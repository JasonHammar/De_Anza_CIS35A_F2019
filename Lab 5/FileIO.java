package studentScoreCalculation;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileIO {
	//private static final boolean DEBUG = false;

	Student[] readFile(String filename, Student[] stu) {

		// Reads the file and builds student array.

		// Opens the file using FileReader Object.
		try {
			FileReader file = new FileReader(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// In a loop read a line using readLine method.
		Student a1 = new Student();
		int counter = 0;
		try {
			String temp;
			FileReader file = new FileReader(filename);

			BufferedReader buff = new BufferedReader(file);

			boolean eof = false;

			while (!eof) {
				String line = buff.readLine();
				if (line == null || counter >= 40) {
					if(counter == 0) {
						System.out.printf("file is empty");
					}
					eof = true;
					break;
				}

				if (counter < 40) {
					if (line.contains("S") == false) {
						stu[counter] = new Student();
					} else {
						System.out.printf(line + " \n");
					}
				}
				if (line.contains("S") == false) {

					if (line == null || counter >= 40) {

						eof = true;
						break;
					} else
						// System.out.println("This is line" + (counter));
						// System.out.println(line);

						temp = line;
					// Stud Qu1 Qu2 Qu3 Qu4 Qu5
					// enrollStudent(temp);
					int quiz = 0;
					String s1 = "";
					StringTokenizer st = new StringTokenizer(temp);
					int x = 0;

					while (st.hasMoreTokens()) {
						if (counter != 0) {
							System.out.printf(" \n");
						}
						int quizzes[] = new int[5];
						for (quiz = 0; quiz <= 5; quiz++) {
							s1 = st.nextToken();
							x = Integer.parseInt(s1);

							if (quiz == 0) {
								stu[counter].setSID(x);
								// System.out.printf("Student ID: ", stu[counter].getSID());
							} else {
								stu[counter].setScores(quizzes);
								quizzes[quiz - 1] = x;
								// System.out.printf("Quiz Scores: ", stu[counter].getScores());
							}
							System.out.print(x + " ");

						}

					}
					counter++;
				}
			}
			buff.close();

		} catch (IOException e) {

			System.out.println("Error -- " + e.toString());

		}

		// readData(filename);
		// Tokenize each line using StringTokenizer Object

		// Each token is converted from String to Integer using parseInt method

		// Value is then saved in the right property of Student Object.
		return stu;

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
