Feature: NC Login
	
	@Smoke
  Scenario: Validate NC Login Functionality
    Given launch the Firefox Browser
    Given open nopcommerce Login Page
    When enter valid email data into email field
    When enter Valid Password data into password filed
    When click on nc login button
    Then Verify login success
