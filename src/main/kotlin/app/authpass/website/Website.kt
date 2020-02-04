package app.authpass.website

import com.dc2f.ContentDef
import com.dc2f.common.Generator
import com.dc2f.common.contentdef.BaseWebsite
import com.dc2f.common.theme.BaseTheme
import com.dc2f.render.*
import com.dc2f.util.Dc2fConfig

class WebsiteTheme : BaseTheme() {
    override fun configure(config: ThemeConfig) {
        super.configure(config)
    }

}

interface StoreUrls : ContentDef {
    val ios: String
    val android: String
    val macos: String
}

abstract class AuthPassWebsite : BaseWebsite {
    abstract val storeUrls: StoreUrls

    override fun createLinkedData(context: RenderContext<*>): Map<String, Any?>? =
        requireNotNull(super.createLinkedData(context)) +
            mapOf(
                "aggregateRating" to mapOf(
                    "@type" to "AggregateRating",
                    "ratingValue" to "5",
                    "bestRating" to "5",
                    "reviewCount" to "1"
                )
            )
}

fun main(argv: Array<String>) {
    Generator(
        Dc2fConfig(
            contentDirectory = "web/content",
            staticDirectory = "web/static",
            rootContentType = AuthPassWebsite::class,
            theme = WebsiteTheme(),
            urlConfigFromRootContent = { it.config.url },
            assetBaseDirectory = "src/main/resources"
        )
    ).main(argv)
//    Generator.generate(
//        Generator.Dc2fConfig(
//            contentDirectory = "web/content",
//            staticDirectory = "web/static",
//            setupClass = WebsiteSetup::class
//        )
//    )
}