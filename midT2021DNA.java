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
	int result = 0;
	for(int i = 0; i < lukeDNA.length(); i++){
		char ch = lukeDNA.charAt(i);
		char nextCh = lukeDNA.charAt(i + 1);
		for(int l = 0; l < anakinDNA.length(); l++){
			char anCh = anakinDNA.charAt(l);
			char anNextCh = anakinDNA.charAt(l + 1);
			if(ch == anCh){
				result = result + 1;
				if(nextCh == anNextCh){
					result = result + 1;
				}
				else{
					result = 0;
				}
			}
		}
		if(result >= anakinDNA.length()/2){
			return true;
		}
	}
	return false;
	}
}