import java.util.*;
class MulDimArr{
    public static void main(String[] ar){
        int marks[][]=new int[10][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter roll no and marks");
        for(int i=0;i<marks.length;i++){
            System.out.println("rollno");
            marks[i][0]=sc.nextInt();
            System.out.println("marks");
            marks[i][1]=sc.nextInt();
        }
        for(int j=0;j<marks.length;j++){
            System.out.println("roll no"+marks[j][0]+"marks"+marks[j][1]);
        }
    }
}