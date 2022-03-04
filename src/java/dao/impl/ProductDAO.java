/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import context.MSSQLConnection;
import dao.IProduct;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Tún ^^
 */
public class ProductDAO extends MSSQLConnection implements IProduct {

    @Override
    public ArrayList<Product> getAllProductAndPaging(int pageIndex, int pageSize) {
        // Khai báo biến
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        //Tạo 1 Arraylist Prodyct để lưu kết quả trả về
        ArrayList<Product> listProduct = new ArrayList<>();

        //Tạo câu lệnh SQL
        String sql = "SELECT * FROM (\n"
                + "SELECT ROW_NUMBER() over (order by id ASC) as rn, *\n"
                + "from Product\n"
                + ") as x/n"
                + "WHERE rn between (?-1)*? + 1"
                + "AND ? * ?";
        try {
            connection = getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, pageIndex);
            ps.setInt(2, pageSize);
            ps.setInt(3, pageIndex);
            ps.setInt(4, pageSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("Id"));
                product.setName(rs.getString("Name"));
                product.setPrice(rs.getInt("Price"));
                product.setQuantity(rs.getInt("Quantity"));
                product.setCategoryId(rs.getInt("CategoryId"));
                product.setStatus(rs.getString("Status"));
                product.setImageLink(rs.getString("ImageLink"));
                product.setDescription(rs.getString("Description"));
                product.setNote(rs.getString("Note"));
                
            }
            return listProduct;
        } catch (Exception e) {
            //throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(connection);
        }
        return listProduct;
    }

}
