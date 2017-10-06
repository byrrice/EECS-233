import java.util.*;
import java.io.*;

//class reporting2
public class reporting2{
  
  public static void main(String[] args) throws FileNotFoundException, IOException{
    try{
      reporting2.sortWriter(args[0]);
    }
    catch (FileNotFoundException e1){
      System.out.print("File not found.\n");
    }
    catch (IOException e2){
      System.out.print("Input File Error.\n");
    }
  }
  
  public static void sortWriter(String inputFileName) throws FileNotFoundException, IOException{
    
    //take in inputfile's data 
    Scanner s1 = new Scanner(new File(inputFileName));
    
    //how many integers to put in array
    int count = 0; 
    while(s1.hasNextInt()){
      count++;
      s1.nextInt();
    }
    
    Scanner s2 = new Scanner(new File(inputFileName));
    Scanner s3 = new Scanner(new File(inputFileName));
    Scanner s4 = new Scanner(new File(inputFileName));
    
    //open the various output files to write to
    File f1 = new File("ikn3QS.txt");
    FileOutputStream fos1 = new FileOutputStream(f1);
    PrintWriter pw1 = new PrintWriter(fos1);
    
    File f2 = new File("ikn3MS.txt");
    FileOutputStream fos2 = new FileOutputStream(f2);
    PrintWriter pw2 = new PrintWriter(fos2);
    
    File f3 = new File("ikn3HS.txt");
    FileOutputStream fos3 = new FileOutputStream(f3);
    PrintWriter pw3 = new PrintWriter(fos3);
    
    //generate the array to be sorted
    try {
      int[] array1 = new int[count];
      for (int i = 0; i < array1.length; i++)
        array1[i] = s2.nextInt();
      
      int[] array2 = new int[count];
      for (int j = 0; j < array2.length; j++)
        array2[j] = s3.nextInt();
      
      int[] array3 = new int[count];
      for (int k = 0; k < array3.length; k++)
        array3[k] = s4.nextInt();
      
      //sort the array using the three methods and calculate the time used for each sorting method
      long startTime1 = System.nanoTime();
      Sorting.quickSort(array1);
      long estimatedTime1 = System.nanoTime() - startTime1;
      
      long startTime2 = System.nanoTime();
      Sorting.mergeSort(array2);
      long estimatedTime2 = System.nanoTime() - startTime2;
      
      long startTime3 = System.nanoTime();
      Sorting.heapSort(array3);
      long estimatedTime3 = System.nanoTime() - startTime3;
      
      //printing them to all the output files
      for (int l = 0; l < array1.length; l++)
        pw1.println(array1[l]);
      
      for (int m = 0; m < array2.length; m++)
        pw2.println(array2[m]);
      
      for (int n = 0; n < array3.length; n++)
        pw3.println(array3[n]);
      
      //printing out the times
      System.out.printf("QSikn3 = %d; MSikn3 = %d; HSikn3 = %d\n", estimatedTime1, estimatedTime2, estimatedTime3);
    }
    //close everything
    finally{
      s1.close();
      s2.close();
      s3.close();
      s4.close();
      pw1.close();
      fos1.close();
      pw2.close();
      fos2.close();
      pw3.close();
      fos3.close();
    }
  }
}
