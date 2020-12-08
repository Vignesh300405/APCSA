package Chapter4;

public class Code {

    private String myCode;
    private String hiddenCode;
    private String beginning;
    private String ending;
    private String hidden;
    private String recover;

    public Code(String code){

        myCode = code;

    }

    public String getCode(){
        return myCode;
    }

    public void hide(int p1, int p2) {

        beginning = "";
        ending = "";
        hidden = "";

       if(p1 >= 0 && p1 < p2 && p2 <= myCode.length()) {
           for(int i = 0; i < p1; i++) {
              beginning = beginning + myCode.charAt(i);
           }
           for(int j = p1; j < p2; j++) {
              hidden = hidden + "x";
           }
           for(int k = p2; k < myCode.length(); k++) {
              ending = ending + myCode.charAt(k);
           }
           hiddenCode = beginning + hidden + ending;
       }
    }

    public void recover(int p1, int p2) {

        beginning = "";
        ending = "";
        recover = "";

        if(p1 >= 0 && p1 < p2 && p2 <= myCode.length()) {
            for(int i = 0; i < p1; i++) {
                beginning = beginning + hiddenCode.charAt(i);
            }
            for(int j = p1; j < p2; j++) {
                recover = recover + myCode.charAt(j);
            }
            for(int k = p2; k < myCode.length(); k++) {
                ending = ending + hiddenCode.charAt(k);
            }
            hiddenCode = "";
            hiddenCode = beginning + recover + ending;
        }
    }

}
