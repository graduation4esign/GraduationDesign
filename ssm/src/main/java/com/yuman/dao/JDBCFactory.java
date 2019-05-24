package com.yuman.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yuman.bean.Product;

public class JDBCFactory {
	private static String Driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static String username = "yuman";
	private static String password = "yuman";
	private static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			Class.forName(Driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static List<Product> findProductByName(String productName) {
		StringBuffer sql = new StringBuffer("select * from product where name like '%"+productName+"%'");
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		List<Product> products = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql.toString());
			 resultSet = pstmt.executeQuery();
			 while (resultSet.next()) {
					BigDecimal id = resultSet.getBigDecimal("id");
					String name = resultSet.getString("name");
					BigDecimal price = resultSet.getBigDecimal("price");
					String img = resultSet.getString("img");
					String introduction = resultSet.getString("introduction");
					BigDecimal hot = resultSet.getBigDecimal("hot");
					BigDecimal remain = resultSet.getBigDecimal("remain");
					BigDecimal sellnum = resultSet.getBigDecimal("sellnum");
					BigDecimal cateDetailId = resultSet.getBigDecimal("cate_detail_id");
					Product product = new Product();
					product.setId(id);
					product.setName(name);
					product.setPrice(price);
					product.setImg(img);
					product.setIntroduction(introduction);
					product.setHot(hot);
					product.setRemain(remain);
					product.setSellnum(sellnum);
					product.setCateDetailId(cateDetailId);
					products.add(product);
				}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		return products;
	}
}
