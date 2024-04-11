package practice.project.Splitwise.dto;

import lombok.Getter;
import lombok.Setter;
import practice.project.Splitwise.model.Currency;
import practice.project.Splitwise.model.Users;

import java.util.List;

@Getter
@Setter
public class GroupCreationDTO {
    private String name;
    private String description;
    private Currency currency;
    private List<Users> usersList;
}
