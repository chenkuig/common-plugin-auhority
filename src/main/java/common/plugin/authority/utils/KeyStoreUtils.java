package common.plugin.authority.utils;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.springframework.util.ClassUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KeyStoreUtils {

    private static final String FILE_SEP = System.getProperty("file.separator");
    public static final String PUBLIC_KEY = "public_key.pem";
    public static final String PRIVATE_KEY = "private_key.pem";
    public static final String PATH = "keyStore" + FILE_SEP;

    public static String getPublicKey() {
        String key = "";
        try {
            key = loadKeyFromPemFile(PATH + PUBLIC_KEY);
        } catch (IOException e) {
            log.error("", e);
        }
        return key;
    }

    public static String getPrivateKey() {
        String key = "";
        try {
            key = loadKeyFromPemFile(PATH + PRIVATE_KEY);
        } catch (IOException e) {
            log.error("", e);
        }
        return key;
    }

    private static String loadKeyFromPemFile(String file) throws IOException {
    	ClassLoader classLoder = ClassUtils.getDefaultClassLoader() ;
    	return  IOUtils.resourceToString(file,  Charset.defaultCharset(), classLoder).trim();
    }
}
