package com.gfg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParametrizedUnitTest {

    @DataProvider(name = "numbers")
    public static Object[][] evenNumbers() {
        return new Object[][]{{11, false}, {2222, true}, {4882, true}};
    }

    @Test(dataProvider = "numbers")
    public void evenNumberCheck(Integer number, boolean expected) {
        assertEquals(expected, number % 2 == 0);
    }

    @Test(dataProvider = "numbersObject")
    public void evenNumberObjectCheck(EvenNumberPOJO number) {
        assertEquals(number.isEven(), number.getValue() % 2 == 0);
    }

    @DataProvider(name = "numbersObject")
    public Object[][] parameterProvider() {
        return new Object[][]{{new EvenNumberPOJO(111, false)}, {new EvenNumberPOJO(2432, true)}, {new EvenNumberPOJO(4712, true),}};
    }

    class EvenNumberPOJO {
        private int value;
        private boolean isEven;

        EvenNumberPOJO(int number, boolean isEven) {
            this.value = number;
            this.isEven = isEven;
        }

        int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        boolean isEven() {
            return isEven;
        }

        public void setEven(boolean even) {
            isEven = even;
        }

        @Override
        public String toString() {
            return "EvenNumber{" +
              "value=" + value +
              ", isEven=" + isEven +
              '}';
        }
    }
}




