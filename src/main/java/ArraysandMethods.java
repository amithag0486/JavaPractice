
public class ArraysandMethods {
	
	public static void main(String[] args) {
	
	int dice = 1;
	
	while (dice <= 6) {
		if (dice < 6) {
			System.out.println("not 6");
			
		}else {
			System.out.println("6!!");
		}
		
		dice = dice + 1;
	
	}
	
	//Multiplication table for a given number
	
	int n = 2;
	
	for(int i= 0; i <= 10; i++) {
		System.out.println(n + " * " + i + " = " + n*i );
	}
	
	//calculates the average of different ages
	
	int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
	
	float avg, sum = 0;
	
	for(int age: ages) {
		sum =sum +age ;
	}
	
	int agesLength = ages.length;
	
	avg = sum/agesLength ;
	
	System.out.println(avg);
	
	//lowest age among different age
	
	
	int LowestAge = ages[0];
	
	for(var age: ages) {
		if(LowestAge > age) {
			LowestAge = age;
		}
	}
	System.out.println(LowestAge);
	
	//Write a method findSecondLargest(int[] numbers) that returns the second-largest integer in an array.
	 //Constraint: You cannot use Arrays.sort(). You must iterate through the array manually.
	
	int FirstLargest = ages[0];
	
	for(var v: ages) {
		if(FirstLargest < v) {
			FirstLargest = v;
		}
	}
	
	int SecondLargest = ages[0];
	
	for(var i: ages) {
		if(i < FirstLargest && SecondLargest < i) {
			SecondLargest = i;
		}
	}
	System.out.println(FirstLargest);
	System.out.println(SecondLargest);

}}
