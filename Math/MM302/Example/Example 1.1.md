In this example we are using the ratio test to determine the [[Radius of Convergence]] of a given power series.

Let
$$
\sum_{n=0}^\infty \frac{1}{n!}x^n
$$
In this example our coefficient is $\frac{1}{n!}$.Taking the [[Ratio Test]] we find:$$
R=\lim_{ n \to \infty } |\frac{a_{n}}{a_{n+1}}|
$$
$$
= \lim_{ n \to \infty } {\frac{\frac{1}{n!}}{\frac{1}{(n+1)!}}}
$$
$$
=\lim_{ n \to \infty } \frac{(n+1)!}{n!}
$$
This limit evaluates to be $\infty$. Also note that as all our terms are positive we can drop the modulus signs. 

As our [[Ratio Test]] evaluates to be $\infty$, we can conclude that $R = \infty$, so the set will converge $\forall x\in \mathbb{R}$.

---
Now let:$$
\sum_{n=0}^\infty n! x^n
$$
Using the ratio test to find $R$ again with our coefficient $n!$;

$$
\lim_{ n \to \infty } |{\frac{a_{n}}{a_{n+1}}}|
$$
$$
= \lim_{ n \to \infty } \frac{n!}{(n+1)!}

$$
Which evaluates to $0$. $R=0$, and this power series will only converge for the trivial case where $x\equiv x_{0}$.

---
Let:
$$
\sum_{n=1}^\infty \frac{1}{n}x^n
$$
Using the ratio test:
$$
\lim_{ n \to \infty } | {\frac{a_{n}}{a_{n+1}}} |
$$
$$
= \lim_{ n \to \infty } \left( \frac{\frac{1}{n}}{\frac{1}{(n+1)}} \right) 
$$
$$
=\lim_{ n \to \infty } \frac{n+1}{n}
$$
Dividing through by our highest order term $n$,

$$
\implies \lim_{ n \to \infty } \left( 1+\frac{1}{n} \right)
$$