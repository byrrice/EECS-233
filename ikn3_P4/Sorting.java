import java.util.*;
//the sorting class which includes all sorting methods
public class Sorting{
    
    //testing 
    public static void main(String[] args){
    int[] x = { 112, 2, 7, 5, 9, 7, 10 };
    System.out.println(Arrays.toString(x));
    quickSort(x);  
    System.out.println(Arrays.toString(x));
    int[] y = { 112, 2, 7, 5, 9, 7, 10 };
    System.out.println(Arrays.toString(y));
    heapSort(y);
    System.out.println(Arrays.toString(y));
    int[] z = {  112, 2, 7, 5, 9, 7, 10};
    System.out.println(Arrays.toString(z));
    mergeSort(z);
    System.out.println(Arrays.toString(z));
  }
  
  
  //heapSort method
  public static void heapSort(int[] arr) {
    
    int length = arr.length;
    
    //build the heap in order to sort
    for (int i = length / 2 - 1; i >= 0; i--)
      buildHeap(arr, length, i);
    
    //Getting the elements from the heap
    for (int i = length - 1; i >= 0; i--){
      // Move current/largest number to end of array
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;
      
      //rebuild the heap with the reduced heap
      buildHeap(arr, i, 0);
    }
  }
  
  // build a heap with root i which is an index in arr[]
  public static void buildHeap(int arr[], int length, int i){
    //set the largest to be the root initially
    int largest = i;  
    int left = 2*i + 1; 
    int right = 2*i + 2;  
    
    //Setting the largest to be the left node if it is bigger
    if (left < length && arr[left] > arr[largest])
      largest = left;
    
    //Setting the largest to the be the right node if it is bigger
    if (right < length && arr[right] > arr[largest])
      largest = right;
    
    //when the largest isn't the root, swapping values
    if (largest != i){
      int temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;
      
      //build the heap recursively
      buildHeap(arr, length, largest);
    }
  }
  
  //quicksort method
  public static void quickSort(int[] arr) {
    quickHelper(arr, 0, arr.length - 1); 
  }
  
  //quicksort helper method that does the actual sorting
  public static void quickHelper(int[] arr, int low, int high) {
    
    //ensures that recursion stops
    if (low >= high)
      return;
    
    //picks the pivot using three random numbers and selecting the median from these three
    int pivot = arr[(low+high)/2];
    
    //ensure that the low value is less than the pivot and that the high value is bigger than the pivot
    int left = low;
    int right = high;
    while (left <= right){
      //going left to pivot
      while (arr[left] < pivot){
        left++;
      }
      
      //going right to pivot
      while (arr[right] > pivot){
        right--;
      }
      
      //switching values
      if (left <= right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        //increment left and right repsectively
        left++;
        right--;
      }
    }
    
    //sort the sub arrays using recursion
    if (low < right)
      quickHelper(arr, low, right);
    if (high > left)
      quickHelper(arr, left, high);
  }
  
  //the mergesort method
  public static void mergeSort(int[] arr){
    //creating the temp array 
    int[] temp = new int[arr.length];
    myMergeSort(arr, temp, 0, arr.length - 1);
  }
  
  //the merge sort recursive method
  private static void myMergeSort(int[] arr, int[] temp, int start, int end) {
    
    //base case
    if (start >= end)
      return;
    
    //calculate middle
    int middle = (start + end)/2;
    
    //sorting left side of array recursively
    myMergeSort(arr, temp, start, middle);
    
    //sorting right side of array recursively
    myMergeSort(arr, temp, middle + 1, end);
    
    //call helper method to sort the array
    merge(arr, temp, start, middle, middle + 1, end);
  }
  
  //the helper method for mergeSort
  private static void merge(int[] arr, int[] temp, int leftStart, int leftEnd, int rightStart, int rightEnd){
    
    //index into left subarray
    int ls = leftStart;  
    //index into right subarray
    int rs = rightStart;  
    //index into temp
    int ts = leftStart;    
    
    //sorting the begin half array and last half array using ls and rs as counters
    while (ls <= leftEnd && rs <= rightEnd){
      
      //if the value of the left is less than the right, set the temp's value to left
      if (arr[ls] < arr[rs])
        temp[ts++] = arr[ls++];
      
      //if value of right less than left, put temp's value to right
      else
        temp[ts++] = arr[rs++];
    }
    
    //while the left start index is less than the left end index, set the temp value to to the left value
    while (ls <= leftEnd)
      temp[ts++] = arr[ls++];
    
    //while the right start index is less than the right end index, set the temp value to to the right value 
    while (rs <= rightEnd)
      temp[ts++] = arr[rs++];
    
    //copy all the sorted values from the temp array to the actual array
    for (ls = leftStart; ls <= rightEnd; ls++)
      arr[ls] = temp[ls];
  }
}