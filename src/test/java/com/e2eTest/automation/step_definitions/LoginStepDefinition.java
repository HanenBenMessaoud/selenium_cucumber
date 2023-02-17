package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public LoginPage loginPage;
	public LoginStepDefinition() {
		loginPage = new LoginPage();
	}

	@Given("Je me connecte sur l application nopcommerce")
	public void jeMeConnecteSurLApplicationNopcommerce() {
		loginPage.goToURL();
	}

	@When("Je remplis l email {string}")
	public void jeRemplisLeEmail(String email) {
		loginPage.fillEmail(email);
	}

	@And("Je remplis le pass word {string}")
	public void jeRemplisLePassWord(String password) {
		loginPage.fillPassword(password);
	}

	@And("Je clique sur le buton LOGIN")
	public void jeCliqueSurLeButonLOGIN() {
		loginPage.clickOnBtnLogin();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String string) {
	}

}
