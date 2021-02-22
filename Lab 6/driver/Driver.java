package driver;

import model.Statistics;
import model.Student;
import util.FileIO;

public class Driver {// This driver is from lab 5, and uses the text files from lab 5.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO list = new FileIO();
		// FileIO a1 = new FileIO("/Lab 5/src/Salesdat.txt");
		// a1.readData();
		int scores[] = new int[5];

		Student stu[] = new Student[40];
		Statistics stats = new Statistics();
		System.out.printf("Statistics for class with no students:\n");
		stu = list.readFile2("C:\\Users\\jason\\eclipse-workspace\\Lab 6\\src\\StudentScores0.txt", stu);
		// Empty text file.
		stats.findlow(stu);
		stats.findhigh(stu);
		stats.findavg(stu);
		stats.print();
		System.out.printf("\nStatistics for class with one student: \n");
		stu = list.readFile2("C:\\Users\\jason\\eclipse-workspace\\Lab 6\\src\\StudentScores1.txt", stu);
		// Text file with one line.
		stats.findlow(stu);
		stats.findhigh(stu);
		stats.findavg(stu);
		stats.print();
		System.out.printf("\nStatistics for class with 5 students: \n");
		stu = list.readFile2("C:\\Users\\jason\\eclipse-workspace\\Lab 6\\src\\StudentScores5.txt", stu);
		// text file with 5 lines.
		stats.findlow(stu);
		stats.findhigh(stu);
		stats.findavg(stu);
		stats.print();
		System.out.printf("\nStatistics for class with fifteen students: \n");
		stu = list.readFile2("C:\\Users\\jason\\eclipse-workspace\\Lab 6\\src\\StudentScores15.txt", stu);
		// Gets the data from the file and opens and reads the file.
		// text file with 15 lines.
		stats.findlow(stu);
		stats.findhigh(stu);
		stats.findavg(stu);
		stats.print();
		System.out.printf("\nStatistics for class with forty students: \n");
		stu = list.readFile2("C:\\Users\\jason\\eclipse-workspace\\Lab 6\\src\\StudentScores40.txt", stu);
		// text file with 40 lines.
		stats.findlow(stu);
		stats.findhigh(stu);
		stats.findavg(stu);
		stats.print();
		System.out.printf("\nStatistics for class with forty-five students: \n");
		stu = list.readFile2("C:\\Users\\jason\\eclipse-workspace\\Lab 6\\src\\StudentScores45.txt", stu);
		// text file with 45 lines.
		stats.findlow(stu);
		stats.findhigh(stu);
		stats.findavg(stu);
		stats.print();

		// The code that is commented out here are different test cases that will
		// make a different output for each text file. The output is only correct
		// if each file is opened in numerical order.

		// add calls to find high and find average

		// Print the data and statistics
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