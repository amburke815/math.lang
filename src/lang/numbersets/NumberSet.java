package lang.numbersets;

import lang.MathObject;
import lang.notable.PredicateDefinition;

public abstract class NumberSet implements MathObject {

  /**
   * The latex/mathbb symbol for this elementary number set
   * @return
   */
  public abstract String latexSymbol();

  /**
   * Returns a <code>PredicateDefinition</code> used to verify the
   * membership of a MathObject in this numberset. i.e. the formal definition of
   * set membership. This object's toLatex method can be called to retrieve
   * a Latex string encapsulating this definition
   * @return
   */
  public abstract PredicateDefinition definition();

  public abstract double value();


}
