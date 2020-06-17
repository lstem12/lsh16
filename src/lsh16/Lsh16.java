package lsh16;

import java.util.Scanner;

/*
 * <오버로딩>
 * 1. 같은 영역 내에 있어야 합니다.
 * 2. 메서드명이 같아야 합니다.
 * 3. 파라메터의 갯수가 달라야 합니다.
 * 4. 파라메터의 갯수가 같더라도 데이터 타입이 달라야 합니다.
 * 5. 파라메터의 갯수, 데이터타입이 같더라도 위치가 달라야 합니다.
 */
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
