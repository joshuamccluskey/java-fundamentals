# java-fundamentals

## Java Fundamentals

### Linter

### Contributor: Joshua McCluskey

### Overview

- Create a linter
- Read Javascript file
- Print the identified line that is missing a semicolon
  - Don’t show an error if the line is empty.
  - Don’t show an error if the line ends with an opening curly brace "{"
  - Don’t show an error if the line ends with a closing curly brace "}"
  - Don’t show an error if the line contains if or else
- Calls method in main method on the file gates.js, and print out the resulting error message.
- Can work on any JS file

Input: String filePath

Output: ex. Line 1: Missing semicolon.

### Testing


- Test the linter on a file that contains no errors.
- Test the linter on a file that contains one error.
- Test the linter on a file that contains few errors.
- Test the linter on a file that contains many errors.
- Test the linter on an empty file

#### Stretch Goals
- Implement another simple lint rule to the linter. (For example, make sure that the file uses only single quotes, not double quotes.)
- Allow the user to specify the file to lint from the command line when they run the application. (Gradle allows passing command line args through to the app with a flag.)

#### Methods:

linter(): Reports any syntactical errors of missing semicolons and its respective line number

#### Work Time: 1 Hour