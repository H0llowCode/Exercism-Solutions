import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {

    List<Integer> scores = new ArrayList<>();

    public HighScores(List<Integer> highScores) {
        scores = new ArrayList<>(highScores);
    }

    List<Integer> scores() {
        return new ArrayList<>(scores);
    }

    Integer latest() {
        if(scores.isEmpty()){
            return null;
        }
        return scores.get(scores.size() - 1);
    }

    Integer personalBest() {
        if (scores.isEmpty()) {
            return null;
        }
        return Collections.max(scores);
    }

    List<Integer> personalTopThree() {
        List<Integer> sortedCopy = new ArrayList<>(scores);
        sortedCopy.sort(Collections.reverseOrder());
    
        int limit = Math.min(sortedCopy.size(), 3);   
        return sortedCopy.subList(0, limit);         
    }
}
