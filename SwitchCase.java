import java.util.*;
public class SwitchCase 
{
public static void main(String[] args)
{
int a=4,b=2;
Scanner sc=new Scanner(System.in);
System.out.println("**********");
System.out.println("*ARITHMATIC OPERATIONS***");
System.out.println("1.add");
System.out.println("2.sub");
System.out.println("3.MUL");
System.out.println("4.div");
System.out.println("Enter your choice");
int ch=sc.nextInt();
switch(ch)
{
case 1->System.out.println("addition result is :"+(a+b));
case 2->System.out.println("subtraction result is:"+(a-b));


case 3->System.out.println("mul result is :"+(a*b));
case 4->System.out.println("div result is:"+(a/b));

default ->System.out.println("give proper option");
}
sc.close();
}
}





