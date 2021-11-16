package Controllers;

import models.UsersModel;
import Repository.AccountsRepository;

public class AccountsController {
    AccountsRepository accountsRepository=new AccountsRepository();
    public UsersModel login(UsersModel usersModel){
            return accountsRepository.loginSql(usersModel);
    }
}
