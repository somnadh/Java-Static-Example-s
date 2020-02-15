public class StaticVariableDemo {
	int rollno;
	String qulification;
	static String college = "Miracle";

	void display() {
		System.out.println("Student Roll no:" + rollno);
		System.out.println("Student Qulificarion:" + qulification);
		System.out.println("Student College:" + college);
	}

	static void change() {
		college = "Bullayya college";
	}

	public static void main(String[] args) {
		StaticVariableDemo somnadh = new StaticVariableDemo();
		StaticVariableDemo kiran = new StaticVariableDemo();
		somnadh.rollno = 12;
		somnadh.qulification = "B.sc";
		kiran.rollno = 12;
		kiran.qulification = "B.sc";
		somnadh.display();
		kiran.display();
		System.out.println("========================");
		// change method called to change college
		change();
		kiran.display();
		somnadh.display();
	}
}

//OUTPUT:
//Student Roll no:12
//Student Qulificarion:B.sc
//Student College:Miracle
//Student Roll no:12
//Student Qulificarion:B.sc
//Student College:Miracle
//========================
//Student Roll no:12
//Student Qulificarion:B.sc
//Student College:Bullayya college
//Student Roll no:12
//Student Qulificarion:B.sc
//Student College:Bullayya college
