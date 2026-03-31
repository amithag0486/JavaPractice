
public class Methods {
	
	static void welcomeMethod(){
		System.out.println("Welcome to Java"); 
		
	}
	

	//Write a method findSecondLargest(int[] numbers) that returns the second-largest integer in an array.
	 //Constraint: You cannot use Arrays.sort(). You must iterate through the array manually.
	static void SecondLargect(int[] numbers) {
	
	int FirstLargest = numbers[0];
	
	for(var v: numbers) {
		if(FirstLargest < v) {
			FirstLargest = v;
		}
	}
	
	int SecondLargest = numbers[0];
	
	for(var i: numbers) {
		if(i < FirstLargest && SecondLargest < i) {
			SecondLargest = i;
		}
	}
	System.out.println(FirstLargest);
	System.out.println(SecondLargest);
	
	}
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		welcomeMethod();
		int numbers1[] = {20, 22, 18, 35, 48, 26, 87, 70};
		SecondLargect(numbers1);

	}

}
