# Question

Write a Java program that defines a class to represent complex numbers and performs the addition of two complex numbers using arrays.

A complex number is expressed in the form:

a + bi, where:

a is the real part

b is the imaginary part


Each complex number will be represented using an array:

index 0 → real part

index 1 → imaginary part



---

## Requirements


1. Method Specification

You must implement the following method:

int[] add(int[] c1, int[] c2)

Takes two integer arrays as input

Each array represents a complex number:

- c[0] = real part

- c[1] = imaginary part


Returns a new array representing the sum:

[realSum, imaginarySum]




## Expected Input (Test Cases Format)

Complex numbers will be defined like this:

- c1 = {3, 2}
- c2 = {1, 4}

Each test case will pass two arrays into the add() method.


---

## Expected Output Format

For each test case:

- [x] Test 1: PASS
- [x] Test 2: FAIL
- [x] Expected: 4 + 6i
- [x] Got: 3 + 5i


