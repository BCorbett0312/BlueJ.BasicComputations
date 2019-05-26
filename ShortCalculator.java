 
import java.util.Scanner;
import java.lang.Math;

public class ShortCalculator {
      
    public void calculator(){
        Scanner input = new Scanner(System.in);
    
        System.out.println("Please enter a number ");
        short input1 = input.nextShort();
        
        
        
    
        System.out.println("Please enter another number ");
        short input2 = input.nextShort();
        
        System.out.println("Thank you.  Please wait.");
        System.out.println("...");
        System.out.println((input1) + " + " +(input2) + " = " + (input1+input2));
        System.out.println("...");
        System.out.println((input1) + " - " +(input2) + " = " + (input1-input2));
        System.out.println("...");
        System.out.println((input1) + " x " +(input2) + " = " + (input1*input2));
        System.out.println("...");
        System.out.println((input1) + " / " +(input2) + " = " + (input1/input2));
        System.out.println("...");
        System.out.println("The remainder of the division is " + (input1%input2));
       
        
    }
    
    
}
