Feature: Bot page verification
  I as user
  I want to search the fligths
  To see if the bot page appears

  Scenario: Bot page verification sucessfully
    Given that Liliana searchs the flight options
      | originCity  | LAX |
      | destinyCity | LGA |
    When she searchs the flight
    Then she should see the bot page asking for verification