
# Question 1

![[Pasted image 20241202101014.png]]

-- Finding the expansion around the origin.

-- We can easily find the first and second terms since we're basically given them but the problem is the 3rd and 4th, so we will derive them.

The Maclaurin expansion is: $$
\sum_{n = 0} ^{ \infty} \frac{y^{n(0)}}{n!}x^{n} = y(0)x^{0} + y'(0)x + \frac{y''(0)}{2}x^{2} + \frac{y'''(0)}{3!}x^{3} + \frac{y^{iv}(0)}{4!}x^{4}
$$
We are told that $y'' = e^{2x} + \sin y$, so $y''(0) = 1$.

We can find $y'''$ by deriving.

$$
y''' = 2e^{2x} +\cos y y'
$$

| $y(0)$   | $0$ |
| -------- | --- |
| $y'(0)$  | 1   |
| $y''(0)$ | $1$ |
