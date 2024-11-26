package homework;

public class AnimalClass implements AnimalInterface
{
	public void animal()
	{
		System.out.println("animals");
	}

	public static void main(String[] args) 
	{
		AnimalInterface ai=new AnimalClass();
		ai.animal();
		AnimalInterface.bird();
	}

}
