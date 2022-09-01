public class Alarm {


    public static String ladenleute(int number) {

        if(number>=31){
            return "zuviel";
        } else if (number==30) {
            return "genau";
        } else {return "zuwenig";
    }
   }
}
