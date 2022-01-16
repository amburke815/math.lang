package lang.numbersets;

import lang.notable.PredicateDefinition;

public class Integer extends Rational {
  public final int val;

  public Integer(int val) {
    this.val = val;
  }

  public Integer() {
    this.val = 0;
  }




  @Override
  public String toLatex() {
    return java.lang.Integer.toString(val);
  }

  @Override
  public String toLatex(String name) {
    return name + " = " + val;
  }

  @Override
  public String toLatex(String name, boolean bind) {
    return bind ? name + " := " + toLatex() : toLatex(name);
  }

  @Override
  public String latexSymbol() {
    return "\\mathbb{Z}";
  }

  @Override
  public PredicateDefinition definition() {
    return null;
  }

  @Override
  public double value() {
    return (double)val;
  }
}
