package domo1.service.impl;

import domo1.service.IStrategy;

public class ConcreteStrategyTail implements IStrategy {

    @Override
    public String execute(String src, String s) {
        return src.concat(s);
    }

}
