/* 
 *  Simple help on java language.
 */

class ex7 {
  public static void main(String args[] ) 
   {

  HelpItem[] Items = {new HelpItem("If","if ( _condition_ ) _operator_\nelse _operator_"),
                      new HelpItem("Switch","switch ( _expression_ ) {\ncase: _constant_:\n_operator_\nbreak;\n// ...\n}")};
  System.out.println("Select item:");
  for (int i = 0; i < Items.length; i++)
    System.out.println((i+1)+ ". "+Items[i].Name);
  
  int i = 0;
  try {
    i = Integer.valueOf((char) System.in.read()) - '0';
    i --;
    if ( i < 0 || i > Items.length) throw new java.util.InputMismatchException();
  }
  catch (Exception e) {
    System.out.println("Invalid index.");
  }
  System.out.println(Items[i].Text);
  }    

}

class HelpItem {
  public HelpItem(String Name, String Text){
    this.Name = Name;
    this.Text = Text;
  }
  final String Text, Name;
}

