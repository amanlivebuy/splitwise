package practice.project.Splitwise.service;

import org.springframework.beans.factory.annotation.Autowired;
import practice.project.Splitwise.repository.UserRepo;
import practice.project.Splitwise.dto.AddUserToGroupDTO;
import practice.project.Splitwise.dto.UsersCreationDTO;
import practice.project.Splitwise.dto.UserResponseDTO;
import practice.project.Splitwise.model.Users;
import org.springframework.stereotype.Service;
import practice.project.Splitwise.model.UsersGroup;
import practice.project.Splitwise.repository.GroupRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private GroupRepo groupRepo;

    @Override
    public UserResponseDTO createUser(UsersCreationDTO usersCreationDTO) {
        Users user = new Users();

        user.setName(usersCreationDTO.getName());
        user.setMail(usersCreationDTO.getEmail());
        user = userRepo.save(user);
        return new UserResponseDTO(user.getId(), user.getName(), user.getMail());
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        List<Users> users = userRepo.findAll();
        List<UserResponseDTO> userResponseDTOs = new ArrayList<>();
        for (Users user : users) {
            UserResponseDTO userResponseDTO = new UserResponseDTO(user.getId(), user.getName(), user.getMail());
            userResponseDTOs.add(userResponseDTO);
        }
        return userResponseDTOs;
    }

    @Override
    public AddUserToGroupDTO addUserToGroup(AddUserToGroupDTO addUserToGroupDTO) {
        UsersGroup group = groupRepo.findById(addUserToGroupDTO.getGroupId()).get();

        List<Users> users = new ArrayList<>();
        for (int userId : addUserToGroupDTO.getUserIds()) {
            Users user = userRepo.findById(userId).get();
            users.add(user);
        }

        List<Users> groupUsers = group.getUsers();
        groupUsers.addAll(users);
        group.setUsers(groupUsers);
        groupRepo.save(group);

        return addUserToGroupDTO;
    }

}
