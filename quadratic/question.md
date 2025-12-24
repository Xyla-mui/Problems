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
