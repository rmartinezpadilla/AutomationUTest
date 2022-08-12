Feature: I as user of the UTest
    i want to create a new register
    to access as user

  Scenario Outline: Scenario: Successful user creation
    Given user in the home page
    When user create an account filling the fields nombre:<nombre> apellido:<lastName> correo:<email> mes:<month> dia:<day> anno:<year>
    Then user sees its username

    Examples:
      | nombre    |lastName         |email                         |month     |day |year  |
      | Ruben     |Martinez Padilla |rmartinezpadilla@hotmail.com  |December  |28  |1989  |

    #Examples:
     # | nombre    |lastName         |
      #| Ruben     |Martinez Padilla  |




