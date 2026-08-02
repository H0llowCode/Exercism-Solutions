import java.util.ArrayList;
class ArmstrongNumbers {
    ArrayList<Integer> power = new ArrayList<>();
    boolean isArmstrongNumber(int numberToCheck) {
        int originalNumber = numberToCheck;
        while(numberToCheck > 0){
            int digit = numberToCheck % 10;
            power.add(digit);
            numberToCheck /= 10;
        }
        int numSize = power.size();
        int total = 0;
        for(int i = 0; i<power.size(); i++){
            total += Math.pow(power.get(i), numSize);
        }
        return total == originalNumber;
    }

}
