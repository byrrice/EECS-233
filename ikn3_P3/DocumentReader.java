import java.io.*;
public class DocumentReader{
  
  //main method runs the wordcount method if file found
  public static void main(String[] args) throws FileNotFoundException, IOException{
    try{
      DocumentReader.wordCount(args[0], args[1]);
      System.out.print("Completed.\n");
    }
    catch (FileNotFoundException e1){
      System.out.print("File not found.\n");
    }
    catch (IOException e2){
      System.out.print("Input File Error.\n");
    }
  }
  
  //prints out inputfile's hash table to output file
  public static void wordCount(String inputFileName, String outputFileName) throws FileNotFoundException, IOException{
    
    //new hashtable created
    HashTable hash = new HashTable();
    
    //take in inputfile's data 
    BufferedReader br = new BufferedReader(new FileReader(inputFileName));
    
    //open's output file to write to
    File f = new File(outputFileName);
    FileOutputStream fos = new FileOutputStream(f);
    PrintWriter pw = new PrintWriter(fos);
    
    //writing input file to stringbuilder
    try {
      StringBuilder sb1 = new StringBuilder();
      String line = br.readLine();
      while (line != null) {
        sb1.append(line);
        sb1.append(System.lineSeparator());
        line = br.readLine();
      }
      String everything = sb1.toString(); 
      
      //stores the words without punctuation and spaces in array
      String[] words = everything.replaceAll("[^A-Za-z0-9\\s]", "").toLowerCase().split("\\s+");
      
      //increment through and add it to the hashtable created before
      for (int x = 0; x < words.length; x++){
        hash.add(words[x]);
      } 
      
      //printing out the hash table and the average collision length
      pw.println(hash.toString());
      pw.println("Your average collision length is: ");
      pw.println((double)hash.getSize()/(double)hash.getTableSize());
    }
    //close everything
    finally{
      br.close();
      pw.close();
      fos.close();
    }
  }
}
