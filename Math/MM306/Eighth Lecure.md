
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

Lets find $\lambda$

$g_{1}(x)$:

$$
\lambda = \max\limits_{x\in[2,5]}|g_{1}'(x)| = \max\limits_{x\in[2,5]}|2x +1| = 11 >1
$$
$g_{2}(x)$:

$$
\lambda = \max\limits_{x\in[2,5]}|-\frac{5}{x^{2}}| = \frac{5}{4} > 1
$$
$g_{3} ( x)$:

$$
\lambda = \max\limits_{x\in[2,5]}| \frac{1}{2}\left( 1-\frac{5}{x^{2}} \right)| =\frac{2}{5} <1
$$

 #### Geometric Derivation

![[Pasted image 20250303150912.png]]
#### Proof for lemma 4.2

![[Pasted image 20250303144031.png]]

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
\exists c \in(a,b) \ \ \ \ h (c) = 0
$$
$$
g(c)-c = 0

$$
#### Definition : contraction

![[Pasted image 20250303144204.png]]

Basically if the function makes the difference between points lower ig

#### Lemma 4.3

![[Pasted image 20250303144344.png]]

We know from Lemma 4.2 that $x = g(x)$ has at least one solution.  
Now suppose $x = g(x)$ has two solutions $\alpha$ and $\beta$ in $[a, b]$. Then  

$$
|\alpha - \beta| = |g(\alpha) - g(\beta)| \leq \lambda |\alpha - \beta| \quad \text{(from (4.13))}
$$

$$
\Rightarrow (1 - \lambda)|\alpha - \beta| \leq 0.
$$

Since $0 < \lambda < 1$, this then implies that $\alpha = \beta$ and hence the solution is unique.  

To prove that the fixed point iteration converges for any $x_0 \in [a, b]$, we have  

$$
|x_{n+1} - \alpha| = |g(x_n) - g(\alpha)| \leq \lambda |x_n - \alpha|
$$

$$
\leq \lambda^2 |x_{n-1} - \alpha|
$$

$$
\leq \lambda^n |x_0 - \alpha|, \quad n \geq 0.
$$

As $n \to \infty$, $\lambda^n \to 0$ and hence $x_n \to \alpha$.  

Finally, to establish the error bound (4.14), we have  

$$
|\alpha - x_0| = |\alpha - x_1 + x_1 - x_0|
$$

$$
\leq |\alpha - x_1| + |x_1 - x_0|
$$

$$
\leq \lambda |\alpha - x_0| + |x_1 - x_0|.
$$

Thus,  

$$
|\alpha - x_0| \leq \frac{1}{1 - \lambda} |x_1 - x_0|.
$$

Since  

$$
|\alpha - x_n| \leq \lambda^n |\alpha - x_0| \leq \frac{\lambda^n}{1 - \lambda} |x_1 - x_0|,
$$

this finishes the proof.  


#### How to pick an auxiliary equation

Using the mean value theorem $$
g(x) - g(y) = g'(\xi)(x - y)
$$
$\xi$ lies between $x$ and $y$

$$
|g(x) - g(y)| = |g'(\xi)||x-y|
$$
$$
\leq \max\limits_{\xi\in[a,b]} |g'(\xi)||x-y|
$$

L.H.S. is our $\lambda$

