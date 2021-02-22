package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;

import model.Statistics;
import model.Student;
import model.StudentGrade;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.IOException;

public class FileIO implements Serializable {

	// private static final boolean DEBUG = false;

	public Student[] readFile(String filename, Student[] stu) {

		// Reads the file and builds student array.

		// Opens the file using FileReader Object.
		try {
			// FileReader file = new FileReader(filename);
		} catch (NullPointerException e) {
			System.out.println("Error" + e.toString());
			throw e;

		}
		// In a loop read a line using readLine method.
		int counter = 0;
		Student a1 = new Student(counter);

		try {
			String temp;
			FileReader file = new FileReader(filename);

			BufferedReader buff = new BufferedReader(file);

			boolean eof = false;

			while (!eof) {

				String line = buff.readLine();

				if (line == null || counter >= 40) {
					if (counter == 0) {
						System.out.printf("file is empty");
					}
					eof = true;
					break;
				}

				if (counter < 40) {

					System.out.printf(line + " \n");

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

		}

		// readData(filename);
		// Tokenize each line using StringTokenizer Object

		// Each token is converted from String to Integer using parseInt method

		// Value is then saved in the right property of Student Object.
		return stu;

	}

	public Student[] readFile2(String filename, Student[] stu) {

		// Reads the file and builds student array.

		// Opens the file using FileReader Object.
		try {
			// FileReader file = new FileReader(filename);
		} catch (NullPointerException e) {
			System.out.println("Error" + e.toString());
			throw e;

		}
		// In a loop read a line using readLine method.
		int counter = 0;
		Student a1 = new Student(counter);

		try {
			String temp;
			FileReader file = new FileReader(filename);

			BufferedReader buff = new BufferedReader(file);

			boolean eof = false;

			while (!eof) {

				String line = buff.readLine();

				if (line == null || counter >= 40) {
					if (counter == 0) {
						System.out.printf("file is empty");
					}
					eof = true;
					break;
				}

				if (counter < 40) {

					if (line.contains("S") == false) {
						stu[counter] = new Student(counter);
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

		}

		// readData(filename);
		// Tokenize each line using StringTokenizer Object

		// Each token is converted from String to Integer using parseInt method

		// Value is then saved in the right property of Student Object.
		return stu;

	}

	public void serializeStudentGrade(StudentGrade stg[], Student stu[], Statistics stats)
			throws IOException, ClassNotFoundException {

		try {

			for (int i = 0; i < stg.length; i++) {
				int x = stu[i].getSID();

				stg[i].setStudent(x);

				
				stg[i].setGrade(stu[i].getScores());

				stg[i].setHigh(stats.getHighscores());
				stg[i].setLow(stats.getLowscores());
				stg[i].setAverage(stats.getAvgscores());

				String filename = stu[i].getSID() + " .ser";

				FileOutputStream file = new FileOutputStream(filename);
				ObjectOutputStream out = new ObjectOutputStream(file);

				out.writeObject(stg[i]);

				out.flush();
				out.close();
				file.close();
			}
			
		} catch (IOException ex) {

		}
		// This method serializes the student grade array and its values in a serialized
		// file.
	}

	public StudentGrade[] deserializeStudentGrade(StudentGrade[] stg, Student stu[])
			throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		// This method deserializes the student grade array so the user can view the
		// contents in each file.
		try {
			for (int i = 0; i < stu.length; i++) {
				String filename = stu[i].getSID() + " .ser";

				FileInputStream filed = new FileInputStream(filename);
				ObjectInputStream in = new ObjectInputStream(filed);

				// Method for deserialization of object
				stg[i] = (StudentGrade) in.readObject();
				stg[i].getStudent();
				in.close();
				filed.close();

			}

		} catch (ClassCastException ex) {

		}
		return stg;

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
