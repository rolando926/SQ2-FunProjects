public class Palindrome{
	public static void main(String[] args){
		String str = args[0];
		String str2 = "";

		//idea #1: reverse it and save it in different variable, 
		//then compare it

		for(int i = str.length() - 1; i >= 0; i--){
			str2 = str2 + str.charAt(i);
		}

		if(str.equals(str2)){
			System.out.println("Is Palindrome!");
		}
		else{
			System.out.println("Not a Palindrome!");
		}

	}

}
