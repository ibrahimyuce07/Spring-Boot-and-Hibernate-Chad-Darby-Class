package com.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements IFortuneService {

	private String fileName = "C:\\Users\\ibrah\\OneDrive\\Documents\\GitHub\\Spring-Boot-and-Hibernate-Chad-Darby-Class\\spring-demo-annotations\\fortune-data.txt";
	private List<String> theFortunes;

	@PostConstruct
	public void readFortunesFromTheFile() {
		System.out.println("Here is the list of all available fortunes:");
		System.out.println("############################");
		for(String fortune:theFortunes) {
			System.out.println(fortune);
		}
		System.out.println("############################");
	}
	
	// create a random number generator
	private Random myRandom = new Random();

	public FileFortuneService() {

		File theFile = new File(fileName);

		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());

		// initialize array list
		theFortunes = new ArrayList<String>();

		// read fortunes from file
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(theFortunes.size());

		String tempFortune = theFortunes.get(index);

		return tempFortune;
	}

}
