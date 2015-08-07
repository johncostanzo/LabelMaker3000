import static org.junit.Assert.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import org.junit.Test;


public class LabelMakerTest {

	@Test
	/** Tests mutator function and input validation. */
	public void testSetAisleStart() {
		// arrange
		LabelMaker test = new LabelMaker();
		int expected = 1;
		
		// act
		test.setAisleStart("-1");
		test.setAisleStart("1");
		
		// assert
		assertFalse(test.getErrors().isEmpty());
		assertEquals(expected, test.getAisleStart());
	}
	
	@Test
	/** Tests mutator function and input validation. */
	public void testSetAisleEnd() {
		// arrange
		LabelMaker test = new LabelMaker();
		int expected = 30;
		
		// act
		test.setAisleEnd("31");
		test.setAisleEnd("30");
		
		// assert
		assertFalse(test.getErrors().isEmpty());
		assertEquals(expected, test.getAisleEnd());
	}
	
	@Test
	/** Tests mutator function and input validation. */
	public void testSetSectionStart() {
		// arrange
		LabelMaker test = new LabelMaker();
		int expected = 1;
		
		// act
		test.setSectionStart("-1");
		test.setSectionStart("1");
		
		// assert
		assertFalse(test.getErrors().isEmpty());
		assertEquals(expected, test.getSectionStart());
	}
	
	@Test
	/** Tests mutator function and input validation. */
	public void testSetSectionEnd() {
		// arrange
		LabelMaker test = new LabelMaker();
		int expected = 100;
		
		// act
		test.setSectionEnd("101");
		test.setSectionEnd("100");
		
		// assert
		assertFalse(test.getErrors().isEmpty());
		assertEquals(expected, test.getSectionEnd());
	}
	
	@Test
	/** Tests mutator function and input validation. */
	public void testSetLevelStart() {
		// arrange
		LabelMaker test = new LabelMaker();
		char expected = 'A';
		
		// act
		test.setLevelStart("@");
		test.setLevelStart("A");
		
		// assert
		assertFalse(test.getErrors().isEmpty());
		assertEquals(expected, test.getLevelStart());
	}
	
	@Test
	/** Tests mutator function and input validation. */
	public void testSetLevelEnd() {
		// arrange
		LabelMaker test = new LabelMaker();
		char expected = 'Z';
		
		// act
		test.setLevelEnd("[");
		test.setLevelEnd("Z");
		
		// assert
		assertFalse(test.getErrors().isEmpty());
		assertEquals(expected, test.getLevelEnd());
	}
	
	@Test
	/** Tests mutator function and input validation. */
	public void testSetPositionStart() {
		// arrange
		LabelMaker test = new LabelMaker();
		int expected = 1;
		
		// act
		test.setPositionStart("-1");
		test.setPositionStart("1");
		
		// assert
		assertFalse(test.getErrors().isEmpty());
		assertEquals(expected, test.getPositionStart());
	}
	
	@Test
	/** Tests mutator function and input validation. */
	public void testSetPositionEnd() {
		// arrange
		LabelMaker test = new LabelMaker();
		int expected = 10;
		
		// act
		test.setPositionEnd("11");
		test.setPositionEnd("10");
		
		// assert
		assertFalse(test.getErrors().isEmpty());
		assertEquals(expected, test.getPositionEnd());
	}
	
	@Test
	/**Tests all of the options within main. Would probably be best if I broke this up into 
	 * separate functions.*/
	public void testMain() {
		
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
				standardLabelsExpectedString += standardLabelsExpectedInput.nextLine();
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
		
		// String to concatenate expected "Every 2 Aisles" labels.
		String aisles2ExpectedString = null;
		
		// Concatenate 
		try
		(Scanner aisles2ExpectedInput = new Scanner(aisles2Expected);
				) {
			while (aisles2ExpectedInput.hasNext()) {
				aisles2ExpectedString += aisles2ExpectedInput.nextLine();
			}
		} catch(Exception x) {
			// Just for unit testing.
		}
		
		// Creates a file of expected labels with "Every 4 Aisles" radio button selected.
		File aisles4Expected = new File("aisles4Expected.txt");
		try
		(PrintWriter aisles4ExpectedOutput = new PrintWriter(aisles4Expected);
				) {
			aisles4ExpectedOutput.println("01-01-A-1");
			aisles4ExpectedOutput.println("01-01-A-2");
			aisles4ExpectedOutput.println("01-01-B-1");
			aisles4ExpectedOutput.println("01-01-B-2");
			aisles4ExpectedOutput.println("01-02-A-1");
			aisles4ExpectedOutput.println("01-02-A-2");
			aisles4ExpectedOutput.println("01-02-B-1");
			aisles4ExpectedOutput.println("01-02-B-2");
			aisles4ExpectedOutput.println("05-01-A-1");
			aisles4ExpectedOutput.println("05-01-A-2");
			aisles4ExpectedOutput.println("05-01-B-1");
			aisles4ExpectedOutput.println("05-01-B-2");
			aisles4ExpectedOutput.println("05-02-A-1");
			aisles4ExpectedOutput.println("05-02-A-2");
			aisles4ExpectedOutput.println("05-02-B-1");
			aisles4ExpectedOutput.println("05-02-B-2");
			} catch(Exception x) {
				// Just for unit testing.
				}
				
		// String to concatenate expected "Every 4 Aisles" labels.
		String aisles4ExpectedString = null;
	
		// Concatenate 
		try
		(Scanner aisles4ExpectedInput = new Scanner(aisles4Expected);
				) {
			while (aisles4ExpectedInput.hasNext()) {
				aisles4ExpectedString += aisles4ExpectedInput.nextLine();
				}
			} catch(Exception x) {
				// Just for unit testing.
				}
		
		// Creates a file of expected labels with "Every 2 Sections" radio button selected.
		File section2Expected = new File("section2Expected.txt");
		try
		(PrintWriter section2ExpectedOutput = new PrintWriter(section2Expected);
				) {
			section2ExpectedOutput.println("01-01-A-1");
			section2ExpectedOutput.println("01-01-A-2");
			section2ExpectedOutput.println("01-01-B-1");
			section2ExpectedOutput.println("01-01-B-2");
			section2ExpectedOutput.println("01-03-A-1");
			section2ExpectedOutput.println("01-03-A-2");
			section2ExpectedOutput.println("01-03-B-1");
			section2ExpectedOutput.println("01-03-B-2");
			section2ExpectedOutput.println("02-01-A-1");
			section2ExpectedOutput.println("02-01-A-2");
			section2ExpectedOutput.println("02-01-B-1");
			section2ExpectedOutput.println("02-01-B-2");
			section2ExpectedOutput.println("02-03-A-1");
			section2ExpectedOutput.println("02-03-A-2");
			section2ExpectedOutput.println("02-03-B-1");
			section2ExpectedOutput.println("02-03-B-2");
			} catch(Exception x) {
				// Just for unit testing.
				}
				
		// String to concatenate expected "Every 2 Sections" labels.
		String section2ExpectedString = null;
				
		// Concatenate 
		try
		(Scanner section2ExpectedInput = new Scanner(section2Expected);
				) {
			while (section2ExpectedInput.hasNext()) {
				section2ExpectedString += section2ExpectedInput.nextLine();
				}
			} catch(Exception x) {
				// Just for unit testing.
				}
				
		// Creates a file of expected labels with "Every 4 Sections" radio button selected.
		File section4Expected = new File("section4Expected.txt");
		try
		(PrintWriter section4ExpectedOutput = new PrintWriter(section4Expected);
				) {
			section4ExpectedOutput.println("01-01-A-1");
			section4ExpectedOutput.println("01-01-A-2");
			section4ExpectedOutput.println("01-01-B-1");
			section4ExpectedOutput.println("01-01-B-2");
			section4ExpectedOutput.println("01-05-A-1");
			section4ExpectedOutput.println("01-05-A-2");
			section4ExpectedOutput.println("01-05-B-1");
			section4ExpectedOutput.println("01-05-B-2");
			section4ExpectedOutput.println("02-01-A-1");
			section4ExpectedOutput.println("02-01-A-2");
			section4ExpectedOutput.println("02-01-B-1");
			section4ExpectedOutput.println("02-01-B-2");
			section4ExpectedOutput.println("02-05-A-1");
			section4ExpectedOutput.println("02-05-A-2");
			section4ExpectedOutput.println("02-05-B-1");
			section4ExpectedOutput.println("02-05-B-2");
			} catch(Exception x) {
				// Just for unit testing.
				}
				
		// String to concatenate expected "Every 4 Sections" labels.
		String section4ExpectedString = null;
		
		// Concatenate 
		try
		(Scanner section4ExpectedInput = new Scanner(section4Expected);
				) {
			while (section4ExpectedInput.hasNext()) {
				section4ExpectedString += section4ExpectedInput.nextLine();
				}
			} catch(Exception x) {
				// Just for unit testing.
				}
				
		// Creates a file of expected labels with "Totem Poles" radio button selected.
		File totemPolesExpected = new File("totemPolesExpected.txt");
		try
		(PrintWriter totemPolesExpectedOutput = new PrintWriter(totemPolesExpected);
				) {
			totemPolesExpectedOutput.print("01-01-A-1\t");
			totemPolesExpectedOutput.print("01-01-A-2\t");
			totemPolesExpectedOutput.print("01-01-B-1\t");
			totemPolesExpectedOutput.print("01-01-B-2\t");
			totemPolesExpectedOutput.print("\n");
			totemPolesExpectedOutput.print("01-02-A-1\t");
			totemPolesExpectedOutput.print("01-02-A-2\t");
			totemPolesExpectedOutput.print("01-02-B-1\t");
			totemPolesExpectedOutput.print("01-02-B-2\t");
			totemPolesExpectedOutput.print("\n");
			totemPolesExpectedOutput.print("02-01-A-1\t");
			totemPolesExpectedOutput.print("02-01-A-2\t");
			totemPolesExpectedOutput.print("02-01-B-1\t");
			totemPolesExpectedOutput.print("02-01-B-2\t");
			totemPolesExpectedOutput.print("\n");
			totemPolesExpectedOutput.print("02-02-A-1\t");
			totemPolesExpectedOutput.print("02-02-A-2\t");
			totemPolesExpectedOutput.print("02-02-B-1\t");
			totemPolesExpectedOutput.print("02-02-B-2\t");
			} catch(Exception x) {
				// Just for unit testing.
				}
		// String to concatenate expected "Totem Poles" labels.
		String totemPolesExpectedString = null;
				
		// Concatenate 
		try
		(Scanner totemPolesExpectedInput = new Scanner(totemPolesExpected);
				) {
			while (totemPolesExpectedInput.hasNext()) {
				totemPolesExpectedString += totemPolesExpectedInput.nextLine();
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
				standardLabelsActualString += standardLabelsActualInput.nextLine();
			}
		} catch(Exception x) {
			// Just for unit testing.
		}
		
		// "Every 2 Aisles" actual file.
		File aisles2Actual = new File("aisles2Actual.txt");
		new LabelMaker("1", "3", "1", "2", "A", "B", "1", "2", true, false, false, false, false, 
				aisles2Actual);
		
		String aisles2ActualString = null;
		
		try
		(Scanner aisles2ActualInput = new Scanner(aisles2Actual);
				) {
			while (aisles2ActualInput.hasNext()) {
				aisles2ActualString += aisles2ActualInput.nextLine();
			}
		} catch(Exception x) {
			// Just for unit testing.
		}
		
		// "Every 4 Aisles" actual file.
		File aisles4Actual = new File("aisles4Actual.txt");
		new LabelMaker("1", "5", "1", "2", "A", "B", "1", "2", false, true, false, false, false, 
		aisles4Actual);
		
		String aisles4ActualString = null;
				
		try
		(Scanner aisles4ActualInput = new Scanner(aisles4Actual);
				) {
			while (aisles4ActualInput.hasNext()) {
				aisles4ActualString += aisles4ActualInput.nextLine();
				}
			} catch(Exception x) {
				// Just for unit testing.
				}
		
		// "Every 2 Sections" actual file.
		File section2Actual = new File("section2Actual.txt");
		new LabelMaker("1", "2", "1", "3", "A", "B", "1", "2", false, false, true, false, false, 
		section2Actual);
		
		String section2ActualString = null;
		try
		(Scanner section2ActualInput = new Scanner(section2Actual);
				) {
			while (section2ActualInput.hasNext()) {
				section2ActualString += section2ActualInput.nextLine();
				}
			} catch(Exception x) {
				// Just for unit testing.
				}
		
		// "Every 4 Sections" actual file.
		File section4Actual = new File("section4Actual.txt");
		new LabelMaker("1", "2", "1", "5", "A", "B", "1", "2", false, false, false, true, false, 
		section4Actual);
		
		String section4ActualString = null;
				
		try
		(Scanner section4ActualInput = new Scanner(section4Actual);
				) {
			while (section4ActualInput.hasNext()) {
				section4ActualString += section4ActualInput.nextLine();
				}
			} catch(Exception x) {
				// Just for unit testing.
				}
		
		// "Totem Poles" actual file.
		File totemPolesActual = new File("totemPolesActual.txt");
		new LabelMaker("1", "2", "1", "2", "A", "B", "1", "2", false, false, false, false, true, 
		totemPolesActual);
		
		String totemPolesActualString = null;
				
		try
		(Scanner totemPolesActualInput = new Scanner(totemPolesActual);
				) {
			while (totemPolesActualInput.hasNext()) {
				totemPolesActualString += totemPolesActualInput.nextLine();
				}
			} catch(Exception x) {
				// Just for unit testing.
				}
		
		// assert
		assertEquals(standardLabelsExpectedString, standardLabelsActualString);
		assertEquals(aisles2ExpectedString, aisles2ActualString);
		assertEquals(aisles4ExpectedString, aisles4ActualString);
		assertEquals(section2ExpectedString, section2ActualString);
		assertEquals(section4ExpectedString, section4ActualString);
		assertEquals(totemPolesExpectedString, totemPolesActualString);
	}
}
