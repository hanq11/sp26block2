package com.example.sd21101sof3012.buoi5.controller;

import com.example.sd21101sof3012.buoi5.entity.SanPham;
import com.example.sd21101sof3012.buoi5.repository.SanPhamRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "sanPhamController", value = {
        "/san-pham/hien-thi",
        "/san-pham/them",
        "/san-pham/sua",
        "/san-pham/view-update",
        "/san-pham/xoa",
})
public class SanPhamController extends HttpServlet {
    SanPhamRepository sprp = new SanPhamRepository();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("hien-thi")) {
            hienThi(req, resp);
        } else if(uri.contains("view-update")) {
            viewUpdate(req, resp);
        } else if(uri.contains("xoa")) {
            xoaSanPham(req, resp);
        }
    }

    private void xoaSanPham(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        sprp.xoaSanPham(id);
        resp.sendRedirect("/san-pham/hien-thi");
    }

    private void viewUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("sanPham", sprp.getById(id));
        req.getRequestDispatcher("/buoi5/view-update.jsp").forward(req, resp);
    }

    private void hienThi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listSanPham", sprp.getAll());
        req.getRequestDispatcher("/buoi5/hien-thi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("them")) {
            themSanPham(req, resp);
        } else if(uri.contains("sua")) {
            suaSanPham(req, resp);
        }
    }

    private void themSanPham(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        Integer price = Integer.valueOf(req.getParameter("price"));
        Boolean active = Boolean.valueOf(req.getParameter("active"));

        SanPham sp = new SanPham(null, name, price, active);
        sprp.themSanPham(sp);
        resp.sendRedirect("/san-pham/hien-thi");
    }

    private void suaSanPham(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String name = req.getParameter("name");
        Integer price = Integer.valueOf(req.getParameter("price"));
        Boolean active = Boolean.valueOf(req.getParameter("active"));

        SanPham sp = new SanPham(id, name, price, active);
        sprp.suaSanPham(sp);
        resp.sendRedirect("/san-pham/hien-thi");
    }
}
