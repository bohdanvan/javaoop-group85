package com.bvan.oop.lessons7_8.generic.formatter;

import com.bvan.oop.lessons1_2.post.Post;

/**
 * @author bvanchuhov
 */
public class LikesFormatter implements Formatter<Post> {

    @Override
    public String format(Post value) {
        return String.valueOf(value.getLikes());
    }
}
