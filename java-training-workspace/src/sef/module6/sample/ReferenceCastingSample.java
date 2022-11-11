package sef.module6.sample;

public class ReferenceCastingSample {

	public static void main(String arg[]){
		
		Student s = new Student();
		s.setName("Jane Doe");
		s.setSchool("A Fictional School");
		s.setGrade(10);
		
		// Sample reference casting
		Person tempPerson = s; // convert student to person
		System.out.println(tempPerson.introduce());
		Student tempStudent = (Student)tempPerson; // convert person to student
		System.out.println(tempStudent.introduce());
	}
}
