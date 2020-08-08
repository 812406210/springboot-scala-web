package com.web.domain

import javax.persistence.{Entity, GeneratedValue, Id, Table}

import scala.beans.BeanProperty

/**
  * @author yangwj
  * @date 2020/8/7 10:02
  */
@Entity
@Table
class Book {
  @Id
  @GeneratedValue
  @BeanProperty
  var id:Integer = _

  @BeanProperty
  var name:String = _

  @BeanProperty
  var price:Integer = _

  @BeanProperty
  var author:String = _

  @BeanProperty
  var bookVersion:Integer = _

  @BeanProperty
  var publishDate:String = _

}