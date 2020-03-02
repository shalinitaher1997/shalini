Feature: Login functionality in adactin application 



@login
Scenario: User validate the login function using username and password 
	Given User launch the adactin application 
	When User enter the username 
	And User enter the password 
	Then User click on the login button

@searchHotel
Scenario: User search for hotel
	When User selects location 
	And User selects hotel 
	And User selects room type 
	And User selects number of rooms 
	And User enters checkin date 
	And User enters checkout date 
	And User selects number of adults 
	And User selects number of children 
	Then User click on the search button 

@selectHotel	
Scenario: User select hotel
	When User selects hotel from available hotels
	Then User click on continue button

@personalInfo	
Scenario: User enter personal info
	When User enter first name
	And User enter last name
	And User enter billing address
	And User enter credit card number
	And User selects credit card type
	And User selects expiry month of card
	And User selects expiry year of card
	And User enter cvv number
	Then User click on book now button

@itinerary	
Scenario: User validate my itinerary
	Then User click on booked itinerary link

@logout	
Scenario: User logout from the application
	Then User click on logout button
	

