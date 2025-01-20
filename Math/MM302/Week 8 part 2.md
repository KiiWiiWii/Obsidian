
# Even and odd functions

An even function is one where $f(-x) = f(x)$, and an odd one is where $f(x) = -f(x)$. Graphically, even functions are mirrored while odd functions are flipped.

The lecturer is shit posting

In terms of integrals, An even function between $-a$ and $a$ would be $2\int _{0}^{a}$, while an odd one would be $0$ between $- a$ and $a$.

Additionally, a function can be piece wise smooth on an interval if it may be broke up into a finite number of pieces in which $f$ and $f'$ are continuous.

![[Pasted image 20241114151756.png]]

If $f$ is discontinuous at a point $x_{0}$ then it is said to have a jump discontinuity at that point.

![[Pasted image 20241114152028.png]]

These are some useful results:
![[Pasted image 20241114152306.png]]
Proved in example 7.1.
# Example 7.1

Verify that $I =\int _{-a} ^{ a} \cos \left( \frac{n\pi x}{a} \right) \cos \left( \frac{m\pi x}{a} \right) \, dx = a$ when $n = m$ and $0$ when $n \neq m$.

For $n =m$, 

$$
I = \int _{-a} ^{ a } \cos ^{2}\left( \frac{n\pi x}{a} \right) \, dx
$$
$$
=\frac{1}{2} \int _{-a}^{a} \left(  1 + \cos \left( \frac{2n\pi x}{a} \right) \right) \, dx 
$$
Now integrating $$
\frac{1}{2} \left[  x + \frac{a}{2n\pi}\sin \left( \frac{2n\pi x}{a} \right) \right]_{-a} ^{ a}
$$

$$
= \frac{1}{2} [a - (- a)]
$$
So you get $a$.

For $n \neq m$, $$
\frac{1}{2}I = \int _{- a } ^{ a } \left[  \cos\left[ \frac{(n - m) \pi x}{a} \right] + \cos\left[ \frac{(n + m) \pi x}{a} \right] \right] \, dx 
$$
$$
= \frac{1}{2} \left[ \frac{a}{(n-m)\pi} \sin\left[ \frac{(n - m) \pi x}{a} \right] +\frac{a}{(n+m)\pi} \sin\left[ \frac{(n + m) \pi x}{a} \right] \right]_{- a }^{a}
$$
$$
= 0
$$
Since $\sin (k\pi) = 0$ for any $k\in\mathbb{Z}$

:3
# Fourier Coefficients

practice ibp

