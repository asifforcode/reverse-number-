import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        // print reverse of a number
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        while (num>0){

           int lastdigit=num%10;
            System.out.print(lastdigit);
            num=num/10;


        }
        System.out.println();




    }

        }

