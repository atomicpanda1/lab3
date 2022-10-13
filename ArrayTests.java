import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverse5Elements() {
    int[] input1 = {1, 2, 3, 4, 5};
    //System.out.println(ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverse5ElementsInPlace() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    //System.out.println(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);
  }

  @Test
  public void testAverage2SameNumbersAnd1Lowest() {
    double[] input1 = {1, 1, 5, 5};
    assertEquals((5, ArrayExamples.averageWithoutLowest(input1), 0.001);
    //System.out.println(ArrayExamples.averageWithoutLowest(input1));
  }
}
