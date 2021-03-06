package com.sfxcode.sapphire.core.demo.login

import javax.inject.Named
import javax.enterprise.context.ApplicationScoped
import com.sfxcode.sapphire.core.controller.AppController
import scalafx.stage.Stage
import com.sfxcode.sapphire.core.cdi.FXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import com.sfxcode.sapphire.core.demo.login.controller.{ProfileController, LoginController}
import scalafx.scene.paint.Color._
import com.sfxcode.sapphire.core.demo.login.model.User
import com.sfxcode.sapphire.core.value.FXBean

object Application extends FXApp {

  override def applicationStage:Stage  = new PrimaryStage {
    title = "Sapphire - Login Demo"
    minWidth = 390
    minHeight = 500
    width = 500
    height = 500
    scene = new Scene {
    }
  }

}

@Named
@ApplicationScoped
class LoginApplicationController extends AppController {
  lazy val loginController = getController[LoginController]()
  lazy val profileController = getController[ProfileController]()

  var applicationUser:Option[FXBean[User]] = None

  def applicationDidLaunch() {
    println("start " + this)
    println(loginController)
    replaceSceneContent(loginController)
    showLogin()
  }

  def showLogin()  {
    replaceSceneContent(loginController)
  }

  def showMain()  {
    replaceSceneContent(profileController)
  }
}
