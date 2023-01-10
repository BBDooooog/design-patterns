package demo1.service.impl;

import demo1.service.AbstractTemplate;

public class Concrete2 extends AbstractTemplate {

    @Override
    public void step1() {
        System.out.println("step1 concrete2");
    }

    @Override
    public void step2() {
        System.out.println("step2 concrete2");
    }

    @Override
    public void step3() {
        System.out.println("step3 concrete2");
    }
}
