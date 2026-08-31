import java.util.ArrayList;
class LargestSeriesProductCalculator {
    private ArrayList<String> nums;
    private String number;
    
    LargestSeriesProductCalculator(String inputNumber) {
        this.nums = new ArrayList<>();
        if(!inputNumber.matches("[0-9]*")){
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
        this.number = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        long max = 0;
        
        if(numberOfDigits > number.length()){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        
        for(int i = 0; i<number.length() - numberOfDigits + 1; i++){
            nums.add(number.substring(i, i + numberOfDigits));
        }
        
        for(int i = 0; i<nums.size(); i++){
            long currMax = 1;
            for(int j = 0; j<numberOfDigits; j++){
                currMax *= Long.parseLong(nums.get(i).substring(j, j+1));
            }
            
            if(currMax > max){
                max = currMax;
            }
        }
        
        return max;
    }
}