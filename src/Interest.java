import java.util.Scanner;
public class Interest {
    public static void main(String[] args) throws Exception {
        double Principal;
         double Time;
         double Interest;
         double Money;
        try (Scanner Elvas = new Scanner(System.in))
        
     {   System.out.println("Enter the anount of money you want from the bank!")
          Principal = Elvas.nextDouble();
          System.out.println("Enter the time you needed to repay the loan" );
          Time = Elvas.nextDouble();
        System.out.println("Enter the interest to be paid back to the bank");
        Interest = Elvas.nextDouble();
        Money=(Principal*Interest)/Time ;
        System.out.println("The amount to be paid back after a period of "+ Time +" is "+Money+" Thank you very much!");
    }
}
}
