package com.techlabs;

import java.util.Scanner;

public class UrlHandling {
	
	private String[] arr = new String[3];
	private String url,domain,name;
	
	public void setUrl() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the URL");
		url=sc.next();
		sc.close();
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void selectDomainName() {
		arr = url.split("\\.");
		domain = arr[1];
		arr = arr[2].split("=");
		name=arr[1].substring(1,arr[1].length()-1);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDomain() {
		return domain;
	}
}
