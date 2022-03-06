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
        String sql = "select * from (\n"
                + "    select ROW_NUMBER() over (order by id ASC) as rn, *\n"
                + "    from Product\n"
                + ") as x\n"
                + "where rn between (?-1)*? +1 "
                + "and ? * ?";
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

                product.setId(rs.getInt("id"));
                product.setName(rs.getString("Name"));
                product.setPrice(rs.getInt("Price"));
                product.setQuantity(rs.getInt("Quantity"));
                product.setCategoryId(rs.getInt("CategoryId"));
                product.setStatus(rs.getString("Status"));
                product.setImageLink(rs.getString("ImageLink"));
                product.setDescription(rs.getString("Description"));
                product.setNote(rs.getString("Note"));

                listProduct.add(product);
            }
        } catch (Exception e) {
            //throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(connection);
        }
        return listProduct;
    }

    @Override
    public int countTotalProduct() {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT COUNT(id) FROM Product";
        int count = 0;
        try {
            connection = getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1); // count++
            }
            return count;
        } catch (Exception e) {
            // throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(connection);
        }
        return count;
    }

}
