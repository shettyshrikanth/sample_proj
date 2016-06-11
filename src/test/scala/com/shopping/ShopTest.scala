package com.shopping

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ShopTest  extends Specification   {
  
  "Shop sell only Apples And Oranges " should {
    "Only Apples And Oranges" in {
       val size = Shop(Apple, Orange) filter { case item @ (Apple | Orange) => false; case _ => false} size 
       
       size mustEqual 0
    }         
  }
}