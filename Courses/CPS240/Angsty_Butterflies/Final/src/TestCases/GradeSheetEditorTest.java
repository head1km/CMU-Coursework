package TestCases;
/**
 * Roxanne Harris, Alexander Brya, Kyle Head, Ben Lubitz'
 * Kyle Head
 * CPS 240
 * Assignment 8
 */

import static org.junit.Assert.*;

import org.junit.Test;

import angsty_Butterflies.GradeSheet;
import angsty_Butterflies.GradeSheetEditor;

public class GradeSheetEditorTest {
	private GradeSheetEditor myGsEditor = new GradeSheetEditor();
	private GradeSheet myGS;
	private GradeSheet myGScopy;

	@Test
	public void testCreate() {
		myGS = myGsEditor.create();
		assertNotNull("NO grade sheet created.", myGS);
	}

	@Test
	public void testCopy() {
		myGScopy = myGsEditor.copy();
		assertNotNull("Copy not Created.", myGScopy);
		assertNotSame("Only a shallow copy.", myGS, myGScopy);
		
	}

	@Test
	public void testDelete() {
		myGsEditor.delete();
		assertNull("Gradesheet not deleted.", myGS);
	}

}
