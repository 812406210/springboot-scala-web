package com.web.controller

import com.web.domain.{Book}
import com.web.service.impl.BookServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._

/**
  * @author yangwj
  * @date 2020/8/7 10:09
  */
@RestController
@RequestMapping(Array("/v1/book"))
class BookController @Autowired()(bookService: BookServiceImpl) {
  @PostMapping(Array("add"))
  def save(@RequestBody book: Book): Book = {
    bookService.save(book)
  }

  @GetMapping(Array("get"))
  def selectBookById(@RequestParam id: Integer): Book = {
    bookService.selectBookById(id)
  }

  @GetMapping(Array("name"))
  def selectBookByName(@RequestParam name: String): Array[Book] = {
    bookService.selectBookByName(name)
  }
}