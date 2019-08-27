// See LICENSE.SiFive for license details.

package freechips.rocketchip.diplomaticobjectmodel.model

sealed trait OMCoreComplexResetType extends OMEnum
case object CoreComplexResetTypeUnspecified extends OMCoreComplexResetType
case object CoreComplexResetTypeSingleSynchronous extends OMCoreComplexResetType
case object CoreComplexResetTypeSeparateCoreAndUncoreSynchronous extends OMCoreComplexResetType

case class OMCoreComplex(
  components: Seq[OMComponent],
  documentationName: String,
  resetType: OMCoreComplexResetType,
  _types: Seq[String] = Seq("OMCoreComplex", "OMComponent", "OMCompoundType")
) extends OMComponent
