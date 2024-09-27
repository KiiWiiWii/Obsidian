```haskell
example :: Markup
example = Concat (Text "hello") (Concat ( Text " ") (Bold) (Text "World"))

 -- this will print "Hello World" with a bold World
catMarkup :: [Markup] -> Markup
catMarkup [] = Text ""
catMarkup (x : xs) = Concat x (catMarkup xs)

--
```