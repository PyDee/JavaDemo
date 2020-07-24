package UsePython;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CallBackPython {
    public static void main(String[] args) {
        try {
            System.out.println("run start....");
            //数组的第一个参数Python命令，第二是Python脚本文件的绝对路径
            String[] args1 = new String[]{"python", "C:\\Users\\Administrator\\qmproject\\qmjava\\UsePython\\PythonPrint.py"};
            Process pr = Runtime.getRuntime().exec(args1);//执行脚本命令
            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;

            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            pr.waitFor();
            System.out.println("run end....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
