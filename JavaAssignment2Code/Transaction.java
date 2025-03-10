// Galagamage Dilmi Nadisha Wickramarathna

package paradis.assignment2;

import java.util.ArrayList;
import java.util.List;

class Transaction implements Runnable {
	private List<Operation> operations = new ArrayList<Operation>();
	private boolean closed = false;
	
	void add(Operation operation) {
		if (closed) return;
		operations.add(operation);
	}
	
	void close() {
		closed = true;
	}
	
	public void run() {
		if (!closed) return;
		
		// Execute the operations.
		for (Operation operation : operations) {
			operation.run();
		}
	}
}	
