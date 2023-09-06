@Regression
Feature: validate the login functionlity in murseworld
Scenario Outline:
to  signin the functionality with valid email and valid password
Given user have to launch the murseworld URL
When user have to enter the valid "<email>" and valid "<password>"
And user have to click the signin button
Then user have to verify the signin functionlity


Examples:
   |email|password|
   |mailgirisinbox@gmail.com|Mailgiri@12|
   |nailgiri@gmail.com|nailajaj|
   |ebiasbdiu@gmail.com|aiUsdiU|
   |QUGFIDHAJK@gmail.com|dvihdiu|