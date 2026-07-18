
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < birdsPerDay.length; i++){
            if(birdsPerDay[i] == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        // Pick whichever number is smaller: the requested days or 7
        int limit = Math.min(numberOfDays, 7); 
    
        for (int i = 0; i < limit; i++) {
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int busy = 0;
        for(int i = 0; i<birdsPerDay.length; i++){
            if(birdsPerDay[i] >= 5){
                busy++;
            }
        }
        return busy;
    }
}
