package com.WebDriverDemos;

import java.util.ArrayList;
import java.util.List;

public class SomeDemos {

	public static void main(String[] args) {
		List<String>fruits = new ArrayList<>();
		
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Watermelon");
		
		System.out.println(fruits.size());
		
		System.out.println(fruits.get(2));
		
		/*for(int i = 0; i < fruits.size(); i++)
			System.out.println(fruits.get(i));*/
		
		for(String f : fruits)
			System.out.println(f);
	}

}
