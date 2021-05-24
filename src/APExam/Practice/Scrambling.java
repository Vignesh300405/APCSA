public class Scrambling {
   
    public static void main(String[] args) {
        System.out.println(scrambleWord("AARDVARK"));
    }

    static String scrambleWord(String word) {

        String scrambled = "";

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'A' && i != word.length() - 1) {
                if(word.charAt(i + 1) != 'A') {
                    scrambled += word.charAt(i + 1);
                    scrambled += word.charAt(i);
                }
            } else if (i != 0 && word.charAt(i - 1) == 'A') {
            } else {
                scrambled += word.charAt(i);
            }
        }

        return scrambled;
    }

}
