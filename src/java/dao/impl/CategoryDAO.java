/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import static context.MSSQLConnection.closeConnection;
import static context.MSSQLConnection.closePreparedStatement;
import static context.MSSQLConnection.closeResultSet;
import static context.MSSQLConnection.getConnection;
import dao.ICategory;
import entity.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Tún ^^
 */
public class CategoryDAO implements ICategory{
    
    public static void main(String[] args) {
        CategoryDAO cd = new CategoryDAO();
        ArrayList<Category> list = cd.getAllCategory();
        for (Category category : list) {
            System.out.println(category.getName());
        }
    }

    @Override
    public ArrayList<Category> getAllCategory() {
          // Khai báo biến
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        //Tạo 1 Arraylist Prodyct để lưu kết quả trả về
        ArrayList<Category> listCategory = new ArrayList<>();

        //Tạo câu lệnh SQL
        String sql = "SELECT * FROM Category";
        try {
            connection = getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Category category = new Category(rs.getInt("id"), rs.getString("Name"));
                listCategory.add(category);
            }
        } catch (Exception e) {
            //throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(connection);
        }
        return listCategory;
    }
    }
    

