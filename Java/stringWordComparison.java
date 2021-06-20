    public static String stringWordComparison(String str1, String str2) {
        //두 단어 중 사전순으로 앞서는 단어를 리턴.
        int turn = 0;
        if (str1.length() < str2.length()) turn = 1;
        if (turn == 0) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) < str2.charAt(i)) {
                    return str1;
                }
                else if (str1.charAt(i) > str2.charAt(i)) {
                    return str2;
                }
            }
        }
        else if (turn == 1) {
            for (int i = 0; i < str2.length(); i++) {
                if (str1.charAt(i) < str2.charAt(i)) {
                    return str1;
                }
                else if (str1.charAt(i) > str2.charAt(i)) {
                    return str2;
                }
            }
        }
        return "The two words are the same.";
    }
