package day9;

import java.util.Scanner;

public class AddDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2;
		char ch;
		 Scanner sc = new Scanner(System.in);
		
		do
		{
        System.out.print("Enter first number:");

       
        num1 = sc.nextDouble();
        System.out.print("Enter second number:");
        num2 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

      
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
        System.out.println("Do you want to continue??(y/n)");
        ch=sc.next().charAt(0);
	}while(ch=='y'||ch=='Y');

}


	}


