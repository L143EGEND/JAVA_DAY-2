// Write a JAVAprogram to print all ASCII character with their values.

class Ascii {
    public static void main(String args[]) {
      
        for (int i = 0; i <= 256; i++) {
            
            System.out.println("ASCII Value: " + i + " = " + (char) i);
        }
    }
}

