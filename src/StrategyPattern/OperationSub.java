package StrategyPattern;

public class OperationSub implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a-b;
    }
}
