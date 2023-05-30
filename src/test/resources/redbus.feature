Feature:  TICKET BOOKING

Background:
Given launch the url  "https://www.redbus.in/bus-tickets"

Scenario:  BUY TICKETS TO ME
  Given  click on the start location 
  When   cick on the end location   
  Then   validate date
  When   click on search
  
  Scenario:  BUY TICKETS TO MY FRIEND
  Given  click on the start_destination with one dim list 
  |tambaram|chennai|bangalore|
  When  cick on the end_destination with one dim list 
   |pune|chennai2|mangalore|
  Then    click on the_submit 
  When   quit the_browser