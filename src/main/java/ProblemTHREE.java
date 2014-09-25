import sun.security.util.BigInt;

import java.math.BigInteger;

public class ProblemTHREE {

    protected static BigInteger findLargestPrime(String num) {

        BigInteger bigNum = new BigInteger(num);
        BigInteger counter = new BigInteger("1");
        BigInteger largestPrime = new BigInteger("0");

        while (!bigNum.equals(counter)) {

            if (bigNum.divideAndRemainder(counter).equals(new BigInteger("0"))) {
                if (counter.isProbablePrime(1)) {
                    largestPrime = counter;
                    counter = counter.add(new BigInteger("1"));
                    System.out.println(counter);
                }
            }

            else {
                counter = counter.add(new BigInteger("1"));
                System.out.println(counter);
            }
        }

        return largestPrime;
    }
}
