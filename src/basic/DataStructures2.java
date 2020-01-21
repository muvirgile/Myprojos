package basic;

import java.util.ArrayList;
import java.util.List;

public class DataStructures2 {

	List<Student> students = new ArrayList<>();

	public void displayStudents() {

		students.add(new Student("Kagame", "012345", 2));
		students.add(new Student("Buhari", "012345", 2));

		for (Student stud : students) {
			System.out.println(stud.getName());
		}
		System.out.println();
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getName());
		}
		System.out.println();
		int k = 0;
		while (k < students.size()) {
			System.out.println(students.get(k).getName());
			k++;
		}
	}

	public static void main(String[] args) {
		new DataStructures2().displayStudents();
	}

}
