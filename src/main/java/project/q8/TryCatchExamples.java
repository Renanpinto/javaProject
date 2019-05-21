package project.q8;

public class TryCatchExamples {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try	{
			Integer number = null;
			Integer result = 2 * number;
			System.out.println(result);
		} catch (NullPointerException e1) {
			System.out.println("deu nullPointer");
			//fazAlgumaCoisa();
		} finally {
			System.out.println("Será sempre executado mesmo que haja exception");
		}
	}
}
