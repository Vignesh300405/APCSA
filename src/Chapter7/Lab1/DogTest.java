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
	Dog dog = (Dog) new Labrador("Spike", "a");
	System.out.println(dog.getName() + " says " + dog.speak());

    Labrador lab = new Labrador("Joe", "brown");
    Yorkshire yorkshire = new Yorkshire("Yorky");

    System.out.println(lab.avgBreedWeight());
    System.out.println(yorkshire.avgBreedWeight());

    }
}