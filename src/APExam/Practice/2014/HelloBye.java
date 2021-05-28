//Inheritance Test
public class HelloBye {
    public static class Hello {
        private String name;

        public Hello(String theName) {
            name = theName;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return "Hello " + name + "!";
        }
    }

    public static class Bye extends Hello {
        public Bye(String theName) {
            super(theName);
        }

        public String toString() {
            return "Bye " + super.getName() + "!";
        }
    }

    public static void main(String[] args) {
        HelloBye.Hello hey = new HelloBye.Bye("John");
        System.out.println(hey);

        // Will not work because child class cannot be a parent class.
        // HelloBye.Bye bye = new HelloBye.Hello("Julius");


    }    


}