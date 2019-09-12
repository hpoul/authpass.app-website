package app.authpass.website

import com.dc2f.common.*
import com.dc2f.common.contentdef.BaseWebsite
import com.dc2f.common.theme.baseTheme
import com.dc2f.render.*
import com.dc2f.util.Dc2fSetup
import kotlin.reflect.KClass

class WebsiteTheme : Theme() {
    override fun configure(config: ThemeConfig) {
        baseTheme()
    }

}

class WebsiteSetup : Dc2fSetup<BaseWebsite> {
    override val rootContent = BaseWebsite::class
    override val theme: Theme
        get() = WebsiteTheme()

    override fun urlConfig(rootConfig: BaseWebsite): UrlConfig =
        rootConfig.config.url

}

fun main(argv: Array<String>) {
    Generator(Dc2fConfig(
        contentDirectory = "web/content",
        staticDirectory = "web/static",
        setupClass = WebsiteSetup::class
    )).main(argv)
//    Generator.generate(
//        Generator.Dc2fConfig(
//            contentDirectory = "web/content",
//            staticDirectory = "web/static",
//            setupClass = WebsiteSetup::class
//        )
//    )
}