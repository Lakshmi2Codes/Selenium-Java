Feature: Login to Leaftaps CRM

  Scenario: Successful login to CRM/SFA page
    Given :launch the browser
    When :load the URL "http://leaftaps.com/opentaps/control/main"
    And :Enter username "DemoSalesManager"
    And :Enter password "Crmsfa"
    And :Click on the login button
    Then : Should land on the CRM/SFA page successfully