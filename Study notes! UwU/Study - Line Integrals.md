Watching Kahn academy's video on line integrals.

Normally for 2 dimensions we use $\int_{a}^b F(x) \, dx$ where $dx$ is the infinitesimally small distance across the x-axis, and at each point calculated at a point $x, a\leq x\leq b$. 
To define a path we would do something like this:
$x=g(t), \,\,y=h(t)\,\,\,\,\,\,\, a\leq t\leq b$

As we increment over a -> b, this will trace over a path. If we introduce a new axis ($F(x,y)$), then we have a surface over our path. What we want to do with line integrals is to draw our line across $x,y$ up to the surface $F(x,y)$ using our parametrization $x=g(t),y=h(t)$.

Let's introduce our elements using our regular integral: instead of $dx$ we use $dS$ to define the small change along the surface. $F(x)$ goes to $F(x,y)$ and our limits on the integral will be $t=a,t=b$. Now we introduce:
$$
dS = \sqrt{dx^{2}+dy^{2}}
$$
What we end up with is:
$$
\int_{t=a}^{t=b} F(x,y) \, dS
$$
$$
\implies \int_{t=a}^{t=b} F(x,y) \, \sqrt{ dx^{2}+dy^{2} }
$$
Note that $x$ & $y$ will be evaluated at $t$. Using some fancy tricks, we can turn this $\sqrt{ dx^{2}+dy^{2} }$ into:
$$
\sqrt{ g'(t)^{2}+h'(t)^{2} }\,\,dt
$$
	That's about it for the theory, it's probably gonna be useless af but I am going onto the next video where we're doing an example.

---
### [Example 1]
Let $F(x,y) =xy$ where the base is defined by:
$x=\cos, t\,y=\sin, t\,0\leq t\leq \frac{\pi}{2}$.

First we want to take this integral:
$$
\int_{t=0}^{t=\pi/2} xy \, dS

$$
$$
\implies \int_{t=0}^{t=\pi/2} \cos t\sin t \, \sqrt{ (\frac{dx}{dt})^{2}+\left( \frac{dy}{dt} \right)^{2} } dt
$$
$$
\implies \int_{t=0}^{t=\pi/2} \cos t\sin t \, \sqrt{ (-\sin t)^2+(\cos t)^2 }dt 
$$
$$
\implies \int_{t=0}^{t=\pi/2} \cos t\sin t \, dt 
$$
Using $\sin ^{2}x+\cos ^{2}x=1$ in the pervious step. Now we can simply use u-substitution to solve this integral.
$$
\int_{u=0}^{u=1} u \, du
$$
$$
\implies\left[ \frac{u^2}{2} \right]_{0}^1
$$
$$
\implies \frac{1}{2}
$$
$$\tag*{$\blacksquare$}$$

---
### [Example 2]

Let $F(x,y)=x+y^{2}$, starting at $(2,0)$, traveling along a curve to reach $(0,2)$, going back to $(0,0)$ and then returning to $(2,0)$.

The surface area of these walls this creates is:
$$
\oint_{c}^{} (x+y^{2}) \, dS
$$
	The 'o' around the integral just means it's a closed path.
$$
x=2\cos t
$$
$$
y=2\sin t\,\,0\leq t\leq\frac{\pi}{2}
$$
Now we find the derivatives.
$$
\frac{dx}{dt} =-2\sin t
$$
$$
\frac{dy}{dt}=2\cos t
$$
So now our integral is:
$$
\int_{0}^{\pi/2} (x+y^{2}) \, \sqrt{ (-2\sin t)^{2}+(2\cos t)^{2} }dt 
$$
$$
\implies \int_{0}^{\pi/2} 2\cos t+(2\sin t)^{2} \, \sqrt{ (-2\sin t)^{2}+(2\cos t)^{2} }dt
$$
$$
\implies \int_{0}^{\pi/2} 2\cos t+(2\sin t)^{2} \, 2dt
$$
$$
\implies\int_{0}^{\pi/2} 4\cos t+8\sin ^{2}t \, dt 
$$
Now we use the identity $\sin ^{2}t=\frac{1}{2}(1-\cos 2t)$.
$$
\int_{0}^{\pi/2} (4\cos t+4(1-\cos 2t)) \, dt 

$$
Simply now taking this integral:
$$
[4\sin t+4t-2\sin 2t]_{0}^{\pi/2}
$$
$$
\implies 4\sin \frac{\pi}{2}+2\pi-2\sin \pi-(0)
$$
$$
\implies 4+2\pi
$$
This completes our first curve. Now doing the curve along the y-axis. Let's parametrize for this curve. $x=0$, and $y=2-t$, $0\leq t\leq 2$.

So, $\frac{dx}{dt} = 0$ and $\frac{dy}{dt}=-1$.

$$
\int_{0}^{2} x+y^{2} \, \sqrt{ 0^{2}+ -1^{2} }dt
$$
$$
\implies \int_{0}^{2} (2-t)^{2} \, dt 
$$
$$
\implies \int_{0}^{2} (4-4t+t^{2}) \, dt

$$
$$
\implies\left[ 4t-2t^{2}+\frac{1}{3}t^{3} \right]_{0}^2
$$
This is just $\equiv$ to $\frac{8}{3}$.

Finally, now we take the line across the x-axis. Lets parametrize this. 
$x=t$, $0\leq t\leq 2$ and $y=0$

$$
\int_{0}^{2} x+y^{2} \, \sqrt{ 1^{2}+0^{2} }dt
$$
$$
\implies \int_{0}^{2} t \, dt
$$
$$
\implies\left[ \frac{t^{2}}{2} \right]_{0}^2
$$
$$
\implies 2
$$
Now that we have all three paths evaluated, to find $\oint$, we add them together. $2+\frac{8}{3}+4+2\pi=8\frac{2}{3}+2\pi$.
$$
\tag*{$\blacksquare$}
$$

---
