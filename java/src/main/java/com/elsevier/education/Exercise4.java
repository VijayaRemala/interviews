package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/

/** we need do syncronization in method level */
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public syncronized int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			count = 0;
		}

	}
}
