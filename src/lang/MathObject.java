package lang;

public interface MathObject {

  /**
   * Formats this math object in Latex
   * @return
   */
  String toLatex();

  /**
   * Formats this math object in Latex with a name for the 'variable'
   * For example, formatting a Real "3" with the name x yields
   * x = 3
   * @param name
   * @return
   */
  String toLatex(String name);

  /**
   * Formats this math object in Latex with a name for the 'variable' where
   * it is explicitly denoted that this is a binding definition using the ":=" symbol
   * when the <code>bind</code> parameter is <code>true</code>.
   * For example <code>new Rational(3).toLatex("z", true)</code> yields the latex expression
   * z := 3
   * @param name
   * @param bind
   * @return
   */
  String toLatex(String name, boolean bind);
}
