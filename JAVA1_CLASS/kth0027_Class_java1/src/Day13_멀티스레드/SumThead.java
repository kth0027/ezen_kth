package Day13_멀티스레드;

public class SumThead extends Thread{

		private long sum;
		
		public long getSum() {return sum;}
		
		public void setSum(long sum) {this.sum = sum;}
		
		@Override
		public void run() {
			
			for (int i = 1; i<=100; i++) {
				sum+= i;
			}
		}
}
