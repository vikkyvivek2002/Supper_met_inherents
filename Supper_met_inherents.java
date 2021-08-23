class Student2
{
	int rn;
	String name;
	Student2(int rn, String name )
	{
		this.rn = rn;
		this.name = name;
	}
	void Display1()
	{
		System.out.println("rollno = "+ rn);
		System.out.println("name = "+ name);
	}
}

class Marks extends Student2
{
	int m1,m2;
	Marks(int rn , String name , int m1, int m2 )
	{
		super(rn,name );
		this.m1 = m1;
		this.m2 = m2;
		
	}
	void Display2()
	{
		System.out.println("marks 1 = "+ m1);
		System.out.println("marks 2 = "+ m2);
	}
	
}
public class Supper_met_inherents {

	public static void main(String[] args) {
		Marks obj = new Marks(11,"sai",67, 68);
		obj.Display1();
		obj.Display2();

	}

}