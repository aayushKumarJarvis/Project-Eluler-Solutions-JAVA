

import org.junit.Assert.*;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class TestProblemTHREE {

    @Test
    public void testFindLargestPrime() {

        BigInteger result = ProblemTHREE.findLargestPrime("600851475143");
        System.out.println(result);
    }
}
