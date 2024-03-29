package com.gl3.grpc;
import com.gl3.messaging.MessagingServiceGrpc;
import com.gl3.messaging.MessagingServiceOuterClass;
import io.grpc.stub.StreamObserver;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class MessagingServiceImpl extends MessagingServiceGrpc.MessagingServiceImplBase {
  private final Map<String, List<String>> userMessages = new HashMap<>();

  @Override
  public void sendMessage(MessagingServiceOuterClass.SendMessageRequest request,
      StreamObserver<MessagingServiceOuterClass.SendMessageResponse> responseObserver) {
    String recipient = request.getRecipient();
    String message = request.getMessage();
    userMessages.computeIfAbsent(recipient, k -> new ArrayList<>()).add(message);
    responseObserver.onNext(MessagingServiceOuterClass.SendMessageResponse.newBuilder().setSuccess(true).build());
    responseObserver.onCompleted();
  }

  @Override
  public void getMessages(MessagingServiceOuterClass.GetMessagesRequest request,
      StreamObserver<MessagingServiceOuterClass.GetMessagesResponse> responseObserver) {
    String user = request.getUser();
    List<String> messages = userMessages.getOrDefault(user, Collections.emptyList());
    responseObserver.onNext(MessagingServiceOuterClass.GetMessagesResponse.newBuilder().addAllMessages(messages).build());
    responseObserver.onCompleted();
  }
}
