package mainpackage.steps.jbehave;

import mainpackage.steps.serenity.SignUpSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpPageSteps {
    private static final String errorSpotifyYearField = "Вы не достигли возраста, с которого можно пользоваться сервисом Spotify.";

    @Steps
    SignUpSteps signUpSteps;

    @Given("I open signup page")
    public void givenStartPage() {
        signUpSteps.openSignUpPageStep();
    }

    @Given("I close cookie message")
    public void closeCookie() {
        signUpSteps.closeCookieMessageStep();
    }

    @When("I set email $email and set $confemail")
    public void whenAddEmailData(@Named("email")String email, @Named("confemail")String confemail) {
        signUpSteps.addEmailDataStep(email, confemail);
    }

    @When("I set password $password")
    public void whenAddPasswordData(@Named("password")String password) {
        signUpSteps.addPasswordDataStep(password);
    }

    @When("I set user name $username")
    public void whenAddNameData(@Named("username")String username) {
        signUpSteps.addNameDataStep(username);
    }

    @When("I set birth day $birthday and  month $birthmonth and year $birthyear")
    public void whenAddBirthdayData(@Named("birthday")String birthday, @Named("birthmonth")String birthmonth, @Named("birthyear")String birthyear) {
        signUpSteps.addBirthdayDataStep(birthday, birthmonth, birthyear);
    }

    @When("choose gender radio button and terms atterny $termscondition")
    public void whenActivateRadioAndCheckboxButtons(@Named("termscondition")boolean termscondition) {
        signUpSteps.activateRadioAndCheckboxButtonsStep(termscondition);
    }

    @When("click on submit button")
    public void whenSubmitButtonClick() {
        signUpSteps.submitActionStep();
    }

    @Then("I can not see error $invisibleerror")
    public void thenIsErrorINVisibleCheck(@Named("invisibleerror")String invisibleerror) {
        assertThat(signUpSteps.isErrorVisibleStep(invisibleerror)).as("Такого текста ошибки не должно отображаться!").isFalse();
    }

    @Then("I can see error $visibleerror")
    public void thenIsErrorVisibleCheck(@Named("visibleerror")int visibleerror) {
        assertThat(signUpSteps.getErrorByNumberStep(visibleerror)).as("Ошибки не совпадают!").isEqualTo(errorSpotifyYearField);
    }


    @Then("I can see $errorsNumber errors")
    public void thenGetErrorFieldsList(int errorsNumber) {
        assertThat(signUpSteps.getErrorFieldsListStep()).as("Кол-во ошибок не совпадает!").isEqualTo(errorsNumber);
    }

    @Then("the $errNumber error equals to $errorName")
    public void thenGetErrorByNumber(int errNumber, String errorName) {
        assertThat(signUpSteps.getErrorByNumberStep(errNumber)).as("Ошибки не совпадают!").isEqualTo(errorName);
    }

    @Then("I can not see the error $errorName")
    public void thenIsErrorVisibleStep1(String errorName) {
        assertThat(signUpSteps.isErrorVisibleStep(errorName)).as("Такого текста ошибки не должно отображаться!").isFalse();
    }

    @When("I set full birth date: $dateTable")
    public void setDate(ExamplesTable dateTable) {
            for (Map<String,String> row : dateTable.getRows()) {
                String a = row.get("day");
                String b = row.get("month");
                String c = row.get("year");
                signUpSteps.addBirthdayDataStep(a, b , c);
                }
    }

}

