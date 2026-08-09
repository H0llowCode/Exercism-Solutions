class ResistorColorTrio {
    String ohm = "";
    String label(String[] colors) {
        if(colors[0].equals("black") && colors[1].equals("black")){
            return "0 ohms";
        }
        for(int i = 0; i<3; i++){
            if(i == 0){
                switch(colors[i]){
                    case "brown" -> ohm += "1";
                    case "red" -> ohm += "2";
                    case "orange" -> ohm += "3";
                    case "yellow" -> ohm += "4";
                    case "green" -> ohm += "5";
                    case "blue" -> ohm += "6";
                    case "violet" -> ohm += "7";
                    case "grey" -> ohm += "8";
                    case "white" -> ohm += "9";
                    default -> ohm += "";
                }
            }
            else if(i == 1){
                switch(colors[i]){
                    case "brown" -> ohm += "1";
                    case "red" -> ohm += "2";
                    case "orange" -> ohm += "3";
                    case "yellow" -> ohm += "4";
                    case "green" -> ohm += "5";
                    case "blue" -> ohm += "6";
                    case "violet" -> ohm += "7";
                    case "grey" -> ohm += "8";
                    case "white" -> ohm += "9";
                    default -> ohm += "";
                }
            }
            else if(i == 2 && colors[1].equals("black")){
               switch(colors[i]){
                    case "black" -> ohm += "0 ohms";
                    case "brown" -> ohm += "00 ohms";
                    case "red" -> ohm += " kiloohms";
                    case "orange" -> ohm += "0 kiloohms";
                    case "yellow" -> ohm += "00 kiloohms";
                    case "green" -> ohm += "megaohms";
                    case "blue" -> ohm += "0 megaohms";
                    case "violet" -> ohm += "00 megaohms";
                    case "grey" -> ohm += "gigaohms";
                    case "white" -> ohm += "0 gigaohms";
                    default -> ohm += "";
                } 
            }
            else{
                switch(colors[i]){
                    case "black" -> ohm += " ohms";
                    case "brown" -> ohm += "0 ohms";
                    case "red" -> ohm += "00 ohms";
                    case "orange" -> ohm += " kiloohms";
                    case "yellow" -> ohm += "0 kiloohms";
                    case "green" -> ohm += "00 kiloohms";
                    case "blue" -> ohm += " megaohms";
                    case "violet" -> ohm += "0 megaohms";
                    case "grey" -> ohm += "00 megaohms";
                    case "white" -> ohm += " gigaohms";
                    default -> ohm += "";
                }
            }
        }
        return ohm;
    }
}
