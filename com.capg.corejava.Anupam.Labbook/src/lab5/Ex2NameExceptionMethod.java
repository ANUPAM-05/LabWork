package lab5;

public class Ex2NameExceptionMethod extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
        return "first name or last name is NULL or empty";
    }
}
