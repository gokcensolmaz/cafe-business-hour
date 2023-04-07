# Exercise: Practice using conditions
### Technologies used:

_Kotlin's `if-else` and `when` statements_: In this project, I used if-else and when statements to create conditional logic that allows the program to make decisions based on the input provided by the user.

_`java.util.Scanner` class_: I used the Scanner class to get input from the user. The Scanner class provides a convenient way to read input from the console.

_`ClosedRange<Int>` structure_: I used the ClosedRange<Int> structure as the return value for the when statement. This allowed me to define a range of values for the input and execute specific code blocks based on the input range.
  
## Scenario 
The Little Lemon cafeteria opens at various times depending on the day of the week, according to the following table:
| Day |Times  |
|----:|------:|
|Monday| 8 AM to 12 PM (8:00 - 12:00)|
|Tuesday|8 AM to 6 PM (8:00 - 18:00)|
|Wednesday| 8 AM to 6 PM (8:00 - 18:00)|
|Thursday|8 AM to 6 PM (8:00 - 18:00)|
|Friday|8 AM to 9 PM (8:00 - 21:00)|
|Saturday|9 AM to 4 PM (9:00 - 16:00)|
|Sunday|8 AM to 4 PM (8:00 - 16:00)|
  
  The program will output the opening hours of a cafe based on the day of the week entered by the user. The user will also input a time, and the program will indicate whether the cafe is open or closed at that time.

The program will provide the opening hours for each weekday, allowing the user to see the cafe's hours of operation throughout the week. Based on the weekday and the opening hours, the program will output either "Little Lemon is open now" or "Little Lemon is closed now" to indicate whether the cafe is currently open or closed.

Overall, this program provides users with information about the cafe's opening hours and current status, allowing them to plan their visits accordingly.
