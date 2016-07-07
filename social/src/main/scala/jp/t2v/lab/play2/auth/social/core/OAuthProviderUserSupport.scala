package jp.t2v.lab.play2.auth.social.core

import scala.concurrent.{ ExecutionContext, Future }

trait OAuthProviderUserSupport[AccessToken] {

  type ProviderUser

  def retrieveProviderUser(accessToken: AccessToken)(implicit ctx: ExecutionContext): Future[ProviderUser]

}
