package practice.project.Splitwise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import practice.project.Splitwise.dto.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
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
        System.out.println(
                "usersCreationDTO: name: " + usersCreationDTO.getName() + " email: " + usersCreationDTO.getEmail());
        return userService.createUser(usersCreationDTO);
    }

    @PostMapping("/addUserToGroup")
    public AddUserToGroupDTO addUserToGroup(@RequestBody AddUserToGroupDTO addUserToGroupDTO) {
        return userService.addUserToGroup(addUserToGroupDTO);
    }

}
