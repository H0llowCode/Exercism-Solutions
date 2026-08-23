import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {
    List<String> printToList(char a) {
        
        List<String> diamond = new ArrayList<>();
        
        int rowToHalf = a - 'A';
        int center = rowToHalf + 1;
        int totalLength = 2 * rowToHalf + 1;
        
        int dynamicI;
        for (int i = 0; i < totalLength; i++) {
            if (i < rowToHalf) {
                dynamicI = i;
            } else {
                dynamicI = (rowToHalf * 2) - i;
            }

            char toPrint = (char) ('A' + dynamicI);
            int whereToPrintLeft = center - dynamicI;
            int whereToPrintRight = center + dynamicI;

            StringBuilder rowWorker = new StringBuilder();

            for (int j = 1; j <= totalLength; j++) {
                if (j == whereToPrintLeft || j == whereToPrintRight) {
                    rowWorker.append(toPrint); 
                } else {
                    rowWorker.append(" ");
                }
            }
            diamond.add(rowWorker.toString());
        }
        return diamond;
    }
}