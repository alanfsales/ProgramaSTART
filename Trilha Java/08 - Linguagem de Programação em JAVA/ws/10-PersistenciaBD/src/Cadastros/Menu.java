package Cadastros;

import java.sql.SQLException;

public class Menu {

	public static void main(String[] args) throws SQLException {
		Dao dao = new Dao();
		dao.open();
		dao.close();
	}
}
