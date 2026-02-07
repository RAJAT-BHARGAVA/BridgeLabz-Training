package JavaStreams;
import java.util.*;
import java.util.stream.Collectors;

class Claim{
	private String claimType;
	private double claimPrice;
	
	public Claim(String claimType , double claimPrice) {
		this.claimType = claimType;
		this.claimPrice = claimPrice;
	}
	
	public String getClaimType() {
        return claimType;
    }
	
	public double getClaimPrice() {
        return claimPrice;
    }
	 public String toString() {
		 return claimType + " " + claimPrice;
	 }
}

public class ClaimInsurance {
	public static void main(String[] args) {
		List<Claim> claims = new ArrayList<>();
		 claims.add(new Claim("Health", 50000));
	     claims.add(new Claim("Vehicle", 150000));
	     claims.add(new Claim("Life", 75000));
         claims.add(new Claim("Property", 200000));
         claims.add(new Claim("Health", 30000));
         claims.add(new Claim("Vehicle", 120000));
         claims.add(new Claim("Life", 90000));
         claims.add(new Claim("Health", 45000));
         claims.add(new Claim("Property", 60000));
         claims.add(new Claim("Vehicle", 110000));
         
         Map<String , Double> claimaverage = claims.stream().collect(Collectors.groupingBy(Claim::getClaimType,Collectors.averagingDouble(Claim::getClaimPrice)));
         claimaverage.forEach((type,avg) -> System.out.println(type +" -> " + avg));
    }

}
