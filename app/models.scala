package models

import siena.{Generator, Column, Id, Model}
import java.lang.Long
import play.i18n.Messages

/**
 * Created by IntelliJ IDEA.
 * User: rossgard
 * Date: 7/2/11
 * Time: 7:06 PM
 * To change this template use File | Settings | File Templates.
 */

class Shack extends Model {

  @Id(Generator.NONE) var id: Long = 0

  @Column(Array("name")) var name = ""

  @Column(Array("number_of_beds")) var numberOfBeds = 0

  @Column(Array("number_of_bedrooms")) var numberOfBedrooms = 0

  @Column(Array("year_built")) var yearBuilt = 0

  @Column(Array("livingArea")) var livingArea = 0

  @Column(Array("smoking_allowed")) var smokingAllowed: Boolean = _

  @Column(Array("pets_allowed")) var petsAllowed: Boolean = _

  @Column(Array("indoor_facilities")) var indoorFacilities: Array[String] = _

  var outdoorFacilities: Array[String] = _

  def indoorFacilitiesI18n() = {
    println("Indoor facilities: " + indoorFacilities)

  }

  def outdoorFacilitiesI18n() = {
    println("Outdoor facilities: " + outdoorFacilities)
  }

}

object Shack {

  def all: java.util.List[_] = Model.all(classOf[Shack]).fetch()

  def getByKey(id: Long): Shack = Model.getByKey(classOf[Shack], id: Long)

}

