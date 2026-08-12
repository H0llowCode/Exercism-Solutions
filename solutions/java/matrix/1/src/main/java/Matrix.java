import java.util.ArrayList;
class Matrix {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    Matrix(String matrixAsString) {
        String[] rows = matrixAsString.split("\n");
        for(int i = 0; i<rows.length; i++){
            list.add(new ArrayList<>());

            String[] columns = rows[i].split(" ");
            for(int j = 0; j<columns.length; j++){
                int item = Integer.parseInt(columns[j]);
                list.get(i).add(item);
            }
        }
    }
    int[] getRow(int rowNumber) {
        int targetRow = rowNumber - 1;
        int[] rowList = new int[list.get(targetRow).size()];
        for(int i = 0; i<list.get(targetRow).size(); i++){
            rowList[i] = list.get(targetRow).get(i);
        }
        return rowList;
    }
    int[] getColumn(int columnNumber) {
        int targetCol = columnNumber - 1;
        int[] colList = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            colList[i] = list.get(i).get(targetCol);
        }
        return colList;
    }
}
