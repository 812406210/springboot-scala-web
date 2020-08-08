package com.web.domain

import javax.persistence.{Entity, GeneratedValue, Id, Table}

import scala.beans.BeanProperty

/**
  * @author yangwj
  * @date 2020/8/7 10:02
  */
@Entity
@Table
class Person {
  @Id
  @GeneratedValue
  @BeanProperty
  var id:Integer = _

  @BeanProperty
  var name:String = _

  @BeanProperty
  var sex:String = _
}