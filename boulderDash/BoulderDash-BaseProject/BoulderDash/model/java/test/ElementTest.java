package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Element;
import model.IDirection;
import model.IEnvironment;

public class ElementTest {
	private Element element;
	private Element player;
	@Before
	public void setUpBefore(){
		this.element = new Element(IEnvironment.Environment.WALL);
		this.player = new Element(IDirection.Direction.DOWN);
	}
	@Test
	public void testGetType(){
		IEnvironment.Environment expected = IEnvironment.Environment.WALL;
		assertEquals(expected, element.getType());
	}
	@Test
	public void testSetType(){
		IEnvironment.Environment expected = IEnvironment.Environment.WALL;
		element.setType(expected);
		assertEquals(expected, element.getType());
	}
	@Test
	public void testGetMovement(){
		IDirection.Direction expected = IDirection.Direction.DOWN;
		assertEquals(expected, player.getMovement());
	}
	@Test
	public void testSetMovement(){
		IDirection.Direction expected = IDirection.Direction.UP;
		player.setMovement(expected);
		assertEquals(expected, player.getMovement());
	}
	@Test
	public void testGetXSpriteImagePlayer(){
		int expected = 0;
		assertEquals(expected, player.getXSpriteImagePlayer(IDirection.Direction.DOWN));
	}
	@Test
	public void testGetYSpriteImagePlayer(){
		int expected = 0;
		assertEquals(expected, player.getYSpriteImagePlayer(IDirection.Direction.DOWN));
	}
	@Test
	public void testGetXSpriteImage(){
		int expected = 96;
		assertEquals(expected, element.getXSpriteImage(element.getType()));
	}
	@Test
	public void testGetYSpriteImage(){
		int expected = 0;
		assertEquals(expected, element.getYSpriteImage(element.getType()));
	}
}
