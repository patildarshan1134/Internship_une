package factorialloop;

public class FactorialLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        for (int num = 1; num <= 5; num++) {
            int factorial = 1;  // Local variable inside loop
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }
	}

}
