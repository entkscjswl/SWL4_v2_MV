package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAOImpl extends DAOBase implements ProductDAO{
	public int create(ProductVO vo) throws SQLException{
		Connection conn = getConnection();
		return 0;
		
	}
	public ProductVO readOne(ProductVO vo) throws SQLException{
		return null;
		
	}
	public ArrayList<ProductVO> readList() throws SQLException{
		return null;
		
	}
	public int update(ProductVO vo) throws SQLException{
		return 0;
		
	}
	public int delete(ProductVO vo) throws SQLException{
		return 0;
		
	}
}
