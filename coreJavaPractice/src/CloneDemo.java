class CloneDemo implements Cloneable {
	int rollno;
	String name;

	CloneDemo(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	

	public static void main(String args[]) {
		try {
			CloneDemo s1 = new CloneDemo(101, "amit");

			CloneDemo s2 = (CloneDemo) s1.clone();
			CloneDemo s3=(CloneDemo) s2.clone();

			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);
			System.out.println(s3.rollno + " " + s3.name);

		} catch (CloneNotSupportedException c) {
		}

	}
}