/*
 * StudentHelper.java
 * entity class for student with a builder
 * Rhegan Albert Fortuin 219273693
 * Date of last edit:2022/06/15
 */

package za.ac.cput.helper;

import org.apache.commons.validator.routines.EmailValidator;

public class StudentHelper {
    //***check for blank or null values string***
    public static String isBlankOrNull(String string){
        if (string.isBlank() || string.equalsIgnoreCase("null"))
            return "";
        else
            return string;
    }

    //validation to see if the email provided is suitable
    public static boolean checkEmail(String email){
        return EmailValidator.getInstance().isValid(email);
    }

    //display which IllegalArgumentException
    public static void checkParam(String paramName, String string){
        if (isBlankOrNull(string).isBlank() || string.equalsIgnoreCase("null") || !checkEmail(string)){
            throw new IllegalArgumentException(String.format("Invalid value for parameter: %s", string));
        }
    }
}
