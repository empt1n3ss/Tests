package org.example;

import org.example.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void testAdd(){
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

    @Test
    public void testFindByName(){
        phoneBook.add("Name1", "111");
        phoneBook.add("Name2", "222");

        assertEquals("111", phoneBook.findByName("Name1"));
        assertNull(phoneBook.findByName("54321"));
    }

    @Test
    public void testPrintAllNames(){
        phoneBook.add("Name1", "111");
        phoneBook.add("Name2", "222");
        phoneBook.add("Name6", "333");
        phoneBook.add("Name5", "444");
        phoneBook.add("Name3", "555");
        phoneBook.add("Name0", "666");
        phoneBook.add("Name9", "777");

        String expectedOutput = "Name0\nName1\nName2\nName3\nName5\nName6\nName9\n";
        assertEquals(expectedOutput, phoneBook.printAllNames());
    }
}