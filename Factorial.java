import java.util.Scanner;
public class Factorial{
public static void main(String args[]){

//Write a program to find factorial of n
Scanner sc=new Scanner(System.in);

System.out.println("Enter a number");
int num=sc.nextInt();
int fact=1;
int temp=num;
for(; num>=1; num--){
    fact=fact*num;
}
    System.out.println("Factorial of "+temp +" is="+ fact);
}
}

