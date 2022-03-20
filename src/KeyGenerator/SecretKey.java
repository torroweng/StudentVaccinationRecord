package KeyGenerator;

import java.security.Key;
import java.util.Arrays;

import javax.crypto.spec.SecretKeySpec;

/**
 * 
 * @author kimlee
 *
 *	this creates a secret-key using predefined chars
 */

public class SecretKey {

	/**
	 * Algorithm
	 */
	private static final String ALGORITHM = "AES";
	
	/**
	 * predefined chars
	 */
	private final static String SECRET_CHARS = "thiszx54365gdfgutryjCXcem"; 
	
	public static Key create() {
		
		return new SecretKeySpec( Arrays.copyOf(SECRET_CHARS.getBytes(), 16), ALGORITHM );
		
	}
	
}
