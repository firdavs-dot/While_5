import java.util.Scanner;

public class while5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int i = 0;
        while (i<n){
            double result = Math.pow(3,i);
            if(n> result){
                i++;
            } else if(n == result){
                System.out.print("3 - ning darajasi");
                break;
            } else{
                System.out.print("3 - ning darajasi emas");
                break;
            }
        }
    }
}
