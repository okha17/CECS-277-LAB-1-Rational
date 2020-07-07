# CECS-277-LAB-1-Rational
CECS 277
LAB ASSIGNMENT 1
Assigned date: Monday 8/26
Due date: Wednesday 9/4
30 points

Objectives

    Be Familar with classes and objects
    Be able to design a class for a given problem
    Design a functional and efficient methods
    Choose appropriate data representations

Prelab

    Read chapter 8 - Classes and objects
    Read the javadoc note posted on the class website

Problem
 
Create a class called Rational for performing arithmetic operations with Rationals. The class Rational must have the following data members, contructors and methods:

    Data members:
    private
    int numerator
    int denominator
    Constructors
    Default-argument constructor
    Two-argument constructor to initialize numerator and denominator
    Accessors (Getters)
    public int getNumerator() - return the numerator
    public int getDenominator() - return the denominator
    Modifiers (Setters)
    public void setNumerator(int value) - set the numerator to value
    public void setDenominator(int value) - set the denominator to value
    public inputRational()
    Input the numerator and the denominator from the keyboard
    public String toString()
    return a string  in the form numerator/denominator
    private int gcd(int  m, int n) - return the greatest common divisor
    int r;
    while(n != 0)
    { r = m % n;
      m = n;
     n = r;
    }
    return m;
    Add two Rational numbers
    pubic void add(Rational, r1, Rational r2)
    Subtract two Rational numbers
    public Rational  sub(Rational r)
    Multiply two Rational numbers
    public void mul(Rational r1,Rational r2)
    Divide two Rational Numbers
    public Rational div(Rational R)
    Return the real value or Rational r1 divided by Rational r2
    public static double divToDouble(Rational r1,Rational r2)

Write a main method to test the class Rational. All the Rational objects should must be reduced by using the greatest common denominator.

    Input Rational object  R1
    Input Rational object R2
    Add the Rational objects R1 and R2 and store the result in the Rational object R3. Display the result in the following Rormat:
    numerator/demoninator + numberator/denominator =  numerator/denominator.
    Subtract the Rational object R2 Rrom the Rational object R1 and store the result in the Rational object R3. Display the result in the following format:
    numerator/demoninator - numberator/denominator =  numberator/denominator.
    Multiply the Rational object R1 with the Rational object R2 and store the result in the object R3. Display the result in the following format:
    numerator/demoninator * numberator/denominator =  numberator/denominator.
    Divide the Rational object R1by the Rational object R2 and store the result in the object R3. Display the result in the following format:
    numerator/demoninator / numberator/denominator =  numerator/denominator.
    Display the result or dividing the object R1 by the object R2 in a real number.
    Change the numerator or object R1 to 2
    Change the denominator or object R2 to 5
    Display the numerator or R1 and the denominator or R2 in the following format:
    Numerator: ______
    Denominator: ___
