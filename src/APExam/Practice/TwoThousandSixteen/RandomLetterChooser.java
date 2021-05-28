package APExam.Practice.TwoThousandSixteen;

import java.util.Random;

import Chapter3.LabExercises3.chargeAccount;

public class RandomLetterChooser extends RandomStringChooser {

    public RandomLetterChooser(String str) {

        super(RandomLetterChooser.getSingleLetters(str));

    }

    public static String[] getSingleLetters(String str) {

        String[] charArray = new String[str.length()];

        for(int i = 0; i < charArray.length; i++)
            charArray[i] = str.substring(i, i + 1);

        return charArray;
    }
}
