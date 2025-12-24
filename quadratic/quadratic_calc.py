def calc(a: int, b: int, c: int):
    # Case 1: Not a quadratic
    if a == 0:
        if b == 0:
            return None  # no or infinite solutions
        x = -c // b
        return [x, x]

    # Discriminant
    D = b * b - 4 * a * c

    if D < 0:
        return None

    sqrtD = int(D ** 0.5)

    x1 = (-b + sqrtD) // (2 * a)
    x2 = (-b - sqrtD) // (2 * a)

    return [x1, x2]


# test
print(calc(5, 2, -21))
# invalid tes
print(calc(5, 2, 21))
