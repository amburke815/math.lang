package lang;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Utils {
  public static <X> boolean andMap(Predicate<X> pred, List<X> lst) {
    boolean andMapped = true;

    for (X x : lst)
      andMapped &= pred.test(x);

    return andMapped;
  }

  public static <X> boolean orMap(Predicate<X> pred, List<X> lst) {
    boolean orMapped = false;

    for (X x : lst)
      orMapped |= pred.test(x);

    return orMapped;
  }

  public static <X,Y> Y foldr(BiFunction<X,Y,Y> func, Y base, List<X> lst) {
    Y folded = base;

    for(X x : lst)
      folded = func.apply(x, folded);

    return folded;
  }


  public static <X,Y> List<Y> map(Function<X,Y> func, List<X> lst) {
    List<Y> mapped = new ArrayList<>();

    for(X x : lst)
      mapped.add(func.apply(x));

    return mapped;
  }
}
