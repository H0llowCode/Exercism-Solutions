class CollatzCalculator {
    int computeStepCount(int start) {
        int steps = 0;
        if(start < 1){
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
        long curr = start;
        while(curr != 1){
            steps++;
            if(curr % 2 == 0){
                curr /= 2;
            }
            else{
                curr = curr * 3 + 1;
            }
        }
        return steps;
    }
}
