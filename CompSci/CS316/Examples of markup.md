```haskell
example :: Markup
example = Concat (Text "hello") (Concat ( Text " ") (Bold) (Text "World"))

 -- this will print "Hello World" with a bold World

catMarkup :: [Markup] -> Markup
catMarkup [] = Text "" -- this is to deal with the emppty string pattern match.
catMarkup [x] = x
catMarkup (x : xs) = Concat x (catMarkup xs)

--running catMarkup[example : Markup], we get the entire defined "Example" String twice concatinated.

-- we want to run catMarkupSpaced [Text "Hello", Text "World"] to return Concat (Text "hello) (Concat (Text " ") (Text "world"))

catMarkupSpaced :: [Markup] -> Markup
catMarkupSpaced [] = Text "" -- this is to deal with the emppty string pattern match.
catMarkupSpaced [x] = x
catMarkupSpaced (x : xs) = Concat x (Concat (text " " (catMarkupSpaced xs))

catMarkupSpaced_v2 :: [Markup] -> Markup
catMarkupSpaced_v2 xs = catMarkup (intersperse (Text " ") xs)

 -- = catMarkup . intersperse ( Text " " )
sepBy :: Markup -> [Markup] -> Markup
sepBy separator = catMarkup

```

