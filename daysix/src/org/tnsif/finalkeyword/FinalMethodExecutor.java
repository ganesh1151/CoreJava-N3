package org.tnsif.finalkeyword;

public class FinalMethodExecutor {

	public static void main(String[] args) {
		Pineapple p=new Pineapple();
		p.flavour="MixedFruit";
		p.display();
		p.setPrice(250);
		System.out.println(p.getPrice());
	}

}
