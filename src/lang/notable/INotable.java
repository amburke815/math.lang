package lang.notable;

/**
 * Something you would write in your math notebook when learning a new concept
 */
public interface INotable {

  String toLatex();

  // String toLatex(String latexLabel); -> implement later

  @Override
  boolean equals(Object o);

  @Override
  int hashCode();
}
