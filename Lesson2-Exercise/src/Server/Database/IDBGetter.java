package Server.Database;

import Client.Model.Account;

public interface IDBGetter
{
  Account getAccount(String accountNo);
}
