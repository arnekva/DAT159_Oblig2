/**
 * 
 */
package no.hvl.dat159.crypto;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;


/**
 * @author tdoy
 *
 */
public class KeyStores {

	
	/**
	 * 
	 * @param keystore
	 * @param alias
	 * @param keystorepassword
	 * @return
	 * @throws KeyStoreException 
	 * @throws NoSuchAlgorithmException 
	 * @throws UnrecoverableKeyException 
	 */
	public static PrivateKey getPrivateKeyFromKeyStore(String keystore, String alias, String keystorepassword) throws KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException {
		
		// Load the keystore (programmatically) and extract the private key from the keystore
		KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
		try(InputStream fis = new FileInputStream(keystore)){
			keyStore.load(fis, keystorepassword.toCharArray());
		}
		catch(Exception e)
		{

		}
		PrivateKey key = (PrivateKey) keyStore.getKey(alias,keystorepassword.toCharArray());
		
		return key;
		// implement me donezo
		
		
	}
}
