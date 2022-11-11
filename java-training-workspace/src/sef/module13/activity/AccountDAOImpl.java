package sef.module13.activity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sef.module8.activity.AccountException;

public class AccountDAOImpl implements AccountDAO {

//    private static final String SELECT_ACOUNT_NAMES = "SELECT id, first_name, last_name, e_mail FROM account WHERE first_name = ? AND last_name = ? ORDER BY id";
    private static final String SELECT_ACOUNT_NAMES = "SELECT id, first_name, last_name, e_mail FROM account  WHERE LOWER(first_name) LIKE LOWER(?) AND LOWER(last_name) LIKE LOWER(?) ORDER BY id";
    private static final String SELECT_ACOUNT_BY_ID = "SELECT id, first_name, last_name, e_mail FROM account WHERE id = ?";
    private static final String INSERT_NEW_ACCOUNT = "INSERT INTO account (first_name, last_name, e_mail) VALUES (?, ?, ?)";
    
    private static final int ACCOUNT_ID_COLUMN = 1;
    private static final int ACCOUNT_FIRST_NAME_COLUMN = 2;
    private static final int ACCOUNT_LAST_NAME_COLUMN = 3;
    private static final int ACCOUNT_EMAIL_COLUMN = 4;
    
    private Connection conn;
    
    private PreparedStatement statement = null;
    private ResultSet rows = null;

    public AccountDAOImpl(Connection conn) {
        this.conn = conn;
    }
    
    private AccountImpl toAccount(ResultSet row) throws SQLException {
        AccountImpl account = new AccountImpl(rows.getInt(ACCOUNT_ID_COLUMN), rows.getString(ACCOUNT_FIRST_NAME_COLUMN), rows.getString(ACCOUNT_LAST_NAME_COLUMN), rows.getString(ACCOUNT_EMAIL_COLUMN));
        return account;
    }
    

    public List<Account> findAccount(String firstName, String lastName) throws AccountDAOException {

        List<Account> accounts = new ArrayList<>();

        try {
            statement = conn.prepareStatement(SELECT_ACOUNT_NAMES);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            rows = statement.executeQuery();

            while (rows.next()) {

                Account account = toAccount(rows);
//                AccountImpl account = new AccountImpl(rows.getInt(ACCOUNT_ID_COLUMN), rows.getString(ACCOUNT_FIRST_NAME_COLUMN), rows.getString(ACCOUNT_LAST_NAME_COLUMN), rows.getString(ACCOUNT_EMAIL_COLUMN));
                accounts.add(account);
                
            }

        } catch (SQLException e) {
            throw new AccountDAOException("ERROR_FIND_NAME", e); 
        } finally {
            this.close();
        }

        return accounts;
    }

    public Account findAccount(int id) throws AccountDAOException {

        Account account = null;

        try {
            statement = conn.prepareStatement(SELECT_ACOUNT_BY_ID);
            statement.setInt(1, id);
            rows = statement.executeQuery();
            
            if (rows.next()) {
                account = toAccount(rows);
            }
            
        } catch (SQLException e) {
            throw new AccountDAOException("ERROR_FIND_ID", e); 
        } finally {
            this.close();
        }
       
        
        return account;
    }

    public boolean insertAccount(String firstName, String lastName, String email) throws AccountDAOException {

        try {
            statement = conn.prepareStatement(INSERT_NEW_ACCOUNT);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, email);
            
            int numberRowsAffected = statement.executeUpdate();
            
            if (numberRowsAffected > 0) {
                return true;
            }
            
            return false;
            
        } catch (SQLException e) {
            throw new AccountDAOException("ERROR_INSERT_ACCOUNT", e);
            
        } finally {
            this.close();

        }
        
    }
    
    private void close () {
        try {
            if (statement != null) {
                statement.close();
            }
            if (rows != null ) {
                rows.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
           logSQLException(e);
        }
    }

    private void logSQLException (SQLException e) {
        System.out.println(String.format("sql error=%s, error code=%s", e.getMessage(), e.getErrorCode()));
    }
}
