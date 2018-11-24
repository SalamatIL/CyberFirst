
public class ForEachClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {128,444,507,354,144};
		int highest_mark = maximum(marks); 
		System.out.println(highest_mark);

	}
	public static int maximum(int[] myArray) {
		int max = myArray[0];
		for (int number:myArray) {  //it means each <number> from <myArray> 
			if (number>max) {
				max = number;
			}
			
		}
		return max;
	}

}
