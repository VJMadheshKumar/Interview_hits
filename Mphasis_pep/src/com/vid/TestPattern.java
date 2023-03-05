package com.vid;

public class TestPattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=i;s++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
				
			}
			for(int k=i+1;k<=n;k++) {
				System.out.print("* ");
			}System.out.println("");
		}
        
	}

}