import java.util.List;
public class PangramChecker {
    List<Character> alphabet = List.of(
    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
    'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
    'u', 'v', 'w', 'x', 'y', 'z'
    );
    public boolean isPangram(String input) {
        input = input.toLowerCase().replaceAll("[^a-z]", "");
        if(input.length() < 26){
            return false;
        }
        for(char c : alphabet){
            if(input.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }

}
