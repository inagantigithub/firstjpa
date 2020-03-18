package info.ashok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dbconnection {
	int connect() throws SQLException {
		Person person = new Person();
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ashok", "inaganti");
		PreparedStatement prepareStatement = connection.prepareStatement("insert into go values(?,?)");
	prepareStatement.setString(1, person.getName());
	prepareStatement.setString(2, person.getSurname());
	int i = prepareStatement.executeUpdate();
	System.out.println(i+"records are inserted");
	connection.close();
	return i;
	}

}
