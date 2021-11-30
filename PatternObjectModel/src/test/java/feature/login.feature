Feature: Login for Leaftap application
Scenario Outline: Positive login flow
Given open the browser
And load the url
And enter the username as DemoSalesManager
And enter the password as crmsfa
When click on the login button
Then verify the login is success
When click on crm/sfa
When click on createlead
And enter the compnamyname as <cName>
And enter the firstname as <fName>
And enter the lastname as <lName>
When click on createlead
Then verify create lead success
Examples:
|cName|fName|lName|
|HCL|kalai|S|
|HCL|Lakshmi|V|


