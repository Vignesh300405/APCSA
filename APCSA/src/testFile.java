import Chapter4.Code;

import java.util.Scanner;

public class testFile {

    public static void main(String[] args) {
        Code code1 = new Code("abcdefg");

        code1.hide(1,4);
        code1.recover(1,2);
        code1.hide(3,6);
        code1.recover(3,5);
    }
}











