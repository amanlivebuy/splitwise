package practice.project.Splitwise.service.strategy;

import practice.project.Splitwise.dto.TransactionDTO;
import practice.project.Splitwise.model.Expense;

import java.util.List;

public interface SettleUpStrategy {
    List<TransactionDTO> settleUp(List<Expense> expenses);
}
