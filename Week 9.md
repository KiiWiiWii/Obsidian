# Recap
![[Pasted image 20241121140543.png]]

# Fourier cosine and sine series

For any function, between $0$ and $a$, if we want the cosine series of it then we just pretend that it is an even function by mirroring it on the y axis and then making it periodic, for a sine function we pretend that it is odd and make it periodic too.

# Example 7.6

Find the sine series for $f(x) = x + 2$ on $0<x<1$, and sketch the series on $-3\leq x\leq 3$.

Using this:
![[Pasted image 20241121142331.png]]

We have $$
b_{n} = 2 \int _{0}^{1}(x+2)\sin (n\pi x ) \, dx 
$$
Using ibp $$
= - \frac{2}{n\pi}[(x+2)\cos (n\pi x)]_{0}^{1} + \frac{2}{n\pi}\int _{0}^{1} \cos (n\pi x) \, dx 
$$
$$
= -\frac{2}{n\pi}[3\cos (n\pi)-2\cos (0)] + \frac{2}{n\pi}\frac{[\sin {n\pi x}]}{n\pi} 
$$
$$
=-\frac{2}{n\pi}[3(-1)^{n}-2]
$$

So $x+2$ ~ $\frac{2}{\pi} \sum_{\neq 1}^{\infty}([\frac{2-3(-1)^{n}])}{n}\sin n\pi x$

![[Pasted image 20241121143252.png]]

# Example 7.7

Find the cosine series of $f(x) = x + 2$ on $0<x<1$, and sketch the series on $-3\leq x\leq 3$.

$$
a_{0} = \int _{o}^{1}(x + 2) \, dx = \left[ \frac{x^{2}}{2} + 2x \right]_{0}^{1} = \frac{5}{2}
$$
$$
a_{n} = 2 \int _{0}^{1} (x+2)\cos (n\pi x)\, dx 
$$
$$
=\frac{2}{n\pi}[(x+2)\sin(n\pi x)]_{0}^{1} - \frac{2}{n\pi}\int _{0}^{1}\sin (n\pi x) \, dx
$$
$$
0 + \frac{2}{n\pi}\left[ \left( \cos \frac{n\pi x}{n\pi} \right) \right]_{0}^{1}
$$
$$
=\frac{2}{n^{2}\pi^{2}}[(-1)^{n} -1]
$$
So $$
x+2 \sim \frac{5}{2} + \frac{2}{\pi^{2}}\sum_{n = 1}^{\infty} \frac{[(-1)^{n}-1]}{n^{2}}\cos (n\pi x)
$$
![[Pasted image 20241121144204.png]]

# Differentiation of Fourier series

![[Pasted image 20241121144405.png]]

