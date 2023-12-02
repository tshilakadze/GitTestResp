import acm.program.*;
public class midT2021DNA extends ConsoleProgram {
	public void run() {
	String lukeDNA = readLine("Luke's DNA: ");
	String anakinDNA = readLine("Anakin's DNA: ");
	lukeDNA = lukeDNA.toUpperCase();
	anakinDNA = anakinDNA.toUpperCase();
	println(amIYourFatherLuke(lukeDNA, anakinDNA));
	
}

	private boolean amIYourFatherLuke(String lukeDNA, String anakinDNA){
		for(int i = 0; i < lukeDNA.length(); i++){
			for(int j = 0; j < anakinDNA.length(); j++){
				String DNA = lukeDNA.substring(i, j);
				if(anakinDNA.contains(DNA) && DNA.length() > anakinDNA.length()/2){
					return true;
				}
			}
		}
	return false;
	}
}