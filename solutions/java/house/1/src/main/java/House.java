import java.util.ArrayList;
import java.util.Arrays;

class House {
    ArrayList<String> items = new ArrayList<>(Arrays.asList(
            "house that Jack built",
            "malt",
            "rat",
            "cat",
            "dog",
            "cow with the crumpled horn",
            "maiden all forlorn",
            "man all tattered and torn",
            "priest all shaven and shorn",
            "rooster that crowed in the morn",
            "farmer sowing his corn",
            "horse and the hound and the horn"
    ));

    ArrayList<String> actions = new ArrayList<>(Arrays.asList(
            "lay in", "ate", "killed", "worried", "tossed", "milked",
            "kissed", "married", "woke", "kept", "belonged to"
    ));

    String verse(int verseNumber) {
        String verse = "This is the " + items.get(verseNumber - 1);
        verse += verseNumber - 1 >= 1 ? "" : ".";
        for(int i = verseNumber - 1; i > 0; i--){
            verse += " that " + actions.get(i - 1) + " the " + items.get(i - 1);
            if(i == 1) {
                verse += ".";
            }
        }
        return verse;
    }

    String verses(int startVerse, int endVerse) {
        String verses = "";

        for(int i = startVerse; i <= endVerse; i++){
            verses += verse(i);
            if(i < endVerse){
                verses += "\n";
            }
        }
        return verses;
    }

    String sing() {
        return verses(1, 12);
    }
}