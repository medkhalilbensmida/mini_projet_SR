package com.gl3.grpc;

import com.gl3.messaging.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class MessagingClient {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50000)
                .usePlaintext()
                .build();
        MessagingServiceGrpc.MessagingServiceBlockingStub stub = MessagingServiceGrpc.newBlockingStub(channel);

        System.out.print("Entrez votre nom d'utilisateur:");
        String username = scanner.nextLine();

        boolean running = true;
        while (running) {
            System.out.println("\nMenu :");
            System.out.println("1. Afficher les messages recus");
            System.out.println("2. Envoyer un message");
            System.out.println("3. Sortie");
            System.out.print("Choisis une option:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    MessagingServiceOuterClass.GetMessagesRequest getRequest = MessagingServiceOuterClass.GetMessagesRequest.newBuilder()
                            .setUser(username)
                            .build();
                    MessagingServiceOuterClass.GetMessagesResponse getResponse = stub.getMessages(getRequest);
                    System.out.println("Messages pour " + username + ": " + getResponse.getMessagesList());
                    break;
                case 2:
                    System.out.print("Saisissez le nom d'utilisateur du destinataire : ");
                    String recipient = scanner.nextLine();
                    System.out.print("Entrez votre message : ");
                    String message = scanner.nextLine();

                    MessagingServiceOuterClass.SendMessageRequest sendRequest = MessagingServiceOuterClass.SendMessageRequest.newBuilder()
                            .setRecipient(recipient)
                            .setMessage(message)
                            .build();
                    MessagingServiceOuterClass.SendMessageResponse sendResponse = stub.sendMessage(sendRequest);
                    System.out.println("Message envoyé : " + sendResponse.getSuccess());
                    break;
                case 3:
                    running = false;
                    System.out.println("Sortir...");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer. ");
            }
        }

        channel.shutdown();
    }
}