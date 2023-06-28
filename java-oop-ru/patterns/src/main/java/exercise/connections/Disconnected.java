package exercise.connections;

import exercise.TcpConnection;

public class Disconnected implements Connection {
    @Override
    public void connect(TcpConnection connection) {
        connection.setState(new Connected());
    }

    @Override
    public void disconnect(TcpConnection connection) {
        System.out.println("Error! Connection already disconnected");
    }

    @Override
    public String getCurrentState() {
        return "disconnected";
    }

    @Override
    public void write(TcpConnection connection, String data) {
        System.out.println("Error! Cannot write data. Connection is disconnected");
    }
}
