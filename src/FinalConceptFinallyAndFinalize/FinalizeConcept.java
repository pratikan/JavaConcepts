package FinalConceptFinallyAndFinalize;

public class FinalizeConcept {
	//finalize()method is used for cleanup process
	public void finalize(){
		System.out.println("finalize method called");
	}

	public static void main(String[] args) {
		FinalizeConcept fz=new FinalizeConcept();
		FinalizeConcept fz1= new FinalizeConcept();
		
		fz=null;
		fz1=null;
		//Requesting JVM to call Garbage Collector method
		System.gc();

	}

}
