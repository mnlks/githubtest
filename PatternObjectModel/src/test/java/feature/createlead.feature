Feature: Login for Leaftap application
Scenario Outline: Positive login flow
Given open the browser
And load the url
And enter the username as DemoSalesManager
And enter the password as crmsfa
When click on the login button
Then verify the login is success
When click on crmsfa
When click on Leads
When click on createlead
And enter the company name as <cname>
And enter the firstname as <fname>
And enter the lastname as <lname>
When click on createlead Button

Examples:
|cname|fname|lname|
|HCL|kalai|S|
|HCL|Lakshmi|V|



