
# Question 1 - 8 marks

![[Pasted image 20241202101014.png]]

-- Finding the expansion around the origin.

-- We can easily find the first and second terms since we're basically given them but the problem is the 3rd and 4th, so we will derive them.

The Maclaurin expansion is: $$
\sum_{n = 0} ^{ \infty} \frac{y^{n(0)}}{n!}x^{n} = y(0)x^{0} + y'(0)x + \frac{y''(0)}{2}x^{2} + \frac{y'''(0)}{3!}x^{3} + \frac{y^{iv}(0)}{4!}x^{4}
$$
We are told that $y'' = e^{2x} + \sin y$, so $y''(0) = 1$.

We can find $y'''$ by deriving.

$$
y''' = 2e^{2x} +\cos (y) y'
$$
This at $y'''(0)$ is $3$.

Deriving this again:

$$
y^{iv} = 4e^{2x} + (\cos (y)y'' -\sin (y)y'^{2})
$$

-- using the product rule.

This at $y^{iv}(0)$ is $5$.

| $y(0)$      | $0$ |
| ----------- | --- |
| $y'(0)$     | 1   |
| $y''(0)$    | $1$ |
| $y'''(0)$   | 3   |
| $y^{iv}(0)$ | 5   |
Now putting this into the Maclaurin series:

$$
0x^{0} + 1x + \frac{1}{2}x^{2} + \frac{3}{6}x^{3} + \frac{5}{24}x^{4} +\dots
$$
-- that is worth 8 marks holy fucking shit. FREE

---

# Question 2 - 15 marks

### Part a - 3 marks

![[Pasted image 20241202102715.png]]

Notice that this is not in normal form because the coefficient of $y''$ is not 1. Normalizing this: 
$$
y'' - \frac{x}{(x^{2}-1)}y' + \frac{1}{(x^{2}-1)}y = 0
$$

Naming these coefficients $p(x)$ and $q(x)$ respective to $y'$ and $y$.

Notice that we will only have problems when $x=\pm 1$, Hence they are analytic at all other points. All of these points are ordinary points.

Regular points are at $x=x_{0}$. They are singular if $(x-x_{0})p(x)$ AND $(x-x_{0})^{2}q(x)$ are analytic. Else they are irregular single points.

Singular point $x_{0}=1$. Take; $$
(x-1) \frac{x}{(x-1)(x+1)} = \frac{x}{x+1}
$$

$$
(x-1)^{2} \frac{x}{(x-1)(x+1)} = \frac{x+1}{x+1}
$$
These is analytic at $x=1$, so it is a regular singular point.. Now consider $x=-1$

$$
(x+1) \frac{x}{(x-1)(x+1)} = \frac{x}{x-1}
$$
$$
(x+1)^{2} \frac{x}{(x-1)(x+1)} = \frac{x+1}{x-1}
$$

Which is also analytic at $x = -1$, so it is also a regular single point.

---

### Part b - 9 marks

![[Pasted image 20241202103829.png]]

-- When we expand around an ordinary point, we use the method of undetermined coefficients, and otherwise we use the method of Frobenius.

Assume the solution is in the form:
$$
y(x) = \sum_{r = 0}^{\infty} a_{r}x^{r}
$$
Then 
$$
y'(x) = \sum_{r = 1} ^{ \infty}a_{r}rx^{r- 1}
$$
-- Writing $r = 0$ is fine, but the first term would disappear anyway.

$$
y''(x) = \sum_{r = 2}^{\infty}a_{r}r(r-1)x^{r-2}
$$
Subbing this back into the og expression: 
$$
(x^{2}-1)\sum_{r = 2} ^{ \infty} a_{r}r(r-1)x^{r-2} - x\sum_{r = 0}^{\infty} a_{r}rx^{r - 1} + \sum_{r = 0}^{\infty} a_{r}x^{r} = 0
$$
Expanding:
$$
\sum_{r = 2}^{\infty} a_{r}r(r-1)x^{r} - \sum_{r = 0}^{\infty} a_{r}r(r-1)x^{r - 2}+ \sum_{r = 0}^{\infty} a_{r}x^{r} = 0
$$