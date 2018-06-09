/**
 * Created by shawn on 9/9/2017.
 */
package CSE464_Assignment1;
import org.junit.Test;
import static org.junit.Assert.*;


public class RootsTest {
    Roots rootsObject = new Roots();

    @Test
    public void test1() {
        double a = 0;
        double b = 50;
        double c = 50;

        rootsObject.calculate_roots(a, b, c);
        double[] expectedResult = {0.0,-1.0,-1.0};
        double[] result = {rootsObject.num_roots(), rootsObject.first_root(), rootsObject.second_root()};

        assertArrayEquals(expectedResult, result, 0.001);
    }

    @Test
    public void test2() {
        double a = 1;
        double b = -10;
        double c = -11;

        rootsObject.calculate_roots(a, b, c);
        double[] expectedResult = {2.0,11.0,-1.0};
        double[] result = {rootsObject.num_roots(), rootsObject.first_root(), rootsObject.second_root()};

        assertArrayEquals(expectedResult, result, 0.001);
    }

    @Test
    public void test3() {
        double a = 2;
        double b = 4;
        double c = 2;

        rootsObject.calculate_roots(a, b, c);
        double[] expectedResult = {1.0,-1.0,-1.0};
        double[] result = {rootsObject.num_roots(), rootsObject.first_root(), rootsObject.second_root()};

        assertArrayEquals(expectedResult, result, 0.001);
    }

    @Test
    public void test4() {
        double a = 4;
        double b = 2;
        double c = 4;

        rootsObject.calculate_roots(a, b, c);
        double[] expectedResult = {0.0,-1.0,-1.0};
        double[] result = {rootsObject.num_roots(), rootsObject.first_root(), rootsObject.second_root()};

        assertArrayEquals(expectedResult, result, 0.001);
    }

    @Test
    public void test5() {
        double a = -2;
        double b = 0;
        double c = 200;

        rootsObject.calculate_roots(a, b, c);
        double[] expectedResult = {2.0,-10.0,10.0};
        double[] result = {rootsObject.num_roots(), rootsObject.first_root(), rootsObject.second_root()};

        assertArrayEquals(expectedResult, result, 0.001);
    }

    @Test
    public void test6() {
        double a = -2;
        double b = 4;
        double c = 0;

        rootsObject.calculate_roots(a, b, c);
        double[] expectedResult = {2.0,0.0,2.0};
        double[] result = {rootsObject.num_roots(), rootsObject.first_root(), rootsObject.second_root()};

        assertArrayEquals(expectedResult, result, 0.001);
    }

    @Test
    public void test7() {
        double a = 1;
        double b = 8;
        double c = 12;

        rootsObject.calculate_roots(a, b, c);
        double[] expectedResult = {2.0,-2.0,-6.0};
        double[] result = {rootsObject.num_roots(), rootsObject.first_root(), rootsObject.second_root()};

        assertArrayEquals(expectedResult, result, 0.001);
    }

    @Test
    public void test8() {
        double a = 1;
        double b = 12;
        double c = 20;

        rootsObject.calculate_roots(a, b, c);
        double[] expectedResult = {2.0,-2.0,-10.0};
        double[] result = {rootsObject.num_roots(), rootsObject.first_root(), rootsObject.second_root()};

        assertArrayEquals(expectedResult, result, 0.001);
    }

    @Test
    public void test9() {
        double a = -2;
        double b = 6;
        double c = 56;

        rootsObject.calculate_roots(a, b, c);
        double[] expectedResult = {2.0,-4.0,7.0};
        double[] result = {rootsObject.num_roots(), rootsObject.first_root(), rootsObject.second_root()};

        assertArrayEquals(expectedResult, result, 0.001);
    }

    @Test
    public void test10() {
        double a = -5;
        double b = 15;
        double c = 90;

        rootsObject.calculate_roots(a, b, c);
        double[] expectedResult = {2.0,-3.0,6.0};
        double[] result = {rootsObject.num_roots(), rootsObject.first_root(), rootsObject.second_root()};

        assertArrayEquals(expectedResult, result, 0.001);
    }

    @Test
    public void test11() {
        double a = 1;
        double b = -14;
        double c = 45;

        rootsObject.calculate_roots(a, b, c);
        double[] expectedResult = {2.0,9.0,5.0};
        double[] result = {rootsObject.num_roots(), rootsObject.first_root(), rootsObject.second_root()};

        assertArrayEquals(expectedResult, result, 0.001);
    }

    @Test
    public void test12() {
        double a = 1;
        double b = 4;
        double c = -21;

        rootsObject.calculate_roots(a, b, c);
        double[] expectedResult = {2.0,3.0,-7.0};
        double[] result = {rootsObject.num_roots(), rootsObject.first_root(), rootsObject.second_root()};

        assertArrayEquals(expectedResult, result, 0.001);
    }
}
