class LuhnValidator {
    boolean isValid(String candidate) {
        candidate = candidate.replaceAll(" ", "");

        if(candidate == null || !candidate.matches("\\d+")) return false;

        if(candidate.matches("0")) return false;
        
        StringBuilder sb = new StringBuilder(candidate);
        
        for(int i = candidate.length() - 2; i>=0; i-=2){
            int doubling = (candidate.charAt(i) - 48) * 2;
            if(doubling > 9){
                doubling -= 9;
            }
            sb.setCharAt(i, (char) (doubling + '0'));
        }
        int total = 0;
        for(int i = 0; i<sb.length(); i++){
            total += (sb.charAt(i) - 48);
        }
        if(total % 10 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
