import java.util.List;
import java.util.ArrayList;
class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> aminoAcids = new ArrayList<>();
        for(int i = 0; i<rnaSequence.length(); i+=3){
            int end = Math.min(i + 3, rnaSequence.length());
            String codon = rnaSequence.substring(i, end);
            switch(codon){
                case "AUG" -> aminoAcids.add("Methionine");
                case "UUU", "UUC" -> aminoAcids.add("Phenylalanine");
                case "UUA", "UUG" -> aminoAcids.add("Leucine");
                case "UCU", "UCC", "UCA", "UCG" -> aminoAcids.add("Serine");
                case "UAU", "UAC" -> aminoAcids.add("Tyrosine");
                case "UGU", "UGC" -> aminoAcids.add("Cysteine");  
                case "UGG" -> aminoAcids.add("Tryptophan");
                case "UAA", "UAG", "UGA" -> {return aminoAcids;}
                default -> throw new IllegalArgumentException("Invalid codon");
            }
        }
        return aminoAcids;
    }
}
