public class ExecutationTimeinJava {
	public static void main ( String[] args ) throws InterruptedException {

		long start = System.nanoTime ();
		//----------program--------------

		Thread.sleep ( 3000);

		//-----------------------------------

		long duration = (System.nanoTime ( )- start);

		System.out.println("Time taken by code is : " + duration + " nanoseconds");
		System.out.println("Time taken by code is : " + duration / 1_000_000 + " milliseconds");
		System.out.println("Time taken by code is : " + duration / 1_000_000_000 + " seconds");
		System.out.println("Time taken by code is : " + duration / (1_000_000_000L * 60) + " minutes");
		System.out.println("Time taken by code is : " + duration / (1_000_000_000L * 60 * 60) + " hours");
		System.out.println("Time taken by code is : " + duration / (1_000_000_000L * 60 * 60 * 24) + " days");
	}
}
