package com.packt.patterninspring.chapter7.bankapp;

/**
 * @author Dinesh.Rajput
 *
 */
public class SpringJdbcDemo {

	public static void main(String[] args) {
		
	}
	
	/*public List<Account> findByAccountNumber(Long accountNumber) {
		List<Account> accountList = new ArrayList<Account>();
		Connection conn = null;
		String sql = "select account_name, account_balance from ACCOUNT where account_number=?";
		try {
			DataSource dataSource = DataSourceUtils.getDataSource();
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, accountNumber);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				accountList.add(new Account(rs.getString("account_name"), ...));
			}
			} catch (SQLException e) {  ???  }
			finally {
				try {
					conn.close();
				} catch (SQLException e) {  ???  }
			}
			return accountList;
	}*/
}