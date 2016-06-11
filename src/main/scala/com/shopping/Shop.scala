package com.shopping

object Shop {
 
  def apply(items: Fruit*): Seq[Fruit] = {
    items.toSeq    
  }

  def checkout(shoppingCart: Fruit *) : BigDecimal = {
    shoppingCart map (item => item.price) sum
  }
}