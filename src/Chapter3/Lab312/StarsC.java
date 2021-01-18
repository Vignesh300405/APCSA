package Chapter3.Lab312;

public class StarsC {

    public static void main(String[] args) {

        int numberOfStars = 10;

        for(int i=numberOfStars;i>0;i--)
        {
            System.out.print("\t\t\t");

            int j = 10 - i;
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
