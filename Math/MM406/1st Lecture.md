
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
Let $C[a,b]$ be a set of continuous functions on $[a,b]$, (sketch in the written notes) (this example isn't actually done however)

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
(\alpha v)(x) = \alpha v(x) = \alpha (v_{0} + v_{1}x +\dots + v_{n}x^{n})
$$
Since $\alpha$ is a real number the product of these will also be a real number in our vector space.

Now to show that a zero element exists:
$$
u + \underline{0} = u
$$
i.e. $u(x) + \underline{0}(x) = u(x)$, clearly this is just a up-to-n degree polynomial with all coefficients being 0, hence exists a zero element in this space.

# Linear Independence

#### Example 1.2
###### a)
Suppose $c_{1}\phi_{1}+c_{2}\phi_{2}+c_{3}\phi_{3}= \underline{0}$, where
 $$
\phi_{1}(x) = x + 1, \phi_{2}(x) = x - 1, \phi_{2}(x)=x^{2}+1
$$

So we need 
$$
c_{1} -c_{2} + c_{3} + (c_{1}+c_{2})x + c_{3}x^{2} \equiv_{0}
$$
This is a quadratic so at most there are 2 roots.
So must have:
$$
c_{1} - c_{2} + c_{3} =0
$$
$$
c_{1}+c_{2} =0
$$
$$
c_{3} = 0
$$
So we get by subbing 3 into 1 
$$
c_{1}=0, c_{2} =0
$$
So it is LI.
##### b)

There's another example in the handwritten notes but my stupid fucking computer locked me out so i didn't get to copy it

# Basis

A basis for a linear space $V$ is a LI set of functions in V such that nay element of V can be written as a linear combination of the $v_{i}$.

#### Example 1.3.

$$
v_{1} = 1, v_{2} = x, v_{3} = x^{2}
$$
Show it is LI

$$
c_{1} + c_{2}x + c_{3}x^{2} \equiv 0 
$$
so $c_{1},c_{2},c_{3} = 0$ hence it is LI

Let $u(x) \in \mathbb{R} \implies u(x)=u_{0}+u_{1}x +u_{2}x^{2}$ where $u_{i} \in \mathbb{R}$.
$$
u(x) = u_{0}v_{1} + u_{1}v_{2} + u_{2}v_{3}
$$
So we can write any $u(x) \in \mathbb{R}$ as a linear combination of $v_{1},v_{2},v_{3}$.

$$
u_{0} + u_{1}x + u_{2}x^{2}
$$
in terms of $\alpha_{i}$. We can use a shortcut:

We found a basis with 3 elements $(1,x,x^{2})$. (result that says any LI set with same number of elements will be a basis)

So yes, ${\phi_{1},\phi_{2},\phi_{3}}$ is LI.


-- I kinda zoned out for a while so im missing the notes on dimension of a space --

# Norms

The norm of some element $v \in V$ : write as $|| v ||$.
![[Pasted image 20250923102446.png]]

