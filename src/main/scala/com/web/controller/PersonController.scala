package com.web.controller

import com.web.domain.Person
import com.web.service.impl.PersonServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, PostMapping, RequestBody, RequestMapping, RequestParam, RestController}

/**
  * @author yangwj
  * @date 2020/8/7 10:09
  */
@RestController
@RequestMapping(Array("/v1/person"))
class PersonController @Autowired()(personService: PersonServiceImpl) {
  @PostMapping
  def save(@RequestBody person: Person): Person = {
    personService.save(person)
  }

  @GetMapping
  def selectPersonById(@RequestParam id: Integer): Person = {
    personService.selectPersonById(id)
  }
}