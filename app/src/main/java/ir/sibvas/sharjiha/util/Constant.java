package ir.sibvas.sharjiha.util;

/**
 * Created by alirezaahmadi on 11/1/2015 AD.
 */
public class Constant {
    public static final String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_PATTERN = "yyyy-MM-dd";
    public static final float PRODUCT_IMAGE_HEIGHT_RATIO = 0.85f;
    public static final int NUMBER_OF_SIMILAR_IN_PRODUCT_PAGE = 3;
    public static final int NUMBER_OF_COMMENTS_IN_PRODUCT_PAGE = 5;
    public static final int NUMBER_OF_LINE_IN_PRODUCT_PAGE_COMMENT_BODY = 4;
    public static final int MAX_SIZE_OF_COMPARISON_PRODUCT_LIST = 2;

    public final static String IP_ADDRESS = "https://10.10.10.10/payment/return_page.html?params=";
    public static final String CHROME_PACKAGE = "com.android.chrome";

    // patterns
    public final static String PHONE_PATTERN = "^09[0-9]{9}$";
    public final static String LPHONE_PATTERN = "^[0-9]{8}$";
    public final static String NUMERIC_PATTERN = "^[0-9]+$";
    public final static String EMAIL_PATTERN = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    public final static String PATTERN_USERNAME = "^[a-zA-Z0-9_-]+$";
    public static final int REQUEST_DELAY_WHEN_DEBUG = 0;

    public static String WEB_SERVICE_URL = "WebServiceUrlHere";
}
