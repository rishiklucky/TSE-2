import java.util.Scanner;

public class StringPalindrome{
	public boolean isPalindrome(String input){
		int left = 0;
		int right = input.length()-1;

		while(left<right){
			if(input.charAt(left) != input.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
	return true;

	}
	public static void main(String[] args){
	StringPalindrome s = new StringPalindrome();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a String : ");
	String inp = sc.next();
	System.out.println(s.isPalindrome(inp));
	}
}