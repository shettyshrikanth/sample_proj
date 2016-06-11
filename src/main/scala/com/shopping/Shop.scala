package com.shopping

import com.shopping.Fruit

object Shop {

  def apply(items: Fruit*): Seq[Fruit] = {
    items.toSeq    
  }
}