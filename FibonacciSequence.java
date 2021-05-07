import java.util.*;
public class FibonacciSequence{

   public static void main(String[] args){
      Scanner sc;
      boolean stop = true;
      while(stop){
         try{
            sc = new Scanner(System.in);
           
            System.out.println("WELCOME TO FIBONACCI NUMBER FINDER!!!");
            System.out.print("What nth term are you looking for?>  ");
            int input = sc.nextInt();
            System.out.println();
         
            long fib = 1;//starting fibonacci number
            long diff = 0;// difference between adjacent fibonacci numbers 
            int count = 1;
            long carry;
            if(input > 0){
               do{
                  count++;
               
                  System.out.print(fib + " ");
                  carry = fib;
                  fib += diff;
                  diff = carry;
               }while(count <= input);
            
               System.out.println("\nThe " + input + "th term you are looking for is " + carry + "!");
               
               boolean stop2 = true;
               while(stop2){
                  System.out.print("Do you want yo continue [y/n]: ");
                  char esc = sc.next().charAt(0);
               
                  if(esc == 'y' || esc == 'Y'){                       
                     stop2 = false;
                     System.out.println("====================================\n");
                  }else if(esc == 'N' || esc == 'n'){
                     stop2 = false;
                     stop = false;
                     System.out.print("Goodbye!");
                  }else{}
               }
               
              
            }else
               System.out.println("The input should be at least 1.\n************************************");
            
         }catch(InputMismatchException e){
            System.out.println("Wrong Input Type: Try Again.\n************************************");
         }
      }
   }
   
}