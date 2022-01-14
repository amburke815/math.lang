import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * ForAll x in Z Even(x) <-> 2|x
 * Even :: Z -> Boolean
 */
public class Even extends PredicateDefinition {

  private final List<MathObject> inputs; // length 1 -> arity 1
  private final List<Predicate<MathObject>> validators; // length 1 -> arity 1

  // an instance that can test the evenness of a number
  public Even(MathObject amIEven) {
    this.inputs = new ArrayList<MathObject>();
    this.inputs.add(amIEven);

    this.validators = new ArrayList<>();
    this.validators.add(mo -> (mo instanceof Integer) && ((Integer) mo).val % 2 == 0);
  }

  // an instance that only encapsulates the definition of evenness
  public Even() {
    this.inputs = new ArrayList<>();
    this.validators = new ArrayList<>(); // trivially returns true for validate()
  }

  @Override
  protected String functionSignatureLatex() {
    return "Even :: \\mathbb{Z} \\rightarrow Boolean";
  }

  @Override
  protected String functionDefinitionLatex() {
    return "\\forall x \\in \\mathbb{Z}\\ Even(x) := 2|x";
  }

  @Override
  public String toLatex(String latexLabel) {
    return null; // implement later and reuse functionality from old latex func
  }

  @Override
  protected List<MathObject> inputs() {
    return inputs;
  }

  @Override
  protected List<Predicate<MathObject>> validators() {
    return validators;
  }

  @Override
  public boolean validate() {
    return Utils.andMap(validators.get(0), inputs);
  }
}
