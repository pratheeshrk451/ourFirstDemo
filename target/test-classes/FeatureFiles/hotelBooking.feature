Feature: To Validate the hotel booking functions

  Scenario Outline: User login the hotel booking website with valid credentials
    Given User launch the browser
    And User enters the url
    When User enters the "<userName>" and "<password>"
    And User clicks the login button
    Then User navigate to hotel search page
    Examples:
    |userName|password|
    |pratheesh|123456|

  Scenario: User search the hotel using with selected requirements
    When User select the location and name of the hotel
    And User select the roomType and noOfRoom they want
    And User select the adult and child counts
    And User click the submit button
    Then User navigate to hotel selected page

  Scenario: User choose the hotel
    When User choose the required hotel offers
    And User click the continue button

  Scenario: User enter their details for hotel booking confirmation
    When User enter the firstName and lastName
    And User enter the billingAdress and creditCardNumber
    And User select the cardType,cardExpireMonth,cvv and expireDate
    And user click the BOok button
    Then User booked the hotel
