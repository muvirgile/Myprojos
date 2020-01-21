package basic;

public class DataStructures {

	Student[] names;

	public void populateArray() {
		names = new Student[3];
		names[0] = new Student("Kagame", "012345", 2);
		names[1] = new Student("Uche", "012745", 1);
		names[2] = new Student("Ahmed", "012845", 3);

		System.out.println("Starting");
		int i = 0;
		while (i < names.length) {
			System.out.println(names[i].getName() + " " + names[i].getPhone() + " " + names[i].getLevel());
			i++;
		}
		System.out.println("Ended");
	}

	public static void main(String[] args) {
		DataStructures obj = new DataStructures();
		obj.populateArray();
	}

}
