package mainpackage.steps.serenity;

import mainpackage.steps.jbehave.SignUpPageSteps;
import net.thucydides.core.annotations.Step;
import mainpackage.pages.SignUpPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SignUpSteps {
    private SignUpPage signUpPage;

    @Step
    public void openSignUpPageStep() {
        signUpPage.open();
    }

    @Step
    public void addEmailDataStep(String email, String confemail) {
        signUpPage.addTextToEmailField(email);
        signUpPage.addTextToEmailConfirmField(confemail);
    }

    @Step("Fill Birthday Fields: day {0}, month {1}, year {2}")
    public void addBirthdayDataStep(String day, String month, String year) {
        signUpPage.setDayOfBirth(day);
        signUpPage.setMonth(month);
        signUpPage.setYearOfBirth(year);
    }

    @Step
    public void addPasswordDataStep(String password){
        signUpPage.addTextToPasswordField(password);
    }

    @Step
    public void addNameDataStep(String name){
        signUpPage.addTextToNameField(name);
    }

    @Step
    public void activateRadioAndCheckboxButtonsStep(boolean clickOTermsConditionsCheckbox) {
        signUpPage.setMaleGenderRadioButton();
        signUpPage.setTermsConditionsCheckbox(clickOTermsConditionsCheckbox);
    }

    @Step
    public void submitActionStep() {
        signUpPage.clickSubmitButton();
    }

    @Step
    public void closeCookieMessageStep() {
        signUpPage.closeCookieMessage();
    }

    @Step
    public void fullRegistrationStep(String email, String confirmEmail, String password, String userName, String dayBirth, String monthBirth,
                                     String yearBirth, boolean termsCondition) {
        signUpPage.closeCookieMessage();
        signUpPage.addTextToEmailField(email);
        signUpPage.addTextToEmailConfirmField(confirmEmail);
        signUpPage.addTextToPasswordField(password);
        signUpPage.addTextToNameField(userName);
        signUpPage.setDayOfBirth(dayBirth);
        signUpPage.setMonth(monthBirth);
        signUpPage.setYearOfBirth(yearBirth);
        signUpPage.setMaleGenderRadioButton();
        signUpPage.setTermsConditionsCheckbox(termsCondition);
        signUpPage.clickSubmitButton();
    }

    @Step
    public String getH2HeaderValueStep() {
        return signUpPage.getH2HeaderValue();
    }

    @Step
    public boolean isErrorVisibleStep(String message) {
        return signUpPage.isErrorVisible(message);
    }

    @Step
    public String getErrorByNumberStep(int number) {
        return signUpPage.getErrorByNumber(number);
    }


    @Step
    public int getErrorFieldsListStep() {
        return signUpPage.getErrorFieldsList().size();
    }
}

