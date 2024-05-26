package mk.ukim.finki;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void testAllItemsNull() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(null, 100);
        });
        assertEquals("allItems list can't be null!", exception.getMessage());
    }

    @Test
    void testEmptyNameAndNoBarcode() {
        List<Item> items = Arrays.asList(new Item("", null, 100, 0));
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(items, 100);
        });
        assertEquals("No barcode!", exception.getMessage());
    }

    @Test
    void testInvalidBarcode() {
        List<Item> items = Arrays.asList(new Item("item1", "abc123", 100, 0));
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(items, 100);
        });
        assertEquals("Invalid character in item barcode!", exception.getMessage());
    }

    @Test
    void testValidItemWithoutDiscount() {
        List<Item> items = Arrays.asList(new Item("item1", "123456", 100, 0));
        assertTrue(SILab2.checkCart(items, 100));
    }

    @Test
    void testValidItemWithDiscount() {
        List<Item> items = Arrays.asList(new Item("item1", "012345", 350, 1));
        assertFalse(SILab2.checkCart(items, 100));
    }
}