package programmingProjects119;

public class programmingProject213 {

    public static void main(String[] args) {

        int one = 0;
        int two = 0;
        int three = 0;
        int thirdNumber = 0;

        for(int i = 0; i < 3; i++) {

            int random = (int) Math.floor(Math.random() * 8);

            if(i == 0) {one = random;} else if(i == 1){two = random;} else{
                three = random;
            }
        }

        int secondNumber = (int) Math.floor(Math.random() * 743);

        String secondNumString = String.format("%03d", secondNumber);

        thirdNumber = (int) Math.floor(Math.random() * 1000);

        String thirdNumString = String.format("%04d", thirdNumber);

        System.out.println("" + one + two + three + "-" + secondNumString + "-" + thirdNumString);

    }



}


