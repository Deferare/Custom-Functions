public String stringIndexChange(String str, int index1, int index2) {
        String save = "";
        for (int i = 0; i < str.length(); i++) {
            if (i != index1 && i != index2) {
                save += str.charAt(i);
            }
            else if (i == index1){
                save += str.charAt(index2);
            }
            else if (i == index2){
                save += str.charAt(index1);
            }
        }
        return save;
    }
