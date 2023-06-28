package exercise.connections;

import exercise.TcpConnection;

public interface Connection {
    void connect(TcpConnection connection);
    void disconnect(TcpConnection connection);
    String getCurrentState();
    void write(TcpConnection connection, String data);
}

