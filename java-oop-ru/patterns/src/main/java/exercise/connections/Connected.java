package exercise.connections;

import exercise.TcpConnection;

public class Connected implements Connection {
    @Override
    public void connect(TcpConnection connection) {
        System.out.println("Error! Connection already connected");
    }

    @Override
    public void disconnect(TcpConnection connection) {
        connection.setState(new Disconnected());
    }

    @Override
    public String getCurrentState() {
        return "connected";
    }

    @Override
    public void write(TcpConnection connection, String data) {
        connection.setBuffer(data);
    }
}
