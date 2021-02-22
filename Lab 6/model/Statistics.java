package model;


public class Statistics {
	int[] lowscores = new int[5];

	int[] highscores = new int[5];

	float[] avgscores = new float[5];

	public void findlow(Student[] stu) {
		
		/*
		 * This method will find the lowest score and store it in an array names
		 * lowscores.
		 */
		// System.out.printf("\nLowest scores:");
		for (int i = 0; i < 5; i++) {
			float x = 0;
			int y = 0;
			for (int j = 0; j < stu.length; j++) {
				if (stu[j] != null) {
					x = stu[j].getScores()[i];

					if (j == 0) {

						// lowscores[i] = x;
						y = stu[j].getScores()[i];
						lowscores[i] = y;

					}
					if (j > 0) {
						if (stu[j].getScores()[i] < lowscores[i]) {
							y = stu[j].getScores()[i];
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

	public int[] getLowscores() {
		return lowscores;
	}

	public void setLowscores(int[] lowscores) {
		this.lowscores = lowscores;
	}

	public int[] getHighscores() {
		return highscores;
	}

	public void setHighscores(int[] highscores) {
		this.highscores = highscores;
	}

	public float[] getAvgscores() {
		return avgscores;
	}

	public void setAvgscores(float[] avgscores) {
		this.avgscores = avgscores;
	}

	public void findhigh(Student[] a) {

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

	public void findavg(Student[] a) {

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
 * First started with requirement 1, and tried to see how I can fix a null
 * pointer exception. I found that I can't pass a string with letters as an int,
 * so I made sure that the null pointer exception was caught, and I called
 * another method to make sure that if the file had any letters in it, then the
 * program would ignore it and go on to convert the numbers from the file. I
 * then decided to rename the null pointer exception to
 * CannotConvertFromStringToInt Exception. I then moved on to requirement two, I
 * decided to copy a text file from lab 5 with 45 students over to lab 6. I
 * tried making the student array, but I kept getting null pointer exceptions.
 * Then I figured out that I had to set each student grade in the array equal to
 * one instance of a student grade. I then managed to find out how to serialize
 * data into a file. At first I was doing individual integers and floats, but
 * then I realized that I had to do a student grade array. while I was able to
 * create an array, I noticed that the only values serialized in a file were the
 * values from the last student. So what I did was put the declarations of the
 * values for student grade in the serialize student grade method, and that
 * helped fix things. Part 3 was a little easy to figure out because part 2 was
 * just like it, but I had to deserialize the values. I had trouble trying to
 * print out all of the values because I couldn't get student grade to equal
 * anything after I deserialized it. So I set stg equal to the deserialized
 * method as it returns student grade. I then put the print scores and print
 * stats methods in a loop, and printed out the scores and stats for each
 * student. Setting up the abstract class and interface was easy while working
 * on the lab.
 */


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