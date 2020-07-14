import org.graalvm.polyglot.*;

import java.util.Scanner;

public class PolyglotJavaAndPython {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to calculate its square...");
        int input = scanner.nextInt();
        
        Context context = Context.newBuilder().allowIO(true).build();
        context.eval("python", "print('Hello From Python')");
        // Use the getBindings and putMember methods on the context for passing the value from Java to Python app.
        context.getBindings("python").putMember("number", input);
        Value result = context.eval("python", "number * number");
        System.out.println(result);
    }
}
