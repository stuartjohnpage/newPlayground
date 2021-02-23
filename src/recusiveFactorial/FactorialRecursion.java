package recusiveFactorial;

public class FactorialRecursion {
    public static void main(String[] args) {
        int answer = factorialCalculator(5);
        System.out.println(answer);

    }
    public static int factorialCalculator(int inputNumber) {
            //base case: returns 1
        if(inputNumber == 1){
            return 1;
            //if the number is too big, do it again, but take one from the input number. It will do that all the way down
            //until it hits the base case. Then it kicks it all the way back up.
        }else
            return(factorialCalculator(inputNumber-1)*inputNumber);
    }
    int myFunction() {
        return 1;
    }
}
