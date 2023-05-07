/*
val stations = mutableListOf(
    Station(
        "start", listOf(
            Way(15, "buss", 15, 10f, "1", "1"),
            Way(15, "taxi", 15, 20f, "1", "1"),
            Way(15, "walk", 15, 5.5f, "1", "1"),

            Way(15, "buss", 15, 12f, "2", "3"),
            Way(15, "taxi", 15, 21f, "2", "3"),
            Way(15, "walk", 15, 5.5f, "2", "3"),
        ), 0
    ),
    Station(
        "1", listOf(
            Way(15, "buss", 15, 12f, "1", "2"),
            Way(15, "taxi", 15, 25f, "1", "2"),
            Way(15, "walk", 15, 5.5f, "1", "2"),

            Way(15, "buss", 15, 9f, "1", "6"),
            Way(15, "taxi", 15, 30f, "1", "6"),
            Way(15, "walk", 15, 5.5f, "1", "6"),
        ), 4
    ),
    Station(
        "2", listOf(
            Way(15, "buss", 15, 20f, "1", "5"),
            Way(15, "taxi", 15, 25f, "1", "5"),
            Way(15, "walk", 15, 5.5f, "1", "5"),
        ), 5
    ),
    Station(
        "3", listOf(
            Way(11, "buss", 11, 20f, "2", "5"),
            Way(11, "taxi", 11, 28f, "2", "5"),
            Way(11, "walk", 11, 5.5f, "2", "5"),

            Way(10, "buss", 10, 16f, "2", "4"),
            Way(10, "taxi", 10, 28f, "2", "4"),
            Way(10, "walk", 10, 5.5f, "2", "4"),
        ), 3
    ),
    Station(
        "4", listOf(
            Way(11, "buss", 11, 18f, "2", "7"),
            Way(11, "taxi", 11, 22f, "2", "7"),
            Way(11, "walk", 11, 5.5f, "2", "7"),
        ), 2
    ),
    Station(
        "5", listOf(
            Way(13, "buss", 13, 23f, "2", "6"),
            Way(13, "taxi", 13, 16f, "2", "6"),
            Way(13, "walk", 13, 5.5f, "2", "6"),
        ), 3
    ),
    Station(
        "6", listOf(
            Way(20, "buss", 20, 20f, "2", "home"),
            Way(20, "taxi", 20, 10f, "2", "home"),
            Way(20, "walk", 20, 5.5f, "2", "home"),
        ), 2
    ),
    Station(
        "7", listOf(
            Way(11, "buss", 11, 22f, "2", "6"),
            Way(11, "taxi", 11, 19f, "2", "6"),
            Way(11, "walk", 11, 5.5f, "2", "6"),
        ), 1
    ),
    Station("home", listOf(), 0),
)
*/


/*
val stations = mutableListOf(
    Station(
        "start", listOf(
            Way(4, "buss", 15, 1f, "1", "1"),
            Way(4, "taxi", 2, 2f, "1", "1"),

            Way(3, "buss", 15, 1f, "2", "2"),
            Way(3, "taxi", 2, 2f, "2", "2"),

            Way(11, "buss", 15, 1f, "2", "home"),
            Way(11, "taxi", 2, 2f, "2", "home"),
        ), 11
    ),
    Station(
        "1", listOf(
            Way(6, "buss", 10, 1f, "1", "3"),
            Way(6, "taxi", 2, 2f, "1", "3"),

            Way(7, "buss", 10, 1f, "1", "home"),
            Way(7, "taxi", 2, 2f, "1", "home")
        ), 7
    ),
    Station(
        "2", listOf(
            Way(5, "taxi", 2, 2f, "1", "1"),

            Way(7, "taxi", 2, 2f, "1", "home"),

        ), 7
    ),
    Station(
        "3", listOf(
            Way(3, "buss", 10, 1f, "2", "home"),
            Way(3, "taxi", 2, 2f, "2", "home"),

        ), 3
    ),
    Station("home", listOf(), 0),
)
*/

val stations = mutableListOf(
    Station(
        "start", listOf(
            Way(4, "buss", 15, 4f, "1", "1"),
            Way(4, "taxi", 2, 6f, "1", "1"),
            Way(4, "walk", 0, 0.55f, "1", "1"),

            Way(3, "buss", 15, 4f, "2", "2"),
            Way(3, "taxi", 2, 6f, "2", "2"),
            Way(3, "walk", 0, 0.55f, "1", "2"),

            Way(11, "taxi", 15, 6.5f, "2", "home"),
            Way(11, "walk", 0, 0.55f, "1", "2"),
        ), 11
    ),
    Station(
        "1", listOf(
            Way(6, "buss", 10, 5f, "3", "3"),
            Way(6, "taxi", 2, 7f, "1", "3"),
            Way(6, "walk", 0, 0.55f, "1", "3"),

            Way(7, "buss", 10, 5f, "1", "home"),
            Way(7, "taxi", 2, 7f, "1", "home"),
            Way(7, "walk", 0, 0.55f, "1", "home"),

            ), 7
    ),
    Station(
        "2", listOf(
            Way(5, "walk", 0, 0.55f, "1", "1"),


            Way(7, "taxi", 2, 6f, "1", "home"),
            Way(7, "walk", 0, 0.55f, "1", "home"),


            ), 7
    ),
    Station(
        "3", listOf(
            Way(3, "buss", 10, 1f, "2", "home"),
            Way(3, "taxi", 2, 2f, "2", "home"),

            ), 3
    ),
    Station("home", listOf(), 0),
)

