package lang;

import lang.notable.Even;
import lang.notable.INotable;
import lang.notable.Odd;

public class Main {
  public static void main(String[] args) {
    INotable ntbl = new Even();

    // System.out.println(ntbl.toLatex());

    INotable odd = new Odd();

    System.out.println(odd.toLatex());

  }
}
