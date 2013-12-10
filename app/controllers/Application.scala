package controllers

import anorm._
import play.api._
import play.api.Play.current 
import play.api.mvc._
import play.api.db._

object Application extends Controller {
	def index = Action { implicit request =>
		println(request.getQueryString("foo"))
		DB.withConnection { implicit c =>
			val result = SQL("Select * from places")
			val show = result().map(row => 
				row[String]("X_place") -> row[String]("Y_place")
			).toList
			Ok(views.html.index(show))
		} 
	}
	
	def timeBrowse = Action { implicit request =>
		println(request.getQueryString("foo"))
		DB.withConnection { implicit c =>
			val result = SQL("Select * from places")
			val show = result().map(row => 
				row[String]("X_place") -> row[String]("Y_place")
			).toList
			Ok(views.html.time(show))
		} 
	}
	def keywordBrowse = Action { implicit request =>
		println(request.getQueryString("foo"))
		DB.withConnection { implicit c =>
			val result = SQL("Select * from places")
			val show = result().map(row => 
				row[String]("X_place") -> row[String]("Y_place")
			).toList
			Ok(views.html.keywords(show))
		} 
	}
	def personBrowse = Action { implicit request =>
		println(request.getQueryString("foo"))
		DB.withConnection { implicit c =>
			val result = SQL("Select * from places")
			val show = result().map(row => 
				row[String]("X_place") -> row[String]("Y_place")
			).toList
			Ok(views.html.person(show))
		} 
	}
	def resultsBrowse = Action { implicit request =>
		println(request.getQueryString("foo"))
		DB.withConnection { implicit c =>
			val result = SQL("Select * from places")
			val show = result().map(row => 
				row[String]("X_place") -> row[String]("Y_place")
			).toList
			Ok(views.html.results(show))
		} 
	}
	def itemShow = Action { implicit request =>
		println(request.getQueryString("foo"))
		DB.withConnection { implicit c =>
			val result = SQL("Select * from places")
			val show = result().map(row => 
				row[String]("X_place") -> row[String]("Y_place")
			).toList
			Ok(views.html.item(show))
		} 
	}
	def organizationsShow = Action { implicit request =>
		println(request.getQueryString("foo"))
		DB.withConnection { implicit c =>
			val result = SQL("Select * from places")
			val show = result().map(row => 
				row[String]("X_place") -> row[String]("Y_place")
			).toList
			Ok(views.html.organizations(show))
		} 
	}

}