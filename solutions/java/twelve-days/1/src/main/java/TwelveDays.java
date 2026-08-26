import java.util.ArrayList;
import java.util.Arrays;
class TwelveDays {

    ArrayList<String> items = new ArrayList<>(Arrays.asList(
        "a Partridge in a Pear Tree", 
        "two Turtle Doves",    
        "three French Hens", 
        "four Calling Birds", 
        "five Gold Rings", 
        "six Geese-a-Laying", 
        "seven Swans-a-Swimming", 
        "eight Maids-a-Milking", 
        "nine Ladies Dancing", 
        "ten Lords-a-Leaping", 
        "eleven Pipers Piping", 
        "twelve Drummers Drumming"
    ));

    ArrayList<String> numbers = new ArrayList<>(Arrays.asList(
        "first", "second", "third", "fourth", "fifth", "sixth", 
        "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    ));

    String verse(int verseNumber) {
        String verse = "On the " + numbers.get(verseNumber - 1) + " day of Christmas my true love gave to me: " + items.get(verseNumber - 1);
        if(verseNumber > 1){
            verse += verseNumber - 1 > 1 ? ", " : ", and ";
        }
        else{
            verse += ".\n";
        }
        for(int i = verseNumber - 1; i>0; i--){
            verse += items.get(i - 1);
            if(i > 1){
                verse += i - 1 > 1 ? ", " : ", and ";
            }
            else{
                verse += ".\n";
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
