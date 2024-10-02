import java.util.Scanner;
class calc{
public static void main (String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("enter the fun");
String fun = scan.nextLine();
System.out.println("enter the a num");
int a = scan.nextInt();
System.out.println("enter the b num");

int b = scan.nextInt();
System.out.println("answer");
switch(fun){
case "add":System.out.println(a+b);break;
case "sub":System.out.println(a-b);break;
case "mul":System.out.println(a*b);break;
case "div":System.out.println(a/b);break;
case "mod":System.out.println(a%b);break;
default:
System.out.println("in valid input");
}

}}
