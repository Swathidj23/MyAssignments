package week4.day1;

public class ImplementClass implements DatabseConnection{

	@Override
	public void connect() {
		System.out.println("connecting the database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnecting the database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("execute query or update query in the database");
		
	}

}
