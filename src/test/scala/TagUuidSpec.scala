/**
  * Created by psc on 28/04/17.
  */

package au.com.carringbushsw.Tag

import org.scalatest.FlatSpec
import TagCategories._
import TagNames._

class TagUuidSpec extends FlatSpec {

  private val tag1 = new TagUuid(Tag1) // q: `def` allows multiple uuids to be generated for one object?
  private val tag2 = new TagUuid(Tag2) // a: `val` for immutable vars, `def` for function evaluated on each call

  "A TagUuid" should "have a unique id" in {
    println(tag1 + "\n" + tag2)
    assert(
      (tag1.id === tag1.id) &&
      (tag2.id === tag2.id) &&
      (tag1.id !== tag2.id))
  }

  it should "be in category('taguuid')" in {
    assert(
      (tag1.category === TagUuid) &&
      (tag2.category === TagUuid))
  }

  it should "have different names('tag1' and 'tag2')" in {
    assert(
      (tag1.name === Tag1) &&
      (tag2.name === Tag2) &&
      (tag1.name !== tag2.name))
  }
} // TagUuidSpec
