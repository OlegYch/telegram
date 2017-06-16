package info.mukel.telegrambot4s

import info.mukel.telegrambot4s.models.{CallbackQuery, Message}

trait ApiTypes {
  type Action[T] = T => Unit
  type Filter[T] = T => Boolean
  type Args = Seq[String]

  type MessageAction = Action[Message]
  type MessageActionWith[T] = Message => T => Unit
  type MessageActionWithArgs = MessageActionWith[Args]
  type MessageFilter = Filter[Message]

  type CallbackQueryAction = Action[CallbackQuery]
  type CallbackQueryFilter = Filter[CallbackQuery]
}
