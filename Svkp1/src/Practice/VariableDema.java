package Practice;
public class VariableDema {
	int id=10;
	void print()
	{
		String msg="hello";
		System.out.println(msg);
		
	}
     static String message="hello world";
	public static void main(String[] args) {
	VariableDema obj=new VariableDema();
	System.out.println(obj.id);
	obj.print();
	System.out.println(message);

	}

}
