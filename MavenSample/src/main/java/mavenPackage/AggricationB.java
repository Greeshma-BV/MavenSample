package mavenPackage;

public class AggricationB 
{
	String name;
	int id;
	AggricationA agga;
	
	AggricationB(String name,int id,AggricationA agga)
	{
		this.name=name;
		this.id=id;
		this.agga=agga;
	}
	void display()
	{
		System.out.println("name:"+name+"Id:"+id);
		System.out.println(agga.city+agga.state+agga.zip);
		
		
	}

	public static void main(String[] args) 
	{
		AggricationA a=new AggricationA("TVM","kerala",695121);
		AggricationB b= new AggricationB("Greeshma",101,a);
		b.display();
	}

}
