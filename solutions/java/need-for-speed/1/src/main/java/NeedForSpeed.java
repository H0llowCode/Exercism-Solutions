class NeedForSpeed {
    private int batteryPercent = 100;
    private int distance;
    private int speed;
    private int batteryDrain;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryPercent < batteryDrain;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(!(this.batteryDrained()) && batteryPercent >= batteryDrain){
            distance += speed;
            batteryPercent -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while(!(car.batteryDrained()) && car.distanceDriven() < this.distance){
            car.drive();
        }
        return car.distanceDriven() >= this.distance;
    }
}
