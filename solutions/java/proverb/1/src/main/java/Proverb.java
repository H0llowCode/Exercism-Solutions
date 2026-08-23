class Proverb {
    StringBuilder sb = new StringBuilder();
    
    Proverb(String[] words) {
        if(words.length == 0){
            sb.append("");
        }
        else{
            for(int i = 0; i<words.length - 1; i++){
                sb.append("For want of a " + words[i] + " the " + words[i+1] + " was lost.\n");
            }
            sb.append("And all for the want of a " + words[0] + ".");
        }
    }

    String recite() {
        return sb.toString();    
    }
}