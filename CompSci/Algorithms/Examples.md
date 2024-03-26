Q: $Is: \     \ 4n^{3}+ 3n^{2}+ 10n + 2 = \mathcal{O}(n^{3})$
$$
\begin{flalign}
f(n) = 4n^{3}+ 3n^{2}+ 10n + 2 \\
g(n) = n^{3}  \\&&
 \\
4n^{3}+ 3n^{2}+ 10n + 2  \\
\leq 4n^{3}+ 3n^{3} + 10n^{3} + 2n^{3} && \forall n \geq 1 && \\
\leq 19n^{3} && \forall n \geq 1 
\end{flalign}
$$

Using $c=19$ and $n_{0}=1$,
$0 \leq f(n) \leq cg(n)$ for all $n \geq n_{0}$ 
and so  $\boldsymbol{4n^{3}+ 3n^{2}+ 10n + 2 = \mathcal{O}(n^3)}$


Q: Show $3n^{2}+ 5n + 1$ is in $\mathcal{O}(n^2)$

$$
\begin{flalign}
&& Let \ \ f(n) = 3n^{2}+ 5n + 1 \ \ \ \ a n d \ \ \ \ 
g(n) = n^{2}  \\ &&
0 \leq f(n)&& \forall n\geq 1 \\&&
f(n) = 3n^{2}+ 5n^{2}+n^{2}&& \forall n\geq 1 \\&&
\leq 9n^{2}&& \forall n\geq 1

\end{flalign}
$$
Using $c = 9$ and $n_{0} = 1$
we have $0 \leq f(n) \leq cg(n)$   $\forall n\geq n_{0}$
Hence $3n^{2}+ 5n + 1$ is in $\mathcal{O}(n^2)$


Q: Show $3n^{2}- 5n + 1$ is in $\mathcal{O}(n^2)$

Let $f(n) = 3n^{2}-5n+1$   and   $g(n) = n^2$

$$
\begin{align} \\
f(n) = 3n^{2}- 5n +1 \\
\leq 3n^{2}+ 0 + n^{2} && \forall n\geq 1 \\
\leq 4n^{2} && \forall n\geq 1  \\
\leq 4g(n) && \forall n\geq 1 \\ \\
\end{align} \\
$$
Also $0\leq 3n^{2}- 5n +1$    $\forall n\geq 2$
Using $c=4$ and $n_{0}=2$ (the numbers from earlier)
we have $0\leq f(n)\leq cg(n)$   $\forall n\geq 2$
Hence, $3n^{2}-5n + 1$ is in $\mathcal{O}(n^2)$


Q: Show $3n^2 +2n$ is in $\Omega(n^2)$

Let $f(n) = 3n^{2}+2n$  and $g(n)=n^2$

$$
\begin{align} \\
f(n) = 3n^{2}+2n  \\
\geq 3n^{2} && \forall n\geq 1 \\
= 3g(n) && \forall n\geq 1  \\
\end{align} \\
$$
Using $c=3$ and $n_{0}=1$
we have $0\leq cg(n) \leq f(n)$  $\forall n\geq n_{0}$

----- Alternatively ------

Let $f(n) = 3n^{2}+2n$  and  $g(n) = n^2$
Find a pair $c$ and $n_{0}$ s.t.
$$
\begin{align}
cg(n) \leq f(n) && \forall n\geq n_{0} \\
\implies cn^{2}\leq 3n^{2}+2n && \forall n\geq n_{0} \\
\implies c\leq 3+\frac{2}{n} && \forall n\geq n_{0} \\ 
\leq 3 && \forall n\geq 1 
\end{align}
$$
Using $c=3$ and $n_{0}=1$ (take $\lim_{ n \to \infty }(3+\frac{2}{n})$)
we have $0\leq cg(n)\leq f(n)$   $\forall n\geq n_{0}$



Q: Show that $n+2$ is in $\Theta(n)$

Let $f(n) = n+2$ and $g(n)=n$

$$
\begin{align} \\
f(n) = n+2 \\
\leq n+2n && \forall n\geq 1 \\
\leq 3n && \forall n\geq 1 \\
=3g(n)
\end{align}
$$
$0\leq f(n)\leq cg(n)$  $\forall n\geq n_{0}$ using $c=3$ and $n_{0}=1$
So $f(n) \in \mathcal{O}(g(n))$

$$
\begin{align}
f(n) = n+2 \\
\geq n && \forall n\geq 1 \\
=1*g(n)
\end{align}
$$
So $cg(n) \leq f(n)$  $\forall n\geq n_{0}$ using $c=1$ and $n_{0}=1$
So $f(n) \in \Omega(g(n))$
Since $f(n) \in \mathcal{O}(g(n))$ and $f(n) \in \Omega(g(n))$
then $f(n) \in \Theta(g(n))$


Q: Is $\mathcal{O}(4n^{2)}= \mathcal{O}(n^2)$

If $f(n) = \mathcal{O}(4n^2)$ then $\exists$positive constants $c$ and $n_{0}$ s.t. $0\leq f(n)\leq c*(4n^2)$  $\forall n\geq n_{0}$
$\implies 0 \leq f(n) \leq (4c)*n^2$   $\forall n\geq n_{0}$
4c is also a positive const.
$\implies f(n) = \mathcal{O}(n^2)$

i.e. $\mathcal{O}(4n^{2)}\subset \mathcal{O}(n^2)$
But need to prove

Function $f(n)=\mathcal{O}(n^2)$ $\exists$positive const. $c$ and $n_{0}$ s.t.
$0\leq f(n) \leq c*n^2$   $\forall n\geq n_{0}$
$\implies 0\leq f(n)\leq\left( \frac{1}{4} \right)c(4n^2)$    $\forall n\geq n_{0}$
($\frac{1}{4}c$ is a pos. const.)
$\implies f(n) = \mathcal{O}(4n^2)$
i.e. $\mathcal{O}(n^{2}) \subset \mathcal{O}(4n^2)$



Q: Are $\mathcal{O}(\log_{2}n)$ and $O(\log_{3}n)$ the same set?

$$
\begin{align} \\
\log_{2}n = \frac{\log_{3}n}{\log_{3}2} \\ \\
= \left( \frac{1}{\log_{3}2} \right)*\log_{3}n  \\
\end{align} \\
$$
If$f(n) = \mathcal{O}(\log_{2}n)$ then $\exists$positive const.s $c$ and $n_{0}$ s.t.
$$
\begin{align}
0\leq f(n) \leq c*\log_{2}n && \forall n\geq n_{0} \\
\implies 0\leq f(n) \leq c*\left( \frac{1}{\log_{3}2} \right)*\log_{3}n && \forall n\geq n_{0} \\
\implies f(n) = \mathcal{O}(\log_{3}n)
\end{align}
$$
c*$\left( \frac{1}{\log_{3}2} \right)$ is a pos. const.

This shows $O(\log_{2}n) \subset O(\log_{3}n)$

If $f(n) = O(\log_{3}n)$ then $\exists$pos. const. $c$ and $n_{0}$ s.t.
$$
\begin{align}
0\leq f(n) \leq c*\log_{3}n && \forall n\geq n_{0} \\
\implies 0 \leq f(n) \leq c*\left( \frac{1}{\log_{2}3} \right)*\log_{2}n && \forall n\geq n_{0} \\
\implies f(n) = \mathcal{O}(\log_{2}n)
\end{align}
$$
$c*\left( \frac{1}{\log_{2}3} \right)$ is a pos. const.

i.e. $\mathcal{O}(\log_{3}n) \subset \mathcal{O}(\log_{2}n)$

and since both subset of each other then $\mathcal{O}(\log_{2}n)$ and $\mathcal{O}(\log_{3}n)$ are the same set 