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
	String result = "";
	if(lukeDNA.length() < anakinDNA.length()/2){
		return false;
	}
	else{
		for(int i = 0; i < lukeDNA.length(); i++){
			char lCh = lukeDNA.charAt(i);
			for(int l = 0; l < anakinDNA.length(); l++){
				char aCh = anakinDNA.charAt(l);
				if(lCh == aCh){
					result += lCh;
					i = i + 1;
					l = l + 1;
				}
				else{
					result = "";
				}
			}
		}
		println(result);
			if(result.length() >= anakinDNA.length()/2){
				return true;
			}
	}
	
	return false;
	}
}