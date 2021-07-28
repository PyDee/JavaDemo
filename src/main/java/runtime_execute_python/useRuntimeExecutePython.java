package runtime_execute_python;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class useRuntimeExecutePython {
    public static void main(String[] args) {
        Process proc;
        try {
            proc = Runtime.getRuntime().exec("python C:\\Users\\Administrator\\qmproject\\qmjava\\src\\main\\java\\UsePython\\python_runtime.py");
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            proc.waitFor();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

