package com.web.service

import com.web.domain.Person
import org.springframework.data.repository.CrudRepository

/**
  * @author yangwj
  * @date 2020/8/7 10:06
  */
trait PersonRepository extends CrudRepository[Person,Integer]{

}