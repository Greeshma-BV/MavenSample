package mavenPackage;

public class MavenPgm2 
{
	String name;
	MavenPgm2(String name)
	{
		this.name=name;
	}
	public void printValue()
	{
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		MavenPgm2 mp2=new MavenPgm2("Greeshma");
		mp2.printValue();
	}

}
