
public class SystemException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SystemException(String msg) {
		super(msg);
	}
	
	public SystemException(Throwable msg) {
		super(msg);
	}
	
	public String getDebugMessage() {
		return this.getMessage();
	}

}
