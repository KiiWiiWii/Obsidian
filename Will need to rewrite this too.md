# Phase plane analysis

Just check the notes the lecturer wrote : [[4_MM302_phase-plane.pdf]].

---
# Example 2.3

In [[4_MM302_phase-plane.pdf]].

### steps:
1. Find the GS
2. Find the critical point(s).
3. Plot different values of $c_{1}$ and $c_{2}$.
4. Find which Eigenvalue is dominant by seeing what happens as $t \to \infty$.
5. See what Eigenvalue is dominant as $t \to -\infty$.
6. Plot the lines with arbitrary $c_{1}$ and $c_{2}$ as $t \to \pm\infty$.
7. 

We can see that $\underline{x} =\begin{pmatrix}0\\0\end{pmatrix}$ is going to be a critical point.

To show that it is the only critical point we can show that $\det (a)$ is not singular.

$$
\det(a) = \begin{vmatrix}
5 & 2  \\
3 & 4
\end{vmatrix} = 20 - 6 = 14
$$

# Exam question

$\underline{\dot{x}} = A\underline{x}$ where $$
A = \begin{bmatrix}
3 & 2 \\
6 & -1 
\end{bmatrix}
$$
a) Find the two eigenvalues and associated eigenvectors for the matrix $A$ and hence write down the GS to he Linear system.

$\det(A-\lambda I) = 0$ $$
\begin{vmatrix}
3 - \lambda  &  2  \\
6  & - 1  - \lambda
\end{vmatrix} = 0
$$
$$
(3 - \lambda) (- 1 - \lambda) - 12 = 0
$$
$$
\lambda^{2} - 2 \lambda - 15 = 0
$$
$$
(\lambda + 3) ( \lambda - 5 )= 0
$$
so $\lambda = - 3,$