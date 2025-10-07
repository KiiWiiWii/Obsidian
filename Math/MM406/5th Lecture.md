First few minutes of the lecture are just covering page 15 of the notes.

Let $(\phi _{j})_{j=0}^{n}$ be an orrhogonal basis
$$
\langle \phi_{i},\phi _{j} \rangle = 0 \text{   if i != j}
$$
--- i zoned out copying this ---

#### Orthonormal definition defintion:

Basis $\underline{s}$ is orthogonal if each element has norm 1

$$
\langle \phi _{i},\phi _{j} \rangle  = 0 \ \ \ \text{i != j}
$$
$$
|| \phi _{i} || =1
$$
## Example 2.5

![[Pasted image 20251007092456.png]]

Inner prod here is
$$
\langle u,v \rangle = \int _{-1}^{1}u(x)v(x) \, dx
$$
If we can show that $\phi_{0},\phi_{1},\phi_{2}$ is orthogonal then they are linearly independent. There are 3 of them which would math the dimension of the space of $P_{2}$ so it must be a basis.

Need to show
$$
\text{(1) Orthogonal:  } \langle \phi_{0},\phi_{1} \rangle =0, \ \  \langle \phi_{0},\phi_{2} \rangle = 0 \text{ and } \langle \phi_{1},\phi_{2} \rangle =0
$$
$$
\text{(2) Each has Norm 1 } || \phi_{0} || = || \phi_{1} || = || \phi_{2} || = 1 
$$
We will only do some of these and the rest are left as exercise.

$$
\langle \phi_{0},\phi_{2} \rangle = \int_{-1}^{1} \phi_{0}(x)\phi_{2}(x) \, dx 
$$
$$
= \frac{1}{\sqrt{ 2 }} \sqrt{ \frac{5}{8} }\int_{-1}^{1}(3x^{2}-1)  \, dx 
$$
$$
= \frac{\sqrt{ 5 }}{4}[(x^{3}-x)]_{-1}^{1} = 0 \ \ \ \ \ \ \ \square
$$
Now to show the norm is 1:
$$
|| \phi_{1} ||^{2} = \langle \phi_{1},\phi_{1} \rangle = \int _{-1}^{1} \phi_{1}^{2} \, dx
$$
$$
= \frac{3}{2}\int _{-1}^{1} x^{2} \, dx
$$
$$
= \frac{3}{2} \left[ \frac{x^{3}}{3} \right]_{-1}^{1} = \frac{1}{2}(1 - - 1) = 1  \ \ \ \ \ \ \square
$$
Hence all conditions are met, therefore it is a orthogonal basis.

## Example 2.6

![[Pasted image 20251007093417.png]]

$$
|| u-a^{\star} ||^{2} = \langle u-a^{\star}, u - a ^{ \star} \rangle
$$
$$
= \langle u, u - a ^{ \star} \rangle  - \langle a^{\star}, u - a ^{ \star} \rangle
$$
$$
= \langle u,u \rangle - \langle u, a ^{ \star} \rangle - \langle a^{\star},a \rangle + \langle a^{\star},a^{\star} \rangle
$$
$$
= || u || ^{2} - 2 \langle u,a^{\star} \rangle + \langle a ^{ \star}, a ^{ \star} \rangle
$$
Basis is orthogonal, so $a^{\star} = \sum_{i=0}^{n}\langle u,\phi _{i} \rangle \phi_{i}$

 - $\langle u,a^{\star} \rangle = \sum_{i = 0}^{n} \langle u, \phi_{i} \rangle \langle u,\phi_{i} \rangle = \sum_{i=0}^{n}\langle u,\phi_{i} \rangle^{2}$


 - $\langle a^{\star},a^{\star} \rangle = \left\langle  \sum_{i=o}^{n} \langle u, \phi_{i} \rangle \phi_{i},\sum_{j=o}^{n}\langle u,\phi_{j} \rangle\phi_{j}  \right\rangle$
  $$
=\sum_{i=0}^{n}\langle u,\phi_{i} \rangle \langle \phi)i \rangle , \sum_{j=0} ^{n} \langle u,\phi_{j}\phi_{j} \rangle 
$$
$$
= \sum_{u=0}^{n}\langle u,\phi_{i} \rangle \sum_{j=0}^{1}\langle u,\phi_{j} \rangle \langle \phi_{i},\phi_{j} \rangle  
$$
But our basis is orthogonal hence $\langle \phi_{i,\phi_{j}} \rangle =0$ unless $j=i$.

$$
\implies \langle a^{\star},a^{\star} \rangle = \sum_{i=0}^{n} \langle u,\phi_{i} \rangle \langle u,\phi_{i} \rangle \langle \phi_{i},\phi_{i} \rangle 
$$
Basis is orthonormal, so $\langle \phi_{i},\phi_{i} \rangle =1$.
$$
\implies \langle a^{\star},a^{\star} \rangle = \sum_{i=0}^{1} \langle u,\phi_{i} \rangle ^{2}
$$
Had : $|| u-a^{\star} ||^{2}=|| u ||^{2}-2\langle du,a^{\star} \rangle + \langle a^{\star}, a^{\star} \rangle$ and $\langle u,a^{\star} \rangle = \sum_{i=0}^{n}\langle u,\phi_{i} \rangle^{2}$
$$
\implies || u - a ^{\star} || ^{2} = || u || ^{2} - \sum_{i=0}^{n} \langle u,\phi_{i} \rangle ^{2}
$$
$$
q=
$$