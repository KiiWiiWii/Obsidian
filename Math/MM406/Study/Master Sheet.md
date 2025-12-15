# Definitions

### Linear Spaces

A set of elements such that it is closed with respect to addition and multiplication.
$$
\begin{cases}
u,v \in V \implies u + v \in V \\
v \in V, \alpha \in \mathbb{R} \implies \alpha v \in V
\end{cases}
$$
### Linear Independence 

If a set of elements $V$ in a linear space satisfies $$
\sum_{i=1}^{n}c_{i}v_{i}=0
$$
Only if $c_{i} = 0$, $\forall c_{i}$.

### Basis

Some set $\underline{\phi}$ is a basis for $V$ for some set of functions in $V$ if any element of $V$ can be written as a linear combination of elements in $\underline{\phi}$. It is finite dimensional if there are finitely many basis elements.

### Norms

A norm measures the size of quantities A norm on the real linear space V is a real-valued function on V whose value at $v ∈ V$ is denoted by $‖v‖$. It satisfies the properties $$\begin{cases}

‖v‖ ≥ 0, \text{ with } ‖v‖ = 0 \text{ if and only if } v = 0 \\
‖αv‖ = |α| ‖v‖, \text{ for any } α ∈ R \text{ and } v ∈ V \\ 
‖u + v‖ ≤ ‖u‖ + ‖v‖ \text{ (the triangle inequality)}
\end{cases}$$
### L Norms

Small l norms are used for sets of numbers, big L norms are used for sets of functions.

The $l_{p}$ norm is $$
|| v || _{l_{p}} = \left( \sum_{i=1}^{n}|v_{i}|^{p} \right)^{1/p}
$$
The $l_{\infty}$ norm is
$$
|| v || _{l_{\infty}} = \max\limits_{i \leq i\leq n}|v_{i}|
$$
The $L_{p}$ norm is
$$
|| u ||_{L_{p}} = \left( \int _{a}^{b}|u(x)|^{p} \, dx  \right) ^{1/p}
$$
The $L_{\infty}$ norm is
$$
|| u || _{L_{\infty}} = \max\limits_{a \leq x \leq b} || u(x) || 
$$
### Inner Product

An inner product on the real linear space V is a mapping $〈·, ·〉 : V × V → R$ which satisfies the following properties $$ \begin{cases}

〈v, v〉 ≥ 0, with 〈v, v〉 = 0 \text{ if and only if } v = 0; \\
 \langle u, v〉 = 〈v, u〉 \text{ for any } u, v ∈ V \\
〈α u + β v, w〉 = α〈u, w〉 + β〈v, w〉 \text{ for any } u, v, w ∈ V \text{ and any } α, β ∈ R 
 \end{cases} $$
 If the inner product of $u,v$ is 0 then they are orthogonal.
### L Inner Products

Just like norms, small l is the inner product of vector elements and big L is the inner product of functions

The $l_{2}$ inner product is
$$
\langle u,v \rangle _{l_{2}} = \sum_{i=1}^{n}u_{i}v_{i}
$$
The $L_{2}$ inner product is
$$
\langle u,v \rangle _{L_{2}} = \int _{a}^{b}u(x)v(x) \, dx 
$$
The $L_{2}$ inner prod can also be weighted by multiplying the integral by some weight function $\omega (x)$.

### Theorem Linear Independence

A mutually orthogonal set of non zero elements of an inner product space is LI.

### Hilbert space

A space on some interval $[a,b]$ such that all functions in it are square integrable, i.e. $$
L_{2}(a,b)=\left\{ u: \int _{a}^{b}|u(x)|^{2} \, dx < \infty  \right\}
$$
If we need the derivatives of u for whatever reason we can extend the notation to also include the square integral of the m'th derivative: $H^{m}(I)$.

### Best Approximation

Consider the space $A$ which is a subspace of the normed linear space $V$ with some element $v \in V$. Then, some element $a\star \in A$ is the closest we can get to $v$. In some cases they'll be the same if v also lies in $A$. Concretely:
$$
|| v-a\star || \leq || v - a || \ \ \ \forall a \in A
$$
Note that sometimes, there can be multiple distinct $a\star$ in the case that $A$ carves out a L shaped space in $V$ then $v$ can lie equally distant from the bottom line and the left line.

### Theorem Weierstrass

Kinda depreciated in a sense that no one uses it but it leads to Jacksons somehow.

For some function $u \in C[a,b]$ and given some $\epsilon > 0$there exists some polynomial q such that 
$$
|| u-q || _{L_{\infty}} < \varepsilon
$$
and this is also true for L - norms greater or equal to 1
$$
|| u- q||_{L_{p}} < \varepsilon 
$$

All this is saying that there exists a polynomial that is arbitrarily close to the function we want, with epsilon being the degree of error we want.

### Theorem Jackson

If u is an r times continuously differentiable function on $[a,b]$ then for any $n>r$ there is a polynomial $q_{n} \in P_{n}$ such that
$$
|| u - q_{n} || _{L_{p}} \leq C_{r}\left( \frac{b-a}{n+1} \right)^{r}|| u^{(r)} || _{L_{p}}
$$
Where $C_{r}$ is just
$$
\frac{(\pi r)^{r}}{4^{r}r!}
$$
### Minimax

Quite simple to understand: how can we find some function that even in the worst point wise case minimises the error. Concretely:
$$
|| u-q_{n} || _{L_{\infty}} = \min\limits_{q \in P_{n}}|| u - q || _{L_{\infty}} = \min\limits_{q \in P_{n}}\max\limits_{x \in [a,b]} |u(x)- q(x)|
$$
### Theorem Projection

$a\star$ is the best approximation in $A$ of some $v \in V$ iff
$$
\langle u - a\star, a \rangle =0 \forall a  \in A
$$
#### Corollary

If $A$ has a basis $\{\phi _{i}\}^{n}_{i=0}$ then $a\star$ is the best approximation iff
$$
\langle u - a \star, \phi _{i} \rangle = 0 \text{ for } i = 0 : n
$$
### Algorithm construction of best approximation
1. Find a basis $\{\phi _{ i}\}^{ n }_{ i = 0}$ for $A$
2. Find $\underline{b} = \{b_{0},b_{1},b_{1},\dots,b_{n}\}$, $b_{i}=\langle u,\phi _{i} \rangle$
3. Find matrix $M \in \mathbb{R}^{(n+1)\times (n+1)}$ with $M_{ij}=\langle \phi _{i} \, \phi _{j} \rangle$
4. Solve the system $M\underline{\alpha}\star = \underline{b}$, with $\underline{\alpha}\star\in \mathbb{R}^{n+1}$
5. Then $a\star = \sum_{i=0}^{n}\alpha _{i}^{\star}\phi _{i}$ is the best approx.

### Best approximation using orthogonal basis

If there is an orthogonal basis then the best approximation is just
$$
a\star = \sum_{i = 0 }^{n}\langle u,\phi_{i} \rangle \phi _{i}
$$
### Algorithm Gram-Schmidt

This constructs an orthogonal basis $\underline{\phi}$.
1. Let $\phi_{0}=\psi_{0}$ and set $i=1$.
2. Let $\psi _{i}^{\star}=\sum_{j=0}^{i-1} \frac{\langle \psi_{i},\phi _{j} \rangle}{\langle \phi _{j},\phi _{j} \rangle}\phi _{j}$
3. Set $\phi _{i} = \psi _{i}-\psi _{i}^{\star}$
4. Set i++
5. If $i \leq n$ then go to step 2 otherwise stop

### Algorithm Three term recurrence for orthogonal polynomials

1. Let  
$$
\phi_0(x) = 1,\qquad
\alpha_0 = \frac{\langle \phi_0,\, x\,\phi_0\rangle}{\|\phi_0\|^2},\qquad
\phi_1(x) = (x - \alpha_0)\phi_0(x) = x - \alpha_0
$$
and set \( j = 1 \).
2. Set  
$$
\alpha_j = \frac{\langle \phi_j,\, x\,\phi_j\rangle}{\|\phi_j\|^2},
\qquad
\beta_j = \frac{\|\phi_j\|^2}{\|\phi_{j-1}\|^2}
$$
and  
$$
\phi_{j+1}(x) = (x - \alpha_j)\phi_j(x) - \beta_j\,\phi_{j-1}(x).
$$
3. Set \( j := j + 1 \).
4. If \( j < n - 1 \), go to 2; otherwise stop.
### Legendre Polynomials

They are orthogonal in $L_{2}(-1,1)$. They can be obtained by
$$
(n+1)p_{n+1}(x) = (2n +1)xp_{n}(x) - np_{n-1}(x)
$$
With $p_{0}(x)= 1$ and $p_{1}(x)=x$
$$p_{n}(x)= \frac{1}{2^{n}n!} \frac{d^{n}}{dx^{n}}(x^{2}-1)^{n}$$
### Chebyshev Polynomials

They are defined by $T_{0}(x)=1$ and $T_{1}(x)=x$, and
$$
T_{n+1}(x) = 2xT_{n}(x)-T_{n-1}(x)
$$
with 
$$
T_{n}(x)= \cos (n\cos ^{-1}(x))
$$
### Approximation using Chebyshev Polynomials

If we need to approximate using chebyshev, i.e. the weight function is $\omega (x)=(1-x^{2})^{-1/2}$ then it is:
$$
p_{n}^{\star}= \sum_{j = 0}^{n}c^{\star}_{j}T_{j}(x)
$$
With
$$
c_{j}^{\star}= \frac{\langle u,T_{j} \rangle }{\langle T_{j},T_{j} \rangle }
$$
With
$$
\begin{cases}
\langle T_{j},T_{j} \rangle = \begin{cases}
\pi \text{ if } m=n = 0, \\ \\
\frac{\pi}{2} \text{ if  } m = n > 0
\end{cases} \\
\langle u,T_{j} \rangle = \int _{0}^{\pi}u(\cos \theta)\cos (j\theta) \, d\theta 
\end{cases}
$$
Hence actually we get:
$$
p_{n}^{\star} = \frac{1}{2}d_{0}^{\star}T_{0}(x)+ \sum _{ j = 1}^{n} d_{j}^{\star} T_{j}(x)
$$
With
$$
d_{j}^{\star}= \frac{2}{\pi}\int _{0}^{\pi} u (\cos \theta)\cos (j\theta) \, d\theta, \ \ \ j \geq 0 
$$
