import static org.junit.Assert.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.Test;


public class LabelMakerTest {

	@Test
	public void testMain() {
		
		// arrange
		
		// Tests printed labels without any radio buttons selected.
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
			standardLabelsExpectedOutput.println("01-01-A-1");
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
		
		String standardLabelsExpectedString = null;
		
		try
		(Scanner standardLabelsExpectedInput = new Scanner(standardLabelsExpected);
				) {
			while (standardLabelsExpectedInput.hasNext()) {
				standardLabelsExpectedString += standardLabelsExpectedInput.next();
			}
		} catch(Exception x) {
			// Just for unit testing.
		}
		
		// act
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
		
		// assert
		assertTrue(standardLabelsExpectedString == standardLabelsActualString);
	}

}
