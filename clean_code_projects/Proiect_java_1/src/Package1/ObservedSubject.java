package Package1;

public interface ObservedSubject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notify(String message);
}
