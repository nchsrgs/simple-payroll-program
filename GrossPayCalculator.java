import java.util.Scanner;

public class GrossPayCalculator{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        while(true){
        System.out.println("Press 'F' for Full Time or 'P' for Part Time('Q' to Exit Program): ");
        char pf = sc.next().charAt(0);

        
        if(pf == 'P' || pf == 'p'){
            System.out.println("--- Part Time Employee ---");
            System.out.println("Enter rate per hour: ");
            double rate_per_hour = sc.nextDouble();

            System.out.println("Enter no. of hours worked: ");
            int hrs_worked = sc.nextInt();

            System.out.println("Enter no. of overtime: ");
            int over_time = sc.nextInt();
            
            System.out.println("___________________________________________");
            
            System.out.println("Employee Name: " + name);
            double basic_pay = rate_per_hour * hrs_worked;
            System.out.println("Basic Pay: "  + basic_pay);

            double ot_compute = (double)over_time *(rate_per_hour*1.25);
            System.out.println("OverTime Pay: " + ot_compute);

            System.out.println("______________________________________________");
            double gross_pay = ot_compute + basic_pay;
            System.out.println("Gross Pay = " + gross_pay);
            
        }
        else if(pf == 'F' || pf == 'f'){
            System.out.println("--- Full Time Employee ---");
            System.out.println("Enter Basic Pay: ");
            double b_pay = sc.nextDouble();
            System.out.println("________________________________________________");
            sc.nextLine();

            System.out.println("Employee Name: " + name);
            System.out.println("Basic Pay: " + b_pay);
            System.out.println("________________________________________________");
            
            System.out.println("Gross Pay: " + b_pay);

        }
        else if(pf == 'q' || pf == 'Q'){
            System.out.println("Thankyou!! See You Again!!");
            System.exit(0);
        }
        else{
            System.out.println("Invalid Input.Please try Again!!!");
        }
    }
    }
}