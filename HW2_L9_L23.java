
public class HW2_L9_L23 {

	

	public static void main(String[] args) {
		// L9 Recap Demo 1

//		int num1 = 20;
//		int num2 = 25;
//		int num3 = 2;
//
//		int maxN = num1;
//
//		if (num2 > maxN) {
//			maxN = num2;
//		}
//		if (num3 > maxN) {
//			maxN = num3;
//		}
//		System.out.println("Maximum number: " + maxN);
		
		//L10 Switch Demo

//		char grade = 'A';
//		switch (grade) {
//		case 'A':
//			System.out.println("Perfect you past");
//			break;
//		case 'B':
//			System.out.println("Very good past");
//		case 'C':
//			System.out.println("Good past");
//		case 'D':
//			System.out.println("Not so good but past");
//		case 'F':
//			System.out.println("Unfortuanately you have failed");
//		default:
//			System.out.println("Invalid grade entry");
//		}
		
		//L11 For Demo
		
//		for (int i = 0; i < 10; i+=2) {
//			System.out.println(i);
//		}
//		System.out.println("end of for loop");

		//L12 While Demo

//		int i =1;
//		while (i<10) {
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("end of while loop");
		
		//L13 Do-While Demo
		
//		do {
//			System.out.println(i);
//			i--;
//		} while (i>00);
//		System.out.println("end of do while loop");
		
		//L14 Working with Arrays
		
//		String student1 = "Emily";
//		String student2 = "Tom";
//		String student3 = "Jerry";
//		String student4 = "John";
//		
//		String[] students = new String[3];
//		students[0] = "Emily";
//		students[1] = "Tom";
//		students[2] = "Jerry";
//		//students[4] = "John";
//		
//		for (int i = 0; i <students.length; i++) {
//			System.out.println(students[i]);
//		}
//			
//		for (String student : students) {
//			System.out.println(student);
//		}
		
		//L15 Recap Demo 2
		
//		double[] myList1 = new double[3];
//		double[] myList = {1.1,1.2,1.3,.14};
//		double total = 0;
//		double max =myList[0];
//		
//		for (double number: myList) {
//			System.out.println(number);
//		}
//			
//		for (double number : myList) {
//			if (max<number) {
//				max = number;
//			}
//			total += number;
//		}
//		System.out.println("Total : "+total);
//		System.out.println("Max : "+max);
		
		
		// L16 MultiDimensional Arrays;
		 
//		String[][] cities = new String[3][4];
//		
//		cities[0][0] = "Istanbul"; 
//		cities[0][1] = "Bursa"; 
//		cities[0][2] = "Bilecik"; 
//		cities[0][3] = "Bil"; 
//		cities[1][0] = "Ankara"; 
//		cities[1][1] = "Konya"; 
//		cities[1][2] = "Kayseri"; 
//		cities[1][3] = "Keri"; 
//		cities[2][0] = "Diyarbakır"; 
//		cities[2][1] = "Şanlıurfa"; 
//		cities[2][2] = "Gaziantep"; 
//		cities[2][3] = "antep"; 
//		
//		for (int i = 0; i < cities.length; i++) {
//			for (int j = 0; j < cities.length; j++) {
//				System.out.println(cities[j][i]);
//				System.out.println(cities[i][j]);
//			}
//			
//		}
		
//		// L17 Working with String
//		
//		String mail = "Today the whether is awesome!";
//		System.out.println(mail);
//		
//		System.out.println("#Char : "+ mail.length());
//		System.out.println("Char at 5: "+ mail.charAt(4));
//		System.out.println(mail.concat(" Hurray"));
//		System.out.println(mail);
//		System.out.println(mail.startsWith("T"));
//		System.out.println(mail.endsWith("!"));
//		char[] chars = new char[5];
//		mail.getChars(0,5,chars,0);
//		System.out.println(chars);
//		System.out.println(mail.indexOf("ay"));
//		System.out.println(mail.lastIndexOf("a"));
		
		//L18 Working with String Pt.2

//		String mail = "  Today the whether is awesome!                          ";
//		System.out.println(mail.replace(' ', '-')); // Almost all string methods does not change original str
//		System.out.println(mail);
//		System.out.println(mail.substring(2));
//		System.out.println(mail.substring(2,4));
//		for (String word : mail.split(" ")) {
//			System.out.println(word);
//		}
//		System.out.println(mail.toLowerCase());
//		System.out.println(mail.toUpperCase());
//		System.out.println(mail.trim());
		
		//L19 Mini Project 1 isPrime
		
//		int number = 75169;
//		int remainder = number % 2;
//		System.out.println(remainder);
//		
//		if (number<2) {
//			System.out.println("Not Prime");
//		} else if (number == 2|| number == 3) {
//			System.out.println("Prime");
//		}
//		else {
//			for (int i = 2; i <= number/2;i++) {
//				remainder = number % i;
//				if (remainder == 0) {
//					System.out.println("Not Prime");
//					break;}
//			}
//			if (remainder != 0) {
//				System.out.println("Prime");
//			}
//		}
		
		// L20 Mini Project 2 bold vowels and thin vowels
		
//		char[] bvowels = {'a','A','ı','I','o','O','u','U'};
//		char[] tvowels = new char[8];
//		tvowels[0] = 'e';
//		tvowels[0] = 'E';
//		tvowels[0] = 'i';
//		tvowels[0] = 'İ';
//		tvowels[0] = 'ö';
//		tvowels[0] = 'Ö';
//		tvowels[0] = 'ü';
//		tvowels[0] = 'Ü';
//		
//		char charValue = 'k';
//		boolean found = false;
//		int bold = 3;
//		switch (bold) {
//		case 1:
//			for (int i = 0; i < bvowels.length; i++) {
//				if (charValue == bvowels[i]) {
//					found = true;
//					System.out.println("Char is a bold vowel");
//					return;
//				}
//			}
//			System.out.println("Char is not a bold vowel");
//			break;
//		case 2:
//			for (int i = 0; i < tvowels.length; i++) {
//				if (charValue == bvowels[i]) {
//					found = true;
//					System.out.println("Char is a thin vowel");
//					return;
//				}
//			}
//			System.out.println("Char is not a thin vowel");
//			break;
//
//		default:
//			System.out.println("Char is neither bold nor thin vowel");
//			break;
//		}
//		
//		char letter = 'e';
//
//		String str = switch (letter) {
//		case 'A','a','I','ı','O','o','U', 'u' : yield  "Bold Vowel";
//		case 'e','E','i','İ','ö','Ö','ü', 'Ü' : yield  "Thin Vowel";
//		default: yield "Neither Bold nor Thin Vowel";
//		};
//		System.out.println(str);
		
		//L 21 Mini Project Great Number
		
//		int number = 1;
//		int total = 0;
//		for (int i = 1; i <= number / 2; i++) {
//			if (number%i == 0) {
//				total += i;
//
//			}
//		}
//		String str = total == number ? "Great Number": "Not so great number";
//		System.out.println(str);
		
		//L 22 Mini Project Amicable Numbers

		//v2
//		for (int k = 1; k<1300;k++) {
//			for (int l = 1; l<1300;l++) {
//				int number1 = l;
//				int total1 = 0;
//				for (int i = 1; i <= number1 / 2; i++) {
//					if (number1%i == 0) {
//						total1 += i;
//					}
//				}
//				int number2 = k;
//				int total2 = 0;
//				for (int i = 1; i <= number2 / 2; i++) {
//					if (number2%i == 0) {
//						total2 += i;
//					}
//				}
//				if (k != l && l>k) {
//					if (number1 == total2 && number2 == total1)
//						System.out.println("Amicable Number pairs" + k +" " + l);
//				}
//			}
//		}
		
		//v1
//		int number1 = 220;
//		int total1 = 0;
//		for (int i = 1; i <= number1 / 2; i++) {
//			if (number1%i == 0) {
//				total1 += i;
//			}
//		}
//		int number2 = 284;
//		int total2 = 0;
//		for (int i = 1; i <= number2 / 2; i++) {
//			if (number2%i == 0) {
//				total2 += i;
//			}
//		}
//		if (number1 == total2 && number2 == total1)
//			System.out.println("Amicable Number");
//		else
//			System.out.println("Not amicable number");
		

		//L23 Mini Project Number Search
		
//		int[] numbers = new int[] {1,2,5,7,9,0};
//		int  sNum = 15;
//		boolean found = false;
//		for (int i : numbers) {
//			if (i == sNum)
//				found = true;
//		}
//		
//		String str = found? "Found":"Not Found";
//		System.out.println(str);
		
	}

}
