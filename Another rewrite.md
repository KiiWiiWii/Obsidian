# Sturm-Liouville Problems

[[5.3.pdf]]

Assume that it can be written as 2 functions, one of time and one of space. Assume then that the general solution is a multiplication of these two functions. It only works if the equation is linear.

-zoned out: look at notes-

[[MM302_Week5_notes.pdf]]

^ this explains it better

# Definition 14

Consider a Sturm-Liouville problem $L[y] + \lambda \sigma (x)y=0$. The values of the parameter $\lambda$ for which there exists nontrivial solutions of the problem are called eigenvalues. The corresponding nontrivial solutions $y(x)$ are called eigenfunctions.

# Definition 15

Let $\lambda_{n}$ and $\lambda_{m}$ be different eigenvalues ($n\neq m$) with corresponding eigenfunctions $y_{n}(x)$ and $y_{m}(x)$ we say that these functions are orthogonal on $[a,b]$ with eight $\sigma (x)$ if $$
\int _{a}^{b}\sigma (x)y_{n}(x)y_{m}(x) \, dx =0, \ \ \ n \neq m 
$$
# Theorem 12


![[Pasted image 20241024132540.png]]
The reason we gaf is because if we have a set of functions and they are all orthogonal, they are a good candidate for being a basis. The best way to write a general vector is with orthogonal vectors (?). They cover the function space most efficiently.

#### Proof for part 3

Using theorem 11 as part of proof.

Assume we have two distinct eigenfunctions, $y_{1}(x), \ \ \ y_{2}(x)$. Using Lagrange identity: $$
\int _{a}^{b}y_{1}L[y_{2}] - y_{2}L[y_{1}] \, dx =0
$$
Since $$
L[y_{2}] +\lambda_{2}\sigma (x)y_{2} = 0
$$
$$
\implies L[y_{2}] = lake\lambda_{2}\sigma (x)y_{2}(x)
$$
and similarly $$
L[y_{1}] + \lambda_{1}\sigma (x)y_{1}(x) = 0
$$
$$
\implies L[y_{1}] = - \lambda_{1}\sigma (x)y_{1}(x)
$$
Subbing back we get $$
\int _{1}^{b} y_{1}(-\lambda_{2}\sigma (x)y_{2}) - y_{2} (-\lambda_{1}\sigma (x)y_{1}) \, dx =0
$$
$$
(\lambda_{1} - \lambda_{2})\int _{a}{y_{1}y_{2}} \sigma (x)  = 0\, dx 
$$
Since we assumed that $\lambda_{1} \neq \lambda_{2}$ $$
\implies \int _{a}^{b} \sigma (x)y_{1}y_{2} \, dx
$$
$\implies y_{1}, \ \ y_{2}$ are orthogonal with respect to weight $\sigma (x)$.
$\square$
---

# Example W5.live
For $$
y'' + \lambda y = 0
$$
$$
y(0) = y(\pi) = 0
$$
We showed that the eigenfunctions are $$
y_{n}(x = \sin(n\pi)), \ \ \ n = 1,2,\dots
$$
$$
\lambda_{n} = n^{2}
$$
We now show that the eigenfunctions are orthogonal with respect to the weight $\sigma (x) = 1$. i.e. we need to show that $$
\int _{0}^{\pi} \sin(nx)\sin (mx) \, dx = 0, \  \ \ m\neq n
$$
Using the trig identities: $\cos (a+b) =\cos (a)\cos (b)\sin (a)\sin (b)$
$\cos (a-b) = \cos a\cos b + \sin a\sin b$.
$\sin a\sin b = \frac{1}{2}( \cos (a-b) - \cos (a + b))$

$$
\int _{0}^{\pi} \cos ((n-m)x) - \cos ( (n +m)x) \, dx
$$
$$
\frac{1}{2} (\frac{1}{n-m} \sin ( (n - m)x) |_{0}^{\pi} - \frac{1}{n+m} \sin ( ( n + m) x ) |_{0}^{ \pi})
$$
For any integer multiple of $\pi$ in $\sin$ is $=0$.
$$
= 0
$$
Therefore these are orthogonal and correspond to [[Theorem 12]].  (_you could also us IBP to solve this integral if you don't remember your trig identities_)


# Rayleigh quotient

![[Pasted image 20241024140925.png]]"quite an easy derivation"

# Example 3.3
Consider the eigenvalue problem $$
y'' + \lambda y = 0 \ \ \ \ 0 < x < a
$$ $$
y(0) = 0 \ \ \ or \ \ \ y'(0)
$$$$
y(a) = 0 \ \ \ or \ \ \ y'(a) =0
$$
The Rayleigh quotient with $p(x) = 1$, $p(x) = 0$ and $\sigma (x) = 1$ is:$$
\lambda = \frac{\int _{0}^{a} (y')^{2} \, dx - [yy']_{0}^{a}}{\int _{0}^{a}y^{2} \, dx }
$$
Using the boundary conditions $$
\frac{\int _{0}^{a} (y')^{2}\, dx - [y(a)y'(a)- y(0)y'(0)]}{\int _{0}^{a}y^{2} \, dx }
$$
$$
\implies \lambda = \frac{\left( \int _{0}^{a} (y')^{2} \, dx  \right)}{\int _{0}^{a} y^{2} \, dx }
$$
Clearly $\lambda$ are all non negative.

The eigenfunctions cannot be 0 but the eigenvalue can.

If $\lambda = 0$: $$
y''(x) = 0
$$
$$
\implies y(x) = Ax + b
$$
$y(0) = 0$
$y'(0) = 0$
$y(a)= 0$
$y'(a) = 0$

Only solutions are $y =$ constant $\neq 0$.

# Example W5.live3

$y'' + \lambda y = 0$     $0 <x < a$
$y(0) = 0$
$y'(a) = 0$

Guessing that $y(x) = A e^{mx}$.
$$
y' = Ame^{mx}
$$
$$
y'' = Am^{2}e^{mx}
$$
Subbing into the equation $$
Am^{2}e^{mx}+\lambda Ae^{mx} = 0
$$
Because $A \neq 0$ $$
m^{2}e^{mx} = Ae^{mx} = 0
$$
Similiart