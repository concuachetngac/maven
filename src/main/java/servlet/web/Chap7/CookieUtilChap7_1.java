package servlet.web.Chap7;

import javax.servlet.http.*;

public class CookieUtilChap7_1 {

    public static String getCookieValue(
            Cookie[] cookies, String cookieName) {
        
        String cookieValue = "";
        if (cookies != null) {
            for (Cookie cookie: cookies) {
                if (cookieName.equals(cookie.getName())) {
                    cookieValue = cookie.getValue();
                }
            }
        }
        return cookieValue;
    }
}
