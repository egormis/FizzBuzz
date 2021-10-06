public class FizzBuzz {
    public static String checkOutPut(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else
            System.out.println(number);
        String outputStr = "";
        return outputStr;
    }

    public static void doFizzBuzz(int range) {
        for (int i = 1; i < range; i++) {
            System.out.println(checkOutPut(i));
        }
    }
}