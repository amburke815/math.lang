package lang.notable;

import java.util.List;
import java.util.function.Predicate;
import lang.MathObject;
import lang.notable.INotable;

/**
 * For noting a boolean quality of a mathematical object.
 *
 * i.e. ForAll x in Z: lang.notable.Even(x) <-> 2|x is a lang.notable.PredicateDefinition
 * lang.notable.Even :: Z -> Boolean
 * ForAll x in Z lang.notable.Even(x) := 2|x
 */
public abstract class PredicateDefinition implements INotable {

  @Override
  public String toLatex() {
    return "\\begin{align}\n\\textit{\\underline{Def:}}\n\\\\"
        + functionSignatureLatex()
        + "\\\\\n"
        + functionDefinitionLatex()
        + "}\n\\end{align}";
  }

  protected abstract String functionSignatureLatex();

  protected abstract String functionDefinitionLatex();

  protected abstract List<MathObject> inputs(); // length of list enforces arity

  protected abstract List<Predicate<MathObject>> validators(); // corresponds to arity

  public abstract boolean validate();



}
