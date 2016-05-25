package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Guitar;
import dao.GuitarDao;
import util.Util;

public class GuitarDaoImpl implements GuitarDao{

	@Override
//ÃÌº”Guitar
	public void addGuitar(Guitar guitar) {
		String sql="insert into Guitar(serialNumber,price,builder,model,type,backWood,topWood) values(?,?,?,?,?,?,?)";
		Util util=new Util();
		Connection conn=util.getConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, guitar.getSerialNumber());
			ps.setDouble(2,guitar.getPrice());
			ps.setString(3, guitar.getBuilder());
			ps.setString(4, guitar.getModel());
			ps.setString(5, guitar.getType());
			ps.setString(6, guitar.getBackWood());
			ps.setString(7, guitar.getTopWood());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			util.closeConnection(conn);
		}
	}



	@Override
//≤È—ØGuitar
	public List<Guitar> search(String model) {
		// TODO Auto-generated method stub
		List<Guitar> list=new ArrayList<Guitar>();
		String sql="select * from Guitar where model=?";
		Util util=new Util();
		Connection conn=util.getConnection();
		
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, model);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Guitar guitar=new Guitar();
				guitar.setSerialNumber(rs.getString(1));
				guitar.setPrice(rs.getDouble(2));
				guitar.setBuilder(rs.getString(3));
				guitar.setModel(model);
				guitar.setType(rs.getString(5));
				guitar.setBackWood(rs.getString(6));
				guitar.setTopWood(rs.getString(7));
				list.add(guitar);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			util.closeConnection(conn);
		}
		return null;
	}



}
