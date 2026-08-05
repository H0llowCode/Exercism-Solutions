import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if(square < 1 || square > 64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        BigInteger grains = new BigInteger("2");
        return grains.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        BigInteger grainSum = new BigInteger("0");
        for(int i = 1; i<=64; i++){
            grainSum = grainSum.add(grainsOnSquare(i));
        }
        return grainSum;
    }

}
