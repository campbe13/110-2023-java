# Style Guide for coding in Java 2023
**_for 420-110-DW Programming 1_** 

**_Even if your program works, you won’t get full marks unless you follow these guidelines!_**

[maybe ref?](https://google.github.io/styleguide/javaguide.html)
## Comments
Comments are ignored by the Java compiler.  They are not statements where the compiler needs to do something, so they don’t need semi-colons.
They are for talking to your future self or any team mate who may read your code. 

Java has 3 types of comments:

`// all text on the line following the 2 slashes is a comment`

```
/* start of a comment block
* can be multi line or single line
* up to end of a comment
*/
```

`/** javadocs comment used forgenerated documentation **/`

* A good comment will explain clearly what a complicated piece of code will do.
* A bad comment will either mislead the user or provide unnecessary information (i.e. over commenting)
* Every block of code (class, method, grouping of a few lines...) should have comments
* at this point more is better than fewer

TL;DR Code should have meaningful comments that explain what it is that you’re trying to accomplish
## Naming identifiers
Identifiers must follow certain rules (syntax), an identifier may only contain:
* letters a–z or A–Z, 
* the digits 0–9, but not the first character
* underscores (_), or  the dollar sign ($)  DO NOT USE these are for special methods

* Identifiers are case sensitive.  `itemsOrdered` is not the same as `itemsordered`.
* Identifiers cannot include spaces.

### Naming specific identifiers, conventions
* class – nouns starting with an uppercase letter, descriptive of their purpose
  *  `AverageGrade`, `Employee`, `Ball`, `SmallestNumber`
* methods – verbs starting with lowercase letter, descriptive of their functionality
  * `getName()`, `computeOverTime()`
  * exception – main()
* variables – start with lowercase, descriptive of their expected content
  * `employeeName`, `payRate`, `hoursWorked`
* constants – all upper case, separate words with an underscore
  * `MAX_CHICKENS`, `Math.PI`

## Structure
Every time you open a { you should increase the indentation of all subsequent lines. Every time you close a } you should decrease the indentation of all subsequent lines.


