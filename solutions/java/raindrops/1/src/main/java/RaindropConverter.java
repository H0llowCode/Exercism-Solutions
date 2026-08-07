class RaindropConverter {

    String convert(int number) {
        String result = "";
        boolean divisible = false;
        if(number % 3 == 0){
            result += "Pling";
            divisible = true;
        }
        if(number % 5 == 0){
            result += "Plang";
            divisible = true;
        }
        if(number % 7 == 0){
            result += "Plong";
            divisible = true;
        }
        if(!divisible){
            result += String.valueOf(number);
        }
        return result;
    }
}
