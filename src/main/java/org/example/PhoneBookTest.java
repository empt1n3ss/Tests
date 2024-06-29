package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd(){
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Name1", "111"));
        assertEquals(1, phoneBook.add("Name1", "111"));
        assertEquals(2, phoneBook.add("Name2", "222"));
    }
}
