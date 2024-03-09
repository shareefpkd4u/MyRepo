Feature: NC Login

  Background: 
    Given open nc login page with url

	@Smoke
  Scenario: NC Login With Datatable
    When enter email data in email
      | Email               |
      | admin@yourstore.com |
    When enter pws data in password
      | Password |
      | admin    |
    When click on login button
    Then verify login is success or not
	
	@Regression
  Scenario Outline: Retest on NC Login
    When enter valid "<Email>" data in email
    And enter valid "<Password>" data in password
    And click on ncLogin button for login purpose
    Then verify login is success or not

    Examples: 
      | Email               | Password   |
      | admin@yourstore.com | admin      |
      | test@yourstore.com  | test       |
      | Radha@yourstore.com | Krishna143 |
