package demo1;

import demo1.service.AbstractTemplate;
import demo1.service.impl.Concrete1;
import demo1.service.impl.Concrete2;

public class client {

    public static void main(String[] args) {
        AbstractTemplate template2 = new Concrete2();
        template2.process();
        System.out.println("----------");

        AbstractTemplate template1 = new Concrete1();
        template1.process();
    }
}
