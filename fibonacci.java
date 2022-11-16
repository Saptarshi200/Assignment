import java.util.Scanner;

public class fibonacci{
    public static void printFibonacci(int a, int b, int n){
        if(n == 0){
            return;
        }
        int nextterm = a + b;
        System.out.println(nextterm);
        printFibonacci(b, nextterm, n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(a + "\n"+ b);
        printFibonacci(a, b, n-2);
        sc.close();
    }
}
