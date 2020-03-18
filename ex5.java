/* Logical Operations truth table */

class ex5 {
  public static void main(String args[]){
  Operations[] Op = {new And(), new Or(), new Xor()};
  System.out.println("a\tb\ta&b\ta|b\ta^b\t");
  for (byte i = 0; i < 2; i++)
    for (byte j = 0; j < 2; j++){
      boolean a = i != 0, b = j != 0;
      System.out.print(a+"\t"+b+"\t");
      for (byte k = 0; k < 3; k++)
        System.out.print(Op[k].op(a,b)+"\t");
      System.out.println();
    }
  } 
}

abstract class Operations {
  public abstract boolean op(boolean x, boolean y);
}

class And extends Operations {
  @Override
  public boolean op(boolean x, boolean y) {
    return x&y;
  }
}

class Or extends Operations {
  @Override
  public boolean op(boolean x, boolean y) {
    return x|y;
  }
}

class Xor extends Operations {
  @Override
  public boolean op(boolean x, boolean y) {
    return x^y;
  }
}



