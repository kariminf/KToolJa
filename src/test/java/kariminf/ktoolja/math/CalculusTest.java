package kariminf.ktoolja.math;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;


public class CalculusTest {
	
	//================================
	// JUnit tests
	//================================
	
	@Test
	public void testFactorial() {
		long start = System.nanoTime();
		int fact = Calculus.factorial(5);
		long end = System.nanoTime();
		System.out.println("Factorial time:" + (end - start) + " nanoseconds");
		assertEquals("factorial(5) must be 120;", 120, fact);
	}
	
	@Test
	public void combinationTest() {
		long start = System.nanoTime();
		int comb = Calculus.combination(5, 3);
		long end = System.nanoTime();
		System.out.println("Combination time:" + (end - start) + " nanoseconds");
		assertEquals("combination(5,3) msut be 10;", 10, comb);
	}
	
	@Test
	public void addMultipleTest() {
		List<Double> l = testList();
				
		long start = System.nanoTime();
		List<Double> l2 = Calculus.addMultiple(l, 0.0, 3);
		long end = System.nanoTime();
		
		l.add(0.0);l.add(0.0);l.add(0.0);
		System.out.println("Add multiple elements time:" + (end - start) + " nanoseconds");
		assertArrayEquals(l.toArray(), l2.toArray());
		
	}
	
	@Test
	public void delMultipleTest() {
		List<Double> l = testList();
		
		long start = System.nanoTime();
		List<Double> l2 = Calculus.delMultiple(l, 6.0);
		long end = System.nanoTime();
		
		l.remove(4); l.remove(2);
		
		System.out.println("Delete multiple elements time:" + (end - start) + " nanoseconds");
		assertArrayEquals(l.toArray(), l2.toArray());
		
	}
	
	@Test
	public void medianTest() {
		List<Double> l = testList();
		
		long start = System.nanoTime();
		double mediane = Calculus.median(l);
		long end = System.nanoTime();
		
		System.out.println("Median time:" + (end - start) + " nanoseconds");
		
		assertEquals("Median must be 3.5;", 3.5, mediane, 0.001);
		
	}

	@Test
	public void meanTest() {
		List<Double> l = testList();
		
		long start = System.nanoTime();
		double mean = Calculus.mean(l);
		long end = System.nanoTime();
		
		System.out.println("Mean time:" + (end - start) + " nanoseconds");
		assertEquals("Mean must be 3.625", 3.625, mean, 0.001);
		
	}

	@Test
	public void modeHighTest() {
		List<Double> l = testList();
		
		long start = System.nanoTime();
		double hmode = Calculus.modeHigh(l);
		long end = System.nanoTime();
		
		System.out.println("Higher Mode time:" + (end - start) + " nanoseconds");
		assertEquals("Higher Mode must be 6.0", 6.0, hmode, 0.001);
		
	}

	@Test
	public void modeLowTest() {
		List<Double> l = testList();
		
		long start = System.nanoTime();
		double lmode = Calculus.modeLow(l);
		long end = System.nanoTime();
		
		System.out.println("Lower Mode time:" + (end - start) + " nanoseconds");
		assertEquals("Lower Mode must be 2.0", 2.0, lmode, 0.001);
	}
	

	//================================
	// Normal application tests
	//================================
	
	public static void factorial_T() {
		long start = System.nanoTime();
		int fact = Calculus.factorial(5);
		long end = System.nanoTime();
		System.out.println();
		System.out.println("factorial(5): 120 = " + fact);
		System.out.println("==> took " + (end - start) + " nanoseconds");
	}
	
	public static void combination_T() {
		long start = System.nanoTime();
		int comb = Calculus.combination(5, 3);
		long end = System.nanoTime();
		System.out.println();
		System.out.println("combination(5,3): 10 = " + comb);
		System.out.println("==> took " + (end - start) + " nanoseconds");
	}

	public static void addMultiple_T() {
		List<Double> l = testList();
		System.out.println();
		System.out.println("list before = " + l);
		
		long start = System.nanoTime();
		List<Double> l2 = Calculus.addMultiple(l, 0.0, 3);
		long end = System.nanoTime();
		
		System.out.println("after adding 3 elements of 0.0 = " + l2);
		System.out.println("==> took " + (end - start) + " nanoseconds");
		
	}

	
	public static void delMultiple_T() {
		List<Double> l = testList();
		System.out.println();
		System.out.println("list before = " + l);
		
		long start = System.nanoTime();
		List<Double> l2 = Calculus.delMultiple(l, 6.0);
		long end = System.nanoTime();
		
		System.out.println("after deleting elements of 6.0 = " + l2);
		System.out.println("==> took " + (end - start) + " nanoseconds");
		
	}

	public static void median_T() {
		List<Double> l = testList();
		System.out.println();
		System.out.println("list = " + l);
		
		long start = System.nanoTime();
		double mediane = Calculus.median(l);
		long end = System.nanoTime();
		
		System.out.println("mediane: 3.5 = " + mediane);
		System.out.println("==> took " + (end - start) + " nanoseconds");
		
	}

	public static void mean_T() {
		List<Double> l = testList();
		System.out.println();
		System.out.println("list = " + l);
		
		long start = System.nanoTime();
		double mean = Calculus.mean(l);
		long end = System.nanoTime();
		
		System.out.println("mean: 3.625 = " + mean);
		System.out.println("==> took " + (end - start) + " nanoseconds");
	}

	public static void modeHigh_T() {
		List<Double> l = testList();
		System.out.println();
		System.out.println("list = " + l);
		
		long start = System.nanoTime();
		double hmode = Calculus.modeHigh(l);
		long end = System.nanoTime();
		
		System.out.println("higher mode: 6.0 = " + hmode);
		System.out.println("==> took " + (end - start) + " nanoseconds");
	}

	public static void modeLow_T() {
		List<Double> l = testList();
		System.out.println();
		System.out.println("list = " + l);
		
		long start = System.nanoTime();
		double lmode = Calculus.modeLow(l);
		long end = System.nanoTime();
		
		System.out.println("Lower mode: 2.0 = " + lmode);
		System.out.println("==> took " + (end - start) + " nanoseconds");
	}

	public static void variance_T() {
		//TODO complete
	}

	public static void skewness_T() {
		//TODO complete
	}

	
	public static void getCombinations_T() {
		//TODO complete
	}
	
	private static List<Double> testList(){
		List<Double> k = new ArrayList<Double>();
		k.add(5.0);
		k.add(1.0);
		k.add(6.0);
		k.add(2.0);
		k.add(6.0);
		k.add(4.0);
		k.add(2.0);
		k.add(3.0);
		return k;
	}

	public static void main(String[] args) {
		
		factorial_T();
		combination_T();
		addMultiple_T();
		delMultiple_T();
		median_T();
		mean_T();
		modeHigh_T();
		modeLow_T();
		variance_T();
		skewness_T();
		getCombinations_T();

	}

}
