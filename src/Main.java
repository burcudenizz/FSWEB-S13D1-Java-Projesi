public class Main {
    public static void main(String[] args) {

        //Barking Dog
        boolean result = shouldWakeUp(true, 1);
        System.out.println(result);

        boolean result2 = shouldWakeUp(false, 2);
        System.out.println(result2);

        boolean result3 = shouldWakeUp(true, 8);
        System.out.println(result3);

        boolean result4 = shouldWakeUp(true, -1);
        System.out.println(result4);

        //Age Detection

        boolean result5 = hasTeen(9,99,19);
        System.out.println(result5);

        boolean result6 = hasTeen(23,15,42);
        System.out.println(result6);

        boolean result7 = hasTeen(22,23,34);
        System.out.println(result7);

        //Cat Playing

        boolean result8 = isCatPlaying(true,10);
        System.out.println(result8);

        boolean result9 = isCatPlaying(false,36);
        System.out.println(result9);

        boolean result10 = isCatPlaying(false,35);
        System.out.println(result10);

        //Area Calculation for Rectangular

        double result11 = area(5.0,4.0);
        System.out.println(result11);

        double result12 = circleArea(5.0);
        System.out.println(result12);

        //Area Calculation for Circle

        double result13 = circleArea(-1);
        System.out.println(result13);

    }

    //Barking Dog

    public static boolean shouldWakeUp(boolean isBarking,int num){
        if(!isBarking){
            return false;
        }
        else if(((num<23 && 20<num) || (num<8 && num>0)) && isBarking){
            return true;
        } else if(num < 0 || num > 23){
            return false;
        } else{
            return false;
        }
}

    //Age Detection

    public static boolean hasTeen(int num1,int num2,int num3){
        if((num1 <=19 && 13<=num1) || (num2 <=19 && 13<=num2) || (num3 <=19 && 13<=num3)){
            return true;
        }
        else{
            return false;
        }
    }


    //Cat Playing

    public static boolean isCatPlaying(boolean isSummer,int num){
        if((num>=25 && num<=35) && !isSummer){
            return true;
        } else if((num>=25 && num<=45) && isSummer){
            return true;
        } else{
            return false;
        }

    }

    //Area Calculation for Rectangular

    public static double area(double num1,double num2){
        if(num1 <0 || num2<0){
            return -1;
        } else{
           double resultArea= num1*num2;
           return resultArea;
        }
    }

    //Area Calculation for Circle


    public static double circleArea(double num){
        if(num <0 ){
            return -1;
        } else{
            double resultArea= num * num * Math.PI ;
            return resultArea;
        }
    }


}


