package learning.java.lesson_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {
    private Condition condition;

    @BeforeEach
    void setUp() {
        condition = new Condition();
    }

    @Test
    void isPositiveLessZero(){
        assertFalse(condition.isPositive(-1));
    }

    @Test
    void isPositiveBiggerThanZero(){
        assertTrue(condition.isPositive(66));
    }

    @Test
    void isPositiveZero(){
        assertTrue(condition.isPositive(0));
    }

    @Test
    void oddNumberFromZeroToTen() {
        int count = 0;
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                array[count] = i;
                count++;
            }
        }
        assertEquals(array, condition.oddNumber());
    }

    void testCalc() {
        assertEquals(6, condition.calc(2,4, '+'));
        assertEquals(5, condition.calc(8,3,'-'));
        assertEquals(99, condition.calc(9,11,'*'));
        assertEquals(3, condition.calc(9,3,'/'));
    }
}