package Crypto;

import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public abstract class Crypto {

	protected Cipher cipher;
	
	public Crypto( String algorithm ) {
		try {
			cipher  = Cipher.getInstance( algorithm );
		} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
		}
	}
	
	public abstract String encrypt(String data, Key key) throws Exception;
	public abstract String decrypt(String cipherTxt, Key key) throws Exception;

}
