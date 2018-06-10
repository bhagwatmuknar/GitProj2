package com.nt.test;

import com.nt.math.Math1;
import com.nt.wish.WishGenerator;
public class Test {

	public static void main(String[] args) {
		System.out.println("Student Info");
		WishGenerator wish=new WishGenerator();
		System.out.println(wish.generateWish("   bhagwat"));
		Math1 math=new Math1();
		System.out.println(math.sum(10,20));
		
		
	}

}
