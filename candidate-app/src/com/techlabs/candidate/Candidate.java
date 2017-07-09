package com.techlabs.candidate;

public class Candidate {
	private int id;
	private String name;
	private float cgpa;
	private ratingType rating;

	public Candidate() {
		System.out.println("Inside constructor");

	}

	public Candidate(int pId, String pName, float pCGPA, ratingType pRating) {
		if (pId >= 100)
			id = pId;
		if (pName.length() >= 1)
			name = pName;
		if (pCGPA >= 4.0f && pCGPA <= 10.0f)
			cgpa = pCGPA;
		rating = pRating;
	}

	public void setID(int pId) {
		if (pId >= 100)
			id = pId;
	}

	public void setName(String pName) {
		if (pName.length() >= 1)
			name = pName;
	}

	public void setCGPA(float pCGPA) {
		if (pCGPA >= 4.0f && pCGPA <= 10.0f)
			cgpa = pCGPA;
	}

	public void setRating(ratingType pRating) {
		rating = pRating;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getCGPA() {
		return cgpa;
	}

	public ratingType getRating() {
		return rating;
	}
}
