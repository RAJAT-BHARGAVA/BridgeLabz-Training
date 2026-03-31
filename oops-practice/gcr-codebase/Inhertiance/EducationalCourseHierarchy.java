package inheritance;

class Course {
	
	String courseName;
	int duration;
	
	Course(String courseName, int duration){
		this.courseName = courseName;
		this.duration = duration;
	}
	
	void displayCourseDetails() {
		System.out.println("Course Details");
		System.out.println("Course Name: "+courseName);
		System.out.println("Duration: "+duration+" months");
	}
}

class OnlineCourse extends Course {
	
	String platform;
	boolean isRecorded;
	
	OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
		super(courseName, duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}
	
	void displayCourseDetails() {
		System.out.println("Course Details");
		System.out.println("Course Name: "+courseName);
		System.out.println("Duration: "+duration+" months");
		System.out.println("Platform: "+platform);
		System.out.println("Recorded Lectures: "+isRecorded);
	}
}

class PaidOnlineCourse extends Course {
	
	int fee;
	float discount;
	
	PaidOnlineCourse(String courseName, int duration, int fee, float discount){
		super(courseName, duration);
		this.fee = fee;
		this.discount = discount;
	}
	
	void displayCourseDetails() {
		System.out.println("Course Details");
		System.out.println("Course Name: "+courseName);
		System.out.println("Duration: "+duration+" months");
		System.out.println("Fees: "+fee);
		System.out.println("Discount: "+discount+"%");
	}
}

public class EducationalCourseHierarchy {
	public static void main(String[] args) {
		Course course1 = new Course("Java with DSA", 4);
		OnlineCourse course2 = new OnlineCourse("Web Devlopment", 5, "Zoom", true);
		PaidOnlineCourse course3 = new PaidOnlineCourse("Android Devlopment", 4, 8000, 10.0f);
		course1.displayCourseDetails();
		course2.displayCourseDetails();
		course3.displayCourseDetails();
	}
}
