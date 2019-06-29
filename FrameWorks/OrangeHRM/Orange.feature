Feature: OrangeHRM login functionality testing
Scenario Outline: Validating login functionality of OrangeHRM application



Given open firefox browser and navigate  OrangeHRM application
When  user enters valid "<username>" and "<password>" and click on login button
Then  user should be able to successfully login and close  application

Examples:

|  username  |  password |
|  Admin     |  admin123 |
|  hello     |  challo   |

