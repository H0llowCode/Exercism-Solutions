public class Lasagna {
    final static int ExpectedMinutes = 40; 
    final static int layers = 2;
    public int expectedMinutesInOven(){
        return ExpectedMinutes;
    }
    public int remainingMinutesInOven(int minutesInOven){
        return ExpectedMinutes - minutesInOven;
    }
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }
    public int totalTimeInMinutes(int layers, int timeInOven){
        return (layers * 2) + timeInOven;
    }
}