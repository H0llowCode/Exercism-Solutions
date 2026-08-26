import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    Map<Integer, String> phoneMap = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return phoneMap;
    }

    public void setDialingCode(Integer code, String country) {
        phoneMap.put(code, country);
    }

    public String getCountry(Integer code) {
       return phoneMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(phoneMap.containsKey(code)){
            return;
        }
        if(findDialingCode(country) != null){
            return;
        }
        else{
            phoneMap.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for (Integer code : phoneMap.keySet()) {
            if (phoneMap.get(code).equalsIgnoreCase(country)) {
                return code;
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);
    
        if (oldCode == null) {
            return; 
        }
    
        phoneMap.remove(oldCode);

        phoneMap.put(code, country);
    }
}
