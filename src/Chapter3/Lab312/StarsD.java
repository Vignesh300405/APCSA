package Chapter3.Lab312;

public class StarsD {

    public static void main(String[] args) {

        int numberOfStars = 1;

        for(int i=numberOfStars;i<=9;i+=2)
        {
            System.out.print("\t\t\t");

            int j = (10 - i)/2;
            while(j>0)
            {
                System.out.print(" ");
                j--;
            }

            j = i;
            while(j>0)
            {
                System.out.print("*");
                j--;
            }

            System.out.print("\n");
        }

        numberOfStars = 9;
        for(int i=numberOfStars;i>0;i-=2)
        {
            System.out.print("\t\t\t");

            int j = (10 - i)/2;
            while(j>0)
            {
                System.out.print(" ");
                j--;
            }

            j = i;
            while(j>0)
            {
                System.out.print("*");
                j--;
            }

            System.out.print("\n");
        }

    }

}
