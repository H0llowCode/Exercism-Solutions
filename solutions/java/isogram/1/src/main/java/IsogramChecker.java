class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase();
        for(int i = 0; i<phrase.length()-1; i++){
            char curr = phrase.charAt(i);
            if(curr == '-' || Character.isWhitespace(curr)){
                continue;
            }
            for(int j = i+1; j<phrase.length(); j++){
                char temp = phrase.charAt(j);
                if(temp == curr){
                    return false;
                }
            }
        }
        return true;
    }

}
