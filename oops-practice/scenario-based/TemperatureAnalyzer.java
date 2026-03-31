package scenario_based;

public class TemperatureAnalyzer {
	
	static double getTemperature() {
		return (Math.random() * 110) - 50;
	}

	static int findHottestDay(double[][] tempData) {
		int day = 1;
		double hottestTemp = tempData[0][0];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 24; j++) {
				if (hottestTemp > tempData[i][j]) {
					hottestTemp = tempData[i][j];
					day = i + 1;
				}
			}
		}
		return day;
	}

	static int findColdestDay(double[][] tempData) {
		int day = 1;
		double coldestTemp = tempData[0][0];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 24; j++) {
				if (coldestTemp < tempData[i][j]) {
					coldestTemp = tempData[i][j];
					day = i + 1;
				}
			}
		}
		return day;
	}

	static double findAvgTemperature(double[][] tempData, int row) {
		double totalTemp = 0;
		for (int i = 0; i < 24; i++) {
			totalTemp += tempData[row][i];
		}
		return totalTemp / 24;
	}

	public static void main(String[] args) {
		double[][] temperatureData = new double[7][24];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 24; j++) {
				temperatureData[i][j] = getTemperature();
			}
		}
		int hottestDay = findHottestDay(temperatureData);
		int coldestDay = findColdestDay(temperatureData);
		System.out.println("Hottest Day is day " + hottestDay + " of the week");
		System.out.println("Coldest Day is day " + coldestDay + " of the week");
		for (int i = 0; i < 7; i++) {
			System.out.printf("Average temperature of day " + (i + 1) + " is %.2f degree celsius\n",
					findAvgTemperature(temperatureData, i));
		}
	}
}