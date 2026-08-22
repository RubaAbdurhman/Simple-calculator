import java. util.*;
public class Main{
	public static void main(String[] args){
		int option,num1,num2;
		boolean decision=true;
		System.out.println("***BASTC CALCULATOR PROGRAM***");
		Scanner in=new Scanner(System.in);
		do{
		    System.out.println("Following operation are available to perform:");
		    System. out. println("Enter number 1 to perform addition ");
            System. out. println("Enter number2 to perform subtraction ");
            System . out.println("Enter number3 to perform multipliction ");
            System.out.println("Enter number4 to perform Division");
            
            option=in.nextInt();
             switch (option){
                 case 1:
                     System. out. println("Enter two number to be added ");
                     num1=in. nextInt();
                     num2=in. nextInt();
                     int method1=add(num1,num2);
                     System. out. println("The result of "+num1+"+"+num2+"is"+method1);
                     break;
                     case 2:
                         System. out. println("Enter two numbers to subtracted ");
                        num1=in.nextInt();
                        num2=in.nextInt();
                        int method2=substract(num1,num2);
                        System.out.println("the result of"+num1+"-"+num2+"is"+method2);
                        break;
                        case 3:
                        System. out. println("Enter two numbers to multiplied:");
                        num1=in.nextInt();
                        num2=in.nextInt();
                        int method3=multiply (num1,num2);
                        System.out.println("the result of"+num1+"*"+num2+"is"+method3);
                        break;
                        case 4:
                        System. out. println("Enter two numbers to divided:");
                        num1=in.nextInt();
                        num2=in.nextInt();
                        int method4=divided(num1,num2);
                        System.out.println("the result of"+num1+"/"+num2+"is"+method4);
                        break;
                        default:
                        System. out. println("This is a wrong choice ");
                        break;
             }
    	}while (decision==true);
	}

public static int add(int num1,int num2)
{int result=num1+num2;
return result;
}
public static int substract(int num1,int num2)
{int result=num1-num2;
return result;
}
public static int multiply(int num1,int num2)
{int result=num1*num2;
return result;
}
public static int divided(int num1,int num2)
{int result=num1/num2;
return result;}}

