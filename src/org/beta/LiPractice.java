package org.beta;

import java.util.ArrayList;
import java.util.List;

public class LiPractice {
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(5);
		li.add(10);
		li.add(15);
		li.add(5);
		
		System.out.println(li);
		
		List<Object> li1 = new ArrayList<Object>();
		li1.add(1);
		li1.add(2);
		li1.add(3);
		li1.add(4);
		li1.add(15);
		li1.add(5);
		li1.add("Jelin");
		
		System.out.println(li1);
		//li1.addAll(li);
		//System.out.println(li1);
		li1.retainAll(li);
		System.out.println(li1);
		li.retainAll(li1);
		li.get(3);
		System.out.println(li);


		
	}

		}


