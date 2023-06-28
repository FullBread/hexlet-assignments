package exercise;
import exercise.connections.Connection;
import exercise.connections.Disconnected;


public class TcpConnection {
    private Connection state;
    private String ipAddress;
    private int port;
    private String buffer;

    public TcpConnection(String ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.state = new Disconnected();
    }

    public String getCurrentState() {
        return state.getCurrentState();
    }
    public void connect() {
        state.connect(this);
    }
    public void disconnect() {
        state.disconnect(this);
    }
    public void write(String data) {
        state.write(this, data);
    }

    public void setState(Connection state) {
        this.state = state;
    }
    public void setBuffer(String buffer) {
        this.buffer = buffer;
    }
}
