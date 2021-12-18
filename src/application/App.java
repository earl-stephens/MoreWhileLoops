package application;

public class App {

	public static void main(String[] args) {
		//var infers the variable type based on what's assigned to
		//Java is strongly typed - needs the variable type declared
		var count = 0;
		
		while(count < 10) {
			System.out.printf("count is %d\n", count);
			//if you did count-- it would be an infinite loop
			count++;
		}
		
		int counter = 10;
		while(counter > 0) {
			System.out.printf("Counter value is %d\n", counter);
			--counter;
		}
	}

}
