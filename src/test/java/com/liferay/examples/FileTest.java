package com.liferay.examples;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileTest {

    @Test
    public void testAddFileAndDelete() throws IOException {
        File file = new File(System.getProperty("user.dir") + "temp.text");

        file.createNewFile();

        assertTrue(file.exists());

        file.delete();

        assertFalse(file.exists());
    }

}