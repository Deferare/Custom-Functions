    public static String strIndexRe(String str, int index) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (index != i) {
                result += str.charAt(i);
            }
        }
        return result;
    }
