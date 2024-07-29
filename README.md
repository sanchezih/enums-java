# Enum Types

![GitHub last commit](https://img.shields.io/github/last-commit/sanchezih/enums-java)
![GitHub repo size](https://img.shields.io/github/repo-size/sanchezih/enums-java)

An  _enum type_  is a special data type that enables for a variable to be a set of predefined constants. The variable must be equal to one of the values that have been predefined for it. Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week.

Because they are constants, the names of an enum type's fields are in uppercase letters.

In the Java programming language, you define an enum type by using the  `enum`  keyword. For example, you would specify a days-of-the-week enum type as:

```java
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
}
```

You should use enum types any time you need to represent a fixed set of constants. That includes natural enum types such as the planets in our solar system and data sets where you know all possible values at compile time—for example, the choices on a menu, command line flags, and so on.

Java programming language enum types are much more powerful than their counterparts in other languages. The  `enum`  declaration defines a  _class_  (called an  _enum type_). The enum class body can include methods and other fields. The compiler automatically adds some special methods when it creates an enum. For example, they have a static  `values`  method that returns an array containing all of the values of the enum in the order they are declared. This method is commonly used in combination with the for-each construct to iterate over the values of an enum type. For example, this code from the  `Planet`  class example below iterates over all the planets in the solar system.

```java
for (Planet p : Planet.values()) {
    System.out.printf("Your weight on %s is %f%n",
                      p, p.surfaceWeight(mass));
}
```

In the following example, `Planet` is an enum type that represents the planets in the solar system. They are defined with constant mass and radius properties.

Each enum constant is declared with values for the mass and radius parameters. These values are passed to the constructor when the constant is created. Java requires that the constants be defined first, prior to any fields or methods. Also, when there are fields and methods, the list of enum constants must end with a semicolon.

**Note:** The constructor for an enum type must be package-private or private access. It automatically creates the constants that are defined at the beginning of the enum body. You cannot invoke an enum constructor yourself.

In addition to its properties and constructor, `Planet` has methods that allow you to retrieve the surface gravity and weight of an object on each planet.

Basado en: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html