
## What is numerical analysis?

When you collect data on a phenomenon, process, whatever, you normally would make a mathematical model, then an a numerical algorithm to turn into code and make it visual. Numerical analysis is the process of taking a mathematical model and turning it into a numerical algorithm.

## Interpolation

### Example 1.2

Compute the value of the function $$
\frac{1 - \cos x}{x^{2}}
$$
when $$
x = 1.2 \times 10^{-5}
$$
---

Here for any value of $x$ we have $$
o \leq f(x) \leq \frac{1}{2}
$$
![[Pasted image 20250120144843.png]]

We will compute $f(1.2 \times 10 ^{ - 5})$ using ten digits of accuracy

$$
\cos (1.2 \times 10 ^{ - 5}) = 0.9999999999
$$
$$
1-\cos (1.2 \times 10 ^{ - 5}) = 0.0000000001 = 10 ^{ - 10}
$$
$$
(1.2 \times 10^{-5})^{2} = 1.44 \times 10 ^{ - 10}
$$
$$
f(1.2 \times 10 ^{- 5}) = \frac{10^{-10}}{1.44\times 10 ^{ - 10}} = 0.6944444444
$$
This answer is clearly wrong as it is greater than $\frac{1}{2}$. A single rounding error of $10^{-10}$ has been amplified a billion fold. The cause of the error is the cancellation in two numbers of a similar size.

What we can do is use a trig identity to rewrite our cosine to solve this problem. We can use $\cos x = 1 - 2 \sin ^{2}\left( \frac{x}{2} \right)$. $$
f(x) = \frac{1}{2} (\frac{\left(  \sin \left( \frac{x}{2} \right) \right)}{\frac{x}{2}})^{2}
$$

Using this (with ten digits of accuracy) gives $0.5$ as expected which is accurate to 11 digits.

---

![[Pasted image 20250120151006.png]]

For each data set $y$ we get an associated $x$, from this we can "guess" a function to estimate these points.

![[Pasted image 20250120151949.png]]

-- first 3 red points are how i'd describe myself --


![[Pasted image 20250120152947.png]]

me rn if you even care

![[Pasted image 20250120153052.png]]

![[Pasted image 20250120153322.png]]

![[Pasted image 20250120153423.png]]

these are 3 important theorems 


### Example 1.3

Find the interpolating polynomial for $$
{(- 1, 6), (1,6), (2.9)}
$$
Since there are 3 points we are looking for a quadratic ($x^{2}$) at most.

Suppose it is $p_{2}(x) = a_{2}x^{2}+a_{1}x + a_{0}$. Using our data points gives $$
a_{2} -a_{1} + a_{0} = 6
$$$$
a_{2} + a_{1} + a_{0} = 6
$$
$$
4a_{2}+2a_{1}+a_{0} = 9
$$
So $a_{2} = 1$ $a_{1} = 0$ and $a_{0} = 5$.

So here $p_{2} ( x ) = x^{2} + 5$.

---

### Example 1.4

Approximate $e^{x}$ over $0\leq x\leq 2$ by a quadratic polynomial.

---

We can find a quadratic interpolate by sampling our function $f(x) = e^{x}$ at three points. Here we choose the equispaced points $$
(0,1),(1,e),(2,e^{2})
$$
So now we do the same thing as the other example
$$
\dots
$$
So we get $a_{0} = 1, a_{1} = -\frac{e^{2}}{2} + 2e - \frac{3}{2}, a_{2} = \frac{e^{2}}{2} - e + \frac{1}{2}$ Hence $p_{2}(x) = 1 + 0.2420x + 1.4762x^{2}$.

---


