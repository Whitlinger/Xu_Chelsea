/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue(); 
	  beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.negate(); 
	  beach.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.grayscale(); 
	  beach.explore();
  }
  
  public static void testMirrorVertical()
  {
	  Picture temple = new Picture("temple.jpg");
	  temple.explore();
	  temple.mirrorVerticalRightToLeft(); 
	  temple.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorHorizontal(); 
	  beach.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorHorizontalBotToTop(); 
	  beach.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture beach = new Picture("snowman.jpg");
	  beach.explore();
	  beach.mirrorArms(); 
	  beach.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.mirrorGull(); 
	  gull.explore();
  }
  
  public static void testMyCollage()
  {
	  Picture canvas = new Picture("640x480.jpg");
	  canvas.myCollage();
      canvas.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorHorizontal(); 
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testMyCollage(); 
    //testCopy();
	//testCopy2(); 
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}