
public class ProblemTWO {

    public static int sumOfFibonacciTerms() {

        int firstVariable = 0;
        int secondVariable = 1;
        int thirdVariable = 0;
        int sumOfEvenTerms = 0;

        while(thirdVariable <= 4000000) {
            thirdVariable = firstVariable + secondVariable;

            if(thirdVariable%2==0)
                sumOfEvenTerms += thirdVariable;

            firstVariable = secondVariable;
            secondVariable = thirdVariable;
            thirdVariable = firstVariable + secondVariable;
        }

        return sumOfEvenTerms;
    }
}