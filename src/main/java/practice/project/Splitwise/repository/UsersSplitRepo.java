package practice.project.Splitwise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.project.Splitwise.model.UsersSplit;

public interface UsersSplitRepo extends JpaRepository<UsersSplit, Integer> {
}
