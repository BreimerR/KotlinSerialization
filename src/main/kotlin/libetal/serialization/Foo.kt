package libetal.serialization

import kotlinx.serialization.Serializable


// same behaviour here
@Serializable
data class Foo(
    val bar: Bar,
    val arg: Boolean,
    val arg1: Boolean,
    // This arg removed on serialization
    val arg2: Boolean = false
)

