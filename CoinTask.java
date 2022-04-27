package com.qa.demo;


import java.text.DecimalFormat;
import java.util.List;

public class CoinTask {

		
		public static void main(String[] args) {
			
			change(5.57, 20);

			
			
		}
		
		public static void change(double cost, double amount) {
			
			double change = amount-cost;
			DecimalFormat numberFormat = new DecimalFormat("#.00");
			System.out.println("You have £" + numberFormat.format(change) + " In Change.");
			System.out.println("Notes and Coins");
			int twentyPound = 0;
			int tenPound = 0;
			int fivePound = 0; 
			int twoPound = 0;
			int onePound = 0;
			int fiftyPence = 0;
			int twentyPence = 0;
			int tenPence = 0;
			int fivePence = 0;
			int twoPence = 0;
			int onePence = 0;
			
			if (change > 0.00) {
				while (change >= 20) {
					twentyPound++;
					change -= 20;
				}

				if (twentyPound > 0) {
					System.out.println(twentyPound + " £20 notes");
				}

				while (change >= 10) {
					tenPound++;
					change -= 10;
				}

				if (tenPound > 0) {
					System.out.println(tenPound + " £10 notes");
				}

				while (change >= 5) {
					fivePound++;
					change -= 5;
				}

				if (fivePound > 0) {
					System.out.println(fivePound + " £5 notes");
				}

				while (change >= 2) {
					twoPound++;
					change -= 2;
				}

				if (twoPound > 0) {
					System.out.println(twoPound + " £2 coins");
				}

				while (change >= 1) {
					onePound++;
					change -= 1;
				}

				if (onePound > 0) {
					System.out.println(onePound + " £1 coins");
				}

				while (change >= 0.50) {
					fiftyPence++;
					change -= 0.50;
				}

				if (fiftyPence > 0) {
					System.out.println(fiftyPence + " 50p coins");
				}

				while (change >= 0.20) {
					twentyPence++;
					change -= 0.20;
				}

				if (twentyPence > 0) {
					System.out.println(twentyPence + " 20p coins");
				}

				while (change >= 0.10) {
					tenPence++;
					change -= 0.10;
				}

				if (tenPence > 0) {
					System.out.println(tenPence + " 10p coins");
				}

				while (change >= 0.05) {
					fivePence++;
					change -= 0.05;
				}

				if (fivePence > 0) {
					System.out.println(fivePence + " 5p coins");
				}

				while (change > 0.01) {
					twoPence++;
					change -= 0.02;
				}

				if (twoPence > 0) {
					System.out.println(twoPence + " 2p coins");
				}

				while (change >= 0) {
					onePence++;
					change -= 0.01;
				}

				if (onePence > 0) {
					System.out.println(onePence + " 1p coins");
				}

			}
			
			
			
		}
		

	}

