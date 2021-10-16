Narrative:
As a user
I want to check an incorrect month during sign up action
So that I can validate the age restriction rule on the Spotify site

Scenario: Check birth year failure error message
Meta: @theme test2
Given I open signup page
And I close cookie message
When I set email <email> and set <confemail>
And I set password <password>
And I set user name <username>
And I set birth day <birthday> and  month <birthmonth> and year <birthyear>
And choose gender radio button and terms atterny <termscondition>
And click on submit button
Then I can not see error <invisibleerror>
And I can see error <visibleerror>


Examples:
| email       | confemail   | password         | username   | birthday | birthmonth | birthyear | termscondition | invisibleerror                      | visibleerror |
| test@ya.ru  | test@ya.ru  | test@ya1PASSWORD | testUser   | 11       | 05         | 2012      | true           | Укажите действительный день месяца. | 0            |
| test2@ya.ru | test2@ya.ru | test@ya2PASSWORD | testUser22 | 01       | 12         | 2021      | true           | Укажите действительный день месяца. | 0            |



