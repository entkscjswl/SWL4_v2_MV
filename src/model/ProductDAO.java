package model;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface ProductDAO {
	int create(ProductVO vo) throws SQLException;
	ProductVO readOne(ProductVO vo) throws SQLException;
	ArrayList<ProductVO> readList() throws SQLException;
	int update(ProductVO vo) throws SQLException;
	int delete(ProductVO vo) throws SQLException;
}