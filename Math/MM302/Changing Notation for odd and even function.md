When we want to apply the [[Ratio Test]] to an odd or even series, then we would run into the problem that every 2nd term would be 0 and we would get some division by 0 errors.

To avoid this, we change notation

$\sum_{n=0}^\infty a_{2n}x^2n$ will become $x \sum_{r=0}^\infty C_{r}W^r$, where $W=x^2$. Consequently, $|x| < \sqrt{ R }$. Simplifying this we just get that the radius of convergence for these series is for even functions: $$
|x| < \sqrt{ \lim_{ n \to \infty } \frac{a_{2n}}{a_{2n+2}} }
$$
And for odd functions:
$$
|x| < \sqrt{ \lim_{ n \to \infty } \frac{a_{2n+1}}{a_{2n+3}} }
$$

