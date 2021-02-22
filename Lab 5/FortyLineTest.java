package studentScoreCalculation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FortyLineTest {
	Student stu[] = new Student[40];
	FileIO list = new FileIO();
	Statistics quiz = new Statistics();

	@Test
	void test() {
		stu = list.readFile("C:\\Users\\jason\\eclipse-workspace\\Lab 5\\src\\StudentScores40.txt", stu);
		// Text file with 40 line of data.
		quiz.findlow(stu);
		quiz.findhigh(stu);
		quiz.findavg(stu);
		quiz.print();
		// Tests the file with 40 lines of data and prints out all of the stats for the
		// 40 lines.
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