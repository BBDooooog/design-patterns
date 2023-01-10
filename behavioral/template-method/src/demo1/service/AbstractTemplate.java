package demo1.service;

public abstract class AbstractTemplate {


    public void process() {
        step1();
        step2();
        step3();
    }

    public void step1() {
        System.out.println("step1 abs");
    }

    public void step2() {
        System.out.println("step2 abs");
    }

    public void step3() {
        System.out.println("step3 abs");
    }
}
