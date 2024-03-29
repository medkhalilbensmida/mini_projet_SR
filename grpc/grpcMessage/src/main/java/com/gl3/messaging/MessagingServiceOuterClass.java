
package com.gl3.messaging;

public final class MessagingServiceOuterClass {
  private MessagingServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SendMessageRequestOrBuilder extends
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string recipient = 1;</code>
     */
    java.lang.String getRecipient();
    /**
     * <code>string recipient = 1;</code>
     */
    com.google.protobuf.ByteString
        getRecipientBytes();

    /**
     * <code>string message = 2;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>string message = 2;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();
  }
  /**
   * Protobuf type {@code com.gl3.messaging.SendMessageRequest}
   */
  public  static final class SendMessageRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.gl3.messaging.SendMessageRequest)
      SendMessageRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SendMessageRequest.newBuilder() to construct.
    private SendMessageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SendMessageRequest() {
      recipient_ = "";
      message_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SendMessageRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              recipient_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              message_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_SendMessageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_SendMessageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest.class, com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest.Builder.class);
    }

    public static final int RECIPIENT_FIELD_NUMBER = 1;
    private volatile java.lang.Object recipient_;
    /**
     * <code>string recipient = 1;</code>
     */
    public java.lang.String getRecipient() {
      java.lang.Object ref = recipient_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recipient_ = s;
        return s;
      }
    }
    /**
     * <code>string recipient = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRecipientBytes() {
      java.lang.Object ref = recipient_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recipient_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;
    private volatile java.lang.Object message_;
    /**
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getRecipientBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, recipient_);
      }
      if (!getMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getRecipientBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, recipient_);
      }
      if (!getMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest)) {
        return super.equals(obj);
      }
      com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest other = (com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest) obj;

      boolean result = true;
      result = result && getRecipient()
          .equals(other.getRecipient());
      result = result && getMessage()
          .equals(other.getMessage());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RECIPIENT_FIELD_NUMBER;
      hash = (53 * hash) + getRecipient().hashCode();
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.gl3.messaging.SendMessageRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.gl3.messaging.SendMessageRequest)
        com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_SendMessageRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_SendMessageRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest.class, com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest.Builder.class);
      }

      // Construct using com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        recipient_ = "";

        message_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_SendMessageRequest_descriptor;
      }

      @java.lang.Override
      public com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest getDefaultInstanceForType() {
        return com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest build() {
        com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest buildPartial() {
        com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest result = new com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest(this);
        result.recipient_ = recipient_;
        result.message_ = message_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest) {
          return mergeFrom((com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest other) {
        if (other == com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest.getDefaultInstance()) return this;
        if (!other.getRecipient().isEmpty()) {
          recipient_ = other.recipient_;
          onChanged();
        }
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object recipient_ = "";
      /**
       * <code>string recipient = 1;</code>
       */
      public java.lang.String getRecipient() {
        java.lang.Object ref = recipient_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          recipient_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string recipient = 1;</code>
       */
      public com.google.protobuf.ByteString
          getRecipientBytes() {
        java.lang.Object ref = recipient_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          recipient_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string recipient = 1;</code>
       */
      public Builder setRecipient(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        recipient_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string recipient = 1;</code>
       */
      public Builder clearRecipient() {
        
        recipient_ = getDefaultInstance().getRecipient();
        onChanged();
        return this;
      }
      /**
       * <code>string recipient = 1;</code>
       */
      public Builder setRecipientBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        recipient_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>string message = 2;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message = 2;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string message = 2;</code>
       */
      public Builder clearMessage() {
        
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>string message = 2;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        message_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.gl3.messaging.SendMessageRequest)
    }

    // @@protoc_insertion_point(class_scope:com.gl3.messaging.SendMessageRequest)
    private static final com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest();
    }

    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SendMessageRequest>
        PARSER = new com.google.protobuf.AbstractParser<SendMessageRequest>() {
      @java.lang.Override
      public SendMessageRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SendMessageRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SendMessageRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SendMessageRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.gl3.messaging.MessagingServiceOuterClass.SendMessageRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SendMessageResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.gl3.messaging.SendMessageResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool success = 1;</code>
     */
    boolean getSuccess();
  }
  /**
   * Protobuf type {@code com.gl3.messaging.SendMessageResponse}
   */
  public  static final class SendMessageResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.gl3.messaging.SendMessageResponse)
      SendMessageResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SendMessageResponse.newBuilder() to construct.
    private SendMessageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SendMessageResponse() {
      success_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SendMessageResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              success_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_SendMessageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_SendMessageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse.class, com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse.Builder.class);
    }

    public static final int SUCCESS_FIELD_NUMBER = 1;
    private boolean success_;
    /**
     * <code>bool success = 1;</code>
     */
    public boolean getSuccess() {
      return success_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (success_ != false) {
        output.writeBool(1, success_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (success_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, success_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse)) {
        return super.equals(obj);
      }
      com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse other = (com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse) obj;

      boolean result = true;
      result = result && (getSuccess()
          == other.getSuccess());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSuccess());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.gl3.messaging.SendMessageResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.gl3.messaging.SendMessageResponse)
        com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_SendMessageResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_SendMessageResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse.class, com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse.Builder.class);
      }

      // Construct using com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        success_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_SendMessageResponse_descriptor;
      }

      @java.lang.Override
      public com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse getDefaultInstanceForType() {
        return com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse.getDefaultInstance();
      }

      @java.lang.Override
      public com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse build() {
        com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse buildPartial() {
        com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse result = new com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse(this);
        result.success_ = success_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse) {
          return mergeFrom((com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse other) {
        if (other == com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse.getDefaultInstance()) return this;
        if (other.getSuccess() != false) {
          setSuccess(other.getSuccess());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean success_ ;
      /**
       * <code>bool success = 1;</code>
       */
      public boolean getSuccess() {
        return success_;
      }
      /**
       * <code>bool success = 1;</code>
       */
      public Builder setSuccess(boolean value) {
        
        success_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool success = 1;</code>
       */
      public Builder clearSuccess() {
        
        success_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.gl3.messaging.SendMessageResponse)
    }

    // @@protoc_insertion_point(class_scope:com.gl3.messaging.SendMessageResponse)
    private static final com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse();
    }

    public static com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SendMessageResponse>
        PARSER = new com.google.protobuf.AbstractParser<SendMessageResponse>() {
      @java.lang.Override
      public SendMessageResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SendMessageResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SendMessageResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SendMessageResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.gl3.messaging.MessagingServiceOuterClass.SendMessageResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetMessagesRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.gl3.messaging.GetMessagesRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string user = 1;</code>
     */
    java.lang.String getUser();
    /**
     * <code>string user = 1;</code>
     */
    com.google.protobuf.ByteString
        getUserBytes();
  }
  /**
   * Protobuf type {@code com.gl3.messaging.GetMessagesRequest}
   */
  public  static final class GetMessagesRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.gl3.messaging.GetMessagesRequest)
      GetMessagesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetMessagesRequest.newBuilder() to construct.
    private GetMessagesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetMessagesRequest() {
      user_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetMessagesRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              user_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_GetMessagesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_GetMessagesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest.class, com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest.Builder.class);
    }

    public static final int USER_FIELD_NUMBER = 1;
    private volatile java.lang.Object user_;
    /**
     * <code>string user = 1;</code>
     */
    public java.lang.String getUser() {
      java.lang.Object ref = user_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        user_ = s;
        return s;
      }
    }
    /**
     * <code>string user = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserBytes() {
      java.lang.Object ref = user_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        user_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getUserBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, user_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getUserBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, user_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest)) {
        return super.equals(obj);
      }
      com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest other = (com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest) obj;

      boolean result = true;
      result = result && getUser()
          .equals(other.getUser());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.gl3.messaging.GetMessagesRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.gl3.messaging.GetMessagesRequest)
        com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_GetMessagesRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_GetMessagesRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest.class, com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest.Builder.class);
      }

      // Construct using com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        user_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_GetMessagesRequest_descriptor;
      }

      @java.lang.Override
      public com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest getDefaultInstanceForType() {
        return com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest build() {
        com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest buildPartial() {
        com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest result = new com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest(this);
        result.user_ = user_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest) {
          return mergeFrom((com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest other) {
        if (other == com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest.getDefaultInstance()) return this;
        if (!other.getUser().isEmpty()) {
          user_ = other.user_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object user_ = "";
      /**
       * <code>string user = 1;</code>
       */
      public java.lang.String getUser() {
        java.lang.Object ref = user_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          user_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string user = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUserBytes() {
        java.lang.Object ref = user_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          user_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string user = 1;</code>
       */
      public Builder setUser(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        user_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string user = 1;</code>
       */
      public Builder clearUser() {
        
        user_ = getDefaultInstance().getUser();
        onChanged();
        return this;
      }
      /**
       * <code>string user = 1;</code>
       */
      public Builder setUserBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        user_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.gl3.messaging.GetMessagesRequest)
    }

    // @@protoc_insertion_point(class_scope:com.gl3.messaging.GetMessagesRequest)
    private static final com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest();
    }

    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetMessagesRequest>
        PARSER = new com.google.protobuf.AbstractParser<GetMessagesRequest>() {
      @java.lang.Override
      public GetMessagesRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetMessagesRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetMessagesRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetMessagesRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.gl3.messaging.MessagingServiceOuterClass.GetMessagesRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetMessagesResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.gl3.messaging.GetMessagesResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string messages = 1;</code>
     */
    java.util.List<java.lang.String>
        getMessagesList();
    /**
     * <code>repeated string messages = 1;</code>
     */
    int getMessagesCount();
    /**
     * <code>repeated string messages = 1;</code>
     */
    java.lang.String getMessages(int index);
    /**
     * <code>repeated string messages = 1;</code>
     */
    com.google.protobuf.ByteString
        getMessagesBytes(int index);
  }
  /**
   * Protobuf type {@code com.gl3.messaging.GetMessagesResponse}
   */
  public  static final class GetMessagesResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.gl3.messaging.GetMessagesResponse)
      GetMessagesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetMessagesResponse.newBuilder() to construct.
    private GetMessagesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetMessagesResponse() {
      messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetMessagesResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                messages_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              messages_.add(s);
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          messages_ = messages_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_GetMessagesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_GetMessagesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse.class, com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse.Builder.class);
    }

    public static final int MESSAGES_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList messages_;
    /**
     * <code>repeated string messages = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMessagesList() {
      return messages_;
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public int getMessagesCount() {
      return messages_.size();
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public java.lang.String getMessages(int index) {
      return messages_.get(index);
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessagesBytes(int index) {
      return messages_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < messages_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, messages_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < messages_.size(); i++) {
          dataSize += computeStringSizeNoTag(messages_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getMessagesList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse)) {
        return super.equals(obj);
      }
      com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse other = (com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse) obj;

      boolean result = true;
      result = result && getMessagesList()
          .equals(other.getMessagesList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getMessagesCount() > 0) {
        hash = (37 * hash) + MESSAGES_FIELD_NUMBER;
        hash = (53 * hash) + getMessagesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.gl3.messaging.GetMessagesResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.gl3.messaging.GetMessagesResponse)
        com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_GetMessagesResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_GetMessagesResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse.class, com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse.Builder.class);
      }

      // Construct using com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.gl3.messaging.MessagingServiceOuterClass.internal_static_com_gl3_messaging_GetMessagesResponse_descriptor;
      }

      @java.lang.Override
      public com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse getDefaultInstanceForType() {
        return com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse.getDefaultInstance();
      }

      @java.lang.Override
      public com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse build() {
        com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse buildPartial() {
        com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse result = new com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          messages_ = messages_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.messages_ = messages_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse) {
          return mergeFrom((com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse other) {
        if (other == com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse.getDefaultInstance()) return this;
        if (!other.messages_.isEmpty()) {
          if (messages_.isEmpty()) {
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMessagesIsMutable();
            messages_.addAll(other.messages_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.LazyStringList messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureMessagesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          messages_ = new com.google.protobuf.LazyStringArrayList(messages_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string messages = 1;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getMessagesList() {
        return messages_.getUnmodifiableView();
      }
      /**
       * <code>repeated string messages = 1;</code>
       */
      public int getMessagesCount() {
        return messages_.size();
      }
      /**
       * <code>repeated string messages = 1;</code>
       */
      public java.lang.String getMessages(int index) {
        return messages_.get(index);
      }
      /**
       * <code>repeated string messages = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMessagesBytes(int index) {
        return messages_.getByteString(index);
      }
      /**
       * <code>repeated string messages = 1;</code>
       */
      public Builder setMessages(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureMessagesIsMutable();
        messages_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string messages = 1;</code>
       */
      public Builder addMessages(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureMessagesIsMutable();
        messages_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string messages = 1;</code>
       */
      public Builder addAllMessages(
          java.lang.Iterable<java.lang.String> values) {
        ensureMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, messages_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string messages = 1;</code>
       */
      public Builder clearMessages() {
        messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string messages = 1;</code>
       */
      public Builder addMessagesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureMessagesIsMutable();
        messages_.add(value);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.gl3.messaging.GetMessagesResponse)
    }

    // @@protoc_insertion_point(class_scope:com.gl3.messaging.GetMessagesResponse)
    private static final com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse();
    }

    public static com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetMessagesResponse>
        PARSER = new com.google.protobuf.AbstractParser<GetMessagesResponse>() {
      @java.lang.Override
      public GetMessagesResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetMessagesResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetMessagesResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetMessagesResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.gl3.messaging.MessagingServiceOuterClass.GetMessagesResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gl3_messaging_SendMessageRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gl3_messaging_SendMessageRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gl3_messaging_SendMessageResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gl3_messaging_SendMessageResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gl3_messaging_GetMessagesRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gl3_messaging_GetMessagesRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gl3_messaging_GetMessagesResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gl3_messaging_GetMessagesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027messaging_service.proto\022\021com.gl3.messa" +
      "ging\"8\n\022SendMessageRequest\022\021\n\trecipient\030" +
      "\001 \001(\t\022\017\n\007message\030\002 \001(\t\"&\n\023SendMessageRes" +
      "ponse\022\017\n\007success\030\001 \001(\010\"\"\n\022GetMessagesReq" +
      "uest\022\014\n\004user\030\001 \001(\t\"\'\n\023GetMessagesRespons" +
      "e\022\020\n\010messages\030\001 \003(\t2\322\001\n\020MessagingService" +
      "\022^\n\013SendMessage\022%.com.gl3.messaging.Send" +
      "MessageRequest\032&.com.gl3.messaging.SendM" +
      "essageResponse\"\000\022^\n\013GetMessages\022%.com.gl" +
      "3.messaging.GetMessagesRequest\032&.com.gl3" +
      ".messaging.GetMessagesResponse\"\000b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_gl3_messaging_SendMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_gl3_messaging_SendMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gl3_messaging_SendMessageRequest_descriptor,
        new java.lang.String[] { "Recipient", "Message", });
    internal_static_com_gl3_messaging_SendMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_gl3_messaging_SendMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gl3_messaging_SendMessageResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_com_gl3_messaging_GetMessagesRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_gl3_messaging_GetMessagesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gl3_messaging_GetMessagesRequest_descriptor,
        new java.lang.String[] { "User", });
    internal_static_com_gl3_messaging_GetMessagesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_gl3_messaging_GetMessagesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gl3_messaging_GetMessagesResponse_descriptor,
        new java.lang.String[] { "Messages", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
