class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int total = 0;
        for(int i = 1; i<=input; i++){
            total += i;
        }
        return total * total;
    }

    int computeSumOfSquaresTo(int input) {
        int total = 0;
        for(int i = 1; i<=input; i++){
            total += (i * i);
        }
        return total;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
