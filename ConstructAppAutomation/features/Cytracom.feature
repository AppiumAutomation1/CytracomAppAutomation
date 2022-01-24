

Feature: Login functionality
  

  @demotest
  Scenario: Validate valid login
    Given User enters valid username "cbowns_test@cytracom.com"
    And User enters valid password "DgTn6VW2"
    And User clicks on login button
    Then validate user lands on the homepage

  
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
