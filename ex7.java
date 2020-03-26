/* 
 *  Simple help on java language.
 */

class ex7 {
  public static void main(String args[] ) 
   {

  HelpItem[] Items = {new HelpItem("If","if ( _condition_ ) _operator_\nelse _operator_"),
                      new HelpItem("Switch","switch ( _expression_ ) {\ncase: _constant_:\n_operator_\nbreak;\n// ...\n}"),
                      new HelpItem("For","for (_initialization condition_; _testing condition_; _increment/decrement_)\n _operator_"),
                      new HelpItem("While","while (_conditon_)\n _operator_"),
                      new HelpItem("Do-while","do{\n_operator_\n} while (_condition_)"),
                      new HelpItem("Break","break;\n-= or =-\nbreak _label_;"),
                      new HelpItem("Continue","continue;\n-= or =-\ncontinue _label_;")
  };
  System.out.println("Select item or press 'q' for quit:");
  for (int i = 0; i < Items.length; i++)
    System.out.println((i+1)+ ". "+Items[i].Name);
  
  int i = 0;
  char c = 'x'; 
  do {
  try {
    char tmp;
    c = (char) System.in.read();
    do tmp = (char) System.in.read(); while (tmp != '\n');
    i = Integer.valueOf(c) - '0';
    i --;
    if ( i > 0 || i <= Items.length) System.out.println(Items[i].Text);
  }
  catch (Exception e) {
    if (c != 'q') System.out.println("Invalid index.");  
  }
  } while ( c != 'q');

  }    

}

class HelpItem {
  public HelpItem(String Name, String Text){
    this.Name = Name;
    this.Text = Text;
  }
  final String Text, Name;
}

