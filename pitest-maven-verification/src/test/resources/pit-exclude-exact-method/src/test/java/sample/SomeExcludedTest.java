package sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomeExcludedTest {

    private final SomeExcluded someExcluded = new SomeExcluded(4, "Bob");

    @Test
    public void idTest() throws Exception {
        assertEquals(someExcluded.id(), 4);
    }
}
