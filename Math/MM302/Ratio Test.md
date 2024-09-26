Let $$
\sum_{n=0}^\infty a_{n}(x-x_{0})^n
$$
be a power series where $a_{0} \neq 0$. For a fixed $x$, we can use the limit of the ratio of the next term over the last term to find $R$.$$
\lim_{ n \to \infty } |\frac{a_{n+1}(x-x_{0})^{n+1}}{a_{n}(x-x_{0})^n}| = L | x-x_{0}|
$$
This will converge if $|x-x_{0}| < \frac{1}{L} = R$, Otherwise it'll diverge.

_note that this is a lot worse looking than it is to use it. It looks complicated just so that mathematicians can feel all cool using it, but a better convergence ratio test can be found in [[Theorem 2]]._

