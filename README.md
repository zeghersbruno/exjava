# exjava
java reskilling exercises
Java Programming - Exercises
General setup
Create a Git repository called exjava in your GitHub account. Clone it in to your local repository
(under the javareskilling/gitprojects directory).
Make a subdirectory per exercise. Give it the name of the exercise (e.g. exA1).
Compile and run your exercises (with javac + java commands) in GitBash. Push each solution to Git, but make sure that
the .class files are ignored.
Most exercises built up onto each other, there are 2 “series”. One is depicted with *, the other with **. In case the exercise
it totally unrelated, it is depicted with ***.
A) Using variables
1. * We want to mimic the info linked with courses at ABIS. Each course has a title, a number of days, a price per day
and a field indicating whether prior knowledge is required to follow the course.
Choose correct names and data types for these variables. Fill them in with some values, and use a
System.out.println to check whether everything was filled in ok.
2. * Each course also has a number of instructors. Use an ArrayList to represent them. Use a print to say how many
instructors there are for a specific course.
3. * Calculate the total price of the course, including a VAT of 21%.
4. * Pass the title, number of days and price per day via the command line instead of hardcoding them.
5. * Change the previous exercise and use Scanner to ask for the data interactively.
6. *** Create a HashMap which contains the months of the year as key, and the number of days of that month as value.
Ask the user to enter the day and the month in two subsequent promptings, and read the information into
variables. Print out how many days there are still to go in the specified month.
B) Conditional programming, iterations and loops
1. * If a course takes more than 3 days and you need prior knowledge to follow it, you don’t have to pay the VAT.
2. * We want to label the courses based on the total price:
< 500 : “CHEAP”
between 500 and 1500 : “OK”
> 1500 : “ EXPENSIVE”
3. *** Create an array of integers. Calculate the average of those numbers.
4. *** Create an application that:
• Reads a language code that the user has typed in
• Displays a welcome message in the given language
• If the language code is not recognized, display a message with multiple greetings
Examples of input and expected result:
“NL” : Goeiedag!
“FR” : Bonjour!
“EN” : Good day!
Other : Goeiedag, bonjour and good day!
5. *** Create an application that:
• greets the user with “Welcome!”
• asks the user: would you like to be greeted again? (Y/N)
• reads the answer and if
- Y: welcomes the user again and repeats the question
- N: ends the application

C) Methods and Exception Handling
1. * Create a method printInfo() which prints the info for a specific course. Call this from your main method.
2. * Create a method for the total price calculation, taking into account exercise B1. Make sure that now the total price
is printed in the printInfo() method.
3. *** Change exercise B3, such that the you create a method “calculateAverage” in a utility class “DoMath”. Call this
from the main method.
4. *** Replace the while loop in exercise B5 with a recursive method.
5. * Use exception handling such that a user cannot enter values in a wrong data type.
D) Reading / writing files
1. * Read in the names of the instructors from a file “instructors.txt”. Make sure to do the correct exception handling.
2. * Write the result of the printInfo() method to a file called “courseinfo.txt”.
E) Mixing it all together
1. ** An instructor is a person working for ABIS. Next to a first name, (s)he should also have a last name and age.
Pass those values via the console.
We want to create a method “printSalaryHistory()” that should take in the instructor’s current age, but also the age
at which (s)he started at ABIS + his/her starting salary.
The method will augment the salary with 3% every five years. After 35 years of seniority, the augmentation should
stop. Think of which exceptions you should handle. The result should be put in a file called “salaryhistory.txt”.
Example of the print (passing 65 as current age):
Salary of Sandy at 23 is 2000.0
Salary of Sandy at 28 is 2060.0
Salary of Sandy at 33 is 2121.8
Salary of Sandy at 38 is 2185.454
Salary of Sandy at 43 is 2251.01762
Salary of Sandy at 48 is 2318.5481486000003
Salary of Sandy at 53 is 2388.1045930580003
Salary of Sandy at 58 is 2459.7477308497405
Maximum salary reached
2. *** EXTRA ***
Create an application that handles palindromes. A palindrome is a word, phrase, number, or other sequence of
characters which reads the same backward or forward. For example: “radar”, “racecar”, “wow”, “tacocat”.
• Create a utility class Palindrome, with a method “boolean isPalindrome(String word)” that checks whether a
passed word is a palindrome or not
• Add a method “ int countNumberOfPalindromes(String[] palindromes)” that counts how many of the words
passed in an array, are really palindromes.

F) OO
1. * Create a class Course which consists of all the functionality used before (variables and methods).
Make sure you have:
• variables with correct visibility
• (a) constructor (s)
• accessor and mutator methods (getters and setters) for each variable
• add/remove method for the instructors

• all methods used above. Which parameters can you now use from the object instead of passing them as argu-
ments?

Create some course objects in the main method (don’t use Scanner anymore), and call the test the methods. Make
sure that exception (try-catch) is handled in the main method.
2. ** Create an Instructor class (same remarks as in previous exercise)
3. Create a UML diagram depicting the 2 classes. How would you link them together?
4. * +** Translate the link between the two classes in your code. You can drop the part where you read the names of
the instructors from a file. Add the names of the instructor(s) to the printInfo() method.
G) EXTRA
1. Create an overloaded version of the printSalaryHistory() method which also takes in the output file as a parameter.
2. Add a “toString” method to the Instructor class which prints an instructor’s data. Also use this in the printInfo()
method.

3. Create a custom AgeCannotBeNegativeException class such that you can handle instructors passing through a neg-
ative age.

4. Replace the age of the instructor by his birthday (use the LocalDate class)
5. Add “implements Comparable<Instructor>” to your Instructor class. Implement the compareTo() method such that
you can sort a list of instructors based on their first name. Apply this in the printInfo() method.
