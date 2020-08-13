package com.github.perscholas;


import com.github.perscholas.utils.IOConsole;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CartSystem extends TheSystem {
	IOConsole console = new IOConsole();
	CartSystem() throws IOException {
		super();
	}

	@Override
	public void display() {
		getItemCollection().forEach((s, item) -> console.print(s + " price: " + item.getItemPrice()) );
		double sum = getItemCollection().values().stream().mapToDouble(item -> item.getQuantity() * item.getItemPrice()).sum();
		System.out.println("Sum: " + sum);
	}

}
