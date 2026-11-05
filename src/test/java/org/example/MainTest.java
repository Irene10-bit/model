package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MainTest {
    @Test
    public void MarkTest(){
        assertEquals("Pass",Main.grade(100));
        assertEquals("Pass",Main.grade(75));
        assertEquals("Pass",Main.grade(50));
        assertEquals("Fail",Main.grade(30));
    }
}
