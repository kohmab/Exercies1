/* All I did not know about literals.*/

class ex4 {
  public static void main(String args[]){
  System.out.println("\uABCD" +  // uncode character with heximal index XXXX;
                     "\123" + // --//-- with octal index XXX
                     "\r" + // carriege return
                     "\f" + // page break
                     "\b" + // one position back 
                     "\t" + // tabulation
                     1_2_3_4 + " " + 1.2_3_4); // symbol "_" is ignored in number literals 


  }

}
