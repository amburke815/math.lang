package lang.numbersets;

import lang.notable.PredicateDefinition;

public class Real extends Complex {

  private final double value;
  /**
   * A Real number is a complex number with b = 0; sets b to 0 no matter what param is passed
   * @param a
   * @param b
   */
  public Real(Real a, Real b) {
    super(a, new Real(0)); // copy ctor
    this.value = a.value();
  }

  public Real(Real value) {
    super(value, new Real(0)); // copy ctor
    this.value = value.value();
  }

  public Real(double value) { // intuitive ctor
    super();
    this.value = value;
  }

  public Real() {
    this.value = 0;
  }

  @Override
  public String toLatex() {
    return Double.toString(value);
  }

  @Override
  public String toLatex(String name) {
    return name + " = " + toLatex();
  }

  @Override
  public String toLatex(String name, boolean bind) {
    return bind ? name + " := " + toLatex() : toLatex(name); // TODO abstract
  }

  @Override
  public String latexSymbol() {
    return "\\mathbb{R}";
  }

  @Override
  public PredicateDefinition definition() {
    return null; // needs a way to define an anonymous/factory PredicateDefinition
  }

  @Override
  public double value() {
    return value;
  }
}
