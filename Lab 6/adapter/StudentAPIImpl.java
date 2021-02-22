package adapter;

import java.io.IOException;

import model.Statistics;
import model.Student;
import model.StudentGrade;
import util.FileIO;

public abstract class StudentAPIImpl {
	Student stu[] = new Student[40];
	int scores[] = new int[5];
	Statistics stats = new Statistics();
	FileIO list = new FileIO();

	public void printStats(StudentGrade[] stg) {
// design - need some instance variables.
		// pass in a file name - and readfile to do all this,
		// student [], calc stats, studentgrade, serialize.
		// placeholder for integrating code from existing classes.
		// This method prints out the class statistics from the serialized file.
		System.out.printf("Class High: ");
		for (int j = 0; j < 5; j++) {
			System.out.printf("%d ", stg[0].getHigh()[j]);
		}
		System.out.printf("\nClass Low: ");
		for (int j = 0; j < 5; j++) {
			System.out.printf("%d ", stg[0].getLow()[j]);
		}
		System.out.printf("\nClass Average: ");
		for (int j = 0; j < 5; j++) {
			System.out.printf("%1.2f ", stg[0].getAverage()[j]);
		}
	}

	public void printScores(StudentGrade[] stg, Student stu[], int i) throws ClassNotFoundException, IOException {

		// This method prints out the Student ID's for each student and prints out the
		// scores for each quiz, for each student, form the serialized file.
		System.out.printf("\nStudent ID: %d", stg[i].getStudent());
		for (int j = 0; j < 5; j++) {
			System.out.printf("\nScore for quiz %d", j + 1);
			System.out.printf(": %d ", stg[i].getGrade()[j]);
		}

		System.out.printf("\n");
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