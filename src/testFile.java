import java.util.ArrayList;

public class testFile {

    public static void main(String[] args) {
    
        ArrayList<Integer> list = new ArrayList<Integer>(); 


        int len = list.size();
        for (int i = 0; i < len; i++) {
    
            list.add(i + 1, i);
            Object x = list.set(i, i);

            System.out.println(list);
        }    

        System.out.println(list);

    }

}











