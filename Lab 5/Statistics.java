package studentScoreCalculation;


public class Statistics {
	int[] lowscores = new int[5];

	int[] highscores = new int[5];

	float[] avgscores = new float[5];

	void findlow(Student[] a) {
		
		/*
		 * This method will find the lowest score and store it in an array names
		 * lowscores.
		 */
		// System.out.printf("\nLowest scores:");
		for (int i = 0; i < 5; i++) {
			int x = 0;
			int y = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] != null) {
					x = a[j].getScores()[i];

					if (j == 0) {

						// lowscores[i] = x;
						y = a[j].getScores()[i];
						lowscores[i] = y;

					}
					if (j > 0) {
						if (a[j].getScores()[i] < lowscores[i]) {
							y = a[j].getScores()[i];
							lowscores[i] = y;
							y = lowscores[i];
							// x = lowscores[i];
						}

					}
				}
				// System.out.printf(" %d", y);
			}
		}

	}

	void findhigh(Student[] a) {

		/*
		 * This method will find the highest score and store it in an array names
		 * highscores.
		 */
		// System.out.printf("\nHighest scores:");
		for (int i = 0; i < 5; i++) {
			int x = 0;
			int y = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] != null) {
					x = a[j].getScores()[i];

					if (j == 0) {

						// lowscores[i] = x;
						y = a[j].getScores()[i];
						highscores[i] = y;

					}
					if (j > 0) {
						if (a[j].getScores()[i] > highscores[i]) {
							y = a[j].getScores()[i];
							highscores[i] = y;
							y = highscores[i];
							// x = lowscores[i];
						}
					}

				}
			}
			// System.out.printf(" %d", y);
		}
	}

	void findavg(Student[] a) {

		/*
		 * This method will find avg score for each quiz and store it in an array names
		 * avgscores.
		 */
		// System.out.printf("\nAverage Scores:");
		for (int i = 0; i < 5; i++) {
			float x = 0;
			float y = 0;
			float average = 0;
			float counter = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] != null) {
					if (j == 0) {
						x = a[j].getScores()[i];
						average = average + x;
					} else {
						y = a[j].getScores()[i];

						average = average + y;
						counter++;
					}
				}

				// System.out.printf(" %f", average);

			}

			average = average / (counter + 1);
			avgscores[i] = average;
		}
	}

	// add methods to print values of instance variables.
	public void print() {
		// This method prints out all of the statistics stored in the arrays
		System.out.printf("\nLowest Scores: ");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d ", lowscores[i]);
		}
		System.out.printf("\nHighest Scores: ");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d ", highscores[i]);
		}
		System.out.printf("\nAverage Scores: ");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%1.1f ", avgscores[i]);
		}
	}

}
/*
 * Started with getting the program set up, so I can have a skeleton to work
 * with the next day. It took me a while but I finally figured out how to read
 * the file and open it. Once I figured that out, I printed out what was in the
 * text file. I tried to use parse int to convert the entries in the file to a
 * variable, but I ran into problems. The first line was a string, so I printed
 * out that line, pretty much skipped over it, and the converted the next 40
 * lines. After that, all of the numbers were converted. Finding the high low
 * and average was difficult. First started with low scores, it took me a while,
 * but after testing many different ways to get results, I was able to get the
 * results I wanted. The variables were not set correctly, and they were giving
 * me results of high scores instead of low scores. So I was able to put it in a
 * loop within a loop, and print out the lowest scores for each quiz. High
 * scores were easy considering it just a few changes from the low scores
 * method. Average was a bit more difficult, but I decided to have a counter,
 * and if the index in student was null, it wouldn't count that line, only the
 * ones before it. The program would then take the total and divide it by
 * counter + 1 because counter started at 0. I wanted to use readsource.java but
 * it didn't really work. I currently have two text files working with two
 * different test cases. The driver class currently prints out the results for
 * all of the test cases with the different types of text files. So I had to set
 * up different test cases individually in order to get the results for one
 * individual text file. Each text file's name is according to how many lines of
 * student scores it has. For example, Studentscores5.txt has five lines, while
 * StudentScores15.txt has 15 lines. The individual test cases are the exact
 * same way.
 */