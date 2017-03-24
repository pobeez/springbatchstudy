package com.example.util;

import java.math.BigDecimal; 



/***
*/
public class BasicArithmaticOperations {
    /***
    */
    static public BigDecimal plus (String a, String b) {
        return plus(new BigDecimal(a), new BigDecimal(b));
    }

    /**/
    static public BigDecimal plus(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
    
    static public BigDecimal minus(String a, String b) {
        return minus(new BigDecimal(a), new BigDecimal(b));
    }

    static public BigDecimal minus(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    static public BigDecimal multiply(String a, String b) {
        return multiply(new BigDecimal(a), new BigDecimal(b));
    }

    static public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
    
    static public BigDecimal divide(String a, String b) {
        return divide(new BigDecimal(a), new BigDecimal(b));
    }

    static public BigDecimal divide(BigDecimal a, BigDecimal b) {
        return a.divide(b);
    }    
}

/*D:\source\git\springbatchstudy\springbatch\gradle\study\ch4\example_project>gradle build
:compileJava
:processResources NO-SOURCE
:classes
:jar
:assemble
:compileTestJava NO-SOURCE
:processTestResources NO-SOURCE
:testClasses UP-TO-DATE
:test NO-SOURCE
:check UP-TO-DATE
:build

BUILD SUCCESSFUL

Total time: 6.331 secs*/