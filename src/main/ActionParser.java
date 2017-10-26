package main;

public class ActionParser {
    public Action[] parse(String[] input_array) {
        Action[] output_array = new Action[input_array.length];
        for(int i=0;i<input_array.length;i++){
            switch(input_array[i]){
                case "d-": output_array[i]=Action.DAY_EARLIER;
                case "d+": output_array[i]=Action.DAY_LATER;
                case "t-": output_array[i]=Action.TIME_EARLIER;
                case "t+": output_array[i]=Action.TIME_LATER;
                default:
            }
        }
        return output_array;
    }
}
