# Style Guide for coding in Java 2023
**_for 420-110-DW Programming 1 [Dawson College](https://www.dawsoncollege.qc.ca)_** 

**_Even if your program works, you won’t get full marks unless you follow these guidelines!_**

## Comments
Comments are ignored by the Java compiler.  They are not statements where the compiler needs to do something, so they don’t need semi-colons.
They are for being kind to your future self or any team mate who may read your code.  (Pay it forward 	:heart_eyes:)

Java has 3 types of comments:

`// all text on the line following the 2 slashes is a comment`

```
/* 
* start of a comment block
* can be multi line or single line
* requires the next line to end it
*/
```

```
/** 
* javadocs comment used for generated documentation 
* usually multi line
*/`
```

* A good comment will explain clearly what a complicated piece of code will do.
* A bad comment will either mislead the user or provide unnecessary information (i.e. over commenting)
* Every block of code (class, method, grouping of a few lines...) should have comments
* At this point more is better than fewer comments

**TL;DR** Code should have meaningful comments that explain what it is that you’re trying to accomplish
## Naming identifiers
Identifiers must follow certain rules (syntax), an identifier may only contain:

* letters `a–z` or `A–Z` 
* the digits `0–9`, but not for the first character
* underscores `_`
* dollar sign `$`  DO NOT USE these are for special methods

* Identifiers are case sensitive  `itemsOrdered` is not the same as `itemsordered`.
* Identifiers cannot include spaces.
* Identifiers cannot be Java reserved words [from oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)

 ```
 abstract	continue	for	new	switch assert default	goto	package	synchronized 
 boolean	do	if	private	this  break	double	implements	protected	throw
 byte	else	import	public	throws case	enum	instanceof	return	transient
 catch	extends	int	short	try char	final	interface	static	void
 class	finally	long	strictfp	volatile const	float	native	super	while
 ```
Java is case sensitive but do NOT use ex `Public`, `Class` etc, this is confusing so a bad practice.

### Naming specific identifiers, conventions
* class – nouns starting with an uppercase letter, descriptive of their purpose
  *  `AverageGrade`, `Employee`, `Triangle`, `SmallestNumber`
* methods – verbs starting with lowercase letter, descriptive of their functionality
  * `getName()`, `calculateHourlyPay()`
  * exception – `main()`
* variables – start with lowercase, descriptive of their expected content
  * `employeeName`, `payRate`, `hoursWorked`
* constants – all upper case, separate words with an underscore
  * `MAX_CHICKENS`, `Math.PI`
* class, methods, variables use a convention called [CamelCase](https://en.wikipedia.org/wiki/Camel_case)  

## Structure
Every time you open a `{` you should increase the indentation of all subsequent lines. Every time you close a `}` you should decrease the indentation of all subsequent lines.
```
public class Greetings {
    public static void main(String args[]) {  
          String msg = "Hello!";
          final int MAX = 5;
          int count  = 0;
          while (count < 5) {
                System.out.println(msg);
          }
    }
}
```
[maybe ref?](https://google.github.io/styleguide/javaguide.html)
