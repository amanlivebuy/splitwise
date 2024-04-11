package practice.project.Splitwise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.project.Splitwise.model.UsersGroup;

public interface GroupRepo extends JpaRepository<UsersGroup, Integer> {

}
