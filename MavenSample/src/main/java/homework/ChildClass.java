package homework;

public class ChildClass extends ParentClass
{
	
	int x,y,z;
	ChildClass(int x,int y)
	{
		super(2,4,6);

		this.x=x;
		this.y=y;
		
		
	}
	
	void display()
	{
		super.display();
		System.out.println("x+y+z");
	}
	public static void main(String[] args) 
	{		
		ChildClass cc=new ChildClass(3,6);
		cc.display();
	}

}
