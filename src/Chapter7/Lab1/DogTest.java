package Chapter7.Lab1;
//package Chapter7.Lab1.Dog;

// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
	//Dog dog = (Dog) new Labrador("Spike", "a");
	//System.out.println(dog.getName() + " says " + dog.speak());

    Labrador lab = new Labrador("Joe", "brown");
	System.out.println(lab.getName() + " says " + lab.speak());
    System.out.println(lab.avgBreedWeight());

    Yorkshire yorkshire = new Yorkshire("Yorky");
	System.out.println(yorkshire.getName() + " says " + yorkshire.speak());
    System.out.println(yorkshire.avgBreedWeight());

    }
}