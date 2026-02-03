import java.util.Scanner;

class RobotSafetyException extends Exception{
    public RobotSafetyException (String message){
        super(message);
    }
} 
public class RobotHazardAuditor {
    public static void main(String[] args) throws RobotSafetyException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Arm Precision");
        double armPrecision = input.nextDouble();
        System.out.println("Enter Worker Density");
        int workerDensity = input.nextInt();
        System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
        String state = input.next();
        double result = CalculateHazardRisk(armPrecision,workerDensity,state);
        System.out.println("The result is "+result);
    }


    public static double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState)throws RobotSafetyException{
        double hazardRisk  =0 ;
        if (armPrecision <=0 || armPrecision >1) {
            throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
        }
        if (workerDensity<1 || workerDensity>20) {
            throw new RobotSafetyException("Error:Worker density must be 1-20");
        }
        if (!machineryState.equals("Worn") && !machineryState.equals("Faulty") && !machineryState.equals("Critical")) {
            throw new RobotSafetyException("Error: Unsupported machinery state");
        }

        if(machineryState.equals("Worn")){
            double machineRiskFactor = 1.3;
            hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
        }else if(machineryState.equals("Faulty")){
            double machineRiskFactor = 2.0;
            hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
        }else if(machineryState.equals("Critical")){
            double machineRiskFactor = 3.0;
            hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
        }

        return hazardRisk;
    }
}
