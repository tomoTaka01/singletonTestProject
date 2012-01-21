/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singletontestproject;

import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

/**
 *
 * @author tomo
 */
public class HelloWorld {
    public String sayHello(){
        final String language = Locale.getDefault().getLanguage();
        if (language.equals(Locale.JAPANESE.getLanguage())){
            if (isAfternoon()) {
                return "こんばんは";
            } else {
                return "こんにちは";
            }
        } else if (language.equals(Locale.ENGLISH.getLanguage())){
            if (isAfternoon()) {
                return "Good Aftermoon";
            } else {
                return "Good Morning";
            }
        }
        return "?";
    }

    private boolean isAfternoon(){
        Date date = new Date(System.currentTimeMillis());
        Formatter formatter = new Formatter();
        String hour = formatter.format("%tH", date).toString();
        if (Long.parseLong(hour) > 17) {
            return true;
        } else {
            return false;
        }
    }
}
