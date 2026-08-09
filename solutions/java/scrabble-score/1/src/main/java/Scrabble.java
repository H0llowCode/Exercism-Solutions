import java.util.List;
class Scrabble {
    private int value;
    private List<Character> val1 = List.of('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T');
    private List<Character> val2 = List.of('D', 'G');
    private List<Character> val3 = List.of('B', 'C', 'M', 'P');
    private List<Character> val4 = List.of('F', 'H', 'V', 'W', 'Y');
    private List<Character> val8 = List.of('J', 'X');
    private List<Character> val10 = List.of('Q', 'Z');
    Scrabble(String word) {
        word = word.toUpperCase();
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(val1.contains(c)) {value += 1;}
            else if(val2.contains(c)) {value += 2;}
            else if(val3.contains(c)) {value += 3;}
            else if(val4.contains(c)) {value += 4;}
            else if(c == 'K') {value += 5;}
            else if(val8.contains(c)) {value += 8;}
            else if(val10.contains(c)) {value += 10;}
        }
    }

    int getScore() {
        return value;
    }

}
