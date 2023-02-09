Feature: This is for cart feature functionality


@newcart
Scenario: verify new item added in the cart
Given launch "<URL>"
    Then Click Nokia lumia
    Then Click add to cart
    Then Click cart
    Then Verify new item added to cart
