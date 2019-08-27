package com.tws.refactoring.extract_variable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BannerRenderTest {

	@Test
	void should_return_IE_ON_Mac_when_renderBanner_given_platform_as_Mac_and_browser_as_IE() {
		//given
		String platform = "Mac";
		String browser = "IE";
		BannerRender bannerRender = new BannerRender();		
		//when
		String returnString = bannerRender.renderBanner(platform,browser);
		//then
		assertEquals("IE on Mac?", returnString);
	}
	
	@Test
	void should_return_banner_when_renderBanner_given_platform_as_Mac_and_browser_as_banner() {
		//given
		String platform = "Mac";
		String browser = "banner";
		BannerRender bannerRender = new BannerRender();		
		//when
		String returnString = bannerRender.renderBanner(platform,browser);
		//then
		assertEquals("banner", returnString);
	}


	@Test
	void should_return_banner_when_renderBanner_given_platform_as_Windows_and_browser_as_banner() {
		//given
		String platform = "Windows";
		String browser = "banner";
		BannerRender bannerRender = new BannerRender();		
		//when
		String returnString = bannerRender.renderBanner(platform,browser);
		//then
		assertEquals("banner", returnString);
	}
	

	@Test
	void should_return_banner_when_renderBanner_given_platform_as_Windows_and_browser_as_other() {
		//given
		String platform = "Windows";
		String browser = "other";
		BannerRender bannerRender = new BannerRender();		
		//when
		String returnString = bannerRender.renderBanner(platform,browser);
		//then
		assertEquals("banner", returnString);
	}
}
