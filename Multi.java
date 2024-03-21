class Multi
{
public static void main(String[] args)
{
int a=Integer.parseInt(args[0]);
System.out.println("Multiplication table for "+a+" is :");
for (int i=1;i<=10;i++)
{
System.out.println(a+"*"+i+"="+(a*i));
}
}
}