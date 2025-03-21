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
y_{n+j} = y(t^{*}) + \theta_{t,j}(h) \ \ \ \ \forall j = 0,\dots,k
$$
Where $\theta_{t,j} \to 0$ ad $h \to 0$.
