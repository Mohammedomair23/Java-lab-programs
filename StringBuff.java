import java.util.*;
class StringBuff{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.next();
        s1.concat("Hey");
        System.out.println("String after concatenation "+s1);
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Hi");
        System.out.println("String After Appending "+sb);
        sc.close();
     }
}
