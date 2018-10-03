package week3;

import org.junit.Assert;
import org.junit.Test;
import week3.Week3;

import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
    /*Assert.*/
        assertEquals(12, Week3.max(4, 12));
        assertEquals(2, Week3.max(1, 2));
        assertEquals(17, Week3.max(16, 17));
        assertEquals(18, Week3.max(15, 18));
        assertEquals(119, Week3.max(119, 17));
    }


    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 1000, 10};
        assertEquals(1, Week3.minOfArray(a));
        int b[] = {111, 12, 13, 10, 15, 16, 17, 18, 19, 20000};
        assertEquals(10, Week3.minOfArray(b));
        int c[] = {-1000, -100, -3, -4, -5, -6, -7, -8, 9, 10};
        assertEquals(-1000, Week3.minOfArray(c));
        int d[] = {3234, 2000, 3123, 4347324, 69, 6343, 79832743, 8332, 249, 42310};
        assertEquals(69, Week3.minOfArray(d));
        int e[] = {10, 20, 30, 40, 50, 60, 70, 80, -90, 100};
        assertEquals(-90, Week3.minOfArray(e));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI(){
        assertEquals("Thiếu cân", Week3.calculateBMI(40, 1.73));
        assertEquals("Bình thường", Week3.calculateBMI(60, 1.73));
        assertEquals("Bình thường", Week3.calculateBMI(49, 1.6));
        assertEquals("Thừa cân", Week3.calculateBMI(72, 1.73));
        assertEquals("Béo phì", Week3.calculateBMI(93, 1.73));

    }



}

