package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void added() {
        Main main = new Main();
        assertEquals(10, main.added(4, 6));
    }
}