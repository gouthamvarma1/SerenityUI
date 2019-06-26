Feature: Google Search with multiple keywords 

 Scenario Outline: Browse all user inputs 
	Given Load google homepage
	When Enter user inputs <userinputs>
	Then Click search button
Examples:
|userinputs|
|dell|
|Mac|
|Apple|
|Hp|