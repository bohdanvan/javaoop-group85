package com.bvan.oop.lessons11_12.multithreading.shared_resource.chatroom;

/**
 * @author bvanchuhov
 */
public class ChatRoomRunner {

    public static void main(String[] args) throws InterruptedException {
        ChatRoom chatRoom = new ChatRoomWithSafeResource();
        testChatRoom(chatRoom);
    }

    private static void testChatRoom(ChatRoom chatRoom) throws InterruptedException {
        Thread senderA = new Thread(new Sender(chatRoom, "Hello"));
        Thread senderB = new Thread(new Sender(chatRoom, "Bye"));

        senderA.start();
        senderB.start();

        senderA.join();
        senderB.join();

        System.out.println(chatRoom.getContent());
    }
}
