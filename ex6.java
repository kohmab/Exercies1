/* Logical Operations truth table 
 * program prints 1 or 0 instead of "true" or "false".
 * */

class ex6 {
  public static void main(String args[]){
  Operations[] Op = {new And(), new Or(), new Xor()};
  System.out.println("a\tb\ta&b\ta|b\ta^b\t");
  for (int i = 0; i < 2; i++)
    for (int j = 0; j < 2; j++){
      System.out.print(i+"\t"+j+"\t");
      for (int k = 0; k < 3; k++)
        System.out.print(Op[k].op(i,j)+"\t");
      System.out.println();
    }
  } 
}

abstract class Operations {
  public abstract int op(int x, int y);
}

class And extends Operations {
  @Override
  public int op(int x, int y) {
    return x&y;
  }
}

class Or extends Operations {
  @Override
  public int op(int x, int y) {
    return x|y;
  }
}

class Xor extends Operations {
  @Override
  public int op(int x, int y) {
    return x^y;
  }
}



