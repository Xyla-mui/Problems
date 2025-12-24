def quadratic_gen(a, b, c, *, start=0, step=1):
    x = start
    while True:
        y = a * x**2 + b * x + c
        yield [x, y]
        x += step


gen = quadratic_gen(1, 0, 0)

# First 10 values
result = [next(gen) for _ in range(10)]
print(result)
