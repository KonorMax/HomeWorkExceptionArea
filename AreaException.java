package HomeWorkExceptionArea;

public class AreaException {
    public static void main(String[] args) {
        try {
            AreaCheck.printResult(-5);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class AreaCheck {
    public static void printResult(double a) throws IllegalAreaException {
        if (a >= 1) {
            System.out.println("The entered number is correct");
        } else
            throw new IllegalAreaException(a);

    }

}

class IllegalAreaException extends Exception {

    public IllegalAreaException(double a) {
        System.out.println("The entered number cannot be negative " + a);
    }


}
