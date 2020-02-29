package lv.javaguru.classworks.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCounterTest {

    @Test
    void shouldReturnCounterValue() {
        BasicCounter counter = new BasicCounter();
        assertEquals(0, counter.getCounter());
    }

    @Test
    void shouldSetNegativeValue() {
        BasicCounter counter = new BasicCounter();


    }

    @Test
    void shouldReturnincrement() {
        BasicCounter counter = new BasicCounter();
        counter.increment();
        assertEquals(1, counter.getCounter());
    }
    @Test
    void shouldReturnDecrement() {
        BasicCounter counter = new BasicCounter();
        counter.decrement();
        assertEquals(-1, counter.getCounter());
    }
    @Test
    void shouldReturnClear() {
        BasicCounter counter = new BasicCounter();
        counter.increment();
        counter.clear();
        assertEquals(0, counter.getCounter());
    }
    @Test
    void shouldShouldBeZeroWhenSetNegativeValue() {
        BasicCounter counter = new BasicCounter();
        counter.increment();
        counter.setCounter(-5);
        assertEquals(0, counter.getCounter());
    }
    @Test
    void shouldSetPositiveCounterValue() {
        BasicCounter counter = new BasicCounter();
        counter.increment();
        counter.setCounter(5);
        assertEquals(5, counter.getCounter());
    }


}