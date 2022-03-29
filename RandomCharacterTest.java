import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RandomCharacterTest {
 
    @Test 
    public void testgetRandomLowerCaseLetter() {
        char c= RandomCharacter.getRandomLowerCaseLetter();
        assertTrue(c >=97 && c<=122);
        // Test if it falls under the ascii values of lower case letter
    }

    @Test 
    public void testgetRandomUpperCaseLetter() {
        char c= RandomCharacter.getRandomUpperCaseLetter();
        assertTrue(c >=65 && c<=90);
        // Test if it falls under the ascii values of upper case letter
    }

    @Test 
    public void testgetRandomDigitCharacter() {
        char test= RandomCharacter.getRandomDigitCharacter();
        assertTrue(test >=48 && test <=57);
        // Test if it falls under the ascii values of digits
    }

    @Test
    public void testgetRandomCharacter() {
        char c = RandomCharacter.getRandomCharacter();
        assertTrue(c >= 48 && c <=57 || c >=65 && c <=90 || c>=97 && c<=122);
        // Test if it falls within the range of ASCII values of alphanumeric chars
    }

    @RepeatedTest(value=15)
    public void testPrimeNumber(){
        char d= RandomCharacter.getRandomDigitCharacter();
        int c= Character.getNumericValue(d); // Convert the char value to its corresponding int value.
     
        //Call isPrime method
        int prime= isPrime(c);
        assertTrue(prime==1); //Test pass if value is a prime number
 
    }
    // method to check if it is a prime number    
    public static int isPrime(int c) {
        int i = 2;
        int isPrime = 1; //set default is a prime number
        while (i <= c / 2) {
          // check if mod returns 0, which means it is divisble to a number apart from itself
          if (c % i == 0) {
            isPrime = 0;
            return isPrime; //return 0, which means it is not prime
          }
          i++; 
        }

        if (c==0 || c==1) { //Need to handle if the number is 0 or 1, 
                            //as it does not knows that 0 and 1 are not prime although they can only be divisible to themselves
            isPrime=0;
            return isPrime;// return that it is not prime
        }
        else {
            return isPrime;
        }
    }
}
