
@Func
Feature: To verify login functionality


@Functional
  Scenario: User should get loginned successfully
    Given User is on login page "https://demoqa.com/login"
    When User enter UserName "vaibhavsaini12@mailinator.com"
    And Password "Vaibhav123@"
    And Clicks on Login button
    Then User should get redirected to profile page

