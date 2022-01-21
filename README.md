## Readme

Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.


[Reference](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm)


## Table Of Contents
 - [Prerequisites](#prerequisites)
 - [When to use ?](#when-to-use)
 - [Steps](#steps)
 - [Run](#run)
 - [Author](#author)

## Prerequisites

```
git clonehttps://gitlab.com/devalgas/factory-pattern-shape.git
cd factory-pattern-shape
./mvnw verify
```

## When to use

They're also useful when you need several "constructors" with the same parameter type but with different behavior.

Factory classes are useful when you need a complicated process for constructing the object, when the construction need a dependency that you do not want for the actual class, when you need to construct different objects.Factory methods should be considered as an alternative to constructors - mostly when constructors aren't expressive enough, ie.

```
class Shape{
  public Shape(bool withRectangle);
}

is not as expressive as :

class Shape{
  public static Shape withRectangle();
  public static Shape withoutRectangle();
}

```

## Steps

```
1- Create an interface. Example: interface Shape
2- Create concrete classes implementing the same interface. Examples: class Rectangle, Square and Circle .
3- Create a Factory to generate object of concrete class based on given information. Example: class ShapeFactory 
4- Use the Factory to get object of concrete class by passing an information such as type.
```

## Run

```
./mvnw spring-boot:run
```

## Author

**Author Name** &nbsp; : &nbsp; Devalgas Largowich 

**GitHub URI** &nbsp; &nbsp; &nbsp; : &nbsp; [largowich](https://github.com/largowich)
