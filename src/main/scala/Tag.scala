/**
  * Created by psc on 28/04/17.
  */

package au.com.carringbushsw.Tag

trait Id {
  type T
  val _id: T
  def self: this.type = this
  def id: T = _id
  override def toString: String = "{" + _id + "}"
}

trait Uuid extends Id {
  type T = String
  val _id: String = java.util.UUID.randomUUID.toString
}

////////////////////////////////////////

//abstract class Tag(_category: String) { // ...traits can't have ctor args??
//  val category: String = _category
trait Tag {
  val category: String                            // ...instead of ctor arg
  override def toString: String = "/" + category  // ??trait if it supplies implementation??, but...
}

//class TagUuid(_name: String) extends Tag(TagCategories.TagUuid) with Uuid {
class TagUuid(_name: String) extends Tag with Uuid {
  val category = TagCategories.TagUuid
  val name: String = _name
  override def toString: String = name + super[Uuid].toString + super[Tag].toString
}

// constants ///////////////////////////

object TagCategories {
  val TagUuid = "taguuid"
}

object TagNames {
  val Tag1 = "tag1"
  val Tag2 = "tag2"
  val Tag3 = "tag3"
  val Tag4 = "tag4"
  val Tag5 = "tag5"
  val Tag6 = "tag6"
  val Tag7 = "tag7"
  val Tag8 = "tag8"
  val Tag9 = "tag9"
}
