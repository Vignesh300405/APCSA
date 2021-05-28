package APExam.Practice.TwoThousandSixteen;

import java.util.ArrayList;

public class RandomStringChooser {
    private ArrayList<String> randomStrings;

    public RandomStringChooser(String[] array) {
        randomStrings = new ArrayList<String>();
        for(String str : array)
            randomStrings.add(str);
    }

    public String getNext() {
        if(randomStrings.size() != 0) {
            return randomStrings.remove((int) (Math.random() + randomStrings.size() - 1));
        } else {
            return "NONE";
        }
    }
}