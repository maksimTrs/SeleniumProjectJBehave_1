Narrative:
As a user
I want to check all errors for empty fields, except birth data fields
So that I can validate fields validation on the Spotify site

Scenario: check all errors for all fields, except birthday fields
Meta: @theme test1
Given I open signup page
And I close cookie message
When I set user name TestUser2
And I set full birth date:
| day | month | year |
| 13  | 05    | 1990 |
| 19  | 11    | 1985 |
And click on submit button
Then I can see 6 errors
And the 4 error equals to Выберите свой пол.
And I can not see the error Укажите действительный день месяца.
And I can not see the error Выберите месяц.
And I can not see the error Укажите действительный год.