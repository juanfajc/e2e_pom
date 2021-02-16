package com.pageconstants;

public class SignUpFormConstants {
    //INPUTS
    public static final String INPUT_FIRST_NAME = "input-firstname";
    public static final String INPUT_LAST_NAME = "input-lastname";
    public static final String INPUT_EMAIL = "input-email";
    public static final String INPUT_PHONE = "input-telephone";
    public static final String INPUT_PASSWORD = "input-password";
    public static final String INPUT_PASSWORD_CONFIRM = "input-confirm";

    //CHECKBOXES
    public static final String CHK_PRIVACY = "//input[@type='checkbox' and @name='agree']";

    //BUTTONS
    public static final String BTN_CONTINUE = "//input[@value='Continue']";

    //ERRORS
    public static final String LBL_ERROR_GENERAL = "text-danger";
    public static final String LBL_ERROR_WRONG_EMAIL = "//div[@class='text-danger' and contains(. ,'E-Mail Address does not appear to be valid')]";
    public static final String LBL_ERROR_MISMATCH_PASSWORD = "//div[@class='text-danger' and contains(. ,'Password confirmation does not match password!')]";
}
