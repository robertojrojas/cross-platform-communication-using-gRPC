package org.golangphilly.grpc.file.transfer;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: file/server.proto")
public final class FileTransferServiceGrpc {

  private FileTransferServiceGrpc() {}

  public static final String SERVICE_NAME = "FileTransferService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.golangphilly.grpc.file.transfer.Server.FileRequest,
      org.golangphilly.grpc.file.transfer.Server.FileResponse> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = org.golangphilly.grpc.file.transfer.Server.FileRequest.class,
      responseType = org.golangphilly.grpc.file.transfer.Server.FileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.golangphilly.grpc.file.transfer.Server.FileRequest,
      org.golangphilly.grpc.file.transfer.Server.FileResponse> getUploadMethod() {
    io.grpc.MethodDescriptor<org.golangphilly.grpc.file.transfer.Server.FileRequest, org.golangphilly.grpc.file.transfer.Server.FileResponse> getUploadMethod;
    if ((getUploadMethod = FileTransferServiceGrpc.getUploadMethod) == null) {
      synchronized (FileTransferServiceGrpc.class) {
        if ((getUploadMethod = FileTransferServiceGrpc.getUploadMethod) == null) {
          FileTransferServiceGrpc.getUploadMethod = getUploadMethod = 
              io.grpc.MethodDescriptor.<org.golangphilly.grpc.file.transfer.Server.FileRequest, org.golangphilly.grpc.file.transfer.Server.FileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "FileTransferService", "Upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.golangphilly.grpc.file.transfer.Server.FileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.golangphilly.grpc.file.transfer.Server.FileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileTransferServiceMethodDescriptorSupplier("Upload"))
                  .build();
          }
        }
     }
     return getUploadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileTransferServiceStub newStub(io.grpc.Channel channel) {
    return new FileTransferServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileTransferServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FileTransferServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileTransferServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FileTransferServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FileTransferServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<org.golangphilly.grpc.file.transfer.Server.FileRequest> upload(
        io.grpc.stub.StreamObserver<org.golangphilly.grpc.file.transfer.Server.FileResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getUploadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.golangphilly.grpc.file.transfer.Server.FileRequest,
                org.golangphilly.grpc.file.transfer.Server.FileResponse>(
                  this, METHODID_UPLOAD)))
          .build();
    }
  }

  /**
   */
  public static final class FileTransferServiceStub extends io.grpc.stub.AbstractStub<FileTransferServiceStub> {
    private FileTransferServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileTransferServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileTransferServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileTransferServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.golangphilly.grpc.file.transfer.Server.FileRequest> upload(
        io.grpc.stub.StreamObserver<org.golangphilly.grpc.file.transfer.Server.FileResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class FileTransferServiceBlockingStub extends io.grpc.stub.AbstractStub<FileTransferServiceBlockingStub> {
    private FileTransferServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileTransferServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileTransferServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileTransferServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class FileTransferServiceFutureStub extends io.grpc.stub.AbstractStub<FileTransferServiceFutureStub> {
    private FileTransferServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileTransferServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileTransferServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileTransferServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_UPLOAD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileTransferServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileTransferServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.upload(
              (io.grpc.stub.StreamObserver<org.golangphilly.grpc.file.transfer.Server.FileResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FileTransferServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileTransferServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.golangphilly.grpc.file.transfer.Server.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileTransferService");
    }
  }

  private static final class FileTransferServiceFileDescriptorSupplier
      extends FileTransferServiceBaseDescriptorSupplier {
    FileTransferServiceFileDescriptorSupplier() {}
  }

  private static final class FileTransferServiceMethodDescriptorSupplier
      extends FileTransferServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileTransferServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FileTransferServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileTransferServiceFileDescriptorSupplier())
              .addMethod(getUploadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
