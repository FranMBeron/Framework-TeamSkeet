@Mymilf
Feature: The Mymilf Navigation and Search funcionality 

    Background: As a customer I am on the Mymilf web without loggin in.
        Given the user navigates to www.mylf.com

    Scenario: I can confirm my age when the web open     
        When click confirms the age

    Scenario Outline: As a customer I can access the subpages through the navigation bar
        When I go to <section> using the navigation bar
        Examples:
            | section            |
            | Videos             | 
            | Series             |
            | Premium            | 
            | Models             |
            | Mylf of the Month  | 
            | Categories         |

    Scenario: As a Customer when I search for videos about blodes I Select the first Video and I want can to use the actresses link name below the video
        When I search for blondes
        Then select the first video
        Then Check the firts actresses link name is ready to interact and the text is correct
        Then Check the second actresses link name is ready to interact and the text is correct  
        Then Check the third actresses link name is ready to interact and the text is correct 
        Then Check the fourth actresses link name is ready to interact and the text is correct
        




     

