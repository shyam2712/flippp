	Feature: GET TEXT 

Scenario: Buy ticket
  Given launch a browser 
  When  close the login button
  And user enter value and search
  Then validate the search result
  When  quit the browser 
  
  