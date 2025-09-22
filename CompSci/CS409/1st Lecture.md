# Introduction
How to **structure** large scale projects.
Labs 2-3 On Tuesday, labs are assessed.
70& exam and 30% coursework (due in week 4 7 and 10), done online on my place.
# Design Patterns

### What and why?

"A named nugget of insight" - basically a certain named way to solve a recurring problem.

Don't implement anything yourself basically, just reuse stuff from people who know better.

Patterns originate from architecture, the idea that a window is a window and a door is a door, introduced to compsci by the "gang of 4" fucking reddit mods

#### The gang of four patterns

|    Creational    | Structural |       Behavioural       |
| :--------------: | :--------: | :---------------------: |
|  Factory method  |  adapter   |       interpreter       |
| abstract factory |   bridge   |     templete metho      |
|     builder      | composite  | chain of responsibility |
|    prototype     | decorator  |         command         |
|    singleton     |   facade   |        iterator         |
|                  | flyweight  |        mediator         |
|                  |   proxy    |         memento         |
|                  |            |        observerr        |
|                  |            |          state          |
|                  |            |        strategy         |
|                  |            |         visitor         |
These all have pretty self explanatory names

Lees fav is the observer pattern which describes how 2 things will interact with each other

#### How are patterns desribed?

name and classification
Internet
aka
motivation
applicability

---

structure
participants
collaborations
consequences
implementation
sample code
known uses
related patterns

#### Iterator Pattern

I've probably used it already.

##### Example:
Mike is working as a librarian

He needs a way to iterate through all these different collections of books regardless of the structure to display the contents inside

This may seem easy but some things you can simply iterate through like a list but what about a tree

Mike could just make numerous implementations on for each type but that becomes messy quickly with many different interfaces

---

The solution is to use an iterator pattern. This is a behavioral pattern which provides a way to access elements of a collection sequentially without exposing internal structure via one interface, it doesn't care about if its a list, stack, etc.

The goal is to decouple traversal logic from collection implementation.

You use this when you need to traverse different collection in a uniform way, you need multiple traversal at once, or need to hide collections internal representations

But this would not be that useful in cases such has having a simple collection where the built in iteration is sufficient, or you have performance critical cases

Pros are that its uniform and supports multiple simultaneous traversals, and simplifies client code, however it adds extra classes, may be less efficient than direct traversal and has limited access, usually forward only.

