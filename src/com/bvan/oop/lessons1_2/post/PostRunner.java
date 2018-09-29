package com.bvan.oop.lessons1_2.post;

/**
 * @author bvanchuhov
 */
public class PostRunner {

    public static void main(String[] args) {
        Post p1 = new Post("@elonmusk", "Mars Base Alpha", 230);
        Post p2 = new Post("@poroshenko", "Вітаю Національну академію");

        String s = p1.show();
        System.out.println(s);

        p2.like();
        p2.like();
        p2.like();
        p2.like();
        p2.like();

        p2.dislike();
        p2.dislike();

//        p2.setContent("....");
        System.out.println(p2.show());

        System.out.println(p1.getAuthor());

//        p1.setLikes(p1.getLikes() + 1);
    }
}
