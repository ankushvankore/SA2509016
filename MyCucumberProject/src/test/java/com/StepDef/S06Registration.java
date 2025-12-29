package com.StepDef;

import java.util.List;

import io.cucumber.java.en.*;

public class S06Registration {
	@Given("Launch the application in browser")
	public void launch_the_application_in_browser() {
	}

	@When("Enter folliwing data")
	public void enter_folliwing_data(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println(dataTable);
	    
	    List<List<String>>data = dataTable.asLists();
	    
	    System.out.println(data);
	    
	    System.out.println(data.get(0).get(0));
	    
	    System.out.println(data.get(1).get(3));
	}

	@Then("Registration successful")
	public void registration_successful() {
	}
}
