package UsePython;

import org.python.util.PythonInterpreter;

public class execute_python {
    public static void main(String[] args) {
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.exec("a = [5, 2, 3, 7, 4, 9, 0]");
        interpreter.exec("print(sorted(a))");
    }
}
