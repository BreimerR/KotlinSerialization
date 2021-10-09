package libetal.serialization

import kotlinx.serialization.json.Json
import kotlin.test.Test


/*Serializer fails if default values are provided for this situations*/
class FooTest {

    @Test
    fun testJsonSerialization() {
        println(
            Json.encodeToString(
                Foo.serializer(), Foo(
                    Bar(
                        unsorted = 12,
                        sorted = false,
                        empty = false
                    ),
                    arg = true,
                    arg1 = true,
                    arg2 = false
                )
            )
        )
    }
}