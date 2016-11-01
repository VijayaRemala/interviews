package com.elsevier.education;

import java.util.*;

/**

can run with gradlew clean build; java -cp build/classes/main com.elsevier.education.Exercise3

TODO We should be able to call people.add() twice but end with only one object in it.

*/
public class Exercise3 {

	public static void main(String[] args) {
	
		Set<Person> people = new HashSet<>();
	
		Person p1 = new Person(1);
		people.add(p1);
		people.add(p1);
		
		/* we can get only one object here */
		System.out.println(people.size());
		
	/** in this if we remove the hashcode and eqals methods we can get the 2 objects*/
		
	}
	
	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		/** by using this hashcode method we can check the instance of the obects*/
		@Override
		public int hashCode() {
			return id * generator.nextInt();
		}
		
		/** by using this equals method we can check the content of the objects*/
		@Override
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
