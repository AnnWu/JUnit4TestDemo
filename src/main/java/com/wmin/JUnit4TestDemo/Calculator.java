package com.wmin.JUnit4TestDemo;

public class Calculator {
    private static int result; // 静态变量，用于存储运行结果
    public void add(int n) {
        result = result + n;  //加法算法
    }
    public void substract(int n) {
        result = result - 1;  //预留Bug: 正确的应该是 result =result-n
    }
    public void multiply(int n) {
        // 此方法暂未实现，用于备用
    }
    public void divide(int n) {
        result = result / n;
    }
    public void square(int n) {
        result = n * n;
    }
    public void squareRoot(int n) {
        for (; ;) ;            //预留Bug : 死循环
    }
    public void clear() {     // 将result结果清零
        result = 0;
    }
    public int getResult() {  //获取最终result的值
        return result;
    }
}
