package com.BookStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		int i = 0;
		// creating object
		UC1 uc1 = new UC1();
		UC2 uc2 = new UC2();
		UC3 uc3 = new UC3();
		UC4 uc4 = new UC4();
		UC5 uc5 = new UC5();
		//UC7 uc7 = new UC7();
		// adding data to hash map
		// uc1.add();
		// printing data from collection
		// uc1.print();



		do {
			System.out.print(
					"1=>add contact\t 2=>edit contact\t 3=>delete contact \t 4=>display all \t 5=>add multiple contact \t 6=>get number of person in city \t 7=>check person present or not");
			Scanner scanInput1 = new Scanner(System.in);
			int getUserInput = scanInput1.nextInt();

			switch (getUserInput) {
			case 1: {
				uc2.add();
				break;
			}
			case 2: {
				uc3.editExisting();
				uc3.print();
				break;
			}
			case 3: {
				uc4.deleteContact();
				break;
			}
			case 4: {
				uc2.print();

				break;
			}
			case 5: {
				System.out.print("Enter first number- ");
				Scanner scanInput = new Scanner(System.in);
				int getUserInput2 = scanInput.nextInt();
				for (int j = 0; j < getUserInput2; j++) {
					uc5.add();
				}
				break;
			}
			case 6: {
				//UC10 uc10 = new UC10();
				//uc10.getNumber();
				break;
			}
			case 7: {
				//UC8 uc8 = new UC8();
				//uc8.checkContact();
				break;
			}
			}

			System.out.print("0 =>to end && 1=>to again ====> ");
			Scanner scanInput = new Scanner(System.in);
			i = scanInput.nextInt();

		} while (i == 1);

		//UC11 uc11=new UC11();
		//uc11.sortBy();

	}
}
