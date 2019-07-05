package springtv;


// import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stv")
public class STV implements TV {
	String status;
	int volume;
	
	
//	@Resource(name="ms")
//	Speaker speaker;
	
//	@Autowired
//	@Qualifier("ms")
//	Speaker speaker;
	
	@Autowired
	Speaker speaker;
	// 자동으로 speaker interface 객체 가져오기(component)
	
	
	public STV() {
		System.out.println("Constructor STV ...");
	}
	
	@Override
	public void turnOn() {
		this.status = "STV ON";
	}

	@Override
	public void turnOff() {
		this.status = "STV OFF";
	}

	@Override
	public void volumeUp(int v) {
		speaker.up();
	}

	@Override
	public void volumeDown(int v) {
		speaker.down();
	}

	@Override
	public String toString() {
		return "STV [status=" + status + ", volume=" + volume + "]";
	}
	
	
	
}




