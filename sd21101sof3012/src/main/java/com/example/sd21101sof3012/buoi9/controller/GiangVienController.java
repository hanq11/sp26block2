package com.example.sd21101sof3012.buoi9.controller;

import com.example.sd21101sof3012.buoi9.entity.GiangVien;
import com.example.sd21101sof3012.buoi9.entity.TruongHoc;
import com.example.sd21101sof3012.buoi9.repository.GiangVienRepository;
import com.example.sd21101sof3012.buoi9.repository.TruongHocRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "giangVienController", value = {
        "/giang-vien/hien-thi", // GET
        "/giang-vien/view-update", // GET
        "/giang-vien/sua", // POST
        "/giang-vien/xoa", // GET
        "/giang-vien/them", // POST
})
public class GiangVienController extends HttpServlet {
    GiangVienRepository giangVienRepository = new GiangVienRepository();
    TruongHocRepository truongHocRepository = new TruongHocRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("hien-thi")) {
            hienThi(req, resp);
        } else if(uri.contains("view-update")) {
            viewUpdate(req, resp);
        } else if(uri.contains("xoa")) {
            xoa(req, resp);
        }
    }

    private void xoa(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        giangVienRepository.xoa(id);
        resp.sendRedirect("/giang-vien/hien-thi");
    }

    private void viewUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("giangVien", giangVienRepository.getById(id));
        req.setAttribute("listTruongHoc", truongHocRepository.getAll());
        req.getRequestDispatcher("/buoi9/view-update.jsp").forward(req, resp);
    }

    private void hienThi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listGiangVien", giangVienRepository.getAll());
        req.setAttribute("listTruongHoc", truongHocRepository.getAll());
        req.getRequestDispatcher("/buoi9/hien-thi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("them")) {
            themGiangVien(req, resp);
        } else if(uri.contains("sua")) {
            suaGiangVien(req, resp);
        }
    }

    private void suaGiangVien(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String tenGiangVien = req.getParameter("tenGiangVien");
        Integer tuoi = Integer.valueOf(req.getParameter("tuoi"));
        Boolean gioiTinh = Boolean.valueOf(req.getParameter("gioiTinh"));

        Integer truongId = Integer.valueOf(req.getParameter("truongId"));
        TruongHoc truongHoc = truongHocRepository.getById(truongId);
        GiangVien giangVien = new GiangVien(id, tenGiangVien, tuoi, gioiTinh, truongHoc);
        giangVienRepository.sua(giangVien);
        resp.sendRedirect("/giang-vien/hien-thi");
    }

    private void themGiangVien(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String tenGiangVien = req.getParameter("tenGiangVien");
        Integer tuoi = Integer.valueOf(req.getParameter("tuoi"));
        Boolean gioiTinh = Boolean.valueOf(req.getParameter("gioiTinh"));

        Integer truongId = Integer.valueOf(req.getParameter("truongId"));
        TruongHoc truongHoc = truongHocRepository.getById(truongId);
        GiangVien giangVien = new GiangVien(null, tenGiangVien, tuoi, gioiTinh, truongHoc);
        giangVienRepository.them(giangVien);
        resp.sendRedirect("/giang-vien/hien-thi");
    }
}
