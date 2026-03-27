
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Amitha";
		int age = 39;
		 
		System.out.println("Name is " + name + " and age is " + age);
		
		int studentID = 0001;
		double scores = 98.99;
		char grade = 'A';
		
		System.out.println("Student ID is " + studentID + " score is " + scores + " and grade is " + grade);
		
		String name1 = "Amitha Ganesh";
		int nameLength = name1.length();
		int nameIndex = name1.indexOf("e");
		
		System.out.println("The String " + name1 + " is of " 
		+ nameLength + " long and the index of letter 'e' is " 
				+ nameIndex);
		
		int minAge = 30;
		int myAge = 31;
		
		if(minAge <= myAge) {
			System.out.println("You are greater than min age requiremnts ");
		} else {
			System.out.println("You are lesser than min age requiremnts ");
		}
			
	}

}
