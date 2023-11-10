package com.liferay.examples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionTest {
    @Test
    public void testRemoveElementByIndex() {
        List<String> workdays = new ArrayList<String>();

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");
        workdays.add("Saturday");
        workdays.add("Sunday");

        workdays.remove(6);
        workdays.remove(5);

        assertEquals(5, workdays.size());
    }

}