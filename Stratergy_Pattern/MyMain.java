package Stratergy_Pattern;

public class MyMain {
	public static void main(String[] args) {
		ImageStorage imageStorage = new ImageStorage();
		imageStorage.store("a" , new JpegCompressor(), new BlackAndWhiteFilter());
		imageStorage.store("b" , new PngCompressor(), new BlackAndWhiteFilter());
	}
}
