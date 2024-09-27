This example is using the ratio test for an even series:
$$
\sum_{n=0}^\infty \frac{x^{2n}}{(2n)!}
$$
Our coefficient is $\frac{1}{(2n)!}$, so we can find:
$$
R = \lim_{ n \to \infty } |\frac{a_{2n}}{a_{2n+2}}|
$$$$
= \lim_{ n \to \infty } \frac{\left( \frac{1}{(2n)!} \right)}{\frac{1}{(2n+2)!}}
$$$$
= \lim_{ n \to \infty } \frac{(2n + 2)!}{(2n)!}
$$
Which is equivalent to $\infty$. It follows that $|x| < \sqrt{ R }$,  and so $\forall x \in \mathbb{R}$.
