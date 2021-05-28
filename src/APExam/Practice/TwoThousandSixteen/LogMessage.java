package APExam.Practice.TwoThousandSixteen;

public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message) {
        machineId = message.substring(0, message.indexOf(":"));
        description = message.substring(message.indexOf(":") + 1);
    }

    public boolean containsWord(String keyword) {
        int keywordIndex = description.indexOf(keyword); 

        if(keywordIndex != -1) {
            if((keywordIndex == 0) || (description.substring(keywordIndex - 1, keywordIndex).equals(" "))){
                if((keywordIndex + keyword.length() == description.length()) || (description.substring(keywordIndex + keyword.length() - 2, keywordIndex + keyword.length() - 1).equals(" "))) {
                    return true;
                }
            }
        }

        return false;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }
}
