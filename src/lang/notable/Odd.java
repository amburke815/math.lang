package lang.notable;

import java.util.List;
import java.util.function.Predicate;
import lang.MathObject;

public class Odd extends PredicateDefinition {

  @Override
  protected String functionSignatureLatex() {
    return "Odd :: " + new lang.numbersets.Integer().latexSymbol() + "\\rightarrow Boolean";
  }

  @Override
  protected String functionDefinitionLatex() {
    return "\\forAll x \\in " + new lang.numbersets.Integer().latexSymbol() + "\\ Odd(x) := \\neg"
        + "Even(x)";
  }

  @Override
  protected List<MathObject> inputs() {
    return null;
  }

  @Override
  protected List<Predicate<MathObject>> validators() {
    return null;
  }

  @Override
  public boolean validate() {
    return false;
  }
}
