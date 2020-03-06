public class FizzBuzz {
    public static String SayFizzBuzz(int number) {
        if(number%15==0){
            return "FizzBuzz";
        }
        return String.valueOf(number);
    };
}
