package com.luoq.designpattern.behavior.strategy;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
