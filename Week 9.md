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

