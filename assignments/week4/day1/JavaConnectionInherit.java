package assignments.week4.day1;

public class JavaConnectionInherit extends MySqlConnection {
	


	@Override
	public void connect() {
	
		System.out.println("Connect from MySQL");
		
	}

	@Override
	public void disconnect() {
		
		System.out.println("Disconnect from MySQL");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute upate in MySQL");
	}
	
	public static void main(String[] args) {
		
		 JavaConnectionInherit  obj = new JavaConnectionInherit();
		
		obj.connect();
		obj.disconnect();
        obj.executeQuery();
        obj.executeUpdate();
		
		
	}

}
