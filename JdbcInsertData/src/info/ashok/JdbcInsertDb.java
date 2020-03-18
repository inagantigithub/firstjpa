package info.ashok;

import java.sql.SQLException;
import java.util.Scanner;

public class JdbcInsertDb {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your name");
		String name = scanner.nextLine();
		System.out.println("enetr your surname");
		String surname = scanner.nextLine();
		Person person = new Person();
		person.setName(name);
		person.setSurname(surname);
		Dbconnection dbconnection = new Dbconnection();
		
		int i = dbconnection.connect();
		System.out.println(i+"records are inserted");
		System.out.println("inagantiashok kumar");
		
	}

}
