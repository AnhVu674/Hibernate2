package Project_KH;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

public class Customer_Modifi {
	public static List<Customer> getCustomerList(String s) {
		List<Customer> customerList = new ArrayList<Customer>();
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = (Connection) DriverManager.getConnection(config.DB_URL, config.USERNAME, config.PASSWORD);
			String mysql = "select * from KhachHang";
			if (s == null && !s.isEmpty()) {
				mysql += "where fullName = ?";
			}
			ps = con.prepareStatement(mysql);
			if (s != null && !s.isEmpty()) {
				ps.setString(1, s);
			}
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Customer customer = new Customer(rs.getString("fullName"), rs.getString("email"),
						rs.getString("phoneNumber"), rs.getString("address"));
				customerList.add(customer);
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return customerList;

	}

	public static void insert(Customer c) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = (Connection) DriverManager.getConnection(config.DB_URL, config.USERNAME, config.PASSWORD);
			String mysql = "insert into KhachHang(id,fullName,email,phoneNumer,address)" + "values(?,?,?,?,?)";
			ps = con.prepareStatement(mysql);
			ps.setLong(1, c.getId());
			ps.setString(2, c.getFullName());
			ps.setString(3, c.getEmail());
			ps.setString(4, c.getPhoneNumber());
			ps.setString(5, c.getAddress());
			ps.execute();
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void update(Customer cus) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = (Connection) DriverManager.getConnection(config.DB_URL, config.USERNAME, config.PASSWORD);
			String mysql = "update customer set fullName =?, email = ?, phoneNumber=?, address = ?, where id=? ";
			ps = con.prepareStatement(mysql);
			ps.setString(1, cus.getFullName());
			ps.setString(2, cus.getEmail());
			ps.setString(3, cus.getPhoneNumber());
			ps.setString(4, cus.getAddress());
			ps.setLong(5, cus.getId());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void delete(Customer cus) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = (Connection) DriverManager.getConnection(config.DB_URL, config.USERNAME, config.PASSWORD);
			String mysql = " delete from customer where id=? ";
			ps = con.prepareStatement(mysql);
			ps.setLong(5, cus.getId());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
