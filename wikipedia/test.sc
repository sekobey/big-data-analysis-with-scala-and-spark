
case class Article(title:String, body:String)

val a = false

a match {
  case true => ("a", Article("a", "a"))
  case false =>
}