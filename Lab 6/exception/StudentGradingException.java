package exception;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import model.Student;
import util.FileIO;

public class StudentGradingException {
	public void logException() throws IOException {
		NullPointerException f = null;
		Student stu[] = new Student[40];
		FileIO list = new FileIO();
		try {
			stu = list.readFile("C:\\Users\\jason\\eclipse-workspace\\Lab 5\\src\\StudentScores45.txt", stu);
			// Tries to read the file by not catching an exception.
		} catch (NullPointerException e) {
			logToFile(e);
			System.out.printf("CannotConvertFromStringToInt Exception caught \n");
			// If it catches an exception, it will log it to a text file and say that it
			// can't convert from string to int.
		} finally {
			stu = list.readFile2("C:\\Users\\jason\\eclipse-workspace\\Lab 6\\src\\StudentScores45.txt", stu);
			System.out.printf("\nAll fixed");
			// Finally, it will call another method similar to the first readfile, but it
			// will detect the letters and fix the exception.
		}
	}

	public static void logToFile(Exception e) {
		// This method takes the exception and logs it into a text file. If it fails to
		// do so, it will throw an exception.
		try {
			FileWriter fstream = new FileWriter(
					"C:\\Users\\jason\\eclipse-workspace\\Lab 6\\src\\exception\\exception.txt", true);
			BufferedWriter out = new BufferedWriter(fstream);
			PrintWriter pWriter = new PrintWriter(out, true);
			e.printStackTrace(pWriter);
		} catch (Exception ie) {
			throw new RuntimeException("Could not write Exception to file", ie);
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