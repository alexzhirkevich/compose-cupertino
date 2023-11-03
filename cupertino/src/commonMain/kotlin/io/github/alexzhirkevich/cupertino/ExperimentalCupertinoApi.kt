package io.github.alexzhirkevich.cupertino


@RequiresOptIn(
    level = RequiresOptIn.Level.WARNING,
    message = "This is an experimental API and is likely to change before becoming stable."
)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.PROPERTY_GETTER
)
@Retention(AnnotationRetention.BINARY)
annotation class ExperimentalCupertinoApi()
