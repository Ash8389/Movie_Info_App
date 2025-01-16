package com.example.movierating.data

class AllMovie {
    fun movies(): List<MovieDetails> {
        return listOf(
            MovieDetails(
                id = "tt0499549",
                title = "Avatar",
                year = "2009",
                genre = "Action, Adventure, Fantasy",
                director = "James Cameron",
                actors = listOf("Sam Worthington", "Zoe Saldana", "Sigourney Weaver", "Stephen Lang"),
                plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
                poster = "https://drive.google.com/uc?export=view&id=18_N-FcLC5BhTJdKI1v47WIWmy5Kmu-gP",
                images = listOf(
                    "https://images-na.ssl-images-amazon.com/images/M/MV5BMjEyOTYyMzUxNl5BMl5BanBnXkFtZTcwNTg0MTUzNA@@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                    "https://images-na.ssl-images-amazon.com/images/M/MV5BNzM2MDk3MTcyMV5BMl5BanBnXkFtZTcwNjg0MTUzNA@@._V1_SX1777_CR0,0,1777,999_AL_.jpg"
                ),
                rating = "7.9"
            ),
            MovieDetails(
                id = "tt4154796",
                title = "Avengers: Endgame",
                year = "2019",
                genre = "Action, Adventure, Drama",
                director = "Anthony Russo, Joe Russo",
                actors = listOf("Robert Downey Jr.", "Chris Evans", "Mark Ruffalo", "Chris Hemsworth"),
                plot = "After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more to undo Thanos' actions and restore order.",
                poster = "https://drive.google.com/uc?export=view&id=1sCj88mBfEZoa8R8MjETw50XXccw_6dyZ",
                images = listOf(
                    "https://m.media-amazon.com/images/M/MV5BMTU2NjEyOTczMl5BMl5BanBnXkFtZTgwNzc4OTM3NzM@._V1_SX1500_CR0,0,1500,999_AL_.jpg"
                ),
                rating = "8.4"
            ),
            MovieDetails(
                id = "tt1375666",
                title = "Inception",
                year = "2010",
                genre = "Action, Adventure, Sci-Fi",
                director = "Christopher Nolan",
                actors = listOf("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page", "Tom Hardy"),
                plot = "A thief who enters the subconscious of his targets finds himself facing his greatest heist yet in a mind-bending journey that may cost him everything.",
                poster = "https://drive.google.com/uc?export=view&id=1EK5faNFbqv_f4ycaPmTPdka1OGauuLCg",
                images = listOf(
                    "https://m.media-amazon.com/images/M/MV5BMjA3NDg5NjQyOV5BMl5BanBnXkFtZTcwNjYzMzIzMw@@._V1_SX1777_CR0,0,1777,937_AL_.jpg"
                ),
                rating = "8.8"
            ),
            MovieDetails(
                id = "tt0088763",
                title = "Back to the Future",
                year = "1985",
                genre = "Adventure, Comedy, Sci-Fi",
                director = "Robert Zemeckis",
                actors = listOf("Michael J. Fox", "Christopher Lloyd", "Lea Thompson", "Crispin Glover"),
                plot = "Marty McFly, a teenager, is accidentally sent back in time to the 1950s in a time-traveling DeLorean invented by his eccentric scientist friend, Dr. Emmett Brown.",
                poster = "https://drive.google.com/uc?export=view&id=1zHMWdEUjlwD8KY3U8dJpc7jSea__Gh59",
                images = listOf(
                    "https://m.media-amazon.com/images/M/MV5BZjQ3NjMzYjUtNDVjMi00ZDBjLWE5ZDYtY2FlNTg5OTNhYzZhXkEyXkFqcGdeQXVyNjk2NzgzNTI@._V1_SX1500_CR0,0,1500,999_AL_.jpg"
                ),
                rating = "8.5"
            ),
            MovieDetails(
                id = "tt7975244",
                title = "The Queen's Gambit",
                year = "2020",
                genre = "Drama",
                director = "Scott Frank",
                actors = listOf("Anya Taylor-Joy", "Chloe Pirrie", "Bill Camp", "Marielle Heller"),
                plot = "Orphaned and alone, a young girl reveals an astonishing talent for chess and begins an incredible journey to stardom while battling addiction.",
                poster = "https://drive.google.com/uc?export=view&id=1tj6oybXiqC1fti45-umbj1_OE229LPmR",
                images = listOf(
                    "https://m.media-amazon.com/images/M/MV5BYzMwZTg4MDUtZmFkOC00ZmI2LTgyYjAtZjNlN2FiZmFhMTcwXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg"
                ),
                rating = "8.6"
            ),
            MovieDetails(
                id = "tt1160419",
                title = "Dune",
                year = "2021",
                genre = "Action, Adventure, Drama",
                director = "Denis Villeneuve",
                actors = listOf("Timothée Chalamet", "Rebecca Ferguson", "Zendaya", "Oscar Isaac"),
                plot = "Paul Atreides, a brilliant and gifted young man born into a great destiny, must travel to the most dangerous planet in the universe to ensure the future of his family and people.",
                poster = "https://drive.google.com/uc?export=view&id=18cEUVgtGOsxvm3zvdPtuqVCRpSPgCb7o",
                images = listOf(
                    "https://m.media-amazon.com/images/M/MV5BZWRmMTk1ZjktYWYxZi00MTk1LTlkZTUtZjJlMjI1NTFiOTFkXkEyXkFqcGdeQXVyNzU0MDI4MTM@._V1_.jpg"
                ),
                rating = "8.1"
            ),
            MovieDetails(
                id = "tt10272386",
                title = "John Wick: Chapter 4",
                year = "2023",
                genre = "Action, Crime, Thriller",
                director = "Chad Stahelski",
                actors = listOf("Keanu Reeves", "Donnie Yen", "Bill Skarsgård", "Laurence Fishburne"),
                plot = "John Wick uncovers a path to defeating The High Table, but must face new enemies with powerful alliances and forces that turn old friends into foes.",
                poster = "https://drive.google.com/uc?export=view&id=1vpCDHXwPsVx5dvaOG5FmaqAd_DVhKijM",
                images = listOf(
                    "https://m.media-amazon.com/images/M/MV5BMTE1ZjNiZTAtYjZjNS00ZjFjLTk1YTUtYmFiNmRjMjBhNWEzXkEyXkFqcGdeQXVyNjEwNTM2MzM@._V1_.jpg"
                ),
                rating = "8.4"
            ),
            MovieDetails(
                id = "tt10648342",
                title = "Thor: Love and Thunder",
                year = "2022",
                genre = "Action, Adventure, Comedy",
                director = "Taika Waititi",
                actors = listOf("Chris Hemsworth", "Natalie Portman", "Christian Bale", "Tessa Thompson"),
                plot = "Thor enlists the help of Valkyrie, Korg, and ex-girlfriend Jane Foster to battle Gorr the God Butcher, who intends to make the gods extinct.",
                poster = "https://drive.google.com/uc?export=view&id=1Gc1y-3VV30ajbSIaVRH4YRrX7ThC-fSl",
                images = listOf(
                    "https://m.media-amazon.com/images/M/MV5BNzM2NDYyNDUtYzZkOC00NDQ2LTgyOGYtMDlmOGYyNDEyOTZlXkEyXkFqcGdeQXVyMTEzMTI1Mjk3@._V1_.jpg"
                ),
                rating = "6.4"
            ),
            MovieDetails(
                id = "tt6443346",
                title = "Black Panther: Wakanda Forever",
                year = "2022",
                genre = "Action, Adventure, Drama",
                director = "Ryan Coogler",
                actors = listOf("Letitia Wright", "Lupita Nyong'o", "Danai Gurira", "Winston Duke"),
                plot = "The people of Wakanda fight to protect their home from intervening world powers as they mourn the death of King T'Challa.",
                poster = "https://drive.google.com/uc?export=view&id=11dHQ6Oc6tmrMLrcJDJvRDj9VSLV7kiU5",
                images = listOf(
                    "https://m.media-amazon.com/images/M/MV5BZTQ5NmYxZjQtNWRjOS00OTMxLWFiZjgtMzY2ZjExZjJlOGVmXkEyXkFqcGdeQXVyMTU3NTM4MjI@._V1_.jpg"
                ),
                rating = "7.3"
            ),
            MovieDetails(
                id = "tt9114286",
                title = "Black Adam",
                year = "2022",
                genre = "Action, Adventure, Fantasy",
                director = "Jaume Collet-Serra",
                actors = listOf("Dwayne Johnson", "Aldis Hodge", "Pierce Brosnan", "Sarah Shahi"),
                plot = "Nearly 5,000 years after he was bestowed with the almighty powers of the Egyptian gods—and imprisoned just as quickly—Black Adam is freed and must face the modern-day heroes of the Justice Society.",
                poster = "https://drive.google.com/uc?export=view&id=1OsJwvUCPG_jXeYpvuW3PMSIayGlQEiZD",
                images = listOf(
                    "https://m.media-amazon.com/images/M/MV5BZGJjY2E3ZTAtODUwNC00NDFhLThjOWMtZGE3NGE5MTMwOTQ5XkEyXkFqcGdeQXVyMTAyOTE2ODg0@._V1_.jpg"
                ),
                rating = "6.5"
            ),
            MovieDetails(
                id = "tt3228774",
                title = "Cruella",
                year = "2021",
                genre = "Comedy, Crime",
                director = "Craig Gillespie",
                actors = listOf("Emma Stone", "Emma Thompson", "Joel Fry", "Paul Walter Hauser"),
                plot = "A young Cruella de Vil comes into her own in 1970s London amidst the punk rock revolution, building her reputation and forging her identity.",
                poster = "https://drive.google.com/uc?export=view&id=10oxs-YdE_Yt64DIMw_8f_3BxNZGqfajB",
                images = listOf(
                    "https://m.media-amazon.com/images/M/MV5BZmMyZTA5NTQtZGRjZi00ZjFjLWJmZGUtZmEyNjUxNTlmNzI5XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg"
                ),
                rating = "7.4"
            )
        )
    }
}
