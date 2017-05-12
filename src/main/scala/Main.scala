/**
  * Created by psc on 28/04/17.
  */

import au.com.carringbushsw.Tag._

object Main extends App {
  val tag1 = new TagUuid(TagNames.Tag1)  // q: `def` allows multiple uuids to be generated for one object?
  val tag2 = new TagUuid(TagNames.Tag2)  // a: 'val' for immutable vars, `def` for function evaluated on each call
  println("tag1 = " + tag1 + ", tag1.name = " + tag1.name + ", tag1.id = " + tag1.id + ", tag1.category = " + tag1.category + "\n" +
          "tag2 = " + tag2 + ", tag2.name = " + tag2.name + ", tag2.id = " + tag2.id + ", tag2.category = " + tag2.category)

} // Main