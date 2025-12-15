## Question 1

**1.** Let $u \in \mathcal{V}$ where $\mathcal{V}$ is a real linear space with inner product $\langle \cdot, \cdot \rangle$ and let $\mathcal{A}$ be the linear subspace of $\mathcal{V}$ which has the orthogonal basis $\{\phi_j\}_{j=1}^n$.

Define $a^* \in \mathcal{A}$ as follows:
$$a^* = \sum_{j=1}^n \frac{\langle u, \phi_j \rangle}{\langle \phi_j, \phi_j \rangle} \phi_j.$$

**(a)** Show that $\langle u - a^*, \phi_i \rangle = 0$ for $i = 1, \dots, n$.
**(1 mark)**

> By linearity, we have $\langle u - a^{\star},\phi _{i} \rangle = \langle u, \phi _{i} \rangle - \langle a^{\star},\phi _{i} \rangle$. Then, from $a^{\star}$'s definition we get $\langle u,\phi _{i} \rangle - \left\langle  \sum_{j=1}^{n}c_{j}\phi _{j},\phi _{i}  \right\rangle$. Note that $\langle \phi _{j},\phi _{i} \rangle = 0$ when $i \neq j$, Hence, we are left with $\langle u,\phi _{i} \rangle - c_{i}\langle \phi _{i},\phi _{i} \rangle$. Then, from definition of $c_{i}$ we obtain $\langle u , \phi _{i} \rangle - \langle u,\phi _{i} \rangle = 0$ as required.

**(b)** Show that if $a \in \mathcal{A}$ then
$$||u - a||^2 = ||u - a^*||^2 + ||a^* - a||^2 + 2\langle u - a^*, a^* - a \rangle,$$
where $a^*$ is defined in (1) and the induced norm is $||v|| = \sqrt{\langle v, v \rangle}$.
Hence show that $||u - a|| \ge ||u - a^*||$ for all $a \in \mathcal{A}$.
**(3 marks)**

> Looking at the LHS, lets add 0 in the form $a^{\star} - a^{\star}$. Then we get $|| u - a^{\star} - a + a^{\star} ||^{2}$. Then, by definition of an induced norm we get $\langle (u-a^{\star})+(a^{\star}-a),(u-a^{\star})+(a^{\star}-a) \rangle$

**(c)** Now suppose that $\mathcal{V} = \mathbb{R}^4$ with the weighted $l_2$ inner product
$$\langle u, v \rangle = \sum_{j=1}^4 j u_j v_j,$$
for $u = (u_1, u_2, u_3, u_4)$ and $v = (v_1, v_2, v_3, v_4)$, and let $\mathcal{A}$ be the subspace of $\mathcal{V}$ which is spanned by $\phi_1 = (2, -1, 1, 0)$ and $\phi_2 = (3, 0, -2, 1)$.

**(i)** Show that the basis $\{\phi_1, \phi_2\}$ is orthogonal.
**(ii)** Use (1) to calculate $a^*$ when $u = (3, 3, -6, -5)$.
**(iii)** Determine whether or not there is an element $a \in \mathcal{A}$ which satisfies $||u - a|| = 12$ for $u$ given in (ii).
**(1, 4, 2 marks)**

---

## Question 2

**2. (a)** Let $\mathcal{S}_X$ be the set of cubic splines with respect to the knots $X = [x_0, x_1, \dots, x_n]$.
**(i)** State the properties satisfied by a cubic spline $S(x) \in \mathcal{S}_X$.
**(ii)** Show that the function $f(x) = (x - x_k)_+^3$ is in the space $\mathcal{S}_X$, where $x_k$ is a knot and
$$(x - x_k)_+^3 = \begin{cases} 0 & \text{for } x < x_k, \\ (x - x_k)^3 & \text{for } x \ge x_k. \end{cases}$$
**(7 marks)**

**(b)** The reference triangle $\mathcal{T}$ has nodes $(\xi_1, \eta_1) = (0, 0)$, $(\xi_2, \eta_2) = (1, 0)$ and $(\xi_3, \eta_3) = (0, 1)$, and the triangle $T$ in the $(x, y)$-plane has nodes $r_1 = (6, 1)$, $r_2 = (6, 4)$ and $r_3 = (-2, 10)$.

**(i)** Find the linear interpolant on $T$ of the function $U(\xi, \eta) = (1 + \xi + 2\eta)^2 \cos(\pi \xi)$.
**(ii)** Find an affine map $F : \mathcal{T} \to T$ for which $F(\xi_i, \eta_i) = r_i$ for $i = 1, 2, 3$.

**Hint:** the affine basis functions for $\mathcal{T}$ are $\Phi_1(\xi, \eta) = 1 - \xi - \eta$, $\Phi_2(\xi, \eta) = \xi$ and $\Phi_3(\xi, \eta) = \eta$.
**(4, 3 marks)**

---

## Question 3

**3.** This question concerns the approximation of the following one-dimensional differential equation:
$$-u'' - u' = f \quad \text{in } (0, 1),$$
$$u(0) = u(1) = 0. \quad \text{(CD)}$$

**(a)** Find a weak formulation for (CD), specifying the appropriate space $V$, bilinear form $a(\cdot, \cdot)$, and linear functional $L(\cdot)$.
Prove that the bilinear form $a(\cdot, \cdot)$ is bounded in $V$.
**(10 marks)**

**(b)** Define a uniform mesh $0 = x_0 < x_1 < \dots < x_n < x_{n+1} = 1$, with $h = x_i - x_{i-1} = \frac{1}{n+1}$. Define the finite element space
$$V_h = \{v_h \in C([0, 1]) : v_h|_{[x_i, x_{i+1}]} \in \mathbb{P}_1 \text{ for all } i = 0, \dots, n, \, v_h(0) = v_h(1) = 0\},$$
and the standard "hat" basis functions $\phi_1, \dots, \phi_n$ characterised by $\phi_j(x_i) = \delta_{ij}$ for $i, j = 1, \dots, n$. Propose a finite element method based on the space $V_h$, and specify its associated matrix $\mathbb{A}$.
**(10 marks)**

---

## Question 4

**4.** Let $\Omega \subseteq \mathbb{R}^2$. Define a mesh $\mathcal{T}_h$ in $\Omega$ and define the standard spaces used in lectures (i.e., continuous piecewise linear functions). In the mesh $\mathcal{T}_h$ the triangle $K$ has vertices $x_1 = (0, 0)$, $x_2 = (1, 0)$ and $x_3 = (1, 1)$. Compute the local stiffness matrix
$$A^K = \left( \int_K \nabla \phi_j \cdot \nabla \phi_i \, dx \right)_{i, j = 1}^3$$

**Hint:** The formula for the gradient of the basis function associated with the node $x_i$ in the element $K$ is given by
$$\nabla \phi_i^K = -\frac{|E_i^K|}{2|K|} n_i^K,$$
where $E_i^K$ is the edge of $K$ opposite to the node $x_i$ and $n_i^K$ is the unit normal vector to $E_i^K$.
**(10 marks)**

---

## Question 5

**5. (a)** Find the truncated power expansion (TPE) of
$$S(x) = 9x + 3 + 2|x + 1|^3 - 2|x|^3$$
on the knots $X = [-5, -2, -1, 0, 2]$.
(The TPE of the cubic spline $S$ on the knots $X = [x_0, x_1, \dots, x_n]$ is
$S(x) = p_3(x) + \sum_{k=1}^{n-1} \gamma_k (x - x_k)_+^3$, where $p_3(x)$ is a polynomial of degree $\le 3$, and $\gamma_k \in \mathbb{R}$.)
**(6 marks)**

**(b)** Show that there is at most one natural cubic spline that interpolates the data values $\{y_k\}_{k=0}^n$ at the knots $X = [x_0, \dots, x_n]$.

**Hint:** You may assume that if $S$ is a natural cubic spline on the knots $X$ and $g \in C^2[x_0, x_n]$ satisfies $g(x_k) = S(x_k)$ for $k = 0, \dots, n$ then
$$\int_{x_0}^{x_n} [g''(x)]^2 dx - \int_{x_0}^{x_n} [S''(x)]^2 dx = \int_{x_0}^{x_n} [g''(x) - S''(x)]^2 dx.$$
**(7 marks)**

**(c)** Let $V$ be a real inner product space with inner product $\langle \cdot, \cdot \rangle$ and suppose that $\{\psi_j\}_{j=0}^n$ is a basis for the subspace $A$ of $V$.
Consider the following algorithm to construct a new set of elements $\{\phi_j\}_{j=0}^n$ which span $A$: set $\phi_0 := \psi_0$, and for each $i = 1, \dots, n$, set
$$\phi_i := \psi_i - \sum_{j=0}^{i-1} \frac{\langle \psi_i, \phi_j \rangle}{\langle \phi_j, \phi_j \rangle} \phi_j$$

**(i)** Show that $\langle \phi_1, \phi_0 \rangle = 0$.
**(ii)** Show that if the set $\{\phi_j\}_{j=0}^{i-1}$ is mutually orthogonal for some $i \ge 1$ then $\langle \phi_i, \phi_k \rangle = 0$ for each $k \le i - 1$.
**(iii)** Hence show that $\{\phi_j\}_{j=0}^n$ is an orthogonal set in $A$.
**(1, 3, 3 marks)**