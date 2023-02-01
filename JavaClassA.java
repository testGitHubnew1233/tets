package com.cx.test;

/**
 * Created by: Dorg.1111
 * Date: 18/08/2016.
 
 
 
 
 */

import javax.script.*;

public class JavaClassA {
    public static void main(String[] args) {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            System.out.println(args[0]);
            engine.eval("print('"+ args[0] + "')");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
