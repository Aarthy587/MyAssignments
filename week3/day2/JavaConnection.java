package week3.day2;

public class JavaConnection implements DatabaseConnection{

	public static void main(String[] args) {
		
		JavaConnection object=new JavaConnection();
		object.connect();
		object.disconnect();
		object.executeUpdate();
		object.close();

	}

	@Override
	public void connect() {
		System.out.println("Database Connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Databse Disconnected");
	}

	@Override
	public void executeUpdate() {
		
		System.out.println("Executed ExecuteUpdated");
	}

	public void close()
	{
		System.out.println("Ended");
	}
}
