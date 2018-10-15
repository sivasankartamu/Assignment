#Author: your.email@your.domain.com
#Keywords Summary :

@tag
Feature: The user regiter the demoqa web application
  I want to use this template for my feature file

 
  Scenario Outline: The user register with demosite
    Given The user go to demo web register page 
    When The user fill the user detail"<firstname>""<lasstname>""<address>""<email>""<mobile>""<gender>""<hobbies>""<language>""<skills>""<country>""<selecountry>""<year>""<month>""<date>""<password>"and"<spassword>"
    Then The user validate the details

    Examples: 
      | firstname  | lasstname   | address              | email           | mobile     | gender  | hobbies  | language | skills  | country  | selecountry | year  | month  | date  | password | spassword  |
      | sivasankar | Thamotharan | 61,north car street  | siva@gmail.com  | 9788316155 | male    | Cricket  | English  | Java    | India    | India       | 1995  | 11     | 02    | Siva@123 | Siva@123  |
      
