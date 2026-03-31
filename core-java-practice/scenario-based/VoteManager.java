import java.util.Scanner;
public class VoteManager {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;

        while(true){
            System.out.print("Enter your age :  ");
            int age = scanner.nextInt();

            if(age==-1){
                break;
            }



            if(age>=18){
                System.out.println("Eligible to vote ");
                System.out.println("vote for candidate ");
                System.out.println("1 . candidate1");
                System.out.println("2 . candidate2");
                System.out.println("3 . candidate3");
                 

                int vote = scanner.nextInt();

                if(vote==1){
                    candidate1++;
                }else if(vote==2){
                    candidate2++;
                }else if(vote==3){
                    candidate3++;
                }else{
                    System.out.println("Invalid vote ");
                }

                
            }else if(age>=0 && age<=17){
                System.out.println("Not Eligible to vote!!.. Only Above 18 is eligible ");
            }
        }
        
        System.out.println("Total Vote of Candidate 1 is :  "+ candidate1);
        System.out.println("Total Vote of Candidate 2 is :  "+ candidate2);
        System.out.println("Total Vote of Candidate 3 is :  "+ candidate3);


        scanner.close();
    }
}
