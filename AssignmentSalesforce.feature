Feature: Login to SalesForce Application

Scenario: Login to Salesforce with Valid data

Given Launch Browser and Load the URL and Maximize the Screen
And Enter the Username as 'hari.radhakrishnan@qeagle.com'
And Enter the Password as 'Leaf@1234'
When Click on Login
And Click on toggle menu button from the left corner
And Click view All
And click Sales from App Launcher
And Click on Opportunity tab
And Click on New button
And Enter Opportunity name as 'Salesforce Automation Venkatesh'
And Choose close date as Today
And Select Stage as Need Analysis
And click Save
Then VerifyOppurtunity Name



