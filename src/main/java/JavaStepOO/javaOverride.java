//  2. 覆写
package JavaStepOO;

import JavaStepOO.SuperBiology;

public class javaOverride extends SuperBiology {


    // 使用@Override 标识下列方法为覆写了父类方法
    @Override
    protected void setClassify(String classify) {

        this.classify = classify + "111";

    }
}

