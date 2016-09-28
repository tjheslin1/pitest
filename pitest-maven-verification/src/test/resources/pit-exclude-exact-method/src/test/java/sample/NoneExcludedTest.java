package sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoneExcludedTest {

    private final NoneExcluded noneExcluded = new NoneExcluded(4, "Bob");

    @Test
    public void toStringTest() throws Exception {
        assertEquals(noneExcluded.noneExcludedToString(), "4, Bob");
    }

    @Test
    public void idTest() throws Exception {
        assertEquals(noneExcluded.id(), 4);
    }
}