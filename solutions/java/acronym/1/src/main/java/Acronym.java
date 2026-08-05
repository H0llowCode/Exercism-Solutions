class Acronym {
    String acr = "";
    Acronym(String phrase) {
        if (phrase == null || phrase.isEmpty()) return;

        acr += phrase.substring(0, 1);
        int indexSpace = phrase.indexOf(" ");
        int indexHyphen = phrase.indexOf("-");
        
        while(indexSpace != -1 || indexHyphen != -1){
            if (indexSpace != -1 && (indexHyphen == -1 || indexSpace < indexHyphen)) {
                if (indexSpace + 1 >= phrase.length()) break;
                
                String nextChar = phrase.substring(indexSpace + 1, indexSpace + 2);
                if (!nextChar.equals(" ") && !nextChar.equals("-") && !nextChar.equals("_")) {
                    acr += nextChar;
                    phrase = phrase.substring(indexSpace + 1);
                }
                else if(nextChar.equals("_")){
                    if (indexSpace + 2 < phrase.length()) {
                        acr += phrase.substring(indexSpace + 2, indexSpace + 3);
                    }
                    phrase = phrase.substring(indexSpace + 2);
                }
                else {
                    phrase = phrase.substring(indexSpace + 1);
                }
            } 
            else if (indexHyphen != -1) {
                if (indexHyphen + 1 >= phrase.length()) break;

                String nextChar = phrase.substring(indexHyphen + 1, indexHyphen + 2);
                if (!nextChar.equals(" ") && !nextChar.equals("-") && !nextChar.equals("_")) {
                    acr += nextChar;
                    phrase = phrase.substring(indexHyphen + 1);
                }
                else if(nextChar.equals("_")){
                    if (indexHyphen + 2 < phrase.length()) {
                        acr += phrase.substring(indexHyphen + 2, indexHyphen + 3);
                    }
                    phrase = phrase.substring(indexHyphen + 2);
                }
                else {
                    phrase = phrase.substring(indexHyphen + 1);
                }
            }
            indexSpace = phrase.indexOf(" ");
            indexHyphen = phrase.indexOf("-");
        }
    }

    String get() {
        return acr.toUpperCase();
    }
}
