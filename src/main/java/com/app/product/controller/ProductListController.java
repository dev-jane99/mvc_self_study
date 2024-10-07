package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.ProductDAO;
import com.app.product.Action;
import com.app.product.Result;
import com.app.vo.ProductVO;

public class ProductListController implements Action{
	
@Override
public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	ProductDAO productDAO = new ProductDAO();
	ProductVO productVO = new ProductVO();
	Result result = new Result();
	
//	forward 에서만 이거 사용
	req.setAttribute("products", productDAO.selectAll());
	result.setPath("list.jsp");
	
	return result;
}
}
