public class Main {
    public static boolean evenOdd(int number) {
        if ((number % 2) > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(evenOdd(
                999998889));
    }

}