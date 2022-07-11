package com.greatlearning.service;

import java.util.Scanner;

public class Denomination {
	int denominations[];
	int size, amount;

	Scanner sc = new Scanner(System.in);

	public void implementDenominations() {

		System.out.print("Enter the number of denominations : ");
		size = sc.nextInt();

		denominations = new int[size];

		System.out.println("Enter the value of Denominations : ");
		insert();

		sort(denominations);

		displayDenominations();

		System.out.print("Enter the amount you want to pay : ");
		amount = sc.nextInt();

		findNumberOfNotes();

	}

	public void findNumberOfNotes() {

		int[] paymentDenominations = new int[size];
		for (int i = 0; i < size; i++) {
			if (amount >= denominations[i]) {

				paymentDenominations[i] = amount / denominations[i];
				amount = amount - (paymentDenominations[i] * denominations[i]);
			}
		}
		if (amount > 0) {
			System.out.println("Exact amount cannot be given with the available denominations ");
		} else {
			System.out.println("Your Payment approach in order to give minimum number of notes will be : ");
			for (int i = 0; i < size; i++) {
				if (paymentDenominations[i] != 0) {
					System.out.println(denominations[i] + " : " + paymentDenominations[i]);
				}

			}
		}

	}

	public void insert() {
		for (int i = 0; i < size; i++) {
			System.out.print("The value of denomincation at " + i + " is : ");
			denominations[i] = sc.nextInt();
		}

	}

	public void sort(int[] arr) {

		for (int j = 1; j < size; j++) {
			int partition = arr[j];
			int i = j - 1;
			while ((i > -1) && (partition > arr[i])) {
				arr[i + 1] = denominations[i];
				i--;
			}
			arr[i + 1] = partition;
		}

	}

	public void displayDenominations() {
		System.out.print("The available denominations are : ");
		System.out.print("{ ");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + denominations[i]);
		}
		System.out.print(" }");
		System.out.println();
	}

	public static void main(String[] args) {

		Denomination obj = new Denomination();
		obj.implementDenominations();

	}

}
