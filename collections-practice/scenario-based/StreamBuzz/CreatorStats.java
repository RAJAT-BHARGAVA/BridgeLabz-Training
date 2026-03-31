package stream_buzz;

public class CreatorStats {
	private String creatorName;
	private double[] weeklyLikes;
	private int idx;
	public CreatorStats(String creatorName, String likes) {
		this.creatorName=creatorName;
		weeklyLikes=new double[4];
		addLikes(likes);
		idx=0;
	}
	private void addLikes(String likes) {
		String[] arrayOfLikes=likes.trim().split(",");
		for(String like:arrayOfLikes) {
			weeklyLikes[idx++]=Double.parseDouble(like);
		}
	}
	public String getCreatorName() {
		return creatorName;
	}
	public int getLikesCountMoreThanThreshold(double likeThreshold) {
		int count=0;
		for(double likes:weeklyLikes) {
			if(likes>=likeThreshold) count++;
		}
		return count;
	}
	public double getTotalLikes() {
		double totalLikes=0;
		for(double likes:weeklyLikes) {
			totalLikes+=likes;
		}
		return totalLikes;
	}
}
