import java.util. *;
public class StudentScores {
	
	//Build a program that manages student grades using Java data structures.
	//Requirements
	//1. Store students and their grades

	//Use a HashMap<String, ArrayList<Integer>> where:

	//Key = student name
	//Value = list of their grades
	
	HashMap<String ,List<Integer>> studentScores = new HashMap<>();
	
	//String studentName;
	//ArrayList<Integer> grades = new ArrayList<>();
	
	
	public void addGrade(String studentName, int grade) {
	    List<Integer> grades = studentScores.getOrDefault(studentName, new ArrayList<>());
	    grades.add(grade);
	    studentScores.put(studentName, grades);
	}
	
	
	public double getAverage(String studentName) {
		List<Integer> grades = studentScores.get(studentName);
		double total = 0;
		for(int i=0;i < grades.size(); i++) {
			total = total + grades.get(i);
		}
		return total/grades.size();
	}
	
	

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		StudentScores student1 = new StudentScores();
		student1.addGrade("Amitha", 95);
		student1.addGrade("Amitha", 86);
		
		System.out.println("Amitha's average: " + student1.getAverage("Amitha"));
		

	}

}
