/**
 * 
 */
package no.hvl.dat159.crypto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/**
 * @author tdoy
 *
 */
public class Certificates {

	/**
	 * Given a certificate, extract the public key for operations such as encryption/signature
	 */
	
	/**
	 * Client side public key methods
	 * @param certfile
	 * @return
	 */
	public static PublicKey getPublicKey(String certfile) {
		
		
		// implement me okidoki
		X509Certificate certificate = null;
		try {
			FileInputStream fin = new FileInputStream(certfile);
			CertificateFactory f = CertificateFactory.getInstance("X.509");
			certificate = (X509Certificate)f.generateCertificate(fin);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (CertificateException e) {
			e.printStackTrace();
		}
		return certificate.getPublicKey();
	}

}
