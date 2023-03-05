package com.vid;



public class MethodCheck {
	
	
	
	public static int change(int[] n,int len) {
		int[] temp = new int[len];
		temp[0]=3;
		temp[1]=2;
		temp[2]=1;
		for (int i = 0; i < temp.length; i++) {
			n[i]=temp[i];
		}
		 System.out.println("inside method  ");
		 for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
		return n.length;
	}
public static void main (String[] args) {
	 int[] arr = {1,2,3};
	 int len= arr.length;
	 len =change(arr,len);
	 System.out.println("\nout side method  ");
	 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	
}

}
