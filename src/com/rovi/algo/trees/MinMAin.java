package com.rovi.algo.trees;

import java.util.List;

import java.util.ArrayList;
import java.util.Random;

public class MinMAin {

	public static void main(String[] args) {	
		List<Integer> arr = new ArrayList<Integer>();
	    Random randomGenerator = new Random();
	    for (int idx = 1; idx <= 1000000; ++idx){
	      int randomInt = randomGenerator.nextInt(10000000);
	      arr.add(randomInt);
	    }
		int min = arr.get(0);
		int x = 0;
		for(int i=1;i<arr.size();i++)
		{
			if(arr.get(i)<min){
				x++;
				min = arr.get(i);
			}
		}
		System.out.println("ans is " + x);
	}

}
