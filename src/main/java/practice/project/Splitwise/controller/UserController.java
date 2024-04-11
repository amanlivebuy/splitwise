package practice.project.Splitwise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import practice.project.Splitwise.dto.AddUserToGroupDTO;
import practice.project.Splitwise.dto.UsersCreationDTO;
import practice.project.Splitwise.dto.UserResponseDTO;
import practice.project.Splitwise.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserResponseDTO> getAllUsers() {
        return userService.getAllUsers();

    }

    @PostMapping("/createUser")
    public UserResponseDTO createUser(@RequestBody UsersCreationDTO usersCreationDTO) {
        return userService.createUser(usersCreationDTO);
    }

    @PostMapping("/addUserToGroup")
    public AddUserToGroupDTO addUserToGroup(@RequestBody AddUserToGroupDTO addUserToGroupDTO) {
        return userService.addUserToGroup(addUserToGroupDTO);
    }

}
