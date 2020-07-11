package com.kay.principles.ocp.after;

public class Demo {

    public static void main(String[] args) {
        ApiStateInfo apiStateInfo = new ApiStateInfo();
        //setter.....
        ApplicationContext.getInstance().getAlert().check(apiStateInfo);
    }
}
