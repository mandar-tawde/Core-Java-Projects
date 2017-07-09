package com.techlabs.candidate.test;

import com.techlabs.candidate.Candidate;
import com.techlabs.candidate.ratingType;

public class CandidateTest {

	public static void main(String[] args) {
		Candidate x; // expects an object

		x = new Candidate();
		x.setID(100);
		x.setName("Mandar");
		x.setCGPA(5.5f);
		x.setRating(ratingType.OUTSTANDING);

		printInfo(x);

		Candidate y;
		y = new Candidate();
		y.setID(101);
		y.setName("Rajashree");
		y.setCGPA(6.75f);
		y.setRating(ratingType.GOOD);

		printInfo(y);

		Candidate z;
		z = x;
		x.setName("Sachin");
		System.out.println("Name of z is " + z.getName());
		System.out.println("Name of x is " + x.getName());

		printInfo(new Candidate(102, "Pankaj", 6.52f, ratingType.AVERage));

		Candidate[] someCandidates = { x, y,
				new Candidate(103, "Namrata", 6.52f, ratingType.GOOD),
				new Candidate(104, "Mandar", 7.50f, ratingType.OUTSTANDING) };

		printInfo(someCandidates);
	}

	private static void printInfo(Candidate c) {
		System.out.println("ID     : " + c.getID());
		System.out.println("Name   : " + c.getName());
		System.out.println("CGPA   : " + c.getCGPA());
		System.out.println("Rating : " + c.getRating());
	}

	private static void printInfo(Candidate[] candidates) {
		for (Candidate c : candidates) {
			printInfo(c);
		}
	}

}
