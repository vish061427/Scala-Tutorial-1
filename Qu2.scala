def main(args: Array[String])= {
      var a: Int = 2;
      var b: Int = 3;
      var c: Int = 4;
      var d: Int = 5;
      var k : Float = 4.3;

      
      b -= 1;
      d -= 1;
      println(b * a + c *d);

      a += 1;
      println(a);

      c += 1;
      println(c);

      c = (c+1)*(a+1);
      println(c)
     
   }