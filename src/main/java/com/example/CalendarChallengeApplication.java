package com.example;

import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalendarChallengeApplication {

	@Autowired
	UserRepository users;
	@Autowired
	EventRepository events;


	public static void main(String[] args) {
		SpringApplication.run(CalendarChallengeApplication.class, args);

		CalendarChallengeApplication newApp = new CalendarChallengeApplication();

		System.out.println("Welcome to the calendar");
		System.out.println("Are you an existing user? Y/N");
		Scanner inputScanner = new Scanner(System.in);
		String customerAnswer = inputScanner.nextLine();


		if (customerAnswer.equalsIgnoreCase("Y")) {
			System.out.println("Please enter your email to login");
			String userEmail = inputScanner.nextLine();
			User loginUser = newApp.checkForExistingUser(userEmail);

			if (loginUser == null) {
				System.out.println("User does not exist, please create an account or try again. ");
			} else {
				System.out.println("Would you like to \n 1. Create Events \n 2. View Your Events \n 3. Create a new calendar ");
			}
			// eventually I would put this menu in it's own method b/c members & non-members would need access to this

		} else if (customerAnswer.equalsIgnoreCase("N")) {
			System.out.println("Let's create an account! ");
			System.out.println("Please enter your first name");
			//save info & add it into the db
			System.out.println("Please enter your lastname");

			System.out.println("Please enter your email");
		}

	}

	public User checkForExistingUser(String emailAddress){
		User loginUser = users.findFirstByEmailAddress(emailAddress);
		return loginUser;
		//this will result in an exception if no one exists... will need to put this in a container 
	}
}
