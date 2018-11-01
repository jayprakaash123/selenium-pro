package artificialIntelligence;

import java.util.Locale;
import java.util.Scanner;

import javax.speech.AudioException;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.EngineStateError;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

public class SpeechRecoganization {

	public static void main(String[] args) throws EngineException, AudioException, EngineStateError, IllegalArgumentException, InterruptedException {
	//text to voice
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter text");
	String x=sc.nextLine();
	
	//set property as kevin dictionary
	System.setProperty("freetts.voice","com.sun.speech.freetts.en.us.cmu_us_kal.kevinVoiceDirectory");
	
	//Register Engine
	Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
	
	//Creat Synthesizer
	Synthesizer syn=Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
	
	//Allocate Synthesizer
     syn.allocate();
     //Resume Synthesizer
     syn.resume();
     //speak the given text until queue is empty
     syn.speakPlainText(x, null);
     syn.waitEngineState(Synthesizer.QUEUE_EMPTY);
     //deallocate Synthesizer
     syn.deallocate();
     
     
     
	}

}
