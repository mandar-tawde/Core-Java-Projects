package com.techlabs;

public class AssignmentOne {
	public static void main(String[] args) {
		UrlHandling urlHandler = new UrlHandling();
		urlHandler.setUrl();
		urlHandler.selectDomainName();
		System.out.println("Domain :- "+urlHandler.getDomain());
		System.out.println("Name   :- "+urlHandler.getName());
	}
}
