class Student {
	String name;
	int rollNo;

	// static variable
	static String cllgName;

	// static counter to set unique roll no
	static int counter = 0;

	public Student(String name) {
		this.name = name;

		this.rollNo = setRollNo();
	}

	// getting unique rollNo
	// through static variable(counter)
	int setRollNo() {
		counter++;
		return counter;
	}

	// static method
	static void setCllg(String name) {
		cllgName = name;
	}

	// instance method
	void getStudentInfo() {
		//accessing instance Variable
		System.out.println("name : " + this.name);
		System.out.println("rollNo : " + this.rollNo);

		// accessing static variable
		System.out.println("cllgName : " + cllgName);
	}
}

//Driver class 
public class OneTimeReprsent {
	public static void main(String[] args) {
		
		// calling static method without instantiating Student class
		Student.setCllg("XYZ");

		Student s1;//creating Reference
		s1= new Student("kiran"); //intialization
		Student s2 = new Student("Banar");//creating an object

		s1.getStudentInfo();//calling method
		s2.getStudentInfo();

	}
}

//OUTPUT:
//name : kiran
//rollNo : 1
//cllgName : XYZ
//name : Banar
//rollNo : 2
//cllgName : XYZ
