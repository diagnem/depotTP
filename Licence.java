package ressources;

public class Licence {
	
	private Logiciel logiciel;
	private Machine machine;
	
	public Licence (Logiciel l , Machine m) {
		this.logiciel = l;
		this.machine = m;
	}

	public Logiciel getLogiciel() {
		return logiciel;
	}

	public void setLogiciel(Logiciel logiciel) {
		this.logiciel = logiciel;
	}

	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	

}
