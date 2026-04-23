import java.util.*;

public class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter First Number : ");
		int num2 = sc.nextInt();
		
		System.out.print("Options : \n1.Addition \n2.Substraction \n3.Multiplication \n4.Division \nSelect An Option : ");
		int choice = sc.nextInt(); 

		try{

		switch(choice){
		case 1:
		System.out.println(num1 + " + "+num2+" = " +(num1+num2));
		break;
		case 2:
		System.out.println(num1 + " - "+num2+" = " +(num1-num2));
		break;
		case 3:
		System.out.println(num1 + " * "+num2+" = " +(num1*num2));
		break;
		case 4:
		System.out.println(num1 + " / "+num2+" = " +(num1/num2));
		break;
}
}catch(Exception e){
System.out.println("Second number cannot be zero while dividing");
}
}
}
