Feature: verify products

Scenario: customer place an order by purchasing an item from search

Given user is on Home Page
When he/she searche for "carrot" 
And clicks on ADD TO CART
And click on shopping bag
And click on PROCEED TO CHECKOUT
And click on Place Order 
And select India from the dropdown
And click on Agree terms and conditions checkbox
And click on proceed
Then order should be placed successfully
