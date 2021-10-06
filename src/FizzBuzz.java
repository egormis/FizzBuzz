public class FizzBuzz {
    public static String checkOutPut(int number) {
        String outputStr = "";
        if (number % 3 == 0 && number % 5 == 0) {
            outputStr ="FizzBuzz";
        } else if (number % 3 == 0) {
            outputStr = "Fizz";
        } else if (number % 5 == 0) {
            outputStr = "Buzz";
        } else
            System.out.println(number);

        return outputStr;
    }

    public static void doFizzBuzz(int range) {
        for (int i = 1; i < range; i++) {
            System.out.println(checkOutPut(i));
        }
    }
}