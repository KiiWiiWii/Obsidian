
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
\sum_{r = 2}^{\infty} a_{r}r(r-1)x^{r} - \sum_{r = 2}^{\infty} a_{r}r(r-1)x^{r - 2} + \sum_{r = 1}^{\infty} a_{r}rx^{r}+ \sum_{r = 0}^{\infty} a_{r}x^{r} = 0
$$

Changing variable to $r = p+2$

$$
\sum_{r = 2}^{\infty} a_{r}r(r-1)x^{r - 2} = \sum_{p = 0}^{\infty} a_{p+2}(p+2)(p+1)x^{p}
$$

Let $r = 0 = p$ and equating coefficients.

$$
-a_{2}(2)(1) + a_{0} = 0
$$
$$
a_{2} = \frac{1}{2}a_{0}
$$

Now let $r = 1 = p$

$$
-a_{3} ( 3) (2) - a_{1} + a_{1} = 0
$$
$$
a_{3} = 0
$$
Setting $p = r = n$ $\geq 2$.
$$
a_{n} n(n-1) - a_{n} + 2 (n+2)(n+1) - a_{n}n + a_{n} = 0
$$

$$
(n+2)(n+1)a_{n+2} = (n(n-1) - n + 1)a_{n}
$$
$$
a_{n+2} = \frac{n(n-1)-(n-1)}{(n+2)(n+1)}
$$
$$
= \frac{(n-1)^{2}}{(n+2)(n+1)}a_{n}
$$

-- man i really need to look over this.


Hence the solution can be written as the sum of two series 
$$
y(x) = Ay_{1}(x) + By_{0}(x)
$$
Where $y_{1}(x) = x$ as odd terms terminate after linear term.

$$
y_{0}(x) = \sum_{n = 0} ^{ \infty}a_{2n}x^{2n}
$$
---

### Part c - 3 marks

![[Pasted image 20241202110151.png]]

The recurrence relationship 
$$
a_{n+2} = \frac{(n-1)^{2}}{(n+2)(n+1)}a_{n}
$$
$$
a_{2} = \frac{1}{2} a_{0}
$$
$$
a_{4} = \frac{1}{(4)(3)} \ \ \ \ a_{2}=\frac{1}{(4)(3)(2)}a_{0}
$$
$$
a_{6}= \frac{3^{2}}{(6)(5)}a_{4} = \frac{3^{2}}{(6)(5)(4)(3)(2)(1)}
 $$
$$
a_{8} = \frac{5^{2}}{(8)(7)}a_{6} =\frac{5^{2}3^{2}}{(8)(7)(6)(5)(4)(3)(2)(1)}
$$
So we can say that 
$$
a_{n} = \frac{[(n-3)(n-5)\dots (5)(3)(1)]^{2}}{n!}a_{0}
$$
So then 
$$
a_{2n} = \frac{[(2n-3)(2n-5)\dots (5)(3)(1)]^{2}}{2n!}a_{0}
$$

$$
= \frac{((2n - 2)(2n - 3)( 2n - 4) ( 2n - 5)\dots (5)(4) (3)(2)(1))^{2}}{(2n)!((2n-2)(2n-4)\dots (4)(2))^{2}}a_{0}
$$

$$
= \frac{((2n-2)!)^{2}}{(2n)!2(n-1)2(n-2)(2(n-3)\dots_{2}(2)2(1))^{2}}a_{0}
$$
$$
=\frac{((2n-2)!)^{2}}{(2n)!4^{n-1}((n-1)!)^{2}}a_{0}
$$
-- Literally how the fuck are you meant to get this and also for only 3 marks kms

# Question 3 - 7 marks

### Part a - 2 marks

![[Pasted image 20241202112635.png]]

-- This is literally expanding it out then cancelling the terms ok

$$
4e^{4x}y' + 3^{4x}y'' + 4e^{4x}y + 4\lambda e^{4x}y = 0
$$
$$
4y' + 3y'' + 4y + 4\lambda y = 0
$$
$$
y'' + 4y' + 4(1+\lambda)y = 0
$$
-- -w-
### Part b - 5 marks

![[Pasted image 20241202113004.png]]

Solving this as normal, solve the auxiliary equation:
$$
m^{2} + 4m + 4(1+\lambda) = 0
$$
$$
m = \frac{-4 \pm \sqrt{ 16 - 4 (4(1+\lambda))}}{2}
$$

$$
= -2 \pm \frac{\sqrt{ -16 \lambda }}{2} = -2 \pm \frac{\sqrt{ -16 } \sqrt{ \lambda }}{2}
$$t
$$
= -2 \pm 2\lambda ^{1/2}i
$$

Real and imaginary roots, so the general solution is:

$$
y(x) = e^{-2x}(A\cos (2\lambda ^{1/2}x) + B\sin (2\lambda ^{1/2}x))
$$

Using the boundary conditions 

$$
y(0) = 0 = 1A \implies A = 0
$$$$
y(1)= 0 = e^{-2}(B\sin (2\lambda ^{1/2})) = 0
$$

$B = 0$ is a trivial solution
Otherwise,
$$
2\lambda ^{1/2} = n\pi
$$
$$
\implies \lambda ^{1/2} = \frac{n\pi}{2}
$$
$$
\lambda = \frac{n^{2}\pi^{2}}{4}
$$
So with $\lambda_{n} = \frac{n^{2}\pi^{2}}{4}$,
$$
y_{n} = e^{-2x} \sin (n\pi x)
$$
---

