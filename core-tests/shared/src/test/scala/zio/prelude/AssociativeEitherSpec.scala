package zio.prelude

import zio.prelude.laws.AssociativeEitherLaws
import zio.test._
import zio.test.laws._

object AssociativeEitherSpec extends ZIOSpecDefault {

  def spec: Spec[Environment, Any] =
    suite("AssociativeEitherSpec")(
      suite("laws")(
        test("either")(checkAllLaws(AssociativeEitherLaws)(GenF.either(Gen.int), Gen.int))
      )
    )
}
