    public static String strWordAllRemove(String str, String word) {
        String result = ""; String saveStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                saveStr += str.charAt(i);
            }
            if (str.charAt(i) == ' ' || i == str.length()-1) {
                if (saveStr.equals(word)) {

                }
                else {
                    result += saveStr;
                    if (i != str.length()-1) result += " ";
                }
                saveStr = "";
            }
        }
        return result;
    }
