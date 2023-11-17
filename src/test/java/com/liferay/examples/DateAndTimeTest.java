package com.liferay.examples;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * In this test class you will learn how to format date and time.
 */
public class DateAndTimeTest {

    @Test
    public void testFormatDateAndTime() {
        Date date = new Date(0L);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        simpleDateFormat.applyPattern("MMM/dd/yyyy HH:mm");

        assertEquals("Jan/01/1970 08:00", simpleDateFormat.format(date));
    }

}