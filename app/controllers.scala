package controllers

import _root_.models.Shack
import play._
import libs.F.Action
import modules.siena.SienaFixtures
import mvc._
import templates.Template
import java.util.Date
import controllers.Shacks

object Application extends Controller {

  def index = Template

  def initDb = {
    if (Shack.all.size() == 0) {
      println("Creating Shack db")
      val shack = SienaFixtures.loadModels("shacks.yml");
      println("Shack: " + shack)

    }
  }
}

object Gallery extends Controller {

  def index = Template
}

object Activities extends Controller {

  def index = Template
}

object Shacks extends Controller {
  def index = Template

  def listCabins(checkInDate: Date, checkOutDate: Date) = {
    Template(
      'shacks -> Shack.all,
      'checkInDate -> checkInDate,
      'checkOutDate -> checkOutDate
    )
  }

  def showCabin(id: Long) = {
    Template(
      'shack -> Shack.getByKey(id)
    )
  }

  def book(id: Long) {

  }

  def showCabin(id: Long, checkInDate: Date, checkOutDate: Date) {
    Template(
      'shack -> Shack.getByKey(id),
      'checkInDate -> checkInDate,
      'checkOutDate -> checkOutDate
    )
  }
}

object Estate extends Controller {

  def index = Template
}

object Contact extends Controller {

  def index = Template
}