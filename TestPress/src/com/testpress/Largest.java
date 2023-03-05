package com.testpress;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Largest {
	

	  public static void main(String[] args)
	  {

	    ArrayList<Integer> arr = new ArrayList<>();
	    arr.add(54);
	    arr.add(546);
	    arr.add(548);
	    arr.add(60);
	 
	    printLargest(arr);
	 
	  }
	 

	  static void printLargest(ArrayList<Integer> arr)
	  {
	 
	    Collections.sort(arr, new Comparator<Integer>(){

	      @Override
	      public int compare(Integer x, Integer y)
	      {
	 
	        int xy = x;
	        int yx = y;
	 
	        int countx = 0;
	        int county = 0;
	 

	        while (x > 0) {
	          countx++;
	          x /= 10;
	        }
	 

	        while (y > 0) {
	          county++;
	          y /= 10;
	        }
	 
	        x = xy;
	        y = yx;
	 
	        while (countx > 0)
	        {
	          countx--;
	          yx *= 10;
	        }
	 
	        while (county > 0)
	        {
	          county--;
	          xy *= 10;
	        }
	 

	        yx += x;
	 
	        xy += y;
	 
	        return -xy + yx;
	      }
	    });
	 
	    for (int i = 0; i < arr.size(); i++)
	      System.out.print(arr.get(i));
	  }
	 

	}


