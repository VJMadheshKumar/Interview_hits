package com.solutions2;

import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		System.out.println("Pascal triangle");
		System.out.println("Enter number of rows : ");
		try (Scanner io = new Scanner(System.in)){
			int rows = io.nextInt();
			printPascal(rows);
		} catch (Exception e) {
			System.out.println("Enter a valide input");
		}

	}
	public static void printPascal(int n)
    {
        for (int line = 1; line <= n; line++) {
            for (int j = line; j <=n ; j++) {
                System.out.print(" ");
            }
 
            int C = 1;
            for (int i = 1; i <= line; i++) {
 
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
}
