Feature: Home Interiors

Background:
Given I am on MagicBricks home page

Scenario: To Navigate to Modular Kitchen Design Ideas
When I click on Home Interiors dropdown
And I click on Home Interiors Design Ideas
And I click on Modular Kitchen Design Ideas
Then Modular Kitchen Design Ideas page will be displayed

Scenario: To Navigate to Bedroom Design Ideas
When I click on Home Interiors design dropdown
And I click on Home Interiors Design Ideas  
And I click on Bedroom Design Ideas
Then Bedroom Design Ideas page will be displayed

Scenario: To Navigate to TV Unit Design Ideas
When I click on Home Interiors design dropdown
And I click on Home Interiors Design Ideas
And I click on TV UnitDesign 
Then TV Unit Design page will be displayed

Scenario: To Navigate to 1BHK Interior Design
When I click on Home Interiors design dropdown
And I click on Full Home Interiors Design Ideas
And I click on 1BHK Interior Design
Then 1BHK Interior Design page will be displayed


Scenario Outline: To Navigate to 2BHK Interior Design
When I click on Home Interiors design dropdown
And I click on Full Home Interiors Design Ideas
And I click on <"<2BHK Interior Design>">
And 2BHK Interior Design page will be displayed
And I choose <"<Select City>"> from dropdown
And I choose <"<Price Range>"> from dropdown
Then the 2BHK Interior Design page should be filtered by <"<Select City>"> and <"<Price Range>">


| Select City | Price Range |
| Banglore    | Below 5Lacs |
| Hyderabad   | 5-10 Lacs   |








    
    