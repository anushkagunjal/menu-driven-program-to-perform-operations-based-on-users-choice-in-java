import java.util.Scanner;

class Demo{
    public static void main(String args[]){
        int n1,n2,result,choice;
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Division\n5.Modulus\nEnter your choice:");
        choice = sc.nextInt();
        switch(choice){
            case 1:result=n1+n2;
            System.out.println("Sum"+" "+"is"+" "+ result);
            break;
            case 2:result=n1-n2;
            System.out.println("Difference"+" "+"is"+" "+result);
            break;
            case 3:result=n1*n2;
            System.out.println("Product"+" "+"is"+" "+result);
            break;
            case 4:result=n1/n2;
            System.out.println("Quotient"+" "+"is"+" "+result);
            break;
            case 5:result=n1%n2;
            System.out.println("Remainder"+" "+"is"+" "+result);
            break;
            default:System.out.println("Invalid choice");
        }
    }
}