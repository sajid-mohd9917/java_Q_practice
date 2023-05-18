//java array  sorting function

/*

import java.util.*;
// import java.io.*;
// import java.util.Arrays;          utility for sorting array



public class sortingArrFunction
{
	public static void main(String[] args) {

int []arr= {11,6,9,12,0,-1,-5};


System.out.println("Arrays before sorting");
for(int i: arr)
{
        System.out.print(i+"  ");
}

// System.out.println();

Arrays.sort(arr);  //sorting is done  n*logn  time complexity


	System.out.println("Arrays after sorting");
	for(int i: arr)
	{
	    	System.out.print(i+"  ");
	}

	}
}

*/







import java.util.Arrays;
 
class sortingArrFunction {
    public static void main(String args[])
    {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }


        Arrays.sort(arr,2,5);  // 2 include 5 exclude


        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}