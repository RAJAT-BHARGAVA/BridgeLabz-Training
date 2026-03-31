package stream_buzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static List<CreatorStats> EngagementBoard=new ArrayList<>();
	
	public void RegisterCreator(String creatorName,String likes) {
		EngagementBoard.add(new CreatorStats(creatorName,likes));
	}
	
	public HashMap<String,Integer> GetTopPostCounts(List<CreatorStats> Stats, double likeThreshold){
		HashMap<String,Integer> map=new HashMap<>();
		for(CreatorStats stat:Stats) {
			int likeCount=stat.getLikesCountMoreThanThreshold(likeThreshold);
			if(likeCount>0) {
				map.put(stat.getCreatorName(),likeCount);
			}
		}
		return map;	
	}
	public double calculateAverageLikes(List<CreatorStats> Stats) {
		double total=0;
		for(CreatorStats stat:Stats) {
			total+=stat.getTotalLikes();
		}
		return total/(Stats.size()*4);
	}
	static void displayOptions() {
		System.out.println("1. Register Creator");
		System.out.println("2. Show Top Posts");
		System.out.println("3. Calculate Average Likes");
		System.out.println("4. Exit");
		System.out.println("Enter your Choice");
	}

	public static void main(String[] args) {
		Program program=new Program();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			displayOptions();
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter the creator name: ");
				String creatorName=sc.nextLine().trim();
				System.out.println("Enter the weekly likes: ");
				String weeklyLikes=sc.nextLine().trim();
				program.RegisterCreator(creatorName,weeklyLikes);
				System.out.println("Creator registered successfully");
				break;
			case 2:
				System.out.println("Enter the threshold: ");
				double likeThreshold=sc.nextDouble();
				HashMap<String,Integer> map=program.GetTopPostCounts(EngagementBoard, likeThreshold);
				if(map.size()==0) {
					System.out.println("No top-performing posts this week.");
				}else {
					System.out.println(map);
				}
				break;
			case 3:
				double avg=program.calculateAverageLikes(EngagementBoard);
				System.out.println("Overall average weekly likes: "+avg);
				break;
			case 4:
				flag=false;
				System.out.println("Logging off — Keep Creating with StreamBuzz!");
				break;
			}
			
		}
		sc.close();
		
	}
}
