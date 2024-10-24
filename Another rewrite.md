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

# Example 5.a
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
Using the trig identity: $\cos (a)\cos (b)\sin (a)\sin (b) = \cos (a+b)$
$\cos (a-b) = \cos a\cos b + \sin as$