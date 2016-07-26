package iview.wsienski.quizapp.util;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public class Utils {

    public static String getSafeString(String text){
        if(text==null)
            text="";
        return text;
    }
}
