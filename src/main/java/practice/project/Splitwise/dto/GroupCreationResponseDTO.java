package practice.project.Splitwise.dto;

import lombok.Getter;
import lombok.Setter;
import practice.project.Splitwise.model.Currency;

import java.util.List;

@Setter
@Getter
public class GroupCreationResponseDTO {
    private Integer id;
    private String name;
    private String description;
    private Currency currency;
    private Double totalSpending;
    private List<UserResponseDTO> usersList;
}
