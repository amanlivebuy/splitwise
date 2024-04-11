package practice.project.Splitwise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.project.Splitwise.model.Expense;

public interface ExpenseRepo extends JpaRepository<Expense, Integer> {
}
