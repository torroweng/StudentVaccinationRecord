package Signature;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import java.util.Base64;

import javax.crypto.Cipher;

public class MySignature {

	private Signature signr;
	
	/**
	 * Testing section (KeyPair)
	 */
	
	
	private KeyPairGenerator keygen;
	private KeyPair keyPair;
	{
		try {
			keygen = KeyPairGenerator.getInstance("RSA");
			keyPair = keygen.generateKeyPair();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//==========================================================================
	public MySignature() {
		super();
		try {
			signr = Signature.getInstance("SHA256WithRSA");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * sign()
	 */
	public String sign(String data) throws Exception {
		signr.initSign( keyPair.getPrivate());
		signr.update(data.getBytes());
		return Base64.getEncoder().encodeToString(signr.sign()); 
	}
	/**
	 * verify()
	 */
	public boolean verify (String data, String signature) throws Exception 
	{
		signr.initVerify(keyPair.getPublic());
		signr.update(data.getBytes());
		return signr.verify(Base64.getDecoder().decode(signature));
	}
}
