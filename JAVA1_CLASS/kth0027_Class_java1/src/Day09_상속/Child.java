package Day09_»ó¼Ó;

public class Child extends Parent {

		private String name;
		
		public Child() {
			this("È«±æµ¿");
			System.out.println("child call");
		}
		
		public Child (String name) {
			this.name = name;
			System.out.println("child String name");
		}
}
