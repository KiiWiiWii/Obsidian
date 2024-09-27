```haskell
example :: Markup
example = Concat (Text "hello") (Concat ( Text " ") (Bold) (Text "World"))

 -- this will print "Hello World" with a bold World

catMarkup :: [Markup] -> Markup
catMarkup [] = Text "" -- this is to deal with the emppty string pattern match.
catMarkup [x] = x
catMarkup (x : xs) = Concat x (catMarkup xs)

--running catMarkup[example : Markup], we get the entire defined "Example" String twice concatinated.

-- we want to run catMarkupSpaced [Text "Hello", Text "World"] to return Concat ()


```

