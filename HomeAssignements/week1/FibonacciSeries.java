package homeassignments.week1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
        int range = 8;   

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= range; i++) {
            System.out.print(first);

            if (i < range) {
                System.out.print(", ");
            }

            int next = first + second;
            first = second;
            second = next;
            
        }
	}

}
