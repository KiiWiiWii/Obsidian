
## Example 3.13

Find the degree of precision of the midpoint rule. 

---

$$
\int _{a}^{b} x ^{ 0}  \, dx = b -a
$$
$$
M(x^{0}) = (b-a)\left( \frac{b+a}{2} \right)^{0} = b - a
$$

So, our rule is exact for $x^{0}$.

$$
\int _{a}^{b}x \, dx = \left[ \frac{x^{2}}{2} \right]_{a}^{b} = \frac{b^{2}-a^{2}}{2}
$$
$$
M(x) = (b-a)\left( \frac{a+b}{2} \right)= \frac{b^{2}-a^{2}}{2}
$$
So again, our rule is exact for $x$.

$$
\int _{a}^{b}x^{2} \, dx  = \left[ \frac{x^{3}}{3} \right]_{a}^{b} = \frac{b^{3}-a^{3}}{2}
$$
$$
m(x^{2}) = (b-a) \left( \left( a+\frac{b}{2} \right)^{2} \right)
$$
Which is not exact, therefore the degree of precision is 1 

---

## Example 3.14

Estimate the number of strips needed to approximate $\int _{-1}^{1}f(x) \, dx$ to an accuracy of $10^{-4}$ where $f(x) = e^{x}$, and $f(x) = \sin (x)$.

---


For $f(x) = e^{ x }$, We have $|f^{4}(x)| \leq e$ on $[-1,1]$, so $$
|E_{s_{n}}(f)| \leq \frac{b-a}{180}h^{4}.max_{\in[-1,1]}|f^{4}(\xi)| = \frac{2h^{4}}{180}\times e
$$
`^this is the `