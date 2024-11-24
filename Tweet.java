class Tweet {
    private String message;
    private int retweets;
    private int likes;

    public Tweet(String m, int r, int lk) {
        message = m;
        retweets = r;
        likes = lk;
    }

    public void addLikes(int n) {
        likes += n;
    }

    public void addRetweets(int n) {
        retweets += n;
    }

    public boolean notLiked() {
        return likes < 10;
    }

    public boolean kindaLiked() {
        return likes > retweets;
    }

    public boolean isTrending() {
        return (likes + retweets) > 75;
    }

    public String toString() {
        return "msg " + message + " rt " + retweets + " lk " + likes;
    }
}