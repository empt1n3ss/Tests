package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
    }
    @Test
    public void testAdd(){
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Name1", "111"));
        assertEquals(1, phoneBook.add("Name1", "111"));
        assertEquals(2, phoneBook.add("Name2", "222"));
    }

    @Test
    public void testFindByNumber(){
        phoneBook.add("Name1", "111");
        phoneBook.add("Name2", "222");

        assertEquals("Name1", phoneBook.findByNumber("111"));
        assertNull(phoneBook.findByNumber("54321"));
    }
}
