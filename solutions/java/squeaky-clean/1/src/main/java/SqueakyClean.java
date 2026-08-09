class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<identifier.length(); i++){
            char curr = identifier.charAt(i);
            if(Character.isWhitespace(curr)){
                sb.append('_');
            }
            else if(curr == '-'){
                sb.append(Character.toUpperCase(identifier.charAt(i+1)));
                i++;
            }
            else if(Character.isLetter(curr)){
                sb.append(curr);
            }
            else if(curr == '4'){
                sb.append('a');
            }
            else if(curr == '3'){
                sb.append('e');
            }
            else if(curr == '0'){
                sb.append('o');
            }
            else if(curr == '1'){
                sb.append('l');
            }
            else if(curr == '7'){
                sb.append('t');
            }
        }
        return sb.toString();
    }
}
