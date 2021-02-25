package com.nubari;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckProtectionTest {
    @Test
    void testPrintAmount() {
        String value = CheckProtection.printAmount(50010678);
        assertNotNull(value);
        assertEquals("*50,010,678", value);
        value = CheckProtection.printAmount(565);
        assertNotNull(value);
        assertEquals("******565", value);
        value = CheckProtection.printAmount(563709);
        assertNotNull(value);
        assertEquals("***563,709", value);
    }
}