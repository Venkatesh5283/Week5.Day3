Feature: Create a  Lead

Scenario: Create a Lead With Valid Data

Given Launch Browser and Load the URL and Maximize the Screen
And Enter the Username as 'DemoCsr'
And Enter the Password as 'crmsfa'
When Click on Login Button
Then Verify My Page Successfully login


When Click on CRMSFA Link
And Click on Leads from Menu Bar
And Click on Create Lead
And Enter the Company Name as 'HP'
And Enter the First Name as 'Venkatesh'
And Enter the Last Name as 'Shan'
And Enter the Phone Number as '7397455283'
When After Entering the Values click on Create lead Button
Then Verify Lead was Created Successfully

