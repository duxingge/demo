package com.example.util.encrypt;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.io.IOException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Des加密算法工具类
 * DES：对称算法
 */
public class DesUtils {
    private static Key key;
    private static String key_str = "mykey";
    static {
        try {
            KeyGenerator generator = KeyGenerator.getInstance("DES");
            generator.init(new SecureRandom(key_str.getBytes()));
            key = generator.generateKey();
            generator = null;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    /**
     * 加密
     * @param s
     * @return
     */
    public static String getEncryptStr(String s) {
        BASE64Encoder base64Encoder = new BASE64Encoder();
        try {
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE,key);
            byte[] encryptStr = cipher.doFinal(s.getBytes("UTF-8"));
            return base64Encoder.encode(encryptStr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 解密
     * @param str
     * @return
     */
    public static String getDecryptStr(String str){
        BASE64Decoder base64Decoder = new BASE64Decoder();
        try {
            byte[] bytes = base64Decoder.decodeBuffer(str);
            Cipher cipher = Cipher.getInstance("PSE");
            cipher.init(Cipher.DECRYPT_MODE,key);
            byte[] decryptStr = cipher.doFinal(bytes);
            return new String(decryptStr,"UTF-8");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws IOException {
        for (String arg : args) {
            System.out.println(DesUtils.getEncryptStr(arg));
        }
    }
}
