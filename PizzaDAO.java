package pizzeria.model.dao;

import java.util.ArrayList;
import pizzeria.model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PizzaDAO extends DataAccessObject{
	

	public ArrayList <Pizza> findAll(){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList <Pizza> pizzalist = new ArrayList<Pizza>();
		Pizza pizza = null;
		
		try {
			conn = getConnection();
			
			String sqlSelect = "SELECT id, name, description, price FROM pizzat";
			stmt = conn.prepareStatement(sqlSelect);
			rs = stmt.executeQuery();
			while (rs.next()) {
				pizza = readPizza(rs);
				pizzalist.add(pizza);
			}
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}finally {
			close(rs, stmt, conn);
		}
		return pizzalist;
		
	}
	


	private Pizza readPizza(ResultSet rs) {
		try {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String description = rs.getString("description");
			double price = rs.getDouble("price");
			
			return new Pizza(id, name, description, price);
			
			
		}catch (SQLException e) {
				throw new RuntimeException(e);
		}
		
		
	}
}
