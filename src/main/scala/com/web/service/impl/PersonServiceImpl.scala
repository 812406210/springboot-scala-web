package com.web.service.impl

import com.web.domain.Person
import com.web.service.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
  * @author yangwj
  * @date 2020/8/7 10:07
  */
@Service
class PersonServiceImpl  @Autowired()(personRepository: PersonRepository) {
  /**
    * 保存
    *
    * @param person 保存对象
    * @return Person
    */
  @Transactional
  def save(person: Person): Person = {
    personRepository.save(person)
  }

  /**
    * 根据Id查询
    * @param id 查询参数
    * @return Person
    */
  def selectPersonById(id: Integer): Person = {
    personRepository.findById(id).get()
  }
}
