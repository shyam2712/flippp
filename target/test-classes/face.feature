Feature:  TICKET BOOKING

Background:
Given launch url 

Scenario:  create a account
  Given   click the create account button 
  When    select first name 
  And     select lastname
  And     give the valuable input 
  And     select the dropdown  
  When   click on signup_button
  
  #Scenario Outline: Facebook login
   #Given   click the create account button 
  #When    select first name    "<namess>"
  #And     select lastname       "<flamess>"
  #And     give the valuable input "<dropss>"
  #And     select the dropdown  
  #When   click on signup_button
  #
 #Examples:
 #|namess|flamess|dropss|
 #|shyam|ryan|7844498575|
 #|naveen|syan|7844498555|