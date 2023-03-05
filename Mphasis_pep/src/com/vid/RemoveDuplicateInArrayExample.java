package com.vid;

public class RemoveDuplicateInArrayExample{
public static int removeDuplicateElement(int arr[], int n)
    {
        if (n==0 || n==1)
            return n;
      
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
         
        temp[j++] = arr[n-1];   
         
        // Changing original array
        for (int i=0; i<j; i++)
            arr[i] = temp[i];
     System.out.println(j+"len");
        return j;
    }
     
    public static void main (String[] args) 
    {
        int array[] = {10,20,20,30,30,40,50,50,70};
        int length = array.length;
        for (int i=0; i<length; i++) {
            System.out.print(array[i]+" ");
     }
        length = removeDuplicateElement(array, length);
        //printing array elements
        System.out.println("\n"+length);
        for (int i=0; i<array.length; i++)
           System.out.print(array[i]+" ");
    }
}
