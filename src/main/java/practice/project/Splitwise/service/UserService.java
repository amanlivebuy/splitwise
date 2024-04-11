package practice.project.Splitwise.service;

import java.util.List;

import practice.project.Splitwise.dto.AddUserToGroupDTO;
import practice.project.Splitwise.dto.UsersCreationDTO;
import practice.project.Splitwise.dto.UserResponseDTO;

public interface UserService {

    public UserResponseDTO createUser(UsersCreationDTO usersCreationDTO);

    public List<UserResponseDTO> getAllUsers();

    public AddUserToGroupDTO addUserToGroup(AddUserToGroupDTO addUserToGroupDTO);

}
