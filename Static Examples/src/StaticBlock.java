
public class StaticBlock {
	{
		System.out.println("Instance block called");// it called each time when object is created
	}

	static {
		System.out.println("static block called "); // Before Constructor first static block will be called.
	}

	public StaticBlock() {
		System.out.println("Constructor called ");

	}

	public static void main(String[] args) {
		StaticBlock obj = new StaticBlock();
		StaticBlock obj1 = new StaticBlock();
		StaticBlock obj2 = new StaticBlock();
		StaticBlock obj3 = new StaticBlock();

	}

}
//OUTPUT:
//static block called 
//Instance block called
//Constructor called 
//Instance block called
//Constructor called 
//Instance block called
//Constructor called 
//Instance block called
//Constructor called 
