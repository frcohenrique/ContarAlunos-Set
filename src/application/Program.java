package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();

		System.out.print("How many students for course A?");
		int students = sc.nextInt();

		for (int i = 0; i < students; i++) {
			int studentsId = sc.nextInt();
			set.add(studentsId);
		}

		System.out.print("How many students for course B?");
		students = sc.nextInt();

		for (int i = 0; i < students; i++) {
			int studentsId = sc.nextInt();
			set.add(studentsId);
		}

		System.out.print("How many students for course C?");
		students = sc.nextInt();

		for (int i = 0; i < students; i++) {
			int studentsId = sc.nextInt();
			set.add(studentsId);
		}
		System.out.println("Total students: " + set.size());

		sc.close();

	}

}
