public class Day3Q2 {
    
    
    public static void main(String[] args) {
        int number = 132, result = 0, originalNum = number, remainder = 0;
        
        while(number!=0) {
            remainder = number%10;
            result = result*10 + remainder;
            number /= 10; 
        }
        if(number % 2 == 0 && result == originalNum) {
            System.out.println("The number is Palindrome");
        } else {
            System.out.println("The number is not Palindrome number");
        }
    }
}
