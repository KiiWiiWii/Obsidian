
# 1a

Let $u \in \mathcal{V}$, where $\mathcal{V}$ is a real linear space with inner product $\langle \cdot, \cdot \rangle$ and let $\mathcal{A}$ be the linear subspace of $\mathcal{V}$ which has the **orthogonal** basis $\{\phi_j\}_{j=0}^n$.

Suppose that there is an element $a^* \in \mathcal{A}$ for which $\langle u - a^*, \phi_i \rangle = 0$ for $i = 0, \dots, n$.

Show that

$$a^* = \sum_{j=0}^n \frac{\langle u, \phi_j \rangle}{\langle \phi_j, \phi_j \rangle} \phi_j. \qquad (1)$$

**(5 marks)**

> Since the inner product is linear, then $$
\langle u-a^{\star},\phi _{i} \rangle = \langle u,\phi _{i} \rangle -\langle a^{\star},\phi _{i} \rangle  
$$Then, we can write $\langle a^{\star},\phi _{i} \rangle$ as $\left\langle  \sum_{j=0}^{n}c_{j}\phi _{j},\phi _{i}  \right\rangle$. Then, we can take out the coefficient: $$
\sum_{j=0}^{n}c_{j}\langle \phi _{j},\phi _{i} \rangle 
$$But, since $\langle \phi _{i},\phi _{j} \rangle = 0$ when $i \neq j$, we get $$
\langle u- a ^{\star},\phi _{i} \rangle = \langle u, \phi _{i} \rangle - c_{i}\langle \phi _{i},\phi _{i} \rangle 
$$Then, as this inner product is 0, $$
\langle u,\phi _{i} \rangle = c_{i}\langle \phi _{i},\phi _{i} \rangle 
$$ $$
c_{i}=\frac{\langle u,\phi _{i} \rangle }{\langle \phi _{i},\phi _{i} \rangle }
$$
Hence,$$
a^{\star}=\sum_{j=0}^{n} \frac{\langle u,\phi _{j} \rangle }{\langle \phi _{j},\phi _{j} \rangle }\phi _{j}
$$


## 1b

Suppose that the elements $\{\psi_j\}_{j=0}^n$ are a (non-orthogonal) basis for the real inner product space $\mathcal{B}$. The Gram-Schmidt construction of an orthogonal basis $\{\phi_j\}_{j=0}^n$ for $\mathcal{B}$ is as follows:

1. Let $\phi_0 := \psi_0$ and set $i = 1$.
2. Set $\phi_i = \psi_i - \psi_i^*$ where
   $$\psi_i^* = \sum_{j=0}^{i-1} \frac{\langle \psi_i, \phi_j \rangle}{\langle \phi_j, \phi_j \rangle} \phi_j.$$
3. Set $i := i + 1$.
4. If $i \leq n$ go to 2, otherwise stop.

Use this algorithm to construct an orthogonal basis for the space $\mathcal{B}$ which is spanned by $\psi_0 = 1$ and $\psi_1 = x^2$ with the $L_2$- inner product on $[0, 1]$, i.e.

$$\langle f, g \rangle = \int_0^1 f(x) g(x) \, dx.$$

**(5 marks)**

> Let $\phi _{0}=1$. Then, $\phi _{1}=x^{2}-\psi _{i}^{\star}$, with $$
\psi _{i}^{\star}=\frac{\left( \int _{0}^{1}1\times1 \, dx  \right)}{\int _{0} ^{1} 1\times 1 \, dx }1 = 1
$$So, $\phi_{1}=x^{2}-1$.

## 1c

 Find the element $a^* \in \mathcal{B}$ (where $\mathcal{B}$ is the space from (b) above), given by (1) when $u(x) = 16x$. **(5 marks)**

> Here we need the following:
> $$
\begin{cases}
\langle u,\phi_{0} \rangle = \int _{0}^{1}16x \, dx = 8 \\
\langle u, \phi_{1} \rangle = \int_{0}^{1} 16x^{3}-16x^{2} \, dx  = -\frac{4}{3} \\
\langle \phi_{0},\phi_{0} \rangle = \int _{0}^{1} 1 \times 1 \, dx = 1 \\
\langle \phi_{1},\phi_{1} \rangle = \int _{0}^{1} (x^{2}-1)^{2} \, dx = \frac{8}{15}
\end{cases}
$$
---

## 2a

Suppose that $S$ is a **linear** spline on the knots $x_0 < \dots < x_n$, and let $v \in H^1(x_0, x_n)$ interpolate the same data as $S$ at the knots, i.e. $v(x_k) = S(x_k)$ for $k = 0, \dots, n$.

(i) Show that $\langle v' - S', S' \rangle = 0$, where the inner product is
$$\langle f, g \rangle = \int_{x_0}^{x_n} f(x)g(x) \, dx.$$

(ii) Hence show that
$$\|v'\|^2 = \|v' - S'\|^2 + \|S'\|^2,$$
where $\|\cdot\|$ is the norm induced by the inner product.

**Note:** You may assume that $S \in H^1(x_0, x_n)$, and if $f, g \in H^1(x_0, x_n)$, then
$$\int_{x_0}^{x_n} f'(x)g'(x) \, dx = \sum_{k=1}^n \int_{x_{k-1}}^{x_k} f'(x)g'(x) \, dx.$$

**(5, 3 marks)**

> Since $\langle v'-S',S' \rangle = \sum_{k=1}^{n}\int _{x_{k-1}}^{x_{k}} (v'-S')S' \, dx$, we can take out $S'$ out front as a constant, as the derivative of a linear function is a constant. Then, I'm not going to do the calcs but we will have a integral evaluated at the knots which we are told are 0.

> To do this, add 0 to the LHS, i.e. $|| v - S' + S' ||^{2} = \langle v - S' + S', v - S' + S' \rangle$. Then we have $\langle v' - S', v' - S' \rangle + 2\langle v' - S', S' \rangle + \langle S',S' \rangle$. It follows then that the middle term will be 0 from part 1. Then the proof follows obviously.

## 3a

This question concerns the approximation of the following one-dimensional differential equation: $$ \begin{aligned} -u'' + a u' &= f \quad \text{in } (0, 1), \\ u(0) = u(1) &= 0, \end{aligned} \qquad (2) $$where $a$ is a positive constant. **(a)** Find a weak formulation for (2), specifying the appropriate space $V$, bilinear form $a(\cdot, \cdot)$, and linear functional $L(\cdot)$. Prove that the bilinear form $a(\cdot, \cdot)$ is elliptic in $V$. 
**(10 marks)**

> To do this, we get a test function $v \in V$, where $V \subset H_{0}^{1}$. Then, we multiply by $v$ and integrate to find the weak form.
> $$
\int _{0}^{1} -u''v + au'v \, dx = \int _{0}^{1} fv \, dx 
$$$$
=\int _{0}^{1}u'v' + au'v \, dx = \int _{0}^{1}fv \, dx
$$With the LHS being $a(.,.)$ and the RHS being $L(.)$. To show that it is elliptic, we need $a(v,v) \geq \alpha || v ||^{2}_{V}$. Let $v \in V$, then $a(v,v)=\int _{0}^{1} v'v' + a v'v \, dx$, $=\int _{0}^{1}v'^{2} \, dx + a \int _{0}^{1}v'v \, dx$. By the fact $v'v=\frac{d}{dx}v^{2}$, we get $a[v^{2}]_{0}^{1}$ which is 0. Hence we obtain $|| v' ||^{2}$ as our LHS. By Poincare's inequality, we know that $|| v' || \geq || v ||$, hence proven.

## 3b

Define a uniform mesh $0 = x_0 < x_1 < \dots < x_n < x_{n+1} = 1$, with $h = x_i - x_{i-1} = \frac{1}{n+1}$. Define the finite element space

$$V_h = \{v_h \in C([0, 1]) : v_h|_{[x_i, x_{i+1}]} \in \mathbb{P}_1 \text{ for all } i = 0, \dots, n, \, v_h(0) = v_h(1) = 0\},$$

and the standard "hat" basis functions $\phi_1, \dots, \phi_n$ characterised by $\phi_j(x_i) = \delta_{ij}$ for $i, j = 1, \dots, n$. Propose a finite element method based on the space $V_h$, and specify its associated matrix $\mathbb{A}$.

**(10 marks)**

> The FEM that solves this question would be $$
a(u_{h},v_{h})= \int _{0}^{1}fv_{h} \, dx 
$$With $u_{h} \in V_{h}$. Then, the stiffness matrix is given by $\mathcal{A} = (a(\phi _{j},\phi _{i}))_{i,j=1}^{n}$. Now we need to find the stiffness matrix $\mathcal{A}$. This will be tridiagonal with cases overlapping left or right neighbours, or itself. We note that we have to consider the diffusion (both $\phi$ are differentiated) and the convection cases ($\phi '\phi$), we consider the center, left and right neighbours.
  We have $\int_{0}^{1} \phi _{i-1}'\phi _{i}' \, dx=-\frac{1}{h}$. Note that this is symmetric hence we get the same result for $\phi _{i+1}$. We also have the center of the diffustion term as $\frac{h}{2}$. Then, $\int _{0}^{1} \phi _{i-1}'\phi _{i} \, dx=-\frac{a}{2}$. The center is 0, and the $\phi _{i+1}$ term becomes $\frac{a}{2}$.
  Putting this into the stiffness matrix, we get these results:
  $a_{i,i-1}=-\frac{1}{h}-\frac{a}{2}$.
  $a_{i,i}= \frac{h}{2}$
  $a_{i,i+1}= \frac{a}{2}-\frac{1}{h}$.
  NOTE these are kinda standard results so we have this:
  
| Term in PDE            | Weak Form Integral | Matrix Integral ($A_{ij}$) | Result (Uniform Mesh)                                                                                |
| ---------------------- | ------------------ | -------------------------- | ---------------------------------------------------------------------------------------------------- |
| **$-u''$ (Diffusion)** | $\int u' v' dx$    | $\int \phi_j' \phi_i' dx$  | **Center ($i,i$):** $\frac{2}{h}$<br>**Neighbors:** $-\frac{1}{h}$                                   |
| **$au'$ (Convection)** | $\int a u' v dx$   | $a \int \phi_j' \phi_i dx$ | **Center ($i,i$):** $0$<br>**Left ($i,i-1$):** $-\frac{a}{2}$<br>**Right ($i,i+1$):** $+\frac{a}{2}$ |
| **$cu$ (Reaction)**    | $\int c u v dx$    | $c \int \phi_j \phi_i dx$  | **Center ($i,i$):** $\frac{2ch}{3}$<br>**Neighbors:** $\frac{ch}{6}$                                 |

## 4

Let $\Omega \subseteq \mathbb{R}^2$. Define a mesh $\mathcal{T}_h$ in $\Omega$ and define the standard spaces used in lectures (i.e., continuous piecewise linear functions). In the mesh $\mathcal{T}_h$ there are two elements $K_1, K_2$ sharing the nodes $x_i$ and $x_j$. In addition to these two nodes, $K_1$ contains the node $x_k$ and $K_2$ contains the node $x_\ell$. The coordinates for these nodes are

$$
\begin{array}{c|cc}
 & x & y \\
\hline
x_i & \frac{1}{2} & 0 \\
x_j & \frac{1}{2} & 1 \\
x_k & 0 & 0 \\
x_\ell & 1 & 1
\end{array}
$$

Compute the integrals

$$
\int_\Omega \nabla \phi_j \cdot \nabla \phi_i \, \mathrm{d}x \quad \text{and} \quad \int_\Omega \phi_j \cdot \phi_i \, \mathrm{d}x.
$$

**Hint:** The formula for the gradient of the basis function associated with the node $x_i$ in the element $K$ is given by

$$
\nabla \phi_i^K = -\frac{|E_i^K|}{2|K|} n_i^K,
$$

where $E_i^K$ is the edge of $K$ opposite to the node $x_i$ and $n_i^K$ is the unit normal vector to $E_i^K$.
In addition, to compute the second integral, the following quadrature rule might be useful

$$
\int_K f(x) \mathrm{d}x \approx \frac{|K|}{3} \big(f(m_1) + f(m_2) + f(m_3)\big),
$$

where $m_1, m_2, m_3$ are the mid-points of the edges of $K$.

**(10 marks)**

> Here, it is helpful to draw these triangles:
```tikz
\begin{document}
\begin{tikzpicture}[scale=7] % Increased scale from 4 to 7 for a much larger image
    % 1. Define the coordinates
    \coordinate (xk) at (0,0);     % Node k
    \coordinate (xi) at (0.5,0);   % Node i
    \coordinate (xj) at (0.5,1);   % Node j
    \coordinate (xl) at (1,1);     % Node l

    % 2. Draw the elements (triangles) with thick lines
    % K1: connected by k, i, j
    \draw[fill=blue!10, line width=1.5pt] (xk) -- (xi) -- (xj) -- cycle;
    
    % K2: connected by i, l, j
    \draw[fill=red!10, line width=1.5pt] (xi) -- (xl) -- (xj) -- cycle;

    % 3. Add labels for the nodes with larger font
    \node[below left, font=\large] at (xk) {$x_k (0,0)$};
    \node[below, font=\large]      at (xi) {$x_i (0.5,0)$};
    \node[above, font=\large]      at (xj) {$x_j (0.5,1)$};
    \node[above right, font=\large] at (xl) {$x_\ell (1,1)$};

    % 4. Label the Elements in the center with a very large font
    \node[font=\Huge, color=blue] at (0.35, 0.4) {$K_1$}; \node[font=\Huge, color=red] at (0.65, 0.6) {$K_2$};


\end{tikzpicture}
\end{document}
```
> We cant integrate over the whole domain $\Omega$ at once, hence we will integrate over $K_{1}$, $K_{2}$ in pieces. We will use $\nabla \phi _{i}^{K}= - \frac{|E_{i}^{K}|}{2|K|}n_{i}^{K}$, where $n_{i}^{K}$ is the normal of each $\phi _{i}^{K}$. Here we need:
> $n_{i}^{K_{1}}=\frac{\begin{pmatrix}0&1 \\ - 1&0\end{pmatrix}\begin{pmatrix}-0.5\\-1\end{pmatrix}}{\sqrt{ 1 + \frac{1}{4} }} = \begin{pmatrix}-\frac{2}{\sqrt{ 5 }}\\ \frac{1}{\sqrt{ 5 }}\end{pmatrix}$
> $n_{i}^{K_{2}}= \begin{pmatrix}0 \\ 1\end{pmatrix}$
> $n_{j}^{K_{1}}= \begin{pmatrix} 0 \\ -1\end{pmatrix}$
> $n_{j}^{K_{2}}= \begin{pmatrix} \frac{2}{\sqrt{ 5 }} \\ -\frac{1}{\sqrt{ 5 }}\end{pmatrix}$
> Then, we need to find the size of each triangle, which clearly is $\frac{1}{4}$ for both triangles. Finally we need the size of each edge $E_{i}^{K}$ which is the edge opposite of the node $x_{i}$ on that triangle. $|E_{i}^{K_{1}}|=\frac{\sqrt{ 5 }}{2}$, $|E_{i}^{K_{2}}|=\frac{1}{2}$, $|E_{j}^{K_{1}}|= \frac{1}{2}$ and $|E_{j}^{K_{2}}|= \frac{\sqrt{ 5 }}{2}$. So, putting this together we get:
> $$
\nabla \phi _{i}^{K_{1}}= - \frac{\left( \frac{\sqrt{ 5 }}{2} \right)}{\frac{1}{2}} \begin{pmatrix}
-\frac{2}{\sqrt{ 5 }}  \\
\frac{1}{\sqrt{ 5 }}
\end{pmatrix}= \begin{pmatrix}
2 \\
-1
\end{pmatrix}
    $$Skipping the rest of the algebra cause its the exact same and just tedious. Finally you take the sum of each integral ($\int _{K_{1}} \, dx + \int _{K_{2}} \, dx$) with the correct grads in them and we get $-\frac{1}{2}$.

## 5a

Let $\mathcal{S}_X$ be the set of cubic splines with respect to the knot sequence $X = [x_0, x_1, \dots, x_n]$. The natural cubic spline $S \in \mathcal{S}_X$ which interpolates the data $\{y_k\}_{k=0}^n$ at the knots in $X$ is given by

$$
\begin{aligned}
S(x) = &\left( \frac{y_{k-1}}{h_k} - \frac{z_{k-1}h_k}{6} \right)(x_k - x) + \left( \frac{y_k}{h_k} - \frac{z_k h_k}{6} \right)(x - x_{k-1}) \\
&+ \frac{z_{k-1}}{6h_k}(x_k - x)^3 + \frac{z_k}{6h_k}(x - x_{k-1})^3 \quad \text{for } x \in [x_{k-1}, x_k]
\end{aligned}
$$

where $h_k = x_k - x_{k-1}$ and the values $z_k = S''(x_k)$ satisfy the system of equations

$$
h_k z_{k-1} + 2(h_k + h_{k+1})z_k + h_{k+1} z_{k+1} = 6 \left( \frac{y_{k+1} - y_k}{h_{k+1}} + \frac{y_{k-1} - y_k}{h_k} \right) \quad \text{for } k = 1, \dots, n-1.
$$

Use these formulae to construct the natural cubic spline $S(x)$ which satisfies $S(-2) = -1, S(0) = -5$ and $S(1) = 5$.

**(10 marks)**

> Here we have the following given: 
> $x_{1}=-2, x_{2}=0,x_{3}=1$
> $y_{1}=-1,y_{2}=-5,y_{3}=5$.
> $h_{0}=2,h_{1}=1$
> Since we are asked to find the natural spline we are also given $z_{1} = z_{3} = 0$. Then, we only need to find $z_{2}$. To do this we will use the given formula:
> $$
2 (2 + 1)z_{2}= 6 \left( \frac{5-(-5)}{1} + \frac{-1 - (-5)}{2}\right )
$$
$$
z_{2}= 12
$$
> The rest is just subbing into the given formula twice, free 10 marks.

## 5b

The reference triangle $\mathcal{T}$ has nodes $(\xi_1, \eta_1) = (0,0)$, $(\xi_2, \eta_2) = (1,0)$ and $(\xi_3, \eta_3) = (0,1)$, and the triangle $T$ in the $(x, y)$-plane has nodes $r_1 = (2, 3)$, $r_2 = (5, 2)$ and $r_3 = (3, 3)$.

(i) Find an affine map $F : \mathcal{T} \to T$ for which $F(\xi_i, \eta_i) = r_i$ for $i = 1, 2, 3$.

(ii) Find the inverse map $F^{-1} : T \to \mathcal{T}$.

(iii) Find the linear interpolant on $T$ of the function $u(x, y)$ whose corner values are $u(x_1, y_1) = 2$, $u(x_2, y_2) = -2$ and $u(x_3, y_3) = 1$.

**Hint:** the affine basis functions for $\mathcal{T}$ are $\Phi_1(\xi, \eta) = 1 - \xi - \eta$, $\Phi_2(\xi, \eta) = \xi$ and $\Phi_3(\xi, \eta) = \eta$.

**(4, 3, 3 marks)**

> To find the mapping of $F$ we do:
> $$
F(\xi,\eta)= (1-\xi -\eta)r_{1} + \xi r_{2} + \eta r_{3}
$$$$
= \begin{pmatrix}
2 - 2 \xi - 2 \eta + 5\xi + 3\eta \\
3 - 3\xi - 3 \eta + 2 \xi + 3 \eta
\end{pmatrix}
$$$$
=\begin{pmatrix}
2+3\xi +\eta \\
3 -\xi
\end{pmatrix}

$$Then, it follows that if $x = 2 + 3\xi + \eta$ and $y = 3 - \xi$, then $\xi = 3 - y$. From this, $\eta = x + 3y -  11$. To find the interpolant, we use the inverse map. We have $2\Phi_{1} - 2\Phi_{2} + \Phi_{3}$. This is $2 - 2\xi - 2\eta - 2\xi + \eta$
$=2 - 4\xi - \eta$ Then doing our substitution:
$$
2 - 4(3-y) - x - 3y + 11 = 1- x + y
$$.

