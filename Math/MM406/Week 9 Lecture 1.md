
# Chapter 3: 2D

The PDE we will be looking at is as follows:
![[Pasted image 20251118100850.png]]

The most used boundary condition is $u(\underline{x}) =0$ where $\underline{x} \in \Gamma$.

$$
D = \begin{pmatrix}
d_{11} & d_{12} \\
d_{21} & d_{22}
\end{pmatrix}
$$
Which in most cases is symmetric, and 

### Example:

$$
D = Id = \begin{pmatrix}
 1  &  0 \\
0 & 1 
\end{pmatrix}
$$
then 
$$
D \nabla u = \begin{pmatrix}
1 & 0 \\
0 & 1
\end{pmatrix}\nabla u = \nabla u
$$

So then

$$
dv = ( D \nabla u) = dv ( I\nabla u) = div(\nabla u)
$$
$$
= \partial x(\partial xu) + \partial y(\partial yu) = \Delta u
$$
### Example 13

$$
D = \begin{pmatrix}
1 - M^{2} & 0 \\
0 & 1
\end{pmatrix}
$$
$$
D\nabla u = ( 1 - M^{2})\partial xu+\partial yu
$$
$$
\implies div(D\nabla u) = (1 - M^{2}) \partial x x u + \partial y y u
$$
Note that $(1-M^{2})>0$.

### Boundary Value Problem

$$
- dv(D\nabla u) = f \text{ in } \Omega
$$
$$
u =0 \text{ on } \Gamma
$$
We will first define conditions on $\Omega$:

We will assume that $\Omega$ is open, bounded, and with a polynomial Boundary.

The main quality is that we can define a unique boundary norm.

To find the weak form, we will multiply out BVP by $v \in H^{1}_{0}(\Omega)$ and then integrate over $\Omega$ to get:
$$
- \int _{\Omega}dv ( D\nabla u)v \, dx = \int _{\Omega} fv \, dx 
$$
We want to pass at least one derivative to the test function so we can weaken the conditions on u.

![[Pasted image 20251118104151.png]]
`Seriously what the fuck is this`

using greens formula our integral turns into

$$
= - \int _{\Omega} ( D \nabla u) . \nabla v \, dx + \int _{\Gamma} ( D \nabla u) . \underline{n}dv \, ds
$$
$$
\implies \int  _{\Omega} (D \nabla u). \nabla v \, dx - \int _{\Gamma} (D \nabla u) . \underline{n}v \, ds = \int _{\Omega} fv \, dx 
$$
Because we get that v is $=0$, our $\Gamma$ integral turns to 0 since $v|_{\Gamma} = 0$.

So the weak from is Find $u \in H^{1}_{0}(\Omega)$ such that
$$
\boxed{\int _{\Omega} (D \nabla u). \nabla v \, dx = \int _{ \Omega} fv \, dx \text{ }\ \ \  \ \forall v \in H^{1}_{0}(\Omega)}
$$

### Example 15
![[Pasted image 20251118105105.png]]

$$
D = \begin{pmatrix}
k & 0 \\
0 & k
\end{pmatrix}
$$
Here
$$
(D \nabla u) = \begin{pmatrix}
k & 0 \\
0 & k
\end{pmatrix} \begin{pmatrix}
\partial x & u \\
\partial x & v
\end{pmatrix} = k \nabla u
$$
So the weak form is, find $u \in H_{0}^{1}(\Omega)$ such that
$$
\int _{\Omega} k(x) \nabla u \times \nabla v \, dx = \int _{\Omega} fv \, dx  \forall  v \in H_{0}^{1}(\Omega)
$$
$\square$

![[Pasted image 20251118105822.png]]

![[Pasted image 20251118111420.png]]

The basis $\phi_{i}$ will be the $x_{i}$ that are not on the edge, $\notin \Gamma$

The FEM for 2D is the exact same process that it is in 1D

![[Pasted image 20251118112200.png]]

Each node can only see its neighbors, hence for points that are far away we get that $a_{ij} = 0$, if they are not part of the same element, i.e. they have an edge between each other.

