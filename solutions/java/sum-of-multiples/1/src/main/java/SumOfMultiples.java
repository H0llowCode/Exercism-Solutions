import java.util.ArrayList;

class SumOfMultiples {
    private ArrayList<Integer> list;
    private int number;
    private int[] set;

    SumOfMultiples(int number, int[] set) {
        this.list = new ArrayList<>();
        this.number = number;
        this.set = set;
    }

    int getSum() {
        for(int i = 0; i < set.length; i++){
            if(set[i] == 0) continue;
            for(int j = 1; j < number; j++){
                if(j % set[i] == 0 && !list.contains(j)){
                    list.add(j);
                }
            }
        }
        int sum = 0;
        for(int i = 0; i<list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }
}