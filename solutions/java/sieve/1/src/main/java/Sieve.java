import java.util.List; 
import java.util.ArrayList; 

class Sieve { 
    private List<Integer> numbers; 
    private int maxPrime; 

    Sieve(int maxPrime) { 
        this.numbers = new ArrayList<>(); 
        this.maxPrime = maxPrime; 
    } 

    List<Integer> getPrimes() { 
        for(int i = 2; i <= maxPrime; i++){ 
            numbers.add(i); 
        } 
        for(int i = 0; i<numbers.size(); i++){ 
            int curr = numbers.get(i); 
            
            if (curr < 0) {
                continue;
            }
            
            for(int j = i + 1; j<numbers.size(); j++){ 
                int target = numbers.get(j);
                
                if (target < 0) {
                    continue;
                }
                
                if(target % curr == 0){ 
                    numbers.set(j, -target); 
                } 
            } 
        }
        for(int i = numbers.size() - 1; i>=0; i--){ 
            if(numbers.get(i) < 0){ 
                numbers.remove(i); 
            } 
        } 
        return numbers; 
    } 
}
