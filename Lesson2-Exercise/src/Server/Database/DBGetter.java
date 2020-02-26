package Server.Database;

import Client.Model.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBGetter implements IDBGetter
{
  private String url = "jdbc:postgresql://localhost:5432/postgres/Bank";
  private String user = "postgres";
  private String password = "stq20000409";





  @Override
  public Account getAccount(String accountNo){
    Connection c = null;
    Statement stmt = null;

    Account account =null;

    try {
      Class.forName("org.postgresql.Driver");

      //don't forget to change localhost and password
      c = DriverManager.getConnection(url, user, password);
      c.setAutoCommit(false);
      System.out.println("Opened Car database successfully");

      stmt = c.createStatement();
      ResultSet rs;

      String sql = "SELECT * FROM account " + "WHERE accountNo  = '" + accountNo  + "'";
      rs = stmt.executeQuery(sql);
      System.out.println("------------Account-------------");


      while (rs.next()) {
        String password = rs.getString("password");
        double deposit = rs.getBigDecimal("deposit").doubleValue();
        account = new Account(accountNo,password,deposit);

        System.out.println("get Customer database successfully: " + account);
      }
      c.close();
    } catch (Exception e) {
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
      System.exit(0);
    }
    return account;
  }








}
