
public class ProblemONE {

    protected static boolean isMultiple(int number) {

        if((number%3 == 0) || (number%5 == 0))
            return true;
        else
            return false;
    }

    protected static int calculateSum(int limitOfSum) {

        int sumOfMultiples = 0;

        for(int loopVariable = 1;loopVariable<limitOfSum;loopVariable++) {
            if(isMultiple(loopVariable))
               sumOfMultiples += loopVariable;
        }

        return sumOfMultiples;
    }

    public static void main(String[] args) {

        System.out.println(calculateSum(1000));
    }
}
