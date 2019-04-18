Feature: To Signup an account for facebook web application

  Scenario Outline: To signup an facebook account with randomly generated personal details
    Given I Launch a web browser
    And Enter the first set of personal details "<EnterFirstname>" "<EnterSurName>" "<EnterEmailaddress>" "<EnterPass>"
    And Enter the second set of personal details "<EnterBirthDay>" "<EnterBirthMonth>" "<EnterBirthYear>"
    Then Signup for the facebook application
    Then I close the web browser

    Examples:
    |EnterFirstname|EnterSurName|EnterEmailaddress|EnterPass|EnterBirthDay|EnterBirthMonth|EnterBirthYear|
    |Yes           |Yes         |Yes              |Yes      |Yes          |Yes            |Yes           |

