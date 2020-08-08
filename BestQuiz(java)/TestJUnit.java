/**
 * This is JUnit that tests the sleepIn method that is available in SleepIn class.
 * This contains 4 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase4).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
	@Test
	public void testCase1() {
		assertEquals(new BestQuiz().bestQuiz(new int[][]{{ 88,  80, 91 }, { 68, 100, -1}}),2);
	}

	@Test
	public void testCase2() {
		assertEquals(new BestQuiz().bestQuiz(new int[][]{{80,  91, 82}, {-1, -1, 100}}),1);
	}

	@Test
	public void testCase3() {
		assertEquals(new BestQuiz().bestQuiz(new int[][]{{88,  89, 90}, {-1, -1, -1 }}),2);
	}

	@Test
	public void testCase4() {
		assertEquals(new BestQuiz().bestQuiz(new int[][]{{80, 88,  80}, {100, 68, 100}}),0);
	}

	@Test
	public void testCase5() {
		assertEquals(new BestQuiz().bestQuiz(new int[][]{{-1,  -1, -1}, {-1,  -1, -1}}),-1);
	}

}
