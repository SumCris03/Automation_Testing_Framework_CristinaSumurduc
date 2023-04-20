Feature: Register feature test suite
  Background:
    Given "https://demo.opencart.com/" is accesed

@run
  Scenario: Register Page URL is accesible Home Page
    Given "https://demo.opencart.com/" is accesed

    When My account button is clicked
    And Register button is clicked
    Then  "register" is present within the current url

  Scenario Outline: Register page url contains the following word <keyword>
    Given "https://demo.opencart.com/" is accesed

    When My account button is clicked
    And Register button is clicked
    Then  "<keyword>" is present within the current url
    Examples:
    |keyword|
    |index  |

    |account/register|