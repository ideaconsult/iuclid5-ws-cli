package net.idea.i5wscli;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

/**
 * Util class that contains some useful methods 
 * needed for initialization of stub classes
 */
public class StubUtil {

	/**
	 * Concatenate base target web services url with specified end point service name.
	 * <br>Example:<br> baseURL=<b>http://example.com/axis2/services</b>, endPointName=<b>SessionEngine</b>,
	 * result=<b>http://example.com/axis2/services/SessionEngine</b>
	 * 
	 * @param baseURL url address for web services
	 * @param endPointName name of axis web service
	 * 
	 * @return the concatenated address
	 */
	public static String concatEndpointAddress(String baseURL, String endPointName) {
		if (baseURL.endsWith("/"))
			return (new StringBuilder()).append(baseURL).append(endPointName).toString();
		else
			return (new StringBuilder()).append(baseURL).append("/").append(endPointName).toString();
	}
	
	/**
	 * Initialize some axis client options for given {@link ServiceClient}
	 * 
	 * @param axisClient
	 * @throws AxisFault
	 */
	public static void initializeAxisService(ServiceClient axisClient) throws AxisFault {
		Options options = axisClient.getOptions();
		options.setManageSession(true);
		options.setTimeOutInMilliSeconds(600000);
		axisClient.setOptions(options);
	}
	

    
	public static String encryptPassword(String decryptedPassword) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			byte pwdByte[] = decryptedPassword.getBytes("UTF-8");
			byte md5Byte[] = md5.digest(pwdByte);
			return encodeHex(md5Byte);
		} catch (NoSuchAlgorithmException ex) {
			throw new RuntimeException(ex);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	protected static String encodeHex(byte hash[]) {
		int currenLength = hash.length;
		char out[] = new char[currenLength * 2];
		int i = 0;
		int j = 0;
		for (; i < currenLength; i++) {
			int high = hash[i] >>> 4 & 0xf;
			int low = hash[i] & 0xf;
			out[j++] = DIGITS[high];
			out[j++] = DIGITS[low];
		}

		return new String(out);
	}
	private static final char DIGITS[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C',
		'D', 'E', 'F' };

}
