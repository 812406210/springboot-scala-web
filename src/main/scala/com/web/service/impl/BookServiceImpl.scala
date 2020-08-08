package com.web.service.impl

import com.web.domain.Book
import com.web.service.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
  * @author yangwj
  * @date 2020/8/7 10:07
  */
@Service
class BookServiceImpl @Autowired()(bookRepository: BookRepository) {
  /**
    * 保存
    *
    * @param book 保存对象
    * @return book
    */
  @Transactional
  def save(book: Book): Book = {
    bookRepository.save(book)
  }

  /**
    * 根据Id查询
    * @param id 查询参数
    * @return book
    */
  def selectBookById(id: Integer): Book = {
    bookRepository.findById(id).get()
  }

  def selectBookByName(name: String): Array[Book] = {
    val book: Array[Book] = bookRepository.selectBookByName(name)
    book
  }
}
