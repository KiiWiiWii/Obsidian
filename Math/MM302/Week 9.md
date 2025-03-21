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

# Example 7.8

![[Pasted image 20241121150935.png]]

(i). 

Here $a=2$ and $f$ is continuous on $[0,2]$.
For the sine series to be continuous, we need $f(0) = 0 = f(a)$, i.e. $f(0) = f(2) = 0$, which is satisfied. 

$$
f'(x) = 2 - 2x \sim \frac{32}{\pi^{3}} \sum_{m=1}^{\infty} \frac{1}{(2m-1)^{3}}\frac{((2m-1)\pi)}{2}\cos \left( \frac{(2m-1)\pi x}{2} \right)
$$
$$
=\frac{16}{\pi^{2}}\sum_{m = 1}^{ \infty} \frac{1}{(2m-1)^{2}}\cos \frac{(2m-1)\pi x}{2}
$$


---

(ii)

$$
a_{0} = \frac{1}{2}\int _{0}^{2}(2-2x) \, dx 
$$
$$
= 0
$$
$$
a_{n} = \int _{0}^{2} ( 2 - 2 x)\cos \left( \frac{n\pi x}{2} \right) \, dx
$$
$$
= \frac{2}{n\pi}\left[ (2-2x)\sin \left( \frac{n\pi x}{2} \right) \right]_{0}^{2} + \frac{4}{n\pi}\int _{0}^{ 2} \sin \left(  \frac{n\pi x}{2} \right) \, dx
$$
$$
= -\frac{8}{n^{2}p^{2}}\left[ \cos \left( \frac{n\pi x}{2} \right) \right]_{0}^{2}
$$
$$
= - \frac{8}{n^{2}p^{2}}[(-1)^{n}-1]
$$
This is $0$ when n is even and then $\frac{16}{n^{2}\pi^{2}}$ when it is odd.

Let $n = 2m-1$ then $$
f'(x) = 2 - 2 x \sim \frac{16}{\pi^{2}}\sum_{m = 1}^{ \infty} \frac{1}{(2m-1)^{2}}\cos \frac{(2m-1)\pi x}{2}
$$
(iii)

We can always differentiate a cosine series term by term as the extended function is continuous.

Here $f'' (x) = - 2$ so its sine series plot is

![[Pasted image 20241121153054.png]]

As this extended function is not continuous,we cannot find the cosine series for$f'''(x)$ by differentiating the sine series of $f''(x)$.


---



# Example 7.9

Solve the PDE $$
\frac{\partial u}{\partial t} = 4 \frac{\partial^2 u}{\partial x^2}
$$
$0<x<2$ and $t<0$

$$
\frac{\partial u}{\partial x}(0,t), \ \ \ \frac{\partial u}{\partial x}(2,t), \ \ \ t>0
$$
$$
u(x,0) = x + 3 \ \\ \ \ \ \ 0 < x < 2
$$

Following example 6.5, at step 4 of separation of variables:


$$
u(x,t) = C_{0} + \sum_{n = 1} ^{ \infty} C_{n}\cos \left(  \frac{n\pi x}{2} \right) e ^{ -n^{2}\pi^{2}t}
$$
IC: When $t = 0$.
$$
x + 3 = C_{0} + \sum_{n = 1}^{\infty}C_{n} \cos \left( \frac{n\pi x}{2} \right)
$$
We therefore need the cosine series for $f(x) = x + 3$ when $0<x<2$.
$$
C_{0} = \frac{1}{2} \int _{0}^{2}(x + 3) \, dx = 4
$$

$$
C_{n} = \int _{0} ^{ 2} (x + 3) \cos \left(  \frac{n\pi x}{2} \right) \, dx 
$$
$$
= \frac{2}{n\pi}\left[ (x + 3)\sin \left( \frac{n\pi x}{2} \right) \right]_{0}^{2} - \frac{2}{n\pi}\int _{0}^{2} \sin \left(  \frac{n\pi x}{2} \right) \, dx 
$$

$$
= \frac{4}{n^{2}\pi^{2}} [\cos\left( \frac{n\pi x}{2} \right)]_{0}^{2}
$$
$$
= \frac{4}{n^{2}\pi^{2}}[(-1)^{2}-1]
$$
Final solution is therefore 
$$
u(x,t) = 4 + \frac{4}{\pi^{2}}\sum_{n = 1}^{\infty} \frac{[(-1)^{2} - 1]}{n^{2}} \cos \left( \frac{n\pi x}{2} \right)e^{-n^{2}\pi^{2}t}
$$

---

$$
\square
$$

