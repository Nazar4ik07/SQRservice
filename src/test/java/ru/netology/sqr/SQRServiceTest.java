package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void testWhenFewSquaresFoundSQuares(){
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinMax(){
        SQRService service = new SQRService();

        int actual = service.calc(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAllPossibleNumbers(){
        SQRService service = new SQRService();

        int actual = service.calc(0, 9801);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testWhenMinBiggerMax(){
        SQRService service = new SQRService();

        int actual = service.calc(400, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        SQRService service = new SQRService();

        int actual = service.calc(100, 800);
        int expected = 19;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenMinAndMaxSmallerMin(){
        SQRService service = new SQRService();

        int actual = service.calc(5, 10);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegativesValuesOf(){
        SQRService service = new SQRService();

        int actual = service.calc(-100, 0);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testZerro(){
        SQRService service = new SQRService();

        int actual = service.calc(0, 0);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
        @Test
        public void test8() {
            SQRService service = new SQRService();

            int actual = service.calc(200, 600);
            int expected = 10;

            Assertions.assertEquals(expected, actual);
        }
    @Test
    public void test9() {
        SQRService service = new SQRService();

        int actual = service.calc(10, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}