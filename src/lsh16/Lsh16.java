package lsh16;

import java.util.Scanner;

public class Lsh16 {
	static String name;
	static int num;

	public static int numbering(int a) {

		a += 5;

		return a;

	}

	public static String firstmyname(String first, String last) {
		String mix = first + last;

		return mix;
	}

	public static void main(String[] args) {

		int age;
		
		System.out.println(name);
		System.out.println(num);

		int k = numbering(5);

		System.out.println(k);

		String fullname = firstmyname("이", "상화");
		System.out.println(fullname);

		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이?");
		age = sc.nextInt();
		
		System.out.println(age);
	}

}
