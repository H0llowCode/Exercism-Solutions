public class JedliksToyCar {
    private int batteryPercent;
    private int distanceDriven;
    public JedliksToyCar(){
        batteryPercent = 100;
        distanceDriven = 0;
    }
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if(batteryPercent == 0){
            return "Battery empty";
        }
        return "Battery at " + batteryPercent + "%";
    }

    public void drive() {
        if(batteryPercent > 0){
            distanceDriven += 20;
            batteryPercent -= 1;
        }
    }
}
