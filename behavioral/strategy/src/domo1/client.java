package domo1;

import domo1.service.IStrategy;
import domo1.service.impl.ConcreteStrategyHeader;
import domo1.service.impl.ConcreteStrategyTail;

public class client {

    public static void main(String[] args) {
        IStrategy strategyHeader = new ConcreteStrategyHeader();
        Context context = new Context(strategyHeader);
        context.process("hello", "world");

        IStrategy strategytail = new ConcreteStrategyTail();
        context.setStrategy(strategytail);
        context.process("hello", "world");
    }
}
