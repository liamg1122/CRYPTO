/*
 * Class: CMSC203 
 * Instructor: GARY THAI
 * Description: ENCRYPTS PLAINTEXT AND DECRYPTS ENCRYPTED TEXT USING CAESAR AND BELLASO METHODS
 * Due: 10/27/2023
 * Platform/compiler: ECLIPSE
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: LIAM GHERSHONY
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerStudentTest {
	
	CryptoManager cryptoManager;


	@Test
	void caesarEncryptTest() {
		
		assertEquals("BCD", CryptoManager.caesarEncryption("ABC", 1));
		assertEquals(")2'6=48D8,-7", CryptoManager.caesarEncryption("ENCRYPT THIS", 100));

	}
	
	
	@Test
	void caesarDecryptTest() {
		
		assertEquals("ABC", CryptoManager.caesarDecryption("BCD", 1));
		assertEquals("ENCRYPT THIS", CryptoManager.caesarDecryption(")2'6=48D8,-7", 100));

	}
	
	@Test
	void belassoEncryptTest() {
		
		assertEquals("MSO^(XY, WQX", CryptoManager.bellasoEncryption("ENCRYPT THIS","HELLO"));
		assertEquals("BCD", CryptoManager.bellasoEncryption("ABC","A"));
	}
	
	@Test
	void belassoDecryptTest() {
		
		assertEquals("ABC", CryptoManager.bellasoDecryption("BCD", "A"));
		assertEquals("ENCRYPT THIS", CryptoManager.bellasoDecryption("MSO^(XY, WQX","HELLO"));
	}
	
	@Test
	void isStringInBoundsTest() {
		assertTrue(CryptoManager.isStringInBounds("THIS ONE IS TRUE"));
		assertFalse(CryptoManager.isStringInBounds("this one is false"));
		assertFalse(CryptoManager.isStringInBounds("~~"));

	}

}
