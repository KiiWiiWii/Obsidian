
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
This answer is clearly wrong as it is greater than $\frac{1}{2}$. A single rounding error of $10^{-10}$ has been amplified a billion fold. The cause of the error is the cancellation