class A
{
void a()
{
 System.out.println("Class A");
}
}
class B extends A
{
void b()
{
System.out.println("Class B");
}
class Main class
{
public static void main(string args[])
{
B obj=new B();
obj.b();
obj.a();
}
}