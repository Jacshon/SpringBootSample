package com.wwj.server.common.util;

import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

public class LocaleUtil {
	
	public static String getLocalCode(){
		Locale locale = LocaleContextHolder.getLocale();
		return locale.toString();
	}
	
	public static Locale getLocal(){
		return LocaleContextHolder.getLocale();
	}
}
