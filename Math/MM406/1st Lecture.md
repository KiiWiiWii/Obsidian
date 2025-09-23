
Need to get the first few points from the first page of the handwritten pages

# Properties of a vector space
### Zero Element

$$
\underline{0} \in V
$$
Such that $$
\underline{0} + u = u = u + \underline{0}
$$
Note, If $u \in V$ then $0u= \underline{0}$. Basically just like 0 normally just as a element of a vector

### Inverse Element

If $u \in V$, then $\exists u^{-}$ with $u + u ^{-} = \underline{0}$.
Note $u^{-} = (-1)u$ Because from the axiom $$
(\alpha + \beta)u = \alpha u + \beta u
$$
Follows
$$
(1 +(-1))u= 1\times u + (-1)u
$$
Since $1 + -1 = 0$ then this proves the statement.

### Example 1.1

Show that the following are vector spaces

##### 1.

$$
V = \mathbb{R}^{n}
$$
Looking at properties 1 and 2 from definition 1.1 
$$
\underline{u}, \underline{v} \in \mathbb{R}^{n}
$$
$$
\implies \underline{u} = (u_{1}, u_{2}, \dots, u_{n})
$$
$$
\underline{v} = (v_{1},v_{2},\dots,v_{n})
$$
We need to show that $u + v$ and $\alpha u, \alpha v$ are in the space.
$$
\underline{u} + \underline{v} = (u_{1}+v_{1}, u_{2}+v_{2},\dots,u_{n}+v_{n})
$$
Since $u_{i},v_{i} \in \mathbb{R}$, the addition of u and v is also in our vector space.
$$
\alpha \underline{v}=(\alpha v_{1},\alpha v_{2},\dots,\alpha v_{n})
$$
Since this is the product of real numbers this is also in our vector space, same goes for u.

Finally we need to prove there exists a zero element, this is literally just 0 ($\underline{0} = (0_{1},0_{2},\dots,0_{n})$) so it is satisfied.
##### 2.
Let $C[a,b]$ be a set of continuous functions on $[a,b]$, (sketch in the written notes)

##### 3.
Show that the set $p_{n}$ of all polynomials of degree less than or equal to $n$.

$$
V = P_{n}[x] = {a_{0} + a_{1}x + a_{2}x^{2} +\dots + a_{n}x^{n}}
$$
$a_{i} \in \mathbb{R}$

$$
u,v \in P_{n} \ \ \ \ \ , \alpha \in \mathbb{R}
$$
$$
u(x) = u_{0} + u_{1}x +\dots u_{n}x^{n}
$$
(same thing for v as n)

$$
(u + v)(x) = u(x) + v(x) = u_{0} + v_{0} + (u_{1}+v_{1})x + \dots + (u_{n}+v_{n})x^{n}
$$
Since the sum of all u and v is a real number then this exists in our vector space $P_{n}$.

$$
(\alpha v)
$$