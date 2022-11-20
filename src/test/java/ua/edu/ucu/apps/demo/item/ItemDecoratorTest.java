package ua.edu.ucu.apps.demo.item;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.flower.FlowerColor;
import ua.edu.ucu.apps.demo.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class ItemDecoratorTest {
	private Item item = new Flower(15.0, FlowerColor.RED,  FlowerType.CHAMOMILE, 9.0, 1);

	@Test
	void testRibbonDecoratorPrice() {
		ItemDecorator decorator = new RibbonDecorator(item);

		Double price = decorator.getPrice();

		assertEquals(15 + 40, price);
	}

	@Test
	void testRibbonDecoratorDescription() {
		ItemDecorator decorator = new RibbonDecorator(item);

		String description = decorator.getDescription();

		assertTrue(description.contains("Ribbon packing"));
	}

	@Test
	void testPaperDecoratorPrice() {
		ItemDecorator decorator = new PaperDecorator(item);

		Double price = decorator.getPrice();

		assertEquals(15 + 13, price);
	}

	@Test
	void testPaperDecoratorDescription() {
		ItemDecorator decorator = new PaperDecorator(item);

		String description = decorator.getDescription();

		assertTrue(description.contains("Paper packing"));

	}

	@Test
	void testBasketDecoratorPrice() {
		ItemDecorator decorator = new BasketDecorator(item);

		Double price = decorator.getPrice();

		assertEquals(15 + 4, price);
	}

	@Test
	void testBasketDecoratorDescription() {
		ItemDecorator decorator = new BasketDecorator(item);

		String description = decorator.getDescription();

		assertTrue(description.contains("Basket packing"));

	}


}