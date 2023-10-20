package org.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

public class BigNumberArrayTest {

    @Test
    public void test_expected_add() throws Exception {
        BigArrayNumber bigArrayNumber_1 = new BigArrayNumber(1,5,0,0,0);
        int [] result_1 = bigArrayNumber_1.add(bigArrayNumber_1);
        assertArrayEquals(new int[]{3, 0, 0, 0, 0}, result_1);

        BigArrayNumber bigArrayNumber_2 = new BigArrayNumber(1,2,3,4,5,6,7,8,9);
        int[] result_2 = bigArrayNumber_2.add(new BigArrayNumber(9,8,7,6,5,4,3,2,1));
        assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, result_2);
    }

    @Test
    public void test_unexpected_add() {
        BigArrayNumber bigArrayNumber_1 = new BigArrayNumber();
        assertThrows(EmptyArrayException.class, ()-> bigArrayNumber_1.add(bigArrayNumber_1));

        BigArrayNumber bigArrayNumber_2 = new BigArrayNumber(1);
        assertThrows(Exception.class, ()-> bigArrayNumber_2.add(new BigArrayNumber(1,2)));
    }

    @Test
    public void test_expected_subtract() throws Exception {
        BigArrayNumber bigArrayNumber_1 = new BigArrayNumber(1,5,0,0,0);
        int [] result_1 = bigArrayNumber_1.subtract(bigArrayNumber_1);
//        System.out.println(Arrays.toString(result_1));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, result_1);
        System.out.println();
        BigArrayNumber bigArrayNumber_2 = new BigArrayNumber(1,2,3,4,5,6,7,8,9);
        int[] result_2 = bigArrayNumber_2.subtract(new BigArrayNumber(9,8,7,6,5,4,3,2,1));
        System.out.println(Arrays.toString(result_2));
        assertArrayEquals(new int[]{-8, 6, 4, 1, 9, 7, 5, 3, 2}, result_2);
    }
}
