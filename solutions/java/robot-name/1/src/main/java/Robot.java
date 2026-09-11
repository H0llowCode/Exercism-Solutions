import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Robot {
    Random rand = new Random();
    private static final Set<String> takenNames = new HashSet<>();
    
    private String name = "";

    String getName() {
        if(name.equals("")){
            reset();
        }
        return name;
    }

    void reset() {
        takenNames.remove(name);
        String newName;
        do {
            newName = "";
            for (int i = 0; i < 2; i++) {
                newName += (char) (rand.nextInt(26) + 65);
            }    
            for (int i = 0; i < 3; i++) {
                newName += (char) (rand.nextInt(10) + 48);
            }
        } while (takenNames.contains(newName));
        name = newName;
        takenNames.add(name);
    }

}