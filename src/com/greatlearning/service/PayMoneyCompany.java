package com.greatlearning.service;

import java.util.Scanner;

public class PayMoneyCompany {

	int array[];
	int size, target;

	Scanner sc = new Scanner(System.in);

	public void transactionImplementation() {

		System.out.println("Enter the number of transactions : ");
		size = sc.nextInt();

		array = new int[size];

		System.out.println("Enter the value of transactions : ");
		insert();

		System.out.print("Enter the target which you want to acheive : ");
		target = sc.nextInt();

		findTargetElement();

	}

	public void findTargetElement() {
		long sum = 0;
		int flag = 0;

		for (int i = 0; i < size; i++) {

			sum += array[i];
			if (sum >= target) {
				System.out.println("Target is acheived at transation number : " + (i + 1));
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			System.out.println("Target is not acheived");
		}
	}

	//insert() is for entering the data
	public void insert() {
		for (int i = 0; i < size; i++) {
			System.out.print("The value of transaction at " + i + " is : ");
			array[i] = sc.nextInt();
		}

	}

	public static void main(String[] args) {

		PayMoneyCompany obj = new PayMoneyCompany();
		obj.transactionImplementation();

	}

}
