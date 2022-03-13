/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ICategory;
import dao.IProduct;
import dao.impl.CategoryDAO;
import dao.impl.ProductDAO;
import entity.Category;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tún ^^
 */
public class CategoryController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            IProduct iProduct = new ProductDAO();
            ICategory iCategory = new CategoryDAO();

            String pageId = request.getParameter("pageIndex");
            String id = request.getParameter("categoryId");

            int categoryId = 0;
            try {
                categoryId = Integer.parseInt(id);
            } catch (Exception e) {
                categoryId = 0;
            }
            
            int pageIndex = 1;
            try {
                pageIndex = Integer.parseInt(pageId);
            } catch (Exception e) {
                //request.setAttribute("message", "Invalid");
                pageIndex = 1;
            }

            int pageSize = 4;
            int totalProduct = iProduct.countTotalProductByCategoryId(categoryId);
            int maxPage = totalProduct / pageSize + (totalProduct % pageSize > 0 ? 1 : 0); // (nếu lớn hơn 0 thì trả về 1 nếu nhỏ hơn 0 thì trả về 0)

            int nextPage = pageIndex + 1;
            int backPage = pageIndex - 1;

            ArrayList<Category> listCategory = iCategory.getAllCategory();

            ArrayList<Product> listProduct = iProduct.getAllProductByCategoryId(categoryId, pageIndex, pageSize);

            request.setAttribute("pageIndex", pageIndex); // truyền lên jsp để biết trang nào cần active và biết nó đang ở page số mấy
            request.setAttribute("maxPage", maxPage); // Để biết có tổng là bao nhiêu trang
            request.setAttribute("nextPage", nextPage); // Để biết khi nào xuất hiện next
            request.setAttribute("backPage", backPage); // Để biết khi nào xuất hiện back
            
            request.setAttribute("listCategory", listCategory);
            request.setAttribute("listProduct", listProduct); // truyền 1 list theo pageIndex và biết nó đang ở page số mấy

            request.getRequestDispatcher("Product.jsp").forward(request, response);

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
