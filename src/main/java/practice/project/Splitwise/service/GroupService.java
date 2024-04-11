package practice.project.Splitwise.service;

import practice.project.Splitwise.dto.*;
import practice.project.Splitwise.exception.GroupNotFoundException;
import practice.project.Splitwise.exception.UserNotFoundException;
import practice.project.Splitwise.exception.UserNotMemberOfGroupException;

import java.util.List;

public interface GroupService {
        List<TransactionDTO> settleUpByGroupId(int groupId, int userId) throws UserNotFoundException,
                        GroupNotFoundException, UserNotMemberOfGroupException;

        GroupCreationResponseDTO createGroup(GroupCreationDTO groupData);

        ExpenseResponseDTO addExpense(ExpenseReceivingDTO expenseData) throws UserNotFoundException,
                        GroupNotFoundException, UserNotMemberOfGroupException;

        void groupSettled(SettledDTO settledDTO) throws UserNotFoundException,
                        GroupNotFoundException, UserNotMemberOfGroupException;
}
