class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder();
        for(int i = 0; i<dnaStrand.length(); i++){
            switch(dnaStrand.charAt(i)){
                case 'G' -> rna.append('C');
                case 'C' -> rna.append('G');
                case 'T' -> rna.append('A');
                case 'A' -> rna.append('U');
                default -> throw new IllegalArgumentException("Invalid input");
            }
        }
        return rna.toString();
    }

}
