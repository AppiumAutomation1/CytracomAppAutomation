package com.constructapp.stepdefinitions;

import org.testng.asserts.SoftAssert;

import com.constructapp.pageobjects.CrewTimeSheetSummaryPage;
import com.constructapp.pageobjects.WorkerTimeSheetSummaryPage;
import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;

public class CrewTimeSheetSummaryStepDefinitions extends CrewTimeSheetSummaryPage {

	SoftAssert softassert = new SoftAssert();
	DriverUtilities utils = new DriverUtilities();
	Hooks hooks = new Hooks();

	@When("^I click please select a crew$")
    public void i_click_please_select_a_crew() throws Throwable {
        clickPleaseSelectACrew();
    }
	
	@When("^I click on notes$")
    public void i_click_on_notes() throws Throwable {
        clickNotes();
    }
	 @When("^I click on crew foreman not signed status$")
	    public void i_click_on_foreman_not_signed_status() throws Throwable {
	        clickOnCrewForeman();
	    }
	 
	 @When("^I click on crew worker not signed status button \"([^\"]*)\"$")
	    public void i_click_on_not_signed_status_button(String arg1) throws Throwable {
	        clickCrewWorkerNotsignedStatus(arg1);
	    }
	
	@Then("^I should see crew name on the sign hours screen \"([^\"]*)\"$")
	public void i_should_see_worker_name_on_the_sign_hours_screen(String arg1) throws Throwable {

		String expected = arg1;
		System.out.println(arg1);
		String actual = captureCrewNameInSignHours(arg1);
		System.out.println("actual is " + actual);

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			// test.log(Status.FAIL, "Assertion failed");
			softassert.assertEquals(actual, expected, "soft assert failed");

			hooks.addScreenshot();
			softassert.assertAll();
		}
	}
	
	  @Then("^I should see crew timesheet summary screen$")
	    public void i_should_see_worker_timesheet_summary_screen() throws Throwable {
	        String expected = "Select a Crew";
				String actual = capturePleaseSelectCrewText();
		
				if (expected.equals(actual)) {
		
					Reporter.addStepLog("Actual text is " + actual);
					Reporter.addStepLog("Expected text is " + expected);
		
				} else {
					Reporter.addStepLog("Actual text is " + actual);
					Reporter.addStepLog("Expected text is " + expected);
					softassert.assertEquals(actual, expected, "Search results are not matching");
		
					hooks.addScreenshot();
					softassert.assertAll();
				}
		    }
	  @When("^I click on collapse in crew summary$")
	    public void i_click_on_collapse() throws Throwable {
	        collapseFileAttachment();
	    }
	  
	  
	  @Then("^I should see select crew as title of the screen$")
	  public void i_should_see_select_crew_as_title_of_the_screen() throws Throwable {
		  String expected = "Select Crew";
			String actual = captureSelectCrewTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Select crew title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
	  }

	 
	@Then("^I should see the header titles as Crew ID and Crew Description$")
	  public void i_should_see_the_header_titles_as_Crew_ID_and_Crew_Description() throws Throwable {
		  String expected = "Crew ID";
			String actual = captureCrewIdTitle();
			
			String expected1 = "Crew Description";
			String actual1 = captureCrewDescTitle();
	
			if (expected.equals(actual) && expected1.equals(actual1)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				Reporter.addStepLog("Actual text is " + actual1);
				Reporter.addStepLog("Expected text is " + expected1);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				Reporter.addStepLog("Actual text is " + actual1);
				Reporter.addStepLog("Expected text is " + expected1);
				softassert.assertEquals(actual, expected, "Crew Id is not matching");
				softassert.assertEquals(actual1, expected1, "Crew Description is not matching");

				hooks.addScreenshot();
				softassert.assertAll();
			}
	  }

	  
	@Then("^I should see the search crew text$")
	  public void i_should_see_the_search_crew_text() throws Throwable {
		  String expected = "Search Crew";
			String actual = captureSearchCrwText();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Search crew text is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
	  }
	  
	 
	@When("^I click on search bar in crew$")
	    public void i_click_on_search_bar_in_crew() throws Throwable {
	       clickSearchBar();
	    }

	   
	    

		@When("^I click on all crews$")
	    public void i_click_on_all_crews() throws Throwable {
	       clickAllCrews();
	    }

	    
		@Then("^I should see the crew details \"([^\"]*)\" \"([^\"]*)\"$")
	    public void i_should_see_the_crew_details(String arg1, String arg2) throws Throwable {
			String expected = arg1;
			String actual = captureCrewIdName(arg1);
			
			String expected1 = arg2;
			String actual1 = captureCrewDescName(arg2);
			
	
			if (expected.equals(actual) && expected1.equals(actual1)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Crew Id is not matching");
				softassert.assertEquals(actual1, expected1, "Crew Desc is not matching");

	
				hooks.addScreenshot();
				softassert.assertAll();
			}
	    }

	    @Then("^I should see crew worker details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	    public void i_should_see_crew_worker_details( String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    	 String expected = arg1;
				String actual = captureWorker(arg1);
				
				String expected1 = arg2;
				String actual1 = captureWorker(arg2);
				
				 String expected2 = arg3;
					String actual2 = captureWorkerPerssonelNum(arg3);
					
					String expected3 = arg4;
					String actual3 = captureWorkerPerssonelNum(arg4);
					
					 
		
				if (expected.equals(actual) && expected1.equals(actual1) && expected2.equals(actual2)
						&& expected3.equals(actual3)) {
		
					Reporter.addStepLog("Actual text is " + actual);
					Reporter.addStepLog("Expected text is " + expected);
					Reporter.addStepLog("Actual text is " + actual1);
					Reporter.addStepLog("Expected text is " + expected1);
					Reporter.addStepLog("Actual text is " + actual2);
					Reporter.addStepLog("Expected text is " + expected2);
					Reporter.addStepLog("Actual text is " + actual3);
					Reporter.addStepLog("Expected text is " + expected3);
		
				} else {
					Reporter.addStepLog("Actual text is " + actual);
					Reporter.addStepLog("Expected text is " + expected);
					Reporter.addStepLog("Actual text is " + actual1);
					Reporter.addStepLog("Expected text is " + expected1);
					softassert.assertEquals(actual, expected, "Crew Id is not matching");
					softassert.assertEquals(actual1, expected1, "Crew Description is not matching");

					hooks.addScreenshot();
					softassert.assertAll();
				}
	    }

	   
		@Then("^I should see the title as crew members$")
	    public void i_should_see_the_title_as_crew_members() throws Throwable {
	    	String expected = "Crew Members";
			String actual = captureCrewMembersText();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Search crew text is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
	    }

	    

		@Then("^I should see the crew foreman name \"([^\"]*)\"$")
	    public void i_should_see_the_crew_foreman_name(String arg1) throws Throwable {
	    	String expected = arg1;
			String actual = captureCrewForemanName(arg1);
	
			if (actual.contains(expected)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Search crew text is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
	    }

	   
	   

	    

		@And("^I enter the search text in search bar \"([^\"]*)\"$")
	    public void i_enter_the_search_text_in_search_bar(String arg1) throws Throwable {
	     enterSearchText(arg1);  
	    }




	 
		
		@Then("^I should see the details on the crew sign hours screen as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	    public void i_should_see_the_details_on_the_hours_screen(String arg1, String arg2, String arg3) throws Throwable {
	    	String expectedRegularHours = arg1;
			String actualRegularHours = captureRegularHoursInCrew(arg1);
			
			String expectedOverTime1 = arg2;
			String actualTOverTime1 = captureOverTime1HoursInCrew(arg2);
			
			String expectedOverTime2 = arg3;
			String actualTOverTime2 = captureOverTime2HoursInCrew(arg3);
			
			

			if (expectedRegularHours.equals(actualRegularHours) && expectedOverTime1.equals(actualTOverTime1) && expectedOverTime2.equals(actualTOverTime2)) {

				
				Reporter.addStepLog("Actual Regular hours  is " + actualRegularHours);
				Reporter.addStepLog("Expected Regular hours is " + expectedRegularHours);
				Reporter.addStepLog("Actual Overtime hours  is " + actualTOverTime1);
				Reporter.addStepLog("Expected Over time hours is " + expectedOverTime1);
				Reporter.addStepLog("Actual overtime2 hours  is " + actualTOverTime2);
				Reporter.addStepLog("Expected overtime2 hours is " + expectedOverTime2);

			} else {
				
				Reporter.addStepLog("Actual Regular hours  is " + actualRegularHours);
				Reporter.addStepLog("Expected Regular hours is " + expectedRegularHours);
				Reporter.addStepLog("Actual Overtime hours  is " + actualTOverTime1);
				Reporter.addStepLog("Expected Over time hours is " + expectedOverTime1);
				Reporter.addStepLog("Actual overtime2 hours  is " + actualTOverTime2);
				Reporter.addStepLog("Expected overtime2 hours is " + expectedOverTime2);

				softassert.assertEquals(actualRegularHours, expectedRegularHours, "Regular hours is not matching");
				softassert.assertEquals(actualTOverTime1, expectedOverTime1, "Overtime1 hours is not matching");
				softassert.assertEquals(actualTOverTime2, expectedOverTime2, "Overtime2 hours is not matching");

				hooks.addScreenshot();
			}
	    }

	@Then("^I should see the status as not signed for crew foreman and customer signature$")
	    public void i_should_see_the_status_as_not_signed_for_foreman_and_customer_signature() throws Throwable {
	          String expected = "Not Signed";
				String actual = WorkerTimeSheetSummaryPage.captureCustomerSignatureStatus();
				
				  String expected1 = "Not Signed";
				String actual1 = "Not Signed";
				
				 
		
				if (expected.equals(actual) && expected1.equals(actual1)) {
		
					Reporter.addStepLog("Actual text is " + actual);
					Reporter.addStepLog("Expected text is " + expected);
					
					Reporter.addStepLog("Actual text is " + actual1);
					Reporter.addStepLog("Expected text is " + expected1);
					
					
		
				} else {
						Reporter.addStepLog("Actual text is " + actual);
					Reporter.addStepLog("Expected text is " + expected);
					
					Reporter.addStepLog("Actual text is " + actual1);
					Reporter.addStepLog("Expected text is " + expected1);
					
					softassert.assertEquals(actual, expected, "Worker sign  status is not matching");
						softassert.assertEquals(actual1, expected1, "customer sign status is not matching");
					
					hooks.addScreenshot();
					softassert.assertAll();
				}
	    }
		
	  
	  @Then("^I should see crew customer signature and foreman tabs$")
	    public void i_should_see_crew_customer_signature_and_foreman_tab() throws Throwable {
	         String expected = "Crew Members";
				String actual = captureCrewMemberTab();
				
				  String expected1 = "Crew Foreman";
				String actual1 = captureForemanStatus();
				
				  String expected2 = "Customer Signature";
				String actual2 = WorkerTimeSheetSummaryPage.captureCustomerStatus();
		
				if (expected.equals(actual) && expected1.equals(actual1)&& expected2.equals(actual2)) {
		
					Reporter.addStepLog("Actual text is " + actual);
					Reporter.addStepLog("Expected text is " + expected);
					
					Reporter.addStepLog("Actual text is " + actual1);
					Reporter.addStepLog("Expected text is " + expected1);
					
					Reporter.addStepLog("Actual text is " + actual2);
					Reporter.addStepLog("Expected text is " + expected2);
		
				} else {
						Reporter.addStepLog("Actual text is " + actual);
					Reporter.addStepLog("Expected text is " + expected);
					
					Reporter.addStepLog("Actual text is " + actual1);
					Reporter.addStepLog("Expected text is " + expected1);
					
					Reporter.addStepLog("Actual text is " + actual2);
					Reporter.addStepLog("Expected text is " + expected2);
					softassert.assertEquals(actual, expected, "tab  title is not matching");
						softassert.assertEquals(actual1, expected1, "tab title is not matching");
					softassert.assertEquals(actual2, expected2, "tab title is not matching");

					hooks.addScreenshot();
					softassert.assertAll();
				}
	    }
   

	@Then("^I should see the selected project on the Crewtimesheet screen \"([^\"]*)\"$")
    public void i_should_see_the_selected_project_on_the_crewtimesheet_screen(String arg1) throws Throwable {
        String expected = arg1;
		String actual = captureSelectedProject();
		System.out.println("actual is " + actual);

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Selected Project is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }
	
	
	@Then("^I should be able to add the notes \"([^\"]*)\"$")
    public void i_should_be_able_to_add_the_notes(String arg1) throws Throwable {
        
        enterNotes(arg1);
		
		
    }

    @Then("^I should see the Crew signature status as pending$")
    public void i_should_see_the_crew_signature_status_as_pending() throws Throwable {
        String expected = "Pending";
		String actual = WorkerTimeSheetSummaryPage.captureWorkerSignatureStatus();
		System.out.println("actual is " + actual);

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Crew signature status is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }

    @Then("^I click select button$")
    public void i_click_select_button() throws Throwable {
        clickSelectButton();
    }

    @Then("^I should see Crew id on the screen \"([^\"]*)\"$")
    public void i_should_see_crew_id_on_the_screen( String arg1) throws Throwable {
        String expected = arg1;
		String actual = captureCrewId(arg1);
		System.out.println("actual is " + actual);

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Crew id is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }

    @Then("^I should see Crew description \"([^\"]*)\"$")
    public void i_should_see_crew_description( String arg1) throws Throwable {
        String expected = arg1;
		String actual = captureCrewDesc(arg1);
		System.out.println("actual is " + actual);

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Crew description is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }
    
   
    @Then("^I should see Crew description in add hours \"([^\"]*)\"$")
    public void i_should_see_crew_description_in_add_hours(String arg1) throws Throwable {
        String expected = arg1;
		String actual = captureCrewDescInHours(arg1);
		System.out.println("actual is " + actual);

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Crew description is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }

    @And("^I click on Crew timesheet button on home screen$")
    public void i_click_on_crew_timesheet_button_on_home_screen() throws Throwable {
        clickCrewTimeSheet();
		}
    
    @And("^I click on Template timesheet button on home screen$")
    public void i_click_on_template_timesheet_button_on_home_screen() throws Throwable {
        clickTemplateTimeSheet();
		}

   

   

	@And("^I select all crew$")
    public void i_select_all_crew() throws Throwable {
        clickSelectAllCrew();
    }

    @And("^I select a crew \"([^\"]*)\"$")
    public void i_select_a_crew( String arg1) throws Throwable {
        selectACrew(arg1);
    }


}
