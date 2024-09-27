This example we have seen countless times but we will be finding the Maclaurin series for $f(x) = \sin(x)$.

| $\frac{df}{dx}$      | $f^n(0)$ |
| -------------------- | -------- |
| $f(x) = \sin(x)$     | 0        |
| $f'(x) = \cos(x)$    | 1        |
| $f''(x) = -\sin(x)$  | 0        |
| $f'''(x) = -\cos(x)$ | -1       |
| $f^{iv} = \sin(x)$   | 0        |
| ...                  | ...      |

Stringing this into the Maclaurin series format, $$
\sin(x) = \sum_{n=0}^\infty \frac{f^n(x_{0})}{n!}(x-x_{0})^n
$$
Subbing in and simplifying we end up with:

$$
= x - \frac{x^{3}}{3!} + \frac{x^5}{5!}-\frac{x^7}{7!}+\dots
$$
---

