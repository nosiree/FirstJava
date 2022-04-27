package com.qa.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Dan");
		names.add("James");
		names.add("Rowan");
		names.add("Matt");
		names.add("Jeff");
		names.add("Rar");
		
		Collections.swap(names, 0, 5);
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		names.clear();
		System.out.println(names);
		
		List<String> names2 = new ArrayList<>(List.of("James", "Dave", "Dreg"));
		System.out.println(names2);
	}

}
