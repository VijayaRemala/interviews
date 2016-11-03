package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
// final class we can not extends the scope
public final class Exercise1 {

	public static class Person {
		//because of final we can assain the values only once
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person() {
		}
    
             /**

	  One Argumented constructor is required to set the values for fields
         */
		
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		//public void setPhoneNumbers(Set<String> newPhoneNumbers) {
		//	phoneNumbers = newPhoneNumbers;
		//}
		
		public String getFirstName() {
			return firstName;
		}
		//public void setFirstName(String newName) {
		//	firstName = newName;
		//}
		
		public String getLastName() {
			return lastName;
		}
		//public void setLastName(String newName) {
		//	lastName = newName;
		//}
	}
}
