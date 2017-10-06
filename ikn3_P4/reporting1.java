import java.io.*;
import java.util.*;

//the class for reporting1 I AM VERY SORRY AHEAD OF TIME FOR THE INEFFICIENT CODE WHOEVER HAS TO GRADE THIS 
//I COULDNT FIGURE OUT A BETTER WAY ;-;
public class reporting1{
  
  public static void main(String[] args) throws FileNotFoundException{
    
    //THESE WILL GENERATE THE MERGE/HEAP/QUICK SORT FOR THE SORTED ARRAYS OF VARIOUS LENGTHS
    int[] quicktimes1 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[1000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      long startTime = System.nanoTime();
      Sorting.quickSort(sarray);
      long endTime = System.nanoTime() - startTime;
      quicktimes1[i] = (int)endTime;
    }
    
    int[] mergetimes1 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[1000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      long startTime = System.nanoTime();
      Sorting.mergeSort(sarray);
      long endTime = System.nanoTime() - startTime;
      mergetimes1[i] = (int)endTime;
    }
    
    int[] heaptimes1 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[1000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      long startTime = System.nanoTime();
      Sorting.heapSort(sarray);
      long endTime = System.nanoTime() - startTime;
      heaptimes1[i] = (int)endTime;
    }
    
    int[] quicktimes2 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[10000];
      for (int j = 0; j < sarray.length; j++)
        sarray[i] = j;
      long startTime = System.nanoTime();
      Sorting.quickSort(sarray);
      long endTime = System.nanoTime() - startTime;
      quicktimes2[i] = (int)endTime;
    }
    
    int[] mergetimes2 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[10000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      long startTime = System.nanoTime();
      Sorting.mergeSort(sarray);
      long endTime = System.nanoTime() - startTime;
      mergetimes2[i] = (int)endTime;
    }
    
    int[] heaptimes2 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[10000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      long startTime = System.nanoTime();
      Sorting.heapSort(sarray);
      long endTime = System.nanoTime() - startTime;
      heaptimes2[i] = (int)endTime;
    }
    
    int[] quicktimes3 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[100000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      long startTime = System.nanoTime();
      Sorting.quickSort(sarray);
      long endTime = System.nanoTime() - startTime;
      quicktimes3[i] = (int)endTime;
    }
    
    int[] mergetimes3 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[100000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      long startTime = System.nanoTime();
      Sorting.mergeSort(sarray);
      long endTime = System.nanoTime() - startTime;
      mergetimes3[i] = (int)endTime;
    }
    
    int[] heaptimes3 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[100000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      long startTime = System.nanoTime();
      Sorting.heapSort(sarray);
      long endTime = System.nanoTime() - startTime;
      heaptimes3[i] = (int)endTime;
    }
    
    int[] quicktimes4 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[1000000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      long startTime = System.nanoTime();
      Sorting.quickSort(sarray);
      long endTime = System.nanoTime() - startTime;
      quicktimes4[i] = (int)endTime;
    }
    
    int[] mergetimes4 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[1000000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      long startTime = System.nanoTime();
      Sorting.mergeSort(sarray);
      long endTime = System.nanoTime() - startTime;
      mergetimes4[i] = (int)endTime;
    }
    
    int[] heaptimes4 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[1000000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      long startTime = System.nanoTime();
      Sorting.heapSort(sarray);
      long endTime = System.nanoTime() - startTime;
      heaptimes4[i] = (int)endTime;
    }
    
    
    //THESE WILL GENERATE THE MERGE/HEAP/QUICK SORT FOR THE REVERSE SORTED ARRAYS OF VARIOUS LENGTHS
    int[] quicktimes5 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[1000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      for(int k = 0; k < sarray.length / 2; k++){
        int temp = sarray[k];
        sarray[k] = sarray[sarray.length - k - 1];
        sarray[sarray.length - k - 1] = temp;
      }
      long startTime = System.nanoTime();
      Sorting.quickSort(sarray);
      long endTime = System.nanoTime() - startTime;
      quicktimes5[i] = (int)endTime;
    }
    
    int[] mergetimes5 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[1000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      for(int k = 0; k < sarray.length / 2; k++){
        int temp = sarray[k];
        sarray[k] = sarray[sarray.length - k - 1];
        sarray[sarray.length - k - 1] = temp;
      }
      long startTime = System.nanoTime();
      Sorting.mergeSort(sarray);
      long endTime = System.nanoTime() - startTime;
      mergetimes5[i] = (int)endTime;
    }
    
    int[] heaptimes5 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[1000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      for(int k = 0; k < sarray.length / 2; k++){
        int temp = sarray[k];
        sarray[k] = sarray[sarray.length - k - 1];
        sarray[sarray.length - k - 1] = temp;
      }
      long startTime = System.nanoTime();
      Sorting.heapSort(sarray);
      long endTime = System.nanoTime() - startTime;
      heaptimes5[i] = (int)endTime;
    }
    
    int[] quicktimes6 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[10000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      for(int k = 0; k < sarray.length / 2; k++){
        int temp = sarray[k];
        sarray[k] = sarray[sarray.length - k - 1];
        sarray[sarray.length - k - 1] = temp;
      }
      long startTime = System.nanoTime();
      Sorting.quickSort(sarray);
      long endTime = System.nanoTime() - startTime;
      quicktimes6[i] = (int)endTime;
    }
    
    int[] mergetimes6 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[10000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      for(int k = 0; k < sarray.length / 2; k++){
        int temp = sarray[k];
        sarray[k] = sarray[sarray.length - k - 1];
        sarray[sarray.length - k - 1] = temp;
      }
      long startTime = System.nanoTime();
      Sorting.mergeSort(sarray);
      long endTime = System.nanoTime() - startTime;
      mergetimes6[i] = (int)endTime;
    }
    
    int[] heaptimes6 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[10000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      for(int k = 0; k < sarray.length / 2; k++){
        int temp = sarray[k];
        sarray[k] = sarray[sarray.length - k - 1];
        sarray[sarray.length - k - 1] = temp;
      }
      long startTime = System.nanoTime();
      Sorting.heapSort(sarray);
      long endTime = System.nanoTime() - startTime;
      heaptimes6[i] = (int)endTime;
    }
    
    int[] quicktimes7 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[100000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      for(int k = 0; k < sarray.length / 2; k++){
        int temp = sarray[k];
        sarray[k] = sarray[sarray.length - k - 1];
        sarray[sarray.length - k - 1] = temp;
      }
      long startTime = System.nanoTime();
      Sorting.quickSort(sarray);
      long endTime = System.nanoTime() - startTime;
      quicktimes7[i] = (int)endTime;
    }
    
    int[] mergetimes7 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[100000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      for(int k = 0; k < sarray.length / 2; k++){
        int temp = sarray[k];
        sarray[k] = sarray[sarray.length - k - 1];
        sarray[sarray.length - k - 1] = temp;
      }
      long startTime = System.nanoTime();
      Sorting.mergeSort(sarray);
      long endTime = System.nanoTime() - startTime;
      mergetimes7[i] = (int)endTime;
    }
    
    int[] heaptimes7 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[100000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      for(int k = 0; k < sarray.length / 2; k++){
        int temp = sarray[k];
        sarray[k] = sarray[sarray.length - k - 1];
        sarray[sarray.length - k - 1] = temp;
      }
      long startTime = System.nanoTime();
      Sorting.heapSort(sarray);
      long endTime = System.nanoTime() - startTime;
      heaptimes7[i] = (int)endTime;
    }
    
    int[] quicktimes8 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[1000000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      for(int k = 0; k < sarray.length / 2; k++){
        int temp = sarray[k];
        sarray[k] = sarray[sarray.length - k - 1];
        sarray[sarray.length - k - 1] = temp;
      }
      long startTime = System.nanoTime();
      Sorting.quickSort(sarray);
      long endTime = System.nanoTime() - startTime;
      quicktimes8[i] = (int)endTime;
    }
    
    int[] mergetimes8 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[1000000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      for(int k = 0; k < sarray.length / 2; k++){
        int temp = sarray[k];
        sarray[k] = sarray[sarray.length - k - 1];
        sarray[sarray.length - k - 1] = temp;
      }
      long startTime = System.nanoTime();
      Sorting.mergeSort(sarray);
      long endTime = System.nanoTime() - startTime;
      mergetimes8[i] = (int)endTime;
    }
    
    int[] heaptimes8 = new int[3];
    for (int i = 0; i < 3; i++){
      int[] sarray = new int[1000000];
      for (int j = 0; j < sarray.length; j++)
        sarray[j] = j;
      for(int k = 0; k < sarray.length / 2; k++){
        int temp = sarray[k];
        sarray[k] = sarray[sarray.length - k - 1];
        sarray[sarray.length - k - 1] = temp;
      }
      long startTime = System.nanoTime();
      Sorting.heapSort(sarray);
      long endTime = System.nanoTime() - startTime;
      heaptimes8[i] = (int)endTime;
    }
    
    //THESE WILL GENERATE THE MERGE/HEAP/QUICK SORT FOR THE RANDOM ARRAYS OF VARIOUS LENGTHS
    int[] quicktimes9 = new int[10];
    for (int i = 0; i < 10; i++){
      int[] rarray = new int[1000];
      Random rand = new Random(i);
      for (int j = 0; j < rarray.length; j++)
        rarray[j] = rand.nextInt(999);
      long startTime = System.nanoTime();
      Sorting.quickSort(rarray);
      long endTime = System.nanoTime() - startTime;
      quicktimes9[i] = (int)endTime;
    }
    
    int[] mergetimes9 = new int[10];
    for (int i = 0; i < 10; i++){
      int[] rarray = new int[1000];
      Random rand = new Random(i);
      for (int j = 0; j < rarray.length; j++)
        rarray[j] = rand.nextInt(999);
      long startTime = System.nanoTime();
      Sorting.mergeSort(rarray);
      long endTime = System.nanoTime() - startTime;
      mergetimes9[i] = (int)endTime;
    }
    
    int[] heaptimes9 = new int[10];
    for (int i = 0; i < 10; i++){
      int[] rarray = new int[1000];
      Random rand = new Random(i);
      for (int j = 0; j < rarray.length; j++)
        rarray[j] = rand.nextInt(999);
      long startTime = System.nanoTime();
      Sorting.heapSort(rarray);
      long endTime = System.nanoTime() - startTime;
      heaptimes9[i] = (int)endTime;
    }
    
    int[] quicktimes10 = new int[10];
    for (int i = 0; i < 10; i++){
      int[] rarray = new int[10000];
      Random rand = new Random(i);
      for (int j = 0; j < rarray.length; j++)
        rarray[j] = rand.nextInt(9999);
      long startTime = System.nanoTime();
      Sorting.quickSort(rarray);
      long endTime = System.nanoTime() - startTime;
      quicktimes10[i] = (int)endTime;
    }
    
    int[] mergetimes10 = new int[10];
    for (int i = 0; i < 10; i++){
      int[] rarray = new int[10000];
      Random rand = new Random(i);
      for (int j = 0; j < rarray.length; j++)
        rarray[j] = rand.nextInt(9999);
      long startTime = System.nanoTime();
      Sorting.mergeSort(rarray);
      long endTime = System.nanoTime() - startTime;
      mergetimes10[i] = (int)endTime;
    }
    
    int[] heaptimes10 = new int[10];
    for (int i = 0; i < 10; i++){
      int[] rarray = new int[10000];
      Random rand = new Random(i);
      for (int j = 0; j < rarray.length; j++)
        rarray[j] = rand.nextInt(9999);
      long startTime = System.nanoTime();
      Sorting.heapSort(rarray);
      long endTime = System.nanoTime() - startTime;
      heaptimes10[i] = (int)endTime;
    }
    
    int[] quicktimes11 = new int[10];
    for (int i = 0; i < 10; i++){
      int[] rarray = new int[100000];
      Random rand = new Random(i);
      for (int j = 0; j < rarray.length; j++)
        rarray[j] = rand.nextInt(99999);
      long startTime = System.nanoTime();
      Sorting.quickSort(rarray);
      long endTime = System.nanoTime() - startTime;
      quicktimes11[i] = (int)endTime;
    }
    
    int[] mergetimes11 = new int[10];
    for (int i = 0; i < 10; i++){
      int[] rarray = new int[100000];
      Random rand = new Random(i);
      for (int j = 0; j < rarray.length; j++)
        rarray[j] = rand.nextInt(99999);
      long startTime = System.nanoTime();
      Sorting.mergeSort(rarray);
      long endTime = System.nanoTime() - startTime;
      mergetimes11[i] = (int)endTime;
    }
    
    int[] heaptimes11 = new int[10];
    for (int i = 0; i < 10; i++){
      int[] rarray = new int[100000];
      Random rand = new Random(i);
      for (int j = 0; j < rarray.length; j++)
        rarray[j] = rand.nextInt(99999);;
      long startTime = System.nanoTime();
      Sorting.heapSort(rarray);
      long endTime = System.nanoTime() - startTime;
      heaptimes11[i] = (int)endTime;
    }
    
    int[] quicktimes12 = new int[10];
    for (int i = 0; i < 10; i++){
      int[] rarray = new int[1000000];
      Random rand = new Random(i);
      for (int j = 0; j < rarray.length; j++)
        rarray[j] = rand.nextInt(999999);
      long startTime = System.nanoTime();
      Sorting.quickSort(rarray);
      long endTime = System.nanoTime() - startTime;
      quicktimes12[i] = (int)endTime;
    }
    
    int[] mergetimes12 = new int[10];
    for (int i = 0; i < 10; i++){
      int[] rarray = new int[1000000];
      Random rand = new Random(i);
      for (int j = 0; j < rarray.length; j++)
        rarray[j] = rand.nextInt(999999);
      long startTime = System.nanoTime();
      Sorting.mergeSort(rarray);
      long endTime = System.nanoTime() - startTime;
      mergetimes12[i] = (int)endTime;
    }
    
    int[] heaptimes12 = new int[10];
    for (int i = 0; i < 10; i++){
      int[] rarray = new int[1000000];
      Random rand = new Random(i);
      for (int j = 0; j < rarray.length; j++)
        rarray[j] = rand.nextInt(999999);
      long startTime = System.nanoTime();
      Sorting.heapSort(rarray);
      long endTime = System.nanoTime() - startTime;
      heaptimes12[i] = (int)endTime;
    }
    
    //PRINTING THE RESULTS OUT INTO FILE
    File f = new File("Results.txt");
    FileOutputStream fos = new FileOutputStream(f);
    PrintWriter pw = new PrintWriter(fos);
    pw.println("SORTED ARRAYS TIMES:");
    pw.printf("1000 Quick Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(quicktimes1), medVal(quicktimes1), varVal(quicktimes1, meanVal(quicktimes1)));
    pw.printf("10000 Quick Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(quicktimes2), medVal(quicktimes2), varVal(quicktimes2, meanVal(quicktimes2)));
    pw.printf("100000 Quick Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(quicktimes3), medVal(quicktimes3), varVal(quicktimes3, meanVal(quicktimes3)));
    pw.printf("1000000 Quick Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(quicktimes4), medVal(quicktimes4), varVal(quicktimes4, meanVal(quicktimes4)));
    pw.printf("1000 Merge Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(mergetimes1), medVal(mergetimes1), varVal(mergetimes1, meanVal(mergetimes1)));
    pw.printf("10000 Merge Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(mergetimes2), medVal(mergetimes2), varVal(mergetimes2, meanVal(mergetimes2)));
    pw.printf("100000 Merge Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(mergetimes3), medVal(mergetimes3), varVal(mergetimes3, meanVal(mergetimes3)));
    pw.printf("1000000 Merge Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(mergetimes4), medVal(mergetimes4), varVal(mergetimes4, meanVal(mergetimes4)));
    pw.printf("1000 Heap Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(heaptimes1), medVal(heaptimes1), varVal(heaptimes1, meanVal(heaptimes1)));
    pw.printf("10000 Heap Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(heaptimes2), medVal(heaptimes2), varVal(heaptimes2, meanVal(heaptimes2)));
    pw.printf("100000 Heap Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(heaptimes3), medVal(heaptimes3), varVal(heaptimes3, meanVal(heaptimes3)));
    pw.printf("1000000 Heap Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(heaptimes4), medVal(heaptimes4), varVal(heaptimes4, meanVal(heaptimes4)));
    pw.println("REVERSE SORTED ARRAYS TIMES:");
    pw.printf("1000 Quick Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(quicktimes5), medVal(quicktimes5), varVal(quicktimes5, meanVal(quicktimes5)));
    pw.printf("10000 Quick Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(quicktimes6), medVal(quicktimes6), varVal(quicktimes6, meanVal(quicktimes6)));
    pw.printf("100000 Quick Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(quicktimes7), medVal(quicktimes7), varVal(quicktimes7, meanVal(quicktimes7)));
    pw.printf("1000000 Quick Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(quicktimes8), medVal(quicktimes8), varVal(quicktimes8, meanVal(quicktimes8)));
    pw.printf("1000 Merge Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(mergetimes5), medVal(mergetimes5), varVal(mergetimes5, meanVal(mergetimes5)));
    pw.printf("10000 Merge Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(mergetimes6), medVal(mergetimes6), varVal(mergetimes6, meanVal(mergetimes6)));
    pw.printf("100000 Merge Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(mergetimes7), medVal(mergetimes7), varVal(mergetimes7, meanVal(mergetimes7)));
    pw.printf("1000000 Merge Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(mergetimes8), medVal(mergetimes8), varVal(mergetimes8, meanVal(mergetimes8)));
    pw.printf("1000 Heap Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(heaptimes5), medVal(heaptimes5), varVal(heaptimes5, meanVal(heaptimes5)));
    pw.printf("10000 Heap Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(heaptimes6), medVal(heaptimes6), varVal(heaptimes6, meanVal(heaptimes6)));
    pw.printf("100000 Heap Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(heaptimes7), medVal(heaptimes7), varVal(heaptimes7, meanVal(heaptimes7)));
    pw.printf("1000000 Heap Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(heaptimes8), medVal(heaptimes8), varVal(heaptimes8, meanVal(heaptimes8)));
    pw.println("RANDOM ARRAYS TIMES:");
    pw.printf("1000 Quick Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(quicktimes9), medVal(quicktimes9), varVal(quicktimes9, meanVal(quicktimes9)));
    pw.printf("10000 Quick Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(quicktimes10), medVal(quicktimes10), varVal(quicktimes10, meanVal(quicktimes10)));
    pw.printf("100000 Quick Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(quicktimes11), medVal(quicktimes11), varVal(quicktimes11, meanVal(quicktimes11)));
    pw.printf("1000000 Quick Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(quicktimes12), medVal(quicktimes12), varVal(quicktimes12, meanVal(quicktimes12)));
    pw.printf("1000 Merge Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(mergetimes9), medVal(mergetimes9), varVal(mergetimes9, meanVal(mergetimes9)));
    pw.printf("10000 Merge Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(mergetimes10), medVal(mergetimes10), varVal(mergetimes10, meanVal(mergetimes10)));
    pw.printf("100000 Merge Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(mergetimes11), medVal(mergetimes11), varVal(mergetimes11, meanVal(mergetimes11)));
    pw.printf("1000000 Merge Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(mergetimes12), medVal(mergetimes12), varVal(mergetimes12, meanVal(mergetimes12)));
    pw.printf("1000 Heap Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(heaptimes9), medVal(heaptimes9), varVal(heaptimes9, meanVal(heaptimes9)));
    pw.printf("10000 Heap Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(heaptimes10), medVal(heaptimes10), varVal(heaptimes10, meanVal(heaptimes10)));
    pw.printf("100000 Heap Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(heaptimes11), medVal(heaptimes11), varVal(heaptimes11, meanVal(heaptimes11)));
    pw.printf("1000000 Heap Sort: Mean = %f, Median = %f, Variance = %f%n", meanVal(heaptimes12), medVal(heaptimes12), varVal(heaptimes12, meanVal(heaptimes12)));
    pw.close();
  }
  
//finds the median of the array; array must be sorted
  public static double medVal(int[] sample) {
    //sorting array of sample times
    Sorting.quickSort(sample);
    int middle = sample.length/2;
    if (sample.length % 2 == 1){
      return sample[middle];
    } 
    else{
      return (sample[middle-1] + sample[middle]) / 2.0;
    }
  }
  
//finds mean of array 
  public static double meanVal(int[] sample){
    double total = 0;
    for (int i = 0; i < sample.length; i++){
      total = total + sample[i];
    }
    double mean = total/sample.length;
    return mean;
  }
  
//finds variance
  public static double varVal(int[] sample, double mean){
    double variance = 0;
    for(double index : sample)
      variance += (index - mean) * (index - mean);
    return variance/sample.length;
  }
}