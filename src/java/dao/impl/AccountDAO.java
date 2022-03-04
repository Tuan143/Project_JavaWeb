/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import context.MSSQLConnection;
import dao.IAccount;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Tún ^^
 */
public class AccountDAO extends MSSQLConnection implements IAccount {

    @Override
    public Account login(String email, String password) throws Exception {
        //Khai báo biến
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        //Tạo câu lệnh SQL
        String sql = "SELECT * FROM Account WHERE email = ?";
        try {
            connection = MSSQLConnection.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setId(rs.getInt("id"));
                account.setUserName(rs.getString("user_name"));
                account.setEmail(rs.getString("email"));
                account.setPassword(rs.getString("password"));
                account.setPhoneNumber(rs.getString("phone_number"));
                account.setAddress(rs.getString("address"));
                account.setRoleId(rs.getInt("role_id"));
                account.setStatusId(rs.getInt("status_id"));
                if (password.equals(account.getPassword().trim())) {
                    return account;
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(connection);
        }
        return null;
    }

}
