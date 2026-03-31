import java.util.Scanner;

public class WageComputation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Employee Wage Computation Program");


        int wagePreHour = 20;
        int workHourPreDay = 8;
        int wagePreHourPart = 10;
        int workHourPreDayPart = 8;


        // usecase 1 where it checks employee is present or not 
        int isPresent = (int)(Math.random()*2);// generate 0 or 1
        if(isPresent==1){
            System.out.println("employee is present");
        }else{
            System.out.println("Employee is Absent");
            return;
        }


        // usecase 2 where calcute wage
        System.out.println("1. full time Employee \n2.Part time Employee");
        System.out.println("Enter your type of Employement");
        int typ = sc.nextInt();
        
        switch(typ){
            case 1:
                int dailyWage = wagePreHour*workHourPreDay;
                System.out.println("Total working hour in a day :    "+ workHourPreDay);
                System.out.println("Your wage for a day is :    " + dailyWage);
                int totalHourMonth = workHourPreDay*20;
                System.out.println("Total hours in month :      "+totalHourMonth);
                System.out.println("Your monthly wage is :      " + dailyWage*20);
                if(totalHourMonth>100){
                    System.out.println("you have crossed the total working hours limit !!!");
                }
                break;

            case 2:
                int wagePart = workHourPreDayPart*wagePreHourPart;
                System.out.println("Total working hour in a day "+ workHourPreDayPart);
                System.out.println("Your wage for a day is :    "+ wagePart); 
                int totalHourMonthPart = workHourPreDayPart*20;
                System.out.println("Total hours in month :  "+totalHourMonthPart);
                System.out.println("Your monthly wage is :  " + wagePart*20);
                if(totalHourMonthPart>100){
                    System.out.println("you have crossed the total working hours limit !!!");
                }
                break;

        }
        sc.close();
    }   
}
