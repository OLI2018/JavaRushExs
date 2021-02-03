// Factory method pattern
// Java Core,  6 уровень,  13 лекция

package FactoryMethodPattern;

public class Solution {

  public static void main(String[] args) {

    ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
  }
}


