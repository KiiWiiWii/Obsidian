Find the (regular) single points of $$
(1-x^{2})y'' - 2xy' + y =0
$$
Here, our $a_{2}$ is $(1-x^{2})$, so let us put this in its [[Normalized Form]].$$
y'' - \frac{2x}{1-x^{2}}y' + \frac{1}{1-x^{2}} y = 0
$$
With our $p(x),q(x)$ being $\frac{2x}{1-x^{2}}, \ \frac{1}{1-x^{2}}$. For both of these, we can see that $x =\pm 1$ will cause trouble, so $x=\pm 1$ are our single points. Now, using [[Definition 7]] To find if they are regular or irregular. Let us consider $x=1$$$
(x-1)p(x) = (x-1) \left( \frac{2x}{(1-x)(1+x)} \right) = \frac{2x}{x+1}
$$
$$
(x-1)^{2}q(x) = (x-1)^{2}\left( \frac{1}{1-x^{2}} \right) = \frac{1-x}{1+x}
$$
Which are both [[Analytic Functions]] at $x=1$. So, $x_{0}= 1$ is a regular single point. 

Doing this for $x=-1$, (skipping the algebra), we also find that they are both analytic.