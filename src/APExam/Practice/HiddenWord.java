public class HiddenWord {

    String hiddenWord;

    public HiddenWord(String hidden) {
        hiddenWord = hidden;
    }

    public String getHint(String guess) {
        String hint = "";

        for(int i = 0; i < guess.length(); i++) {
            if(guess.charAt(i) == hiddenWord.charAt(i)) {
                hint += guess.charAt(i);
            } else if(hiddenWord.indexOf(guess.charAt(i)) > -1) {
                hint += "+";
            } else {
                hint += "*";
            }
        }

        return hint;
    }
}
