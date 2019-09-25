package aplicacion;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Walter López
 * @author Eduard Jiménez
 */
public class Main {

  private static SecretKeySpec secretKey;// = "29dh120_dk1_3";

  public static void main(String[] args) {

  }

  public static void setKey(String myKey) {
    MessageDigest sha;
    try {
      byte[] key = myKey.getBytes("UTF-8");
      sha = MessageDigest.getInstance("SHA-1");
      key = sha.digest(key);
      key = Arrays.copyOf(key, 16);
      secretKey = new SecretKeySpec(key, "AES");
    } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
      System.out.println("No se pudo completar");
    }
  }
}
