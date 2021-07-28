package blbl;

import org.python.util.PythonInterpreter;


public class use_python {

    public static void main(String[] args) {

        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.exec("a=[5,2,3,9,4,0]; ");
        interpreter.exec("print(sorted(a));");  //此处python语句是3.x版本的语法
//        PythonInterpreter interpreter = new PythonInterpreter();
//
//        interpreter.execfile("C:\\Users\\lei\\PycharmProjects\\numpy\\venv\\java.py");
//
//        // 第一个参数为期望获得的函数（变量）的名字，第二个参数为期望返回的对象类型
//        PyFunction pyFunction = interpreter.get("add", PyFunction.class);
//        int a = 2, b = 3;
//        //调用函数，如果函数需要参数，在Java中必须先将参数转化为对应的“Python类型”
//        PyObject pyobj = pyFunction.__call__(new PyInteger(a), new PyInteger(b));
//        System.out.println("方法调用成功，返回: " + pyobj);
    }
}
