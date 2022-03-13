/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import context.MSSQLConnection;
import static context.MSSQLConnection.closeConnection;
import static context.MSSQLConnection.closePreparedStatement;
import static context.MSSQLConnection.closeResultSet;
import static context.MSSQLConnection.getConnection;
import dao.IProduct;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    @Override
    public ArrayList<Product> getAllProductByCategoryId(int CategoryId, int pageIndex, int pageSize) {
        // Khai báo biến
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        //Tạo 1 Arraylist Prodyct để lưu kết quả trả về
        ArrayList<Product> listProduct = new ArrayList<>();

        //Tạo câu lệnh SQL
        String sql = "select * from (\n"
                + "    select ROW_NUMBER() over (order by id ASC) as rn, *\n"
                + "    from Product WHERE CategoryId = ?\n"
                + ") as x\n"
                + "where rn between (?-1)*? +1 "
                + "and ? * ?";
        try {
            connection = getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, CategoryId);
            ps.setInt(2, pageIndex);
            ps.setInt(3, pageSize);
            ps.setInt(4, pageIndex);
            ps.setInt(5, pageSize);
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
    public int countTotalProductByCategoryId(int categoryId) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT COUNT(id) FROM Product WHERE CategoryId = ?";
        int count = 0;
        try {
            connection = getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, categoryId);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1); // count++
            }
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
