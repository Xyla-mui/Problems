# Quadratic questions
the following are thr questions solved by the pythoj files above

## 1. quadractic calculator
Create a function called calc that solves equations of the form:```ax²+bx+c=0```
### Requirements
The function must accept three integer parameters: *a, b, and c.*
The solution must be computed using the quadratic formula.
The values of a, b, and c may be zero, and all valid cases must be handled correctly.
The function must return:
None (undefined) if no real solution exists, or if the equation has infinitely many solutions.
A list of two integers representing the possible solutions when real solutions exist.
If the equation is linear (i.e., a = 0 and b ≠ 0), return the single solution twice as '[x, x]'.
Do not use any external libraries (including math).
### example
```python
calc(1, -3, 2)   → [2, 1]
calc(0, 2, -4)   → [2, 2]
calc(5, 2, 21)   → None
```

# 2. quadratic generator 
Quadratic equations come in the form y(x) = ax^2 + bx + c. Substituting in different values of x gives us different coordinates/points on the graph of the given quadratic function.

## *Task:* 
Your job is to create a function that does the following:

Takes in three required parameters: *a, b, and c*, and two keyword/optional parameters, start and step. If start is not provided, it should be set as default to 0, and if step is not provided, its default value should be 1.
It should return an enumerator/generator which is dynamic and created based on the arguments taken in.
What the enumerator/generator must do:
Essentially, the method you write should return an enumerator/generator which, when called, should start by yielding [start, a(start)^2 + b(start) + c], where a, b, and c, are provided when the method was called. Then start should be incremented by step and continue the sequence.

### *Examples* :
 ```python
 gen = quadratic_gen(1, 0, 0)   # this is the equation of y = x^2
 First 10 values: [[0, 0], [1, 1], [2, 4], [3, 9], [4, 16], [5, 25], [6, 36], [7, 49], [8, 64], [9, 81]]

 gen = quadratic_gen(1, 0, 0, start = 2)   # different start point
 First 10 values: [[2, 4], [3, 9], [4, 16], [5, 25], [6, 36], [7, 49], [8, 64], [9, 81], [10, 100], [11, 121]]

 gen = quadratic_gen(1, 0, 0, step = 2)   # different step value
 First 10 values: [[0, 0], [2, 4], [4, 16], [6, 36], [8, 64], [10, 100], [12, 144], [14, 196], [16, 256], [18, 324]]

 gen = quadratic_gen(1, 0, 0, step = -1)  # tracing backwards
 First 10 values: [[0, 0], [-1, 1], [-2, 4], [-3, 9], [-4, 16], [-5, 25], [-6, 36], [-7, 49], [-8, 64], [-9, 81]]

 gen = quadratic_gen(1, 0, 0, step = 0.5)  # step is a float
 First 10 values: [[0, 0], [0.5, 0.25]
```
