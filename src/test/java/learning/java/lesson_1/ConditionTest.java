package learning.java.lesson_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}