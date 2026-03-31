package scenario_based;
import java.util.Scanner;

public class StudentScore {
	
	static int findAvgScore(int[] scores) {
		int totalMarks = 0;
		for (int score : scores) {
			totalMarks += score;
		}
		return totalMarks / scores.length;
	}

	static int findHighestMarks(int[] scores) {
		int highest = scores[0];
		for (int score : scores) {
			if (score > highest) {
				highest = score;
			}
		}
		return highest;
	}

	static int findLowestMarks(int[] scores) {
		int lowest = scores[0];
		for (int score : scores) {
			if (score < lowest) {
				lowest = score;
			}
		}
		return lowest;
	}

	static int[] findScoreAboveAverage(int[] scores, int avg) {
		int count = 0;
		for (int score : scores) {
			if (score > avg)
				count++;
		}
		int[] scoreAboveAvg = new int[count];
		int j = 0;
		for (int score : scores) {
			if (score > avg)
				scoreAboveAvg[j++] = score;
		}
		return scoreAboveAvg;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfStudents;
		while (true) {
			System.out.print("Enter number of students: ");
			numberOfStudents = input.nextInt();
			if (numberOfStudents <= 0) {
				System.out.println("Enter positive number");
			} else {
				break;
			}
		}
		int[] scores = new int[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			int score;
			while (true) {
				System.out.print("Enter student score: ");
				score = input.nextInt();
				if (score <= 0) {
					System.out.println("Enter positive number");
				} else {
					break;
				}
			}
			scores[i] = score;
		}
		int avgScore = findAvgScore(scores);
		System.out.println("Average score: " + avgScore);
		System.out.println("Highest Marks: " + findHighestMarks(scores));
		System.out.println("Lowest marks: " + findLowestMarks(scores));
		int[] scoreAboveAverage = findScoreAboveAverage(scores, avgScore);
		System.out.print("Scores above Avergae: ");
		for (int score : scoreAboveAverage) {
			System.out.print(score + " ");
		}
		input.close();
	}
}
