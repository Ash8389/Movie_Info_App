package com.example.movierating.data


class AllActor{
    fun actors() : List<ActorsDetail> {
        return listOf(
            // Sam Worthington
            ActorsDetail(
                name = "Sam Worthington",
                dob = "August 2, 1976",
                about = "Sam Worthington is an Australian actor known for his action-packed roles in films like 'Avatar' and 'Clash of the Titans'. His intense performances have earned him recognition in both Hollywood and Australian cinema.",
                profilePic = "https://image.tmdb.org/t/p/original/blKKsHlJIL9PmUQZB8f3YmMBW5Y.jpg",
                movies = "Avatar, Clash of the Titans, Terminator Salvation",
                awards = "AACTA Award for Best Lead Actor, Saturn Award for Best Actor",
                images = listOf("https://example.com/sam-worthington1.jpg", "https://example.com/sam-worthington2.jpg")
            ),

            // Zoe Saldana
            ActorsDetail(
                name = "Zoe Saldana",
                dob = "June 19, 1978",
                about = "Zoe Saldana is an American actress best known for her roles in blockbuster franchises such as 'Avatar' and 'Guardians of the Galaxy'. She has become a familiar face in science fiction and fantasy genres.",
                profilePic = "https://image.tmdb.org/t/p/original/jPXb0tH7yUoirt9Wkgrp4JvahB1.jpg",
                movies = "Avatar, Guardians of the Galaxy, Star Trek",
                awards = "ALMA Award for Favorite Movie Actress, Teen Choice Award for Choice Movie Actress: Sci-Fi",
                images = listOf("https://example.com/zoe-saldana1.jpg", "https://example.com/zoe-saldana2.jpg")
            ),

// Sigourney Weaver
            ActorsDetail(
                name = "Sigourney Weaver",
                dob = "October 8, 1949",
                about = "Sigourney Weaver is an acclaimed American actress renowned for her iconic roles in science fiction films like 'Alien' and 'Avatar'. She is celebrated for breaking boundaries for women in the genre.",
                profilePic = "https://image.tmdb.org/t/p/original/wTSnfktNBLd6kwQxgvkqYw6vEon.jpg",
                movies = "Alien, Avatar, Ghostbusters",
                awards = "Golden Globe for Best Actress, BAFTA Award for Best Actress",
                images = listOf("https://example.com/sigourney-weaver1.jpg", "https://example.com/sigourney-weaver2.jpg")
            ),

// Stephen Lang
            ActorsDetail(
                name = "Stephen Lang",
                dob = "July 11, 1952",
                about = "Stephen Lang is an American actor known for his powerful performances in films like 'Avatar' and 'Don't Breathe'. His portrayals of intense and complex characters have garnered critical praise.",
                profilePic = "https://image.tmdb.org/t/p/original/xEBuFWrCKDQD6r6CZK71GYIc4UW.jpg",
                movies = "Avatar, Don't Breathe, Tombstone",
                awards = "Saturn Award for Best Supporting Actor, Tony Award for Best Featured Actor",
                images = listOf("https://example.com/stephen-lang1.jpg", "https://example.com/stephen-lang2.jpg")
            ),

// Robert Downey Jr.
            ActorsDetail(
                name = "Robert Downey Jr.",
                dob = "April 4, 1965",
                about = "Robert Downey Jr. is an American actor widely recognized for his role as Iron Man in the Marvel Cinematic Universe. His charismatic performances have made him one of the most beloved actors worldwide.",
                profilePic = "https://image.tmdb.org/t/p/original/f9toX5MahujsDZTJoKIa5kzdhAE.jpg",
                movies = "Iron Man, Sherlock Holmes, Avengers",
                awards = "Golden Globe Award for Best Actor, BAFTA Award for Best Actor",
                images = listOf("https://example.com/robert-downey-jr1.jpg", "https://example.com/robert-downey-jr2.jpg")
            ),

// Chris Evans
            ActorsDetail(
                name = "Chris Evans",
                dob = "June 13, 1981",
                about = "Chris Evans is an American actor best known for his role as Captain America in the Marvel Cinematic Universe. His versatility as an actor has allowed him to excel in both action and dramatic roles.",
                profilePic = "https://image.tmdb.org/t/p/original/7NOKhXWOwzGfa1ArFLPv8G1Mqzu.jpg",
                movies = "Captain America, Avengers, Snowpiercer",
                awards = "People's Choice Award for Favorite Action Movie Star, MTV Movie Award for Best Fight",
                images = listOf("https://example.com/chris-evans1.jpg", "https://example.com/chris-evans2.jpg")
            ),

// Mark Ruffalo
            ActorsDetail(
                name = "Mark Ruffalo",
                dob = "November 22, 1967",
                about = "Mark Ruffalo is an American actor known for his portrayal of the Hulk in the Marvel Cinematic Universe. He is also celebrated for his performances in dramas like 'Spotlight' and 'Foxcatcher'.",
                profilePic = "https://image.tmdb.org/t/p/original/5GilHMOt5PAQh6rlUKZzGmaKEI7.jpg",
                movies = "The Avengers, Spotlight, Foxcatcher",
                awards = "Primetime Emmy Award for Outstanding Lead Actor, Screen Actors Guild Award",
                images = listOf("https://example.com/mark-ruffalo1.jpg", "https://example.com/mark-ruffalo2.jpg")
            ),

// Chris Hemsworth
            ActorsDetail(
                name = "Chris Hemsworth",
                dob = "August 11, 1983",
                about = "Chris Hemsworth is an Australian actor best known for playing Thor in the Marvel Cinematic Universe. He is admired for his physical roles and has starred in both action and comedy films.",
                profilePic = "https://image.tmdb.org/t/p/original/xkHHiJXraaMFXgRYspN6KVrFn17.jpg",
                movies = "Thor, The Avengers, Extraction",
                awards = "People's Choice Award for Favorite Action Movie Star, MTV Movie Award for Best Fight",
                images = listOf("https://example.com/chris-hemsworth1.jpg", "https://example.com/chris-hemsworth2.jpg")
            ),

// Leonardo DiCaprio
            ActorsDetail(
                name = "Leonardo DiCaprio",
                dob = "November 11, 1974",
                about = "Leonardo DiCaprio is an American actor and environmentalist known for his work in 'Titanic', 'Inception', and 'The Revenant'. His dedication to complex roles has earned him numerous accolades.",
                profilePic = "https://image.tmdb.org/t/p/original/aLUFp0zWpLVyIOgY0scIpuuKZLE.jpg",
                movies = "Titanic, Inception, The Revenant",
                awards = "Academy Award for Best Actor, Golden Globe Award for Best Actor",
                images = listOf("https://example.com/leonardo1.jpg", "https://example.com/leonardo2.jpg")
            ),

// Joseph Gordon-Levitt
            ActorsDetail(
                name = "Joseph Gordon-Levitt",
                dob = "February 17, 1981",
                about = "Joseph Gordon-Levitt is an American actor and filmmaker known for his roles in 'Inception', '500 Days of Summer', and 'Looper'. He is also the founder of the collaborative production company HitRecord.",
                profilePic = "https://image.tmdb.org/t/p/original/z2FA8js799xqtfiFjBTicFYdfk.jpg",
                movies = "Inception, 500 Days of Summer, Looper",
                awards = "Golden Globe Nominee for Best Actor, Independent Spirit Award",
                images = listOf("https://example.com/joseph1.jpg", "https://example.com/joseph2.jpg")
            ),

// Elliot Page
            ActorsDetail(
                name = "Elliot Page",
                dob = "February 21, 1987",
                about = "Elliot Page is a Canadian actor and producer recognized for their performances in 'Juno', 'Inception', and 'The Umbrella Academy'. Known for portraying complex characters, Elliot has become a prominent advocate for LGBTQ+ rights.",
                profilePic = "https://image.tmdb.org/t/p/original/xYMqDWthY4mnbVptrnvOZms9FYt.jpg",
                movies = "Juno, Inception, The Umbrella Academy",
                awards = "Academy Award Nominee, Independent Spirit Award",
                images = listOf("https://example.com/elliot1.jpg", "https://example.com/elliot2.jpg")
            ),

// Tom Hardy
            ActorsDetail(
                name = "Tom Hardy",
                dob = "September 15, 1977",
                about = "Tom Hardy is an English actor known for his powerful performances in films like 'Inception', 'Mad Max: Fury Road', and 'Venom'. His transformative roles have made him one of the most versatile actors of his generation.",
                profilePic = "https://image.tmdb.org/t/p/original/scbbuyWX3yuMjDlm1etAljrbCr0.jpg",
                movies = "Inception, Mad Max: Fury Road, Venom",
                awards = "BAFTA Rising Star Award, Academy Award Nominee for Best Supporting Actor",
                images = listOf("https://example.com/tom-hardy1.jpg", "https://example.com/tom-hardy2.jpg")
            ),
// Michael J. Fox
            ActorsDetail(
                name = "Michael J. Fox",
                dob = "June 9, 1961",
                about = "Michael J. Fox is a Canadian-American actor and advocate best known for his role as Marty McFly in 'Back to the Future'. His work in film and television has left a lasting impact on pop culture.",
                profilePic = "https://image.tmdb.org/t/p/original/2JB4FMgQmnhbBlQ4SxWFN9EIVDi.jpg",
                movies = "Back to the Future, Teen Wolf, The Secret of My Success",
                awards = "Primetime Emmy Award, Golden Globe Award",
                images = listOf("https://example.com/michael-fox1.jpg", "https://example.com/michael-fox2.jpg")
            ),

// Christopher Lloyd
            ActorsDetail(
                name = "Christopher Lloyd",
                dob = "October 22, 1938",
                about = "Christopher Lloyd is an American actor celebrated for his eccentric roles, particularly as Doc Brown in 'Back to the Future'. His career spans film, television, and theater, with numerous memorable characters.",
                profilePic = "https://image.tmdb.org/t/p/original/nxVjpyb3UrfbPZnEyDNlQVlFAs5.jpg",
                movies = "Back to the Future, Who Framed Roger Rabbit, The Addams Family",
                awards = "Primetime Emmy Award, Obie Award",
                images = listOf("https://example.com/christopher-lloyd1.jpg", "https://example.com/christopher-lloyd2.jpg")
            ),

// Lea Thompson
            ActorsDetail(
                name = "Lea Thompson",
                dob = "May 31, 1961",
                about = "Lea Thompson is an American actress and director known for her role as Lorraine in 'Back to the Future'. She has appeared in numerous films and television series, becoming a familiar face in the industry.",
                profilePic = "https://image.tmdb.org/t/p/original/85E9NTEfkRdUdK4kTrrnk5of25w.jpg",
                movies = "Back to the Future, Howard the Duck, Some Kind of Wonderful",
                awards = "Young Artist Award, People's Choice Award",
                images = listOf("https://example.com/lea-thompson1.jpg", "https://example.com/lea-thompson2.jpg")
            ),

// Crispin Glover
            ActorsDetail(
                name = "Crispin Glover",
                dob = "April 20, 1964",
                about = "Crispin Glover is an American actor, filmmaker, and musician known for his unique performances, particularly as George McFly in 'Back to the Future'. His unconventional approach to acting has earned him a distinct reputation.",
                profilePic = "https://image.tmdb.org/t/p/original/e6lbvXOnVEGDLn9OpaLQpwMSWe3.jpg",
                movies = "Back to the Future, Alice in Wonderland, Willard",
                awards = "Saturn Award Nominee, High Times Stony Award",
                images = listOf("https://example.com/crispin-glover1.jpg", "https://example.com/crispin-glover2.jpg")
            ),

// Anya Taylor-Joy
            ActorsDetail(
                name = "Anya Taylor-Joy",
                dob = "April 16, 1996",
                about = "Anya Taylor-Joy is an Argentine-British actress known for her roles in 'The Queen's Gambit', 'Emma', and 'Split'. Her captivating performances have quickly made her a prominent figure in modern cinema.",
                profilePic = "https://image.tmdb.org/t/p/original/yZpghhtKM2VZHDx6JGAZqAVU4PL.jpg",
                movies = "The Queen's Gambit, Emma, Split",
                awards = "Golden Globe for Best Actress, Critics' Choice Television Award",
                images = listOf("https://example.com/anya1.jpg", "https://example.com/anya2.jpg")
            ),

// Chloe Pirrie
            ActorsDetail(
                name = "Chloe Pirrie",
                dob = "August 25, 1987",
                about = "Chloe Pirrie is a Scottish actress known for her roles in 'The Queen's Gambit' and 'War & Peace'. She has earned acclaim for her nuanced portrayals in television and film.",
                profilePic = "https://image.tmdb.org/t/p/original/q6mjlrXrHziETbxilCKdO0atctI.jpg",
                movies = "The Queen's Gambit, War & Peace, Black Mirror",
                awards = "BAFTA Scotland Award, British Academy Television Award Nominee",
                images = listOf("https://example.com/chloe1.jpg", "https://example.com/chloe2.jpg")
            ),

// Bill Camp
            ActorsDetail(
                name = "Bill Camp",
                dob = "October 13, 1961",
                about = "Bill Camp is an American actor known for his roles in 'The Queen's Gambit', 'Joker', and 'The Night Of'. His intense and versatile performances have made him a sought-after character actor.",
                profilePic = "https://image.tmdb.org/t/p/original/wxYyJSltCHwU0MTg838SllOlvNT.jpg",
                movies = "The Queen's Gambit, Joker, The Night Of",
                awards = "Primetime Emmy Award Nominee, Screen Actors Guild Award Nominee",
                images = listOf("https://example.com/bill1.jpg", "https://example.com/bill2.jpg")
            ),

// Marielle Heller
            ActorsDetail(
                name = "Marielle Heller",
                dob = "October 1, 1979",
                about = "Marielle Heller is an American actress and filmmaker known for 'The Queen's Gambit' and 'Can You Ever Forgive Me?'. She is acclaimed both for her acting and her direction in independent cinema.",
                profilePic = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3YMRpIF6fPH1RDNOG4Do1Yqq4l5.jpg",
                movies = "The Queen's Gambit, Can You Ever Forgive Me?, The Diary of a Teenage Girl",
                awards = "Independent Spirit Award, Gotham Independent Film Award",
                images = listOf("https://example.com/marielle1.jpg", "https://example.com/marielle2.jpg")
            ),

// Timothée Chalamet
            ActorsDetail(
                name = "Timothée Chalamet",
                dob = "December 27, 1995",
                about = "Timothée Chalamet is an American actor known for his roles in 'Dune', 'Call Me by Your Name', and 'Little Women'. His performances have garnered critical acclaim, establishing him as a talented young actor.",
                profilePic = "https://image.tmdb.org/t/p/original/BE2sdjpgsa2rNTFa66f7upkaOP.jpg",
                movies = "Dune, Call Me by Your Name, Little Women",
                awards = "Academy Award Nominee, BAFTA Rising Star Award",
                images = listOf("https://example.com/timothee1.jpg", "https://example.com/timothee2.jpg")
            ),

// Rebecca Ferguson
            ActorsDetail(
                name = "Rebecca Ferguson",
                dob = "October 19, 1983",
                about = "Rebecca Ferguson is a Swedish actress known for her roles in 'Dune', 'Mission: Impossible' series, and 'The Greatest Showman'. Her versatility and presence have earned her roles in numerous blockbuster films.",
                profilePic = "https://image.tmdb.org/t/p/original/lJloTOheuQSirSLXNA3JHsrMNfH.jpg",
                movies = "Dune, Mission: Impossible - Fallout, The Greatest Showman",
                awards = "Golden Globe Nominee, Critics' Choice Movie Award Nominee",
                images = listOf("https://example.com/rebecca1.jpg", "https://example.com/rebecca2.jpg")
            ),
            // Zendaya
            ActorsDetail(
                name = "Zendaya",
                dob = "September 1, 1996",
                about = "Zendaya is an American actress and singer known for her roles in 'Euphoria', 'Spider-Man' series, and 'Dune'. Her acting versatility has earned her numerous accolades and a significant following.",
                profilePic = "https://image.tmdb.org/t/p/original/tylFh0K48CZIIhvKlA7WA1XBAtE.jpg",
                movies = "Euphoria, Spider-Man: Homecoming, Dune",
                awards = "Primetime Emmy Award, People's Choice Award",
                images = listOf("https://example.com/zendaya1.jpg", "https://example.com/zendaya2.jpg")
            ),

// Oscar Isaac
            ActorsDetail(
                name = "Oscar Isaac",
                dob = "March 9, 1979",
                about = "Oscar Isaac is a Guatemalan-American actor known for his roles in 'Dune', 'Star Wars', and 'Ex Machina'. His dynamic performances across genres have made him one of Hollywood's most respected actors.",
                profilePic = "https://image.tmdb.org/t/p/original/dW5U5yrIIPmMjRThR9KT2xH6nTz.jpg",
                movies = "Dune, Star Wars, Ex Machina",
                awards = "Golden Globe Award, National Board of Review Award",
                images = listOf("https://example.com/oscar1.jpg", "https://example.com/oscar2.jpg")
            ),

// Keanu Reeves
            ActorsDetail(
                name = "Keanu Reeves",
                dob = "September 2, 1964",
                about = "Keanu Reeves is a Canadian actor known for his iconic roles in 'The Matrix', 'John Wick', and 'Speed'. He is celebrated for his action roles and humble personality.",
                profilePic = "https://image.tmdb.org/t/p/original/4D0PpNI0kmP58hgrwGC3wCjxhnm.jpg",
                movies = "The Matrix, John Wick, Speed",
                awards = "MTV Movie Award, CinemaCon Icon Award",
                images = listOf("https://example.com/keanu1.jpg", "https://example.com/keanu2.jpg")
            ),

// Donnie Yen
            ActorsDetail(
                name = "Donnie Yen",
                dob = "July 27, 1963",
                about = "Donnie Yen is a Hong Kong actor and martial artist known for his roles in 'Ip Man', 'Rogue One', and 'Mulan'. His martial arts expertise has made him a key figure in action cinema.",
                profilePic = "https://image.tmdb.org/t/p/original/hTlhrrZMj8hZVvD17j4KyAFWBHc.jpg",
                movies = "Ip Man, Rogue One, Mulan",
                awards = "Hong Kong Film Award, Golden Horse Award",
                images = listOf("https://example.com/donnie1.jpg", "https://example.com/donnie2.jpg")
            ),

// Bill Skarsgård
            ActorsDetail(
                name = "Bill Skarsgård",
                dob = "August 9, 1990",
                about = "Bill Skarsgård is a Swedish actor known for his roles in 'It', 'Castle Rock', and 'Deadpool 2'. His portrayal of Pennywise the Clown in 'It' brought him widespread recognition.",
                profilePic = "https://image.tmdb.org/t/p/original/wGQidITqyDl4Igmq9TCQjRpegsk.jpg",
                movies = "It, Castle Rock, Deadpool 2",
                awards = "Saturn Award Nominee, MTV Movie Award Nominee",
                images = listOf("https://example.com/bill-skarsgard1.jpg", "https://example.com/bill-skarsgard2.jpg")
            ),

// Laurence Fishburne
            ActorsDetail(
                name = "Laurence Fishburne",
                dob = "July 30, 1961",
                about = "Laurence Fishburne is an American actor known for his roles in 'The Matrix', 'John Wick', and 'Boyz n the Hood'. His powerful screen presence has earned him numerous accolades.",
                profilePic = "https://image.tmdb.org/t/p/original/ttquRGRj9Jq5eEy9MvM1SJ6jCLz.jpg",
                movies = "The Matrix, John Wick, Boyz n the Hood",
                awards = "Primetime Emmy Award, Tony Award",
                images = listOf("https://example.com/laurence1.jpg", "https://example.com/laurence2.jpg")
            ),

// Natalie Portman
            ActorsDetail(
                name = "Natalie Portman",
                dob = "June 9, 1981",
                about = "Natalie Portman is an Israeli-American actress known for her roles in 'Black Swan', 'V for Vendetta', and 'Thor'. Her nuanced performances have made her one of the most respected actresses in Hollywood.",
                profilePic = "https://image.tmdb.org/t/p/original/edPU5HxncLWa1YkgRPNkSd68ONG.jpg",
                movies = "Black Swan, V for Vendetta, Thor",
                awards = "Academy Award for Best Actress, Golden Globe Award",
                images = listOf("https://example.com/natalie1.jpg", "https://example.com/natalie2.jpg")
            ),

// Christian Bale
            ActorsDetail(
                name = "Christian Bale",
                dob = "January 30, 1974",
                about = "Christian Bale is a Welsh actor known for his transformative roles in 'The Dark Knight', 'American Psycho', and 'Ford v Ferrari'. His dedication to his craft is evident in his physical and emotional transformations.",
                profilePic = "https://image.tmdb.org/t/p/original/wxt0NX2tnbAQm0eqeN1l7cXTfGX.jpg",
                movies = "The Dark Knight, American Psycho, Ford v Ferrari",
                awards = "Academy Award for Best Supporting Actor, Golden Globe Award",
                images = listOf("https://example.com/christian1.jpg", "https://example.com/christian2.jpg")
            ),

// Tessa Thompson
            ActorsDetail(
                name = "Tessa Thompson",
                dob = "October 3, 1983",
                about = "Tessa Thompson is an American actress known for her roles in 'Thor: Ragnarok', 'Creed', and 'Westworld'. Her impactful roles have garnered praise for her talent and versatility.",
                profilePic = "https://image.tmdb.org/t/p/original/7IDARj5sBzK3xlAQ6YSbNflBZIv.jpg",
                movies = "Thor: Ragnarok, Creed, Westworld",
                awards = "Black Reel Award, Critics' Choice Television Award Nominee",
                images = listOf("https://example.com/tessa1.jpg", "https://example.com/tessa2.jpg")
            ),

// Letitia Wright
            ActorsDetail(
                name = "Letitia Wright",
                dob = "October 31, 1993",
                about = "Letitia Wright is a Guyanese-British actress known for her roles in 'Black Panther', 'Avengers: Infinity War', and 'Small Axe'. She gained international fame as Shuri in the Marvel Cinematic Universe.",
                profilePic = "https://image.tmdb.org/t/p/original/f7PevpEeBqwzACPhoZ8K3ktrKvE.jpg",
                movies = "Black Panther, Avengers: Infinity War, Small Axe",
                awards = "BAFTA Rising Star Award, Screen Actors Guild Award",
                images = listOf("https://example.com/letitia1.jpg", "https://example.com/letitia2.jpg")
            ),
            // Lupita Nyong'o
            ActorsDetail(
                name = "Lupita Nyong'o",
                dob = "March 1, 1983",
                about = "Lupita Nyong'o is a Kenyan-Mexican actress known for her roles in '12 Years a Slave', 'Black Panther', and 'Us'. She is acclaimed for her powerful performances and has won several prestigious awards.",
                profilePic = "https://image.tmdb.org/t/p/original/4f71PMUwGaTxjTjrSEjVFtpbQpe.jpg",
                movies = "12 Years a Slave, Black Panther, Us",
                awards = "Academy Award for Best Supporting Actress, Screen Actors Guild Award",
                images = listOf("https://example.com/lupita1.jpg", "https://example.com/lupita2.jpg")
            ),

// Danai Gurira
            ActorsDetail(
                name = "Danai Gurira",
                dob = "February 14, 1978",
                about = "Danai Gurira is an American-Zimbabwean actress and playwright known for her roles in 'The Walking Dead' and 'Black Panther'. She is celebrated for her strong portrayals of powerful female characters.",
                profilePic = "https://image.tmdb.org/t/p/original/umN1i1MkWRCJx6MnwSkudprfRrU.jpg",
                movies = "The Walking Dead, Black Panther, Avengers: Endgame",
                awards = "Satellite Award, Drama Desk Award Nominee",
                images = listOf("https://example.com/danai1.jpg", "https://example.com/danai2.jpg")
            ),

// Winston Duke
            ActorsDetail(
                name = "Winston Duke",
                dob = "November 15, 1986",
                about = "Winston Duke is a Tobagonian-American actor known for his roles in 'Black Panther', 'Us', and 'Avengers: Infinity War'. His breakout role as M'Baku in 'Black Panther' earned him a strong fan following.",
                profilePic = "https://image.tmdb.org/t/p/original/pqwok07EgGGTCa80kmGQmb8ut8M.jpg",
                movies = "Black Panther, Us, Avengers: Infinity War",
                awards = "MTV Movie Award Nominee, NAACP Image Award Nominee",
                images = listOf("https://example.com/winston1.jpg", "https://example.com/winston2.jpg")
            ),

// Dwayne Johnson
            ActorsDetail(
                name = "Dwayne Johnson",
                dob = "May 2, 1972",
                about = "Dwayne Johnson, also known as 'The Rock', is an American actor, producer, and former professional wrestler known for his roles in 'Jumanji', 'Fast & Furious', and 'Black Adam'. He is one of the highest-grossing actors in Hollywood.",
                profilePic = "https://image.tmdb.org/t/p/original/5QApZVV8FUFlVxQpIK3Ew6cqotq.jpg",
                movies = "Jumanji: Welcome to the Jungle, Fast & Furious, Black Adam",
                awards = "People's Choice Award, Kids' Choice Award",
                images = listOf("https://example.com/dwayne1.jpg", "https://example.com/dwayne2.jpg")
            ),

// Aldis Hodge
            ActorsDetail(
                name = "Aldis Hodge",
                dob = "September 20, 1986",
                about = "Aldis Hodge is an American actor known for his roles in 'One Night in Miami', 'Black Adam', and 'Leverage'. His performances are recognized for their depth and versatility.",
                profilePic = "https://image.tmdb.org/t/p/original/jPpnaAGFXaIeOrRNUHIHxk3fIJL.jpg",
                movies = "One Night in Miami, Black Adam, Leverage",
                awards = "Black Reel Award, Critics' Choice Television Award Nominee",
                images = listOf("https://example.com/aldis1.jpg", "https://example.com/aldis2.jpg")
            ),

// Pierce Brosnan
            ActorsDetail(
                name = "Pierce Brosnan",
                dob = "May 16, 1953",
                about = "Pierce Brosnan is an Irish actor and film producer known for his roles as James Bond in the 'Bond' series, 'Mamma Mia!', and 'Black Adam'. He is renowned for his charisma and charm in diverse roles.",
                profilePic = "https://image.tmdb.org/t/p/original/AdFQZh4iGRT0qjwU9hTmTtyQ1xJ.jpg",
                movies = "GoldenEye, Mamma Mia!, Black Adam",
                awards = "Empire Award, Golden Globe Nominee",
                images = listOf("https://example.com/pierce1.jpg", "https://example.com/pierce2.jpg")
            ),

// Sarah Shahi
            ActorsDetail(
                name = "Sarah Shahi",
                dob = "January 10, 1980",
                about = "Sarah Shahi is an American actress and former NFL cheerleader, known for her roles in 'Black Adam', 'Person of Interest', and 'Sex/Life'. She brings intensity and charisma to her characters.",
                profilePic = "https://image.tmdb.org/t/p/original/shiLCJNyvi9xlUZw4bTuRkhrKpm.jpg",
                movies = "Black Adam, Person of Interest, Sex/Life",
                awards = "Gracie Award, ALMA Award Nominee",
                images = listOf("https://example.com/sarah1.jpg", "https://example.com/sarah2.jpg")
            ),

// Emma Stone
            ActorsDetail(
                name = "Emma Stone",
                dob = "November 6, 1988",
                about = "Emma Stone is an American actress known for her roles in 'La La Land', 'Easy A', and 'The Favourite'. She is celebrated for her comedic timing and emotional depth.",
                profilePic = "https://image.tmdb.org/t/p/original/3UaYw9KF4fEXRMRWhf25aGJpAW2.jpg",
                movies = "La La Land, Easy A, The Favourite",
                awards = "Academy Award for Best Actress, Golden Globe Award",
                images = listOf("https://example.com/emma-stone1.jpg", "https://example.com/emma-stone2.jpg")
            ),

// Emma Thompson
            ActorsDetail(
                name = "Emma Thompson",
                dob = "April 15, 1959",
                about = "Emma Thompson is a British actress and screenwriter known for her roles in 'Sense and Sensibility', 'Nanny McPhee', and 'Love Actually'. She is admired for her wit and versatility.",
                profilePic = "https://image.tmdb.org/t/p/original/xr8Ki3CIqweWWqS5q0kUYdiK6oQ.jpg",
                movies = "Sense and Sensibility, Nanny McPhee, Love Actually",
                awards = "Academy Award for Best Actress, BAFTA Award",
                images = listOf("https://example.com/emma-thompson1.jpg", "https://example.com/emma-thompson2.jpg")
            ),

// Joel Fry
            ActorsDetail(
                name = "Joel Fry",
                dob = "May 20, 1983",
                about = "Joel Fry is a British actor known for his roles in 'Cruella', 'Yesterday', and 'Game of Thrones'. He often brings a unique charm to his diverse range of characters.",
                profilePic = "https://image.tmdb.org/t/p/original/4nEKEWJpaTHncCTv6zeP98V0qGI.jpg",
                movies = "Cruella, Yesterday, Game of Thrones",
                awards = "British Independent Film Award Nominee",
                images = listOf("https://example.com/joel1.jpg", "https://example.com/joel2.jpg")
            ),

// Paul Walter Hauser
            ActorsDetail(
                name = "Paul Walter Hauser",
                dob = "October 15, 1986",
                about = "Paul Walter Hauser is an American actor known for his roles in 'I, Tonya', 'Richard Jewell', and 'Cruella'. His performances are marked by a blend of humor and intensity.",
                profilePic = "https://image.tmdb.org/t/p/original/nhjefgcPcOTa0p4aprajsXPDERw.jpg",
                movies = "I, Tonya, Richard Jewell, Cruella",
                awards = "Critics' Choice Award, Gotham Award Nominee",
                images = listOf("https://example.com/paul1.jpg", "https://example.com/paul2.jpg")
            )
        )
    }
}

fun getActor(name: String) : ActorsDetail? {
    return AllActor().actors().find { name == it.name }
}