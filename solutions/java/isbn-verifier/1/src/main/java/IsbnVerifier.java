import java.util.List;
import java.util.ArrayList;
class IsbnVerifier {
    boolean isValid(String stringToVerify) {
        String s = stringToVerify.replaceAll("-", "");
        if(s.length() > 10 || s.length() < 10){
            return false;
        }
        int[] digits = new int[10];
        for(int i = 0; i<10; i++){
            char c = s.charAt(i);
            if((!Character.isDigit(c) && i != 9) || (i == 9 && c != 'X' && !Character.isDigit(c))){
                return false;
            }
            else if(c == 'X'){
                digits[9] = 10;
            }
            else{
                digits[i] = Integer.parseInt(String.valueOf(c));
            }
        }
        return (digits[0] * 10 + digits[1] * 9 + digits[2] * 8 + digits[3] * 7 + digits[4] * 6 + digits[5] * 5 + digits[6] * 4 + digits[7] * 3 + digits[8] * 2 + digits[9]) % 11 == 0;
    }
}
