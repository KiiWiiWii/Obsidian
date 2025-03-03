
## Fixed point iteration

#### Background - Intermediate value theorem

If you have some continuous function evaluated at $(a,b)$, and $f(a)<y<f(b)$ then there exists some $c \in (a,b)$, such that $f(c) = y$. Moreover, if $f(a)<0 \ \ \ \ f(b) > 0$, then there is some $c \ \ s.t. \ \ f(c) = 0$.

#### Fixed point method

Instead of working with some problem in the form:

Find $\alpha$

$$
f(\alpha) = 0
$$

We can instead do 

Find $\alpha$
$$
g(\alpha) = \alpha
$$
Here $\alpha$ is a fixed point of $g$.

Generic Iteration:
$$
x_{n+1} = g(x_{n}) \ \ \ \ \ \ \forall n \geq 0
$$
#### Example

Find $\alpha$ $$
f(\alpha) = x^{2} - 5 = 0
$$

There are many ways we can change this into out generic iteration form:


a) $g_{1}(x)$

$$
x^{2} - 5 = 0
$$
Adding $x$ on both sides

$$
x^{2} + x - 5 = x
$$
The L.H.S. is our $g_{1}(x)$.

b)$$
x^{2} - 5 = 0
$$
$$
\iff x^{2} = 5
$$
$$
\iff x = \frac{5}{x}
$$
With the R.H.S. being $g_{2}(x)$.

c)

$$
x^{2}-5=0
$$
$$
\iff 5 -x^{2} = 0
$$
Adding $2x^{2}$ to both sides:
$$
\iff 5 + x^{2} = 2x^{2}
$$
$$
\frac{1}{2}\left( x + \frac{5}{x} \right) = x
$$
With the L.H.S. being $g_{3}(x)$.

The reason we went through so many different forms is cause they can lead to diff answers
![[Pasted image 20250303142750.png]]

#### Proof for lemma 4.2

- $g([a,b]) \in [a,b]$, $g$ is continuous
- $\implies \exists x$ at least one s.t. $x = g(x)$
$$
a \leq g(x) \leq b \forall x \in[a,b]
$$
$$
\implies g(0) - a \geq 0
$$
and $$
g(b) - b \leq 0
$$
if $h(x) = g(x - x)$
$$
\implies h(0) \geq 0, h(0) \leq 0
$$
From the intermediate value theorem
$$
\exists c \in(a,b) \ \ \ \ h (c) e
$$