package lv.javaguru.classworks.lesson4.VowelChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelCheckerTest {
    @Test
    void shouldBeVowel() {
        VowelChecker checker = new VowelChecker();
        assertEquals(true, checker.isVowel('a'));
    }


}



