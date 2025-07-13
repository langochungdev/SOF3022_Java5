package web.service;

import web.model.Account;

public interface AccountService {
    Account findById(String username);
}
