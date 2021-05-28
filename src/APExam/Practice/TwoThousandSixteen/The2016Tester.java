package APExam.Practice.TwoThousandSixteen;

public class The2016Tester {
    public static void main(String[] args) {
        String[] array = {"wheels", "on", "the", "bus"};

        RandomStringChooser rsc = new RandomStringChooser(array);
        for(int i = 0; i < 7; i++) {
            System.out.println(rsc.getNext());
        }

        System.out.println();

        RandomLetterChooser rlc = new RandomLetterChooser("hello");
        for(int j = 0; j < 7; j++) {
            System.out.println(rlc.getNext());
        }

        LogMessage lm = new LogMessage("SERVER1:write error on disk DSK1");
        System.out.println(lm.getDescription());
        System.out.println(lm.containsWord("write"));
    }
}