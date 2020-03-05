# new feature
# Tags: optional

Feature: Test the login functionality of the website

    Scenario: The correct username/password combination should be able to login
        Given User is in login page
        When User enters correct username and password
        Then User will have Top Questions page displayed

    Scenario: The wrong username/password combination should not able to login
        Given User is on home page
        When User enters wrong username and password
        Then Wrong username password combination error should displayed


    # new feature # Tags: optional