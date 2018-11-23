import java.util.List;

public interface IObservable {

	void register(IObserver observer);
	void remove(IObserver observer);
}
