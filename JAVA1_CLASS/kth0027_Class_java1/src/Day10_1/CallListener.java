package Day10_1;

import Day10_1.Button;

public class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전원을 켭니다");
	}
}
