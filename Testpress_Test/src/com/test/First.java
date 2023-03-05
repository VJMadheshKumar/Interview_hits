package com.test;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class First {
	public static void main(String[] args) {
        int[] array = {3,-6,2,-5,7,-3};
        toFindProduct(array);
    }
	static void  toFindProduct(int[] array){
        int max ;
        int temp = 1;
        int len = array.length;
        max = array[0]*array[1];
       // int[] res = new int[len];
        
        for(int i=0;i<len;i++){
            if((i+1)!=len)
                temp = array[i]*array[i+1];
                        if(temp>max)
                            max = temp;
                    }
        
        System.out.print(max);
    //     int resMax = 0;
    //   for(int j=0; j<len; j++){
    //       for(int k=0; k<len; k++){
    //           if(res[j]<res[k]){
    //               resMax=res[k];
    //           }
    //       }
    //   }
      // System.out.print(resMax);
       //System.out.println(res[len-1]);
        
    }
        
     
 }

