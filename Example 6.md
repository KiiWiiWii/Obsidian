This example is a simple IVP, $$
\frac{dy}{dx} = y
$$
where $y(0) = A, a \in \mathbb{R}$.

If we were to solve this using normal methods, we would quickly find that $\frac{dy}{dx} - y =0$, so our axillary equation would be $m-1 = 0$, and our complimentary function would be $y = Be^x$. Subbing in $y(0) = A$, we get the general solution of $y= Ae^x$.

Let us assume that $y$ can be represented by a Maclaurin series. We need to find the $r^{th}$ derivative for each $y^r(0)$. We already know from the IVP that $y(0) = A$, and additionally each $y^r(0)$ is also $A$.