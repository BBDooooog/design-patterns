package demo1.service.impl;

import demo1.service.AbstractTemplate;

public class Concrete1 extends AbstractTemplate {

    @Override
    public void step2() {
        System.out.println("step2 concrete1");
    }
}
