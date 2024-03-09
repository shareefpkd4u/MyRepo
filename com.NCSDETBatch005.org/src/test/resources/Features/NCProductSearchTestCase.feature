Feature: NC Product Search
	
	@Regression
  Scenario: Verify & Validate the NC Product Search Functionality
    Given launch Chrome Browser
    Given open NC Login Page
    Then verify NC login page got loaded
    When do Login of the NC
    Then verify Login success
    When click on catalog
    When click on products
    When enter valid product name
    When click on search button
    When click on logout link
    Then verify logout success
    When terminate the browser
