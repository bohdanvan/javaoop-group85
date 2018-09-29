package com.bvan.oop.lessons1_2.post;

/**
 * @author bvanchuhov
 */
public class Post {

    private final String author;
    private String content;
    private long likes;

    public Post(String author, String content, long likes) {
        checkLikes(likes);
        this.author = author;
        this.content = content;
        this.likes = likes;
    }

    private void checkLikes(long likes) {
        if (likes < 0) {
            throw new IllegalArgumentException("negative likes: " + likes);
        }
    }

    public Post(String author, String content) {
        this(author, content, 0);
    }

    public String show() {
        return "\"" + content + "\" by " + author + ", "
                + likes + " likes";
    }

    public void like() {
        likes++;
    }

    public void dislike() {
        if (likes == 0) {
            throw new IllegalStateException("zero likes");
        }
        likes--;
    }

    public Post immutableLike() {
        return new Post(author, content, likes + 1);
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }
}
