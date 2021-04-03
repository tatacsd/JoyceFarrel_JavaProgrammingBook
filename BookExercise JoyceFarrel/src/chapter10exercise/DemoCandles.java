package chapter10exercise;

/*
 * Write an application that instantiates an object of each type and
displays the details. Save the files as Candle.java, ScentedCandle.java, and
DemoCandles.java.
 */

public class DemoCandles {
	public static void main(String[] args) {
		// Ordinary Cadle
		Candle candleOne = new Candle();
		candleOne.setColor("Yellow");
		candleOne.setHeight(4);		
		
		// Scented Candle
		ScentedCandle candleTwo =  new ScentedCandle();
		candleTwo.setColor("Purple");
		candleTwo.setScent("Lavander");
		candleTwo.setHeight(4);
		
		// Display info
		candleOne.display();
		candleTwo.display();
		
	}

}
