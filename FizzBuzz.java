import java.lang.Integer;

public class FizzBuzz{
	public static void main(String[] args){
		//loop from 1 to args[0]
		int limit = Integer.parseInt(args[0]);

		for(int i = 1; i <= limit; i++){
			//verify conditions and print message
			//if((i%3 == 0) && (i%5 == 0)){
			//	System.out.println(i+"FizzBuzz");
			//}
			if(i%3 == 0){
				if(i%5 == 0){
					System.out.println(i+":FizzBuzz");
				}
				else{
					System.out.println(i+":Fizz");
				}
			}
			else if(i%5 == 0){
				System.out.println(i+":Buzz");
			}
			else{
				System.out.println(i);
			}

		}
	}

}
