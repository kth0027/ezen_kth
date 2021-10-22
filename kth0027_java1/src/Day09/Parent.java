package Day09;

public class Parent {

		public String nation;
		
		public Parent() {
			this("¥Î«—πŒ±π");
			System.out.println("Parent() Call");
		}
		
		public Parent ( String nation ) {
			this.nation = nation;
			System.out.println("parent String nation");
		}
}
