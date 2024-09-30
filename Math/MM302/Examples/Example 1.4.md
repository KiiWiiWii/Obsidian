Find the Taylor series up until the $4^{th}$ term of $$
y' = x^{2} + y^{2} \ \ \ , \ \ \ y(1) = 2
$$
As the IVP is given at $x = 1$ , our series will be centered around $x_{0} = 1$. From our initial condition, $y(1) = 2$, so we can find $y'(1) = 1 + (y(1))^{2} = 5$. Differentiating this ODE we get $$
y'' = 2x + 2yy'
$$
$$
y''(1) = 2 + 2(y(1))(y'(1)) = 22

$$
Differentiating one more time we find $$
y''' = 2 + 2y'y' + 2yy''
$$
$$
y'''(1) = 2 + 2(y'(1))^{2} + 2(y(1))(y''(1)) = 140
$$
Now that we have the first 4 terms, we can find the Taylor series to be:
$$
y(x) = 2 + 5(x-1) + 11(x-1)^{2} + \frac{70}{3}(x-1)^{3}+\dots
$$
---
