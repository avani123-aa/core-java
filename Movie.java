class Movie {

    static String movieName;
    static String director;
    static String hero;
    static String heroine;
    static String language;
    static String releaseYear;
    static String rating;

    public static boolean createMovie(String name, String dir, String her,
                                       String hern, String lang,
                                       String relYear, String rate) {

        boolean isMovieCreated = false;

        boolean isNameValid = false;
        boolean isDirValid = false;
        boolean isHeroValid = false;
        boolean isHeroineValid = false;
        boolean isLangValid = false;
        boolean isRelYearValid = false;
        boolean isRateValid = false;

        if (name != null && !name.isEmpty()) {
            System.out.println("movieName is validated");
            movieName = name;
            isNameValid = true;
        } else {
            System.out.println("movieName is not valid");
        }

        if (dir != null && !dir.isEmpty()) {
            System.out.println("director is validated");
            director = dir;
            isDirValid = true;
        } else {
            System.out.println("director is not valid");
        }

        if (her != null && !her.isEmpty()) {
            System.out.println("hero is validated");
            hero = her;
            isHeroValid = true;
        } else {
            System.out.println("hero is not valid");
        }

        if (hern != null && !hern.isEmpty()) {
            System.out.println("heroine is validated");
            heroine = hern;
            isHeroineValid = true;
        } else {
            System.out.println("heroine is not valid");
        }

        if (lang != null && !lang.isEmpty()) {
            System.out.println("language is validated");
            language = lang;
            isLangValid = true;
        } else {
            System.out.println("language is not valid");
        }

        if (relYear != null && !relYear.isEmpty()) {
            System.out.println("releaseYear is validated");
            releaseYear = relYear;
            isRelYearValid = true;
        } else {
            System.out.println("releaseYear is not valid");
        }

        if (rate != null && !rate.isEmpty()) {
            System.out.println("rating is validated");
            rating = rate;
            isRateValid = true;
        } else {
            System.out.println("rating is not valid");
        }

        if (isNameValid && isDirValid && isHeroValid &&
            isHeroineValid && isLangValid &&
            isRelYearValid && isRateValid) {

            isMovieCreated = true;
        }

        return isMovieCreated;
    }

    public static void getMovieDetails() {
        System.out.println("The Movie Details are:");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Director: " + director);
        System.out.println("Hero: " + hero);
        System.out.println("Heroine: " + heroine);
        System.out.println("Language: " + language);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
    }
}