
Feature: Flight Booking
@tagsfirst
Scenario: Book a one-way fligt
	Given User is at the Flight tab page
	And Clicks on One way button
	Then Enter 'Paris' as origin and 'London' as destination
	And Select  10/03/2017 as departure date and 20/03/2017 as return date
	
	
	