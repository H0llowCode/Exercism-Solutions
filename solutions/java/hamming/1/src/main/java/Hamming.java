public class Hamming {
    private int distance;
    public Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("strands must be of equal length");
        }
        for(int i = 0; i<leftStrand.length(); i++){
            if(!(rightStrand.substring(i, i+1).equals(leftStrand.substring(i, i+1)))){
                distance++;
            }
        }
    }

    public int getHammingDistance() {
        return distance;
    }
}
