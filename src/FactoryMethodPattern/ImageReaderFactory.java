package FactoryMethodPattern;

public class ImageReaderFactory {

  public static ImageReader getImageReader (ImageTypes types) {

    if (types == null) throw new IllegalArgumentException();
    if (types.equals(ImageTypes.JPG)) return new JpgReader();
    if (types.equals(ImageTypes.BMP)) return new BmpReader();
    if (types.equals(ImageTypes.PNG)) return new PngReader();
    throw new IllegalArgumentException();
  }

}
