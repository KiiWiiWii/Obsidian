##### Convergence

![[Pasted image 20250321142142.png]]

\*holds for all $t_{n} \in [a,b]$*.

###### Consistency:

This is telling us if our numerical approximations are close enough to the exact solution.

Definition:

The multi-step method $$
\sum_{i = 0}^{k}\alpha_{j}y_{n+j}=h\sum_{j=0}^{k}\beta_{j}f(t_{n+j},y_{n+j})
$$
Is consistent if $T_{n+k}(h)\to 0$ when $h \to 0$

Now, we will look for a characterization of this definition in terms of $C_{0},C_{1},C_{2},\dots$ (error constants.)

Consider a fixed $t = t^{*}$ and we will assume that the k-step method converges to $y(t)$ as $h\to 0$ $$
y_{n+j} \to y(t^{*}) \ \ \ \ \ \forall j = 0,\dots k
$$
But this can be rewritten as: $$
y(t^{*}) = y_{n+j} + \theta_{t,j}(h)
$$
Where $\theta_{t,j} \to 0$ as $h \to 0$.

Multiplying by $\alpha_{j}$ and summing over $j$ $$
\sum_{j=0}^{k}\alpha_{k}y(t^{*}) = \sum_{j=0}^{k}\alpha_{j}y_{n+j} + \sum_{j=0}^{k}\alpha_{j}\theta_{t,j}(h)
$$ $$
y({t^{*}})\sum_{j=0}^{k}\alpha_{j} = h \times \sum_{j =0}^{k}\beta_{i}f_{n+j} + \sum_{j=0}^{k}\alpha_{j}\theta_{t,j}(h)
$$
If we take $h \to 0$, the RHS will tend to $0$, and $y(t^{*})\neq 0$, $$
C_{0} = \sum_{j=0}^{k} \alpha_{j} = 0
$$
We assume $$
\frac{y_{n+j}-y_{n}}{j\times h} \to y'(t^{*}) \ \ \ \ \ \forall j = 1,\dots,k
$$
$$
y_{n+j}-y_{n}=hjy'(t^{*})+jh\phi_{j}(h)
$$
Where $\phi_{j}(h) \to 0$ when $h \to 0$.

$$
\sum_{}^{}\alpha_{j}y_{n+j}-\sum\alpha_{j}y_{n} = hy'(t^{*})\sum j\alpha_{j} + h\sum j\alpha_{j}\phi (h)
$$
$$
h\sum\beta_{j}f_{n+j} - h y'(t^{*})\sum j \alpha_{j} = h \sum j \alpha_{i}\phi (h)
$$
$$
\sum\beta_{j}f_{n+j} -  y'(t^{*})\sum j \alpha_{j} =  \sum j \alpha_{i}\phi (h)
$$
Since $y_{n+j} \to y(t^{*})$ then $f_{n+j} \to y'(t^{*})$. $\implies f(t_{n+j},y_{n+j}) \to f(t^{*},y(t^{*}))$.

If we take $h \to 0$:
$$
\sum j\alpha_{j}-\sum \beta_{j} =0
$$