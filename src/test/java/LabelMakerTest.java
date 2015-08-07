import static org.junit.Assert.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import org.junit.Test;


public class LabelMakerTest {

	@Test
	public void testStandardLabels() {
		
		// arrange
		
		// Creates a file of expected standard labels (no options selected)
		File standardLabelsExpected = new File("standardLabelsExpected.txt");
		try
		(PrintWriter standardLabelsExpectedOutput = new PrintWriter(standardLabelsExpected);
				) {
			standardLabelsExpectedOutput.println("01-01-A-1");
			standardLabelsExpectedOutput.println("01-01-A-2");
			standardLabelsExpectedOutput.println("01-01-B-1");
			standardLabelsExpectedOutput.println("01-01-B-2");
			standardLabelsExpectedOutput.println("01-02-A-1");
			standardLabelsExpectedOutput.println("01-02-A-2");
			standardLabelsExpectedOutput.println("01-02-B-1");
			standardLabelsExpectedOutput.println("01-02-B-2");
			standardLabelsExpectedOutput.println("02-01-A-1");
			standardLabelsExpectedOutput.println("02-01-A-2");
			standardLabelsExpectedOutput.println("02-01-B-1");
			standardLabelsExpectedOutput.println("02-01-B-2");
			standardLabelsExpectedOutput.println("02-02-A-1");
			standardLabelsExpectedOutput.println("02-02-A-2");
			standardLabelsExpectedOutput.println("02-02-B-1");
			standardLabelsExpectedOutput.println("02-02-B-2");
		} catch(Exception x) {
			// Just for unit testing.
		}
		
		// String to concatenate expected standard labels.
		String standardLabelsExpectedString = null;
		
		// Concatenate 
		try
		(Scanner standardLabelsExpectedInput = new Scanner(standardLabelsExpected);
				) {
			while (standardLabelsExpectedInput.hasNext()) {
				standardLabelsExpectedString += standardLabelsExpectedInput.next();
			}
		} catch(Exception x) {
			// Just for unit testing.
		}
		
		// Creates a file of expected labels with "Every 2 Aisles" radio button selected.
		File aisles2Expected = new File("aisles2Expected.txt");
		try
		(PrintWriter aisles2ExpectedOutput = new PrintWriter(aisles2Expected);
				) {
			aisles2ExpectedOutput.println("01-01-A-1");
			aisles2ExpectedOutput.println("01-01-A-2");
			aisles2ExpectedOutput.println("01-01-B-1");
			aisles2ExpectedOutput.println("01-01-B-2");
			aisles2ExpectedOutput.println("01-02-A-1");
			aisles2ExpectedOutput.println("01-02-A-2");
			aisles2ExpectedOutput.println("01-02-B-1");
			aisles2ExpectedOutput.println("01-02-B-2");
			aisles2ExpectedOutput.println("03-01-A-1");
			aisles2ExpectedOutput.println("03-01-A-2");
			aisles2ExpectedOutput.println("03-01-B-1");
			aisles2ExpectedOutput.println("03-01-B-2");
			aisles2ExpectedOutput.println("03-02-A-1");
			aisles2ExpectedOutput.println("03-02-A-2");
			aisles2ExpectedOutput.println("03-02-B-1");
			aisles2ExpectedOutput.println("03-02-B-2");
		} catch(Exception x) {
			// Just for unit testing.
		}
		
		// String to concatenate expected standard labels.
		String aisles2ExpectedString = null;
		
		// Concatenate 
		try
		(Scanner aisles2ExpectedInput = new Scanner(aisles2Expected);
				) {
			while (aisles2ExpectedInput.hasNext()) {
				aisles2ExpectedString += aisles2ExpectedInput.next();
			}
		} catch(Exception x) {
			// Just for unit testing.
		}
		
		// act
		
		// Standard labels actual file.
		File standardLabelsActual = new File("standardLabelsActual.txt");
		new LabelMaker("1", "2", "1", "2", "A", "B", "1", "2", false, false, false, false, false, 
				standardLabelsActual);
		
		String standardLabelsActualString = null;
		
		try
		(Scanner standardLabelsActualInput = new Scanner(standardLabelsActual);
				) {
			while (standardLabelsActualInput.hasNext()) {
				standardLabelsActualString += standardLabelsActualInput.next();
			}
		} catch(Exception x) {
			// For unit testing.
		}
		
		// Aisles 2 actual file.
		File aisles2Actual = new File("aisles2Actual.txt");
		new LabelMaker("1", "3", "1", "2", "A", "B", "1", "2", true, false, false, false, false, 
				aisles2Actual);
		
		String aisles2ActualString = null;
		
		try
		(Scanner aisles2ActualInput = new Scanner(aisles2Actual);
				) {
			while (aisles2ActualInput.hasNext()) {
				aisles2ActualString += aisles2ActualInput.next();
			}
		} catch(Exception x) {
			// For unit testing.
		}
		
		// assert
		assertEquals(standardLabelsExpectedString, standardLabelsActualString);
		assertEquals(aisles2ExpectedString, aisles2ActualString);
	}

}
