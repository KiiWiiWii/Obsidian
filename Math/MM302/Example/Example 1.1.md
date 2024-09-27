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
\sum_{n=1}^\infty n! x^n
$$
Using the ratio test to find $R$ again with our coefficient $n!$;

$$
\lim_{ n \to \infty } |{\frac{a_{n}}{a_{n+1}}}|
$$
$$
= \lim_{ n \to \infty } \lim_{ n \to \infty } \frac{n!}{(n+1)!}

$$
