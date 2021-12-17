package Day10_1;

import Day10_1.Button;

public class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다");
	}
}
