package com.tws.refactoring.extract_variable;

public class BannerRender {
	boolean isPlatformMAC(String platform) {
		String mac = "MAC";
		return platform.toUpperCase().indexOf(mac) > -1;
	}
	
	boolean isBrowserIE(String browser) {
		String ie = "IE";
		return browser.toUpperCase().indexOf(ie) > -1;
	}
	
    String renderBanner(String platform, String browser) {
    	String ieOnMac = "IE on Mac?";
    	String banner = "banner";
    	return isPlatformMAC(platform) && isBrowserIE(browser) ? ieOnMac:banner;
    }
}
