package benchmark;
import org.derive4j.Data;
@Data
 public abstract class C39
{
  public interface Cases <R>
  {
    R m1 (Integer p1)
    ;
    R m2 (Integer p1, String p2)
    ;
    R m3 (Integer p1, String p2, Object p3)
    ;
  }
  public abstract <R> R match (Cases<R> cases)
  ;
  @Override
  public abstract String toString ()
  ;
  @Override
  public abstract boolean equals (Object other)
  ;
  @Override
  public abstract int hashCode ()
  ;
}