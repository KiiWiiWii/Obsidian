#### Order of convergence

We suppose $\exists \text{constants c and p}$ such that the error of the method satisfies
$$
||e_{r}||_{\infty} = \max\limits_{1 \leq n \leq N} |e_{n}| \approx Ch^{p}
$$
If we assume that we compare the errors of two discretisations one with $N$ points and one with  $\frac{N}{2}$ points then we will have:

$$
\frac{\max\limits_{1\leq n\leq \frac{N}{2}}|e_{n}|}{\max\limits_{1\leq n\leq N}|e_{n}|} \approx \frac{C(2h^{p})}{C(h)^{p}} = 2^{p}
$$
Taking log to both sides we obtain
$$
\tilde{P}_{n} = \frac{1}{\ln (2)}\ln (\frac{\max\limits_{1\leq n\leq \frac{N}{2}}|e_{n}|}{\max\limits_{1\leq n\leq N}|e_{n}|})
$$
#### Standard for of linear multi-step methods

$$
\sum_{j = 0}^{k} \alpha_{j}y_{n+1} = h \sum_{j = 0} ^{ k} \beta_{j}f_{n+j}
$$

Without loss of generality we assume $\alpha_{k} = 1$.