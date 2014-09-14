
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestProblemONE {

    @Test
    public void isMultipleTest() {

        ProblemONE objectForProblemONE = new ProblemONE();

        assertEquals(objectForProblemONE.isMultiple(3),true);
        assertEquals(objectForProblemONE.isMultiple(5),true);
        assertEquals(objectForProblemONE.isMultiple(9),true);
        assertEquals(objectForProblemONE.isMultiple(4),false);

        assertEquals(objectForProblemONE.calculateSum(10),23);
    }
}
