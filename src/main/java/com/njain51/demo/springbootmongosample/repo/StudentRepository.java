package com.njain51.demo.springbootmongosample.repo;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 6/18/2022, Saturday
 **/

import com.njain51.demo.springbootmongosample.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 What this program snippet doing?
 **/
// this will basically provides all methods related to mongo database in this repository.
public interface StudentRepository extends MongoRepository<Student,Integer>  // we are working with Student class and id is Integer type

{

}
