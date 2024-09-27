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
sepBy separator = catMarkup . intersperse seperator

-- sepBy (Text " " ) [Text "hello", Text "World"] will return the same thing as the catMarkup

list :: [Markup] -> Markup
list xs = Concat (Text "[") (Concat (sepby ( Text "," ) xs (text "]")) -- ??

between :: Markup -> Markup -> (Markup -> Markup)
between l r xs = Concat l (Concat xs r) --  still ??

bracket = between (Text "[") (Text "]")

strings :: [Markup] -> Markup
strings = map (between ( Text "\"") (Text "/")) |> list


-- between (Text "[")(Text "]") (sepBy (Text ", ") [Text "a", Text "b"]) <- that runs something but idk what im new here, i kinda get it but wtf man 
-- ==
-- bracket (sepBy (Text ", ") [Text "a", Text "b"])

```

i gave up 37 mins in, look at the lecture notes after he adds the f g a b c x shit

```haskell
-- markupToHTML

data HTML = HText String | HEL String [HTML]
	deriving (Show, Eq)
em html = HEL "em" [HTML]

-- markupToHTML :: Markup -> String
	-- "Bob" --; funny example of security risk
	-- DROP TABLE users;

strong :: HTML -> HTML
strong html = HEL "strong" [HTML]

markupToHTML :: MArkup -> HTML
markupToHTML (Text s) = HText s
markupToHTML (Bold m) = strong (MarkupToHTML)
markupToHTML (Italic m) = em (markupToHTL)
```

