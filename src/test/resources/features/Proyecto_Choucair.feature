# Autor: XXXXXXXXX
@stories
Feature:  Proyecto
  As a user, I need to join to Latest page because is necessary continue the learning process

  @scenario1
  Scenario: Register in the page
    Given than Mateo Open Utest Page and Click Join Button

    When he finds and registers on the platform
      | strName |strLastName  | strEmail                | strBirthDay | strBirthMonth | strBirthYear | strCity | strPostalCode | strPassword   |
      | Mateo   | Roldan      | teoroldan015@gmail.com  | 23          | July          | 1996         | Medellin| 055420        | Y123456789.   |

    Then he finds button complete Register