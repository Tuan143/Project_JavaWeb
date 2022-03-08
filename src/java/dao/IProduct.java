/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Product;
import java.util.ArrayList;

/**
 *
 * @author Tún ^^
 */
public interface IProduct {

    /**
     * Lấy tất cả sản phẩm theo số trang mà mình ở PageIndex: là số trang hiện
     * tại mà mình muốn lấy data ra PageSize: là số sản phẩm được hiển thị trên
     * 1 trang
     */
    ArrayList<Product> getAllProductAndPaging(int pageIndex, int pageSize);

    /**
     * Get tất cả product trong database và trả về số lượng hiện có
     *
     * @return
     */
    int countTotalProduct();

    /**
     * Get tất cả product có CategoryId tương ứng
     *
     * @return
     */
    ArrayList<Product> getAllProductByCategoryId(int CategoryId, int pageIndex, int pageSize);

    /**
     * Count tất cả sản phẩm có Category tương ứng
     *
     * @return
     */
    int countTotalProductByCategoryId(int categoryId);

}
