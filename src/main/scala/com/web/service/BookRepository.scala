package com.web.service

import com.web.domain.Book
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

/**
  * @author yangwj
  * @date 2020/8/7 10:06
  */
trait BookRepository extends CrudRepository[Book,Integer]{

  @Query(value = "select * from book where name = ?1 ",nativeQuery = true)
  def selectBookByName(name: String): Array[Book]
}