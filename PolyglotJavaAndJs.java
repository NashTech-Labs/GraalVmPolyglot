import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class PolyglotJavaAndJs {
    public static void main(String[] args) {
        Context context = Context.newBuilder().allowIO(true).build();
        Value array = context.eval("js", "[1,2,42,4]");
        int result = array.getArrayElement(2).asInt();
        System.out.println(result);
    }
}
