import java.util.ArrayList;

public class PracticeTests {

    public static class PracticeTest1 {

        public void question2(String str) {
            int counter = 0;
            for(int i = 0; i < str.length() - 1; i++) {
                if(str.substring(i, i + 1).equals("a") && !str.substring(i + 1, i + 2).equals("b")) {
                    counter++;
                }
            }
            System.out.println(counter);
        }

        public void question5(int x) {
            if(x < 7) {
                x = 2 * x;
            }
            if(x % 3 == 1) {
                x = x + 2;
            }
            System.out.println(3 * x);
        }

        public void question6(String[] words) {
            String longest = "";
            for(int k = 1; k < words.length; k++) {
                if(words[k].length() > longest.length()) {
                    longest = words[k];
                }
            }
            System.out.println(longest);
        }

        public int question21(ArrayList<Integer> myList, int low, int high, int target) {
            int mid = (high + low) / 2;
            if (target < myList.get(mid)) {
                return question21(myList, low, mid - 1, target);
            } else if (target > myList.get(mid)) {
                return question21(myList, mid + 1, high , target);
            } else if (myList.get(mid).equals(target)) {
                return mid;
            }
            return -1;
            }

       public void question15() {
String[][] arr = {{"Hello,", "Hi,", "Hey,"}, {"it's", "it is", "it really is"},{"nice", "great", "a pleasure"},{"to", "to get to", "to finally"},{"meet", "see", "catch up with"},{"you", "you again", "you all"}};

for (int j = 0; j < arr.length; j++)

{

for (int k = 0; k < arr[0].length; k++)

{

if (k == 1)

{

System.out.print(arr[j][k] + " ");

}

}

}
       }
       
       public void question19() {
           double val = -0.7;
           int roundedVal = (int) (val + 0.5);
           System.out.println("\n" + roundedVal);
       }

       public void q20(boolean x) {
           System.out.println((x && y) && !(x || y));
       }

       public void q20(boolean z){
        System.out.println("asdfdsa");
       }

    }

    public static void main(String[] args) {
        PracticeTest1 pc1 = new PracticeTest1();

        // pc1.question2("a black cat sat on a table");
        // pc1.question5(7);
        // pc1.question6(new String[]{"apple", "ba", "can", "dog"});

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(0);
        // list.add(10);
        // list.add(30);
        // list.add(40);
        // list.add(40);
        // list.add(50);
        // list.add(70);
        // list.add(70);
        // list.add(70);
        // list.add(70);
        // System.out.println(pc1.question21(list, 0, 8, 70));

        // pc1.question15();
        // pc1.question19();
        pc1.q20(false, true);
    }
}