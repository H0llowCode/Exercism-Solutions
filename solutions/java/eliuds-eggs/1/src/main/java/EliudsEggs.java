public class EliudsEggs {
    public int eggCount(int number) {
        int eggs = 0;
        String binaryNum = Integer.toBinaryString(number);
        for(int i = 0; i<binaryNum.length(); i++){
            if(binaryNum.charAt(i) == '1'){
                eggs++;
            }
        }
        return eggs;
    }
}
