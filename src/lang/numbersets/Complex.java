package lang.numbersets;

import lang.notable.PredicateDefinition;

/**
 * A complex number of the form a+bi, where i=sqrt(-1)
 */
public class Complex extends NumberSet {
  private Real a;
  private Real b;
  public final static double i = Math.sqrt(-1); // might not compile

  public Complex(Real a, Real b) {
    this.a = a;
    this.b = b;
  }

  public Complex(Real a) {
    this.a = a;
    this.b = new Real(0);
  }

  public Complex() {
  }


  @Override
  public String toLatex() {
    return a + " + " + b + "i";
  }

  @Override
  public String toLatex(String bindingLabel) {
    return bindingLabel + " = " + toLatex();
  }

  @Override
  public String toLatex(String name, boolean bind) {
    return bind ? name + " := " + toLatex() : toLatex(name); // TODO simplify this behavior using
    // an abstract class  MathObject -> _AMathObject_ -> NumberSet -> Complex -> ... -> Integer
  }

  @Override
  public String latexSymbol() {
    return "\\mathbb{C}";
  }

  @Override
  public PredicateDefinition definition() {
    return null;
  }

  @Override
  public double value() {
    return a.value() + b.value() * i;
  }
}
