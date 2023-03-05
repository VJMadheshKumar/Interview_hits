package com.test;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.Arrays;
import java.util.List;

class Second {
 public static void main(String[] args) {
     int[] array = {100,4,200,1,3,2};
     int[] array2={0,3,7,2,5,8,5,4,6,0,1,1,11,12,13,14,15,16,17,18,19,20,20};
     //toFindRun(array);
     toFindRun(removeDup(array2));
     
 }
 static void toFindRun(int[] array){
     int len = array.length;
     int temp = 0;
     // for(int i=0; i<len; i++){
     //     for(int j=0;j<len; j++){
     //         if(array[i]<array[j]){
     //             temp = array[i];
     //             array[i]= array[j];
     //             array[j]=temp;
     //         }
     //     }
     // }
       Arrays.sort(array);
     int count =1;
     int[] res = new int[len];
     int index = 0;
     for(int k=0; k<len;k++){
        // System.out.println(array[k]);
         if(k+1!=len){
             if(array[k]+1==array[k+1]){
                 ++count;
                 res[index++]= count;
             }
         else{
             count = 1;
             continue;
             
             }
         }
             //if(temp>count)
             //temp2=count;
            
     }//System.out.println(test+"test");
     
 //   for(int i =0; i<len;i++){
 //       System.out.print(array[i]+"-");
 //   }
     
     
     // int max =0;
     //  for(int i =0; i<len;i++){
     //       max = res[i];
     //      for (int j=0; j<len; j++){
     //          if(max<res[j]){
     //                 max= res[j];
     //               }
     //      }
     //  }
      Arrays.sort(res);
     //  System.out.print(max+"--");
      System.out.println(res[len-1]);
      
     
 }
 
 static int[] removeDup(int[] array){
     Arrays.sort(array);
     int len = array.length;
     int index =0;
     int[] res = new int[len];
     for(int i =0; i<len; i++){
       if(i+1!=len)
         if(array[i]!=array[i+1]){
             res[index++]=array[i];}
     }
     res[len-1]= array[len-1];

     return res;
 }
}