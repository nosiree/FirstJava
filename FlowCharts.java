package com.qa.demo;

public class FlowCharts {



	public static void main(String[] args) {

//		firstFlowchart();
//		secondFlowchart();
		tenPrint();
//		tenAlt();

	}

	public static void firstFlowchart() {

		for (int A = 100; A < 200; A++) {
			System.out.println(A);
		}

	}

	public static void secondFlowchart() {

		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}

	}


	public static void tenPrint() {

		for (int i = 0; i < 10; i++) {

			for (int n = 0; n < 10; n++) {
				System.out.println(n + 1);
			}

		}

	}



	public static void callMe(int total) {

		for (int i = 0; i < total; i++) {
			System.out.println(total);
		}

	}

	public static void tenAlt() {

		for (int i = 0; i < 10; i++) {

			callMe(i + 1);

		}

	}

}
