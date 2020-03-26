/* Converting characters from lowercase to uppercase
 * and vice versa in a string obtained from standard 
 * input and counting the number of characters changed */

import java.util.Scanner; 

class ex8 {
  static public void main(String args[])
  throws java.io.IOException {
    String str_in, str_out = "";
    Scanner scan = new Scanner(System.in);
    str_in = scan.nextLine();
    int numberOfChanges = 0;
    for (char c : str_in.toCharArray()) {

      if ( c >='A' & c <= 'Z') {
      numberOfChanges++; 
      c += 32;
      }

      else if ( c >='a' & c <= 'z') {
      numberOfChanges++; 
      c -= 32;
      }

      str_out += c;
      
    }
    System.out.println(str_out);
    switch (numberOfChanges) {
      case 0 : System.out.println("No changes were made."); break;
      case 1 : System.out.println("One symbol is changed."); break;
      default: System.out.println(numberOfChanges + " symbols were changed.");

    }

    

  }
}
