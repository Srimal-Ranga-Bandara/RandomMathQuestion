import java.util.Random;
import java.util.Scanner;

public class Random_Math {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int  num1 = random.nextInt(10)+1;
        int  num2 = random.nextInt(10)+1;

        char[] operators = {'+','-','*','/'};
        char operator = operators[random.nextInt(operators.length)];

        double answer = 0;

        switch (operator) {
               case '+' : answer = num1+num2;
            break;

               case '-' : answer = num1-num2;
            break;

               case '*' : answer = num1*num2;
            break;

               case '/' : answer = num1/num2;
            break;
         }

         System.out.println("problenm is :"+num1+" "+operator+" "+num2);
         double number = scanner.nextDouble();

         if(number==answer){

            System.out.println("Your answer is correct");
         }

         else{

            System.out.println("Try Again");
         }

        
     }
}


