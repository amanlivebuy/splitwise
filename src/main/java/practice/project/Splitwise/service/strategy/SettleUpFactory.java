package practice.project.Splitwise.service.strategy;

import practice.project.Splitwise.model.SettleUpStrategyType;

public class SettleUpFactory {
    public static SettleUpStrategy getSettleUpStrategy(SettleUpStrategyType type) {
        type.toString();
        return new HeapBasedStrategy();

    }
}
