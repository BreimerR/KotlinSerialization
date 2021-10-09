package libetal.serialization

import kotlinx.serialization.Serializable

/*
* Wrong data serialized*/
// If all default are true none
// is serialized
// If actual value == default value
// item isn't serialized
@Serializable
data class Bar(
    // unsorted isn't serialized
    var unsorted: Int = 12,
    // not serialized
    val sorted: Boolean = false,
    // serialized despite having a
    // default value defined
    val empty: Boolean = true
)