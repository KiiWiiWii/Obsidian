Find the 2 [[Linear Independence]] solutions in powers of [[Legendres Equation]] with $\alpha = 2$. Consider $$
(1-x^{2})y'' - 2xy'+6y = 0, \ \ |x| < 1
$$
Putting this into [[Normalized Form]] with $a_{2} = (1-x^{2})$,$$
y'' - \frac{2}{1-x^{2}}y' + \frac{6}{1-x^{2}}y = 0
$$ 
With our $p(x), q(x)$ being $\frac{2}{1-x^{2}}, \frac{6}{1-x^{2}}$. Here, we can see that both $p,q$ are analytic near $x=0$ and hence we will choose $x_{0} =0$ as our ordinary point. Using the [[Method of undetermined coefficients]], we will now assume a solution exists in the form $$
y(x) = \sum_{r=0}^\infty a_{r}x^r
$$
Then,$$
y'(x) = \sum_{r=1}^\infty a_{r}rx^{r-1}
$$
and $$
y''(x) = \sum_{r=2}^\infty a_{r}r(r-1)x^{r-2}
$$
Now we can sub this back into the ode:
$$
(1-x^{2})[ \sum_{r=2}^\infty a_{r}r(r-1)x^{r-2}] - 2x [\sum_{r=1}^\infty a_{r}rx^{r-1}] + 6[\sum_{r=0}^\infty a_{r}x^r] = 0
$$
Now we can multiply out the leading terms with the sum:
$$
\sum_{r=2}^\infty a_{r}r(r-1)x^{r-2} - \sum_{r=2}^\infty a_{r}r(r-1)x^r - \sum_{r=2}^\infty a_{r}r(r-1)x^r + \sum_{r=2}^\infty 6arx^r = 0
$$
Notice that all the sums bar the 1st one have an $x^r$ term. We can change the index of our first sum, letting $p=r-2$, and combine the rest of sums into one:
