package homeassignments.week4.day1;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		
		System.out.println("Connect from JavaConnection");
	}

	@Override
	public void disconnect() {
		
		System.out.println("disconnect from JavaConnection");
	}

	@Override
	public void executeUpdate() {
		
		System.out.println("executeUpdate in JavaConnection");
		
	}
	
	public static void main(String[] args) {
    
		JavaConnection obj = new JavaConnection ();
    
		obj.connect();
		obj.disconnect();
        obj.executeUpdate();

	}


}
