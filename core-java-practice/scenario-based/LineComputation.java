import java.util.Scanner;
public class LineComputation {
    public static void main (String [] args ){
        System.out.println("Enter the points of line 1");
        double lengthLine1= computation();
        System.out.println("Enter the points of line 2");
        double lengthLine2= computation();
        System.out.println(lengthLine1);
        System.out.println(lengthLine2);
        // call for compare the lines // uc2
        compare(lengthLine1, lengthLine2);
        

    }
    // uc 2
    public static void compare(double lengthLine1 , double lengthLine2){
        if(lengthLine1==lengthLine2){
            System.out.println("Both are Equal");
        }else if(lengthLine1>lengthLine2){
            System.out.println("Line 1 is greater than Line 2");
        }else{
            System.out.println("Line 2 is greater than Line 1");
        }
    }

    // uc 1
    public static double computation(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cartision po x1 :  ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the cartision po y1 :  ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter the cartision po x2 :  ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the cartision po y2 :  ");
        double y2= scanner.nextDouble();

        double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return length ;
    }
    
}
