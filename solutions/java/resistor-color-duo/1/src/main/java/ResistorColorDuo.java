class ResistorColorDuo {
    int value(String[] colors) {
        String value = "";
        int limit = Math.min(colors.length, 2); //change 2 to however many numbers you want in the value;
        for(int i = 0; i<limit; i++){
            switch(colors[i].toLowerCase()){
                case "black" -> value += 0;
                case "brown" -> value += 1;
                case "red" -> value += 2;
                case "orange" -> value += 3;
                case "yellow" -> value += 4;
                case "green" -> value += 5;
                case "blue" -> value += 6;
                case "violet" -> value += 7;
                case "grey" -> value += 8;
                case "white" -> value += 9;
                default -> throw new IllegalArgumentException("Invalid color");
            }
        }
        return Integer.parseInt(value);
    }
}
