import java.io.*;

public class HuffmanCompressor {
  
  public static void main(String[] args) throws FileNotFoundException, IOException{
    try{
      HuffmanCompressor.huffmanCoder(args[0], args[1]);
      System.out.print("Completed.\n");
    }
    catch (FileNotFoundException e1){
      System.out.print("File not found.\n");
    }
    catch (IOException e2){
      System.out.print("Input File Error.\n");
    }
  }
  
  public static String huffmanCoder(String inputFileName, String outputFileName) throws FileNotFoundException, IOException{
    BufferedReader br = new BufferedReader(new FileReader(inputFileName));
    File f = new File(outputFileName);
    FileOutputStream fos = new FileOutputStream(f);
    PrintWriter pw = new PrintWriter(fos);
    try {
      StringBuilder sb1 = new StringBuilder();
      String line = br.readLine();
      
      while (line != null) {
        sb1.append(line);
        sb1.append(System.lineSeparator());
        line = br.readLine();
      }
      String everything = sb1.toString(); 
      
      // Counts the frequency of the different characters
      int[] frequency = getFreq(everything);
      
      // Creates Huffman Tree
      Tree tree = getTree(frequency); 
      
      //encodes the character
      String[] huffmancode = getCode(tree.top); 
      
      //build string and print it to file, also calculate space savings by comparing encoding with every character assumed 8 bits
      int space = 0;
      int originalspace = everything.length() * 8;
      StringBuilder sb2 = new StringBuilder();
      for (int i = 0; i < everything.length(); i++){
        sb2.append(huffmancode[(int)everything.charAt(i)]);
        space = space + huffmancode[(int)everything.charAt(i)].length();
      }
      pw.println(sb2);
      pw.printf("You saved %d bits!", originalspace - space);
    }
    finally {
      br.close();
      pw.close();
      fos.close();
    }
    return "Completed"; 
  }
  
  //generates the encoding Table
  public static void generateTable(String inputFileName, String outputFileName) throws FileNotFoundException, IOException{
    //takes inputfile
    BufferedReader br = new BufferedReader(new FileReader(inputFileName));
    //making the output file
    File outputfile = new File(outputFileName);
    FileOutputStream fos = new FileOutputStream(outputfile);
    PrintWriter pw = new PrintWriter(fos);
    //turns it into a string
    try {
      StringBuilder sb = new StringBuilder();
      String line = br.readLine();
      
      while (line != null) {
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();
      }
      String everything = sb.toString(); 
      
      // Counts the frequency of the different characters
      int[] frequency = getFreq(everything);
      
      // Creates Huffman Tree
      Tree tree = getTree(frequency); 
      
      //encodes the character
      String[] huffmancode = getCode(tree.top); 
      
      //prints table used to encode text
      pw.printf("%-20s%-20s%-20s%-20s\r\n", "ASCII:", "Char:", "Freq:", "Code:"); 
      for (int i = 0; i < huffmancode.length; i++){
        //if the character shows up display the data for it in the table
        if (frequency[i] != 0)
          pw.printf("%-20s%-20s%-20s%-20s\r\n", i, (char)i, frequency[i], huffmancode[i]);
      }
    }
    //close everything
    finally {
      br.close();
      pw.close();
      fos.close();
    }
  }
  
  
  //gets the code for the requisite ASCII character
  public static String[] getCode(Tree.HuffmanNode root) {
    
    // returns null if tree is not even built
    if (root == null) 
      return null;
    
    //make code 256 for number of ASCII characters
    String[] codes = new String[256];
    
    //get all the code for the Tree
    giveCode(root, codes);
    
    //return array
    return codes;
  }
  
  //gives codes to the leaf node by recursion
  public static void giveCode(Tree.HuffmanNode top, String[] codes) {
    
    //gets recursively down to get all the code
    if (top.left != null) {
      top.left.code = top.code + "0";
      giveCode(top.left, codes);
      
      top.right.code = top.code + "1";
      giveCode(top.right, codes);
    }
    //assigns the root code
    else {
      codes[(int)top.inChar] = top.code;
    }
  }
  
  //obtains Huffman tree
  public static Tree getTree(int[] array) {
    // Create the heap of type tree
    Heap<Tree> heap = new Heap<Tree>();
    //builds tree
    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0)
        heap.add(new Tree(array[i], (char)i)); 
    }
    
    //combines trees
    while (heap.getSize() > 1) {
      Tree tree1 = heap.remove();
      Tree tree2 = heap.remove(); 
      heap.add(new Tree(tree1, tree2)); 
    }
    
    return heap.remove(); 
  }
  
  /** Get the frequency of the characters */
  public static int[] getFreq(String s) {
    
    //256 ASCII characters
    int[] charArray = new int[256]; 
    
    //travel through string to check for characters
    for (int i = 0; i < s.length(); i++){
      //increment up if character met
      charArray[(int)s.charAt(i)]++; 
    }
    return charArray;
  }
  
  //Tree made out of HuffmanNodes
  public static class Tree implements Comparable<Tree> {
    
    public HuffmanNode top;
    
    //combines two subtrees into one tree
    public Tree(Tree tree1, Tree tree2) {
      top = new HuffmanNode();
      //make the top of the 1st tree the new top's left
      top.left = tree1.top;
      //make the top of the 1st tree the new top's right
      top.right = tree2.top;
      //find the frequency of the top by adding the two below it
      top.frequency = tree1.top.frequency + tree2.top.frequency;
    }
    
    //initializing the tree with a huffmannode
    public Tree(int frequency, char letter) {
      top = new HuffmanNode(frequency, letter);
    }
    
    //reverse order on purpose
    @Override 
    public int compareTo(Tree t) {
      if (top.frequency < t.top.frequency)
        return 1;
      else if (top.frequency == t.top.frequency)
        return 0;
      else
        return -1;
    }
    
    //Huffman Node class
    public class HuffmanNode{
      private char inChar;
      private int frequency;
      private HuffmanNode left;
      private HuffmanNode right;
      //unknown code at first
      private String code = "";
      
      public HuffmanNode(){
      }
      
      //initialize a huffman node with its frequency and character
      public HuffmanNode(int frequency, char inChar) {
        this.inChar = inChar;
        this.frequency = frequency;
      }
    }
  }
}