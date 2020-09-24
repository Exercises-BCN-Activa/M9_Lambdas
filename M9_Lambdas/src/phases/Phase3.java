package phases;

public class Phase3 {
	
	/**
	 * It injects the body of the method into the Functional Interface 
	 * created using a lambda, so that it returns the same string it 
	 * receives as a parameter but in reverse mode. 
	 * In the Main invokes the instance instance by passing a 
	 * string to it and checking the result.
	 * Reverse mode created from class StringBuffer and 
	 * with trim method applied to the parameter.
	 */
	static Phase3i i = (x) -> new StringBuffer(x.trim()).reverse().toString();	
	
}
