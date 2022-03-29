public class RandomCharacter {
    
    public static void main(String[] args)  {

        // Generate 15 lower case letters
        System.out.print("15 generated lower case letter: ");
        for (int i=0; i<15; i++) {
            char c= RandomCharacter.getRandomLowerCaseLetter();
            System.out.print(c+", ");
        }    
        
        // Generate 15 upper case letters
        System.out.print("\n15 generated upper case letter: ");
        for (int i=0; i<15; i++) {
            char c= RandomCharacter.getRandomUpperCaseLetter();
            System.out.print(c+", ");
        }

        // Generate 15 digit characters
        System.out.print("\n15 generated digits: ");
        for (int i=0; i<15; i++) {
            char c= RandomCharacter.getRandomDigitCharacter();
            System.out.print(c+", ");

        }

        // Generate 15 alphanumeric characters
        System.out.print("\n15 generated characters: ");
        for (int i=0; i<15; i++) {
            char c= RandomCharacter.getRandomCharacter();
            System.out.print(c+", ");
        }
        
    }  
    
    
    public static char getRandomLowerCaseLetter() {
        
        int min = 97;
        int max = 122;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        // Lower case letter is int 97-122 in ASCII TABLE
        char c= (char)random_int; // convert back to char based on ascii value
        return c;  
    }

   

    public static char getRandomUpperCaseLetter() {
        
        int min = 65;
        int max = 90;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        // Upper case letter is int 65-90 in ASCII TABLE
        char c= (char)random_int; // convert back to char based on ascii value
        return c;  
    }



    public static char getRandomDigitCharacter() {
        
        int min = 48;
        int max = 57;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        // Digit letters are int 48-57 in ASCII TABLE
        char c= (char)random_int; // convert back to char based on ascii value
        return c;
    }

    
    public static char getRandomCharacter() {
        int min = 48;
        int max = 122;
        int random_int= (int)Math.floor(Math.random()*(max-min+1)+min);
        //First generate a random ascii value from 48-122
        while (random_int >= 58 && random_int <=64 || random_int >=91 && random_int <=96) {
            // From 58-64 and 91-96 ascii values are non-alphanumeric chars
            random_int = (int)Math.floor(Math.random()*(max-min+1)+min); 
            // Generate another new ascii value till it is a alphanumeric ascii value 
        }
        char c= (char)random_int; // convert back to char based on ascii value
        return c;
    }

   

}

