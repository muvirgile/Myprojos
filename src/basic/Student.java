package basic;

public class Student {

	String name;
	String phone;
	int level;

	public Student(String name, String phone, int level) {
		super();
		this.name = name;
		this.phone = phone;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public int getLevel() {
		return level;
	}

}
