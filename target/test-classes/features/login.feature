@login
Feature: Validate Login Functionality
  This features comtains all test cases to check login functionality with both valid and 
  invalid credentials

  Scenario Outline: Validate Login Functionality with Valid Credentials
    Given User is on Login Page
    When User enter valid Username "<username>" and Password "<password>"
    And Click on Login Button
    Then User lands on Dashboard Page

    Examples: 
      | username                       | password     |
      | nandeesh.cl@impactanalytics.co | Apjkalam!123 |
      | nandeesh.cl@impactanalytics.co | Apjkalam!123 |
