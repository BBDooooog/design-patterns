package domo1;

import domo1.service.IStrategy;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(String src, String s) {
        print(src, s);
        System.out.println(strategy.execute(src, s));
    }

    public void print(String src, String s) {
        System.out.println("src: " + src);
        System.out.println("s: " + s);
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
