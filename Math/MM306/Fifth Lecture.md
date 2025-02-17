
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
|E_{s_{n}}(f)| \leq \frac{b-a}{180}h^{4}.max_{\xi\in[-1,1]}|f^{4}(\xi)| = \frac{2h^{4}}{180}\times e
$$
`^this is the ugliest thing ive ever wrote`

This is less than $10^{-4}$ if $h^{4} \leq \frac{90\times 10^{-4}}{e}$ or $h \leq 0.2399$, so as $n = \frac{2}{h}$, we need $n > 8.3$. So we need at least 10 since we need n to be even for Simpsons rule.


For $f(x) = \sin (x)$, we have $f^{4}(x) = \sin x$ and over $[-1,1]$ this attains its max value @ $x = 1$.
So $max_{\xi\in[-1,1]}|f^{4}(\xi)| = \sin (1)$.

$$
|E_{s_{n}}(f)| \leq \frac{h^{4}}{90}\sin (1)
$$
This is less than $10^{-4}$ if $h^{4}\leq 0.0107$ or $h\leq 0.3216$ so we need $n\geq 8$.

---

## Example 3.15

Find $G_{2}(f)$ over $[-1,1]$ and show it has d.o.p. 3.

The Legendre polynomials come from a recurrence relation (in chap 2, and it is given in the formula sheet), the one of degree 2 is $$
p_{2}(x) = \frac{3x^{2}-1}{2}
$$
Which has zeros @ $x_{0}  = -\frac{1}{\sqrt{ 3 }}$ and $x_{1} = \frac{1}{\sqrt{ 3} }$. We find the weights by integrating the related Lagrange polynomials:

$$
\int _{-1}^{1} \frac{x - x_{1}}{x_{0}-x_{1}} \, dx  = \int_{-1}^{1} \frac{\left( x - \frac{1}{\sqrt{ 3 }} \right)}{-\frac{1}{\sqrt{ 3 }}-\frac{1}{\sqrt{ 3 }}} \, dx 
$$
$$
= \left[ \frac{x}{2} - \frac{\sqrt{ 3 }x^{2}}{4} \right]_{-1}^{1} = 1

$$
$$
c_{1} = \int \frac{_{-1}^{1}(x-x_{0})}{x_{1}-x_{0}} \, dx = \int _{-1}^{1} \frac{\left( x + \frac{1}{\sqrt{ 3 }} \right)}{\frac{1}{\sqrt{ 3 }}+\frac{1}{\sqrt{ 3 }}} \, dx  = 1
$$
The rule is therefore $$
G_{2}(f) = c_{0}f(x_{0}) + c_{1}f(x_{1})
$$
$$
= f\left( -\frac{1}{\sqrt{ 3 }} \right)+f\left( \frac{1}{\sqrt{ 3 }} \right)
$$
Using this rule, we  have $$
G_{2}(1) = 1 + 1 = 2 = \int _{-1}^{1} 1 \, dx
$$$$
G_{2}(x) = -\frac{1}{\sqrt{ 3 }} + \frac{1}{\sqrt{ 3 }} = 0 = \int _{-1}^{1}x \, dx
$$
$$
G_{2}(x^{2}) = \left( -\frac{1}{\sqrt{ 3 }} \right)^{2} + \frac{1}{\sqrt{ 3 }}^{2} = \frac{2}{3} = \int _{-1}^{1} x^{2} \, dx 
$$
$$
G_{2}(x^{3}) = -\frac{1}{3\sqrt{ 3 }} + \frac{1}{3\sqrt{ 3 }} = 0 = \int _{-1}^{1} x^{3} \, dx 
$$

But
$$
G_{2}(x^{4}) = \frac{2}{9} \neq \int _{-1}^{1}x^{4} \, dx 
$$

## Example 3.16

Find $G_{3}(f)$ over $[-1,1]$.

$$
p_{3}(x) = \frac{5x^{3}-3x}{2}
$$

With zeros at $x_{0} = -\sqrt{ \frac{3}{5} }$, $x_{1} = 0$ and $x_{2}= \sqrt{ \frac{3}{5} }$.

$$
c_{0} = \int _{-1}^{ 1} \frac{(x-x_{1})()x-x_{2})}{(x_{0}-x_{1})(x_{0}-x_{2})} \, dx = \frac{5}{9}
$$


$$
c_{1} = \dots = 
$$