package foo.bar

import org.jetbrains.kotlin.compiler.plugin.template.SomeAnnotation

@SomeAnnotation
fun box(): String {
    val result = MyClass().bar()
    return if (result == "Hello world") {
        "OK"
    } else {
        "Fail: $result"
    }
}
