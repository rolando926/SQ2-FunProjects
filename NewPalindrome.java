public class NewPalindrome{
	public static void main(String[] args){
		String str = args[0];
		boolean blnPalindrome = true;
		int y = str.length() - 1;

		for (int i = 0; i < y; i++){
			if(!(str.charAt(i) == str.charAt(y))){
				System.out.println("Not a Palindrome!!!");
				blnPalindrome = false;
				break;
			}
			y--;
		}

		if(blnPalindrome){
			System.out.println("Is a Palindrome!!!");
		}

	}

}
