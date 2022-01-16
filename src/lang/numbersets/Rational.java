package lang.numbersets;

import lang.notable.PredicateDefinition;

public class Rational extends Real {
  private final int numerator;
  private final int denominator;

  public Rational(int numerator, int denominator) {
    super();
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public Rational() {
    this.numerator = 0;
    this.denominator = 0;
  }


  @Override
  public String toLatex() {
    return numerator + "/" + denominator;
  }

  @Override
  public String toLatex(String name) {
    return name + " = " + toLatex();
  }

  @Override
  public String toLatex(String name, boolean bind) {
    return bind ? name + " := " + toLatex() : toLatex(name);
  }

  @Override
  public String latexSymbol() {
    return "\\mathbb{Q}";
  }

  @Override
  public PredicateDefinition definition() {
    return null;
  }

  @Override
  public double value() {
    return ((double)numerator / (double)denominator);
  }
}
