package app.authpass.website

import com.dc2f.ContentDef
import com.dc2f.Renderable
import com.dc2f.common.Generator
import com.dc2f.common.contentdef.Article
import com.dc2f.common.contentdef.BaseWebsite
import com.dc2f.common.contentdef.PageSeo
import com.dc2f.common.theme.BaseTheme
import com.dc2f.render.*
import com.dc2f.util.Dc2fConfig
import kotlinx.html.*
import org.apache.commons.text.StringEscapeUtils
import org.w3c.dom.Document

class WebsiteTheme : BaseTheme() {
    @Suppress("RedundantOverride")
    override fun configure(config: ThemeConfig) {
        super.configure(config)
    }

    override fun <T> baseTemplate(
      tc: TagConsumer<T>,
      context: RenderContext<*>,
      seo: PageSeo,
      headInject: HEAD.() -> Unit,
      navbarMenuOverride: (DIV.() -> Unit)?,
      mainContent: DIV.() -> Unit
    ): Document {
        return super.baseTemplate(
          tc,
          context,
          seo,
          headInject,
          navbarMenuOverride
        ) {
            mainContent()
            if (context.node is Article) {
                div("container") {
                    div("section") {
                        div("columns") {
                            div("column is-offset-2 is-8 is-centered") {
                                unsafe { raw(renderSurveySparrow(context)) }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Suppress("unused")
interface StoreUrls : ContentDef {
    val ios: String
    val android: String
    val macos: String
}

class SurveySparrow : Renderable {
    override fun renderContent(
      renderContext: RenderContext<*>,
      arguments: Any?
    ): String {
        return renderSurveySparrow(renderContext)
    }

}

private fun renderSurveySparrow(renderContext: RenderContext<*>): String {
    val permalink = renderContext.node.let {
        StringEscapeUtils.escapeJson(
          renderContext.href(
            it,
            absoluteUrl = false
          )
        )
    } ?: ""
    //language=html
    return """
    <script>
        window.sparrowConfig = {
            triggerOnLoad: false
        };
        function sparrowOnLoad() {
            window.SparrowLauncher('popup', {
                variables: {
                    'page': "$permalink",
                    'domain': window.location.host
                }
            });
        }
    </script>
    <script>(function(){var e="ss-widget",t="script",a=document,r=window;var s,n,c;r.SS_WIDGET_TOKEN="tt-cfae4c";r.SS_ACCOUNT="codeuxdesign.surveysparrow.com";r.SS_SURVEY_NAME="authpass-helpful";if(!a.getElementById(e)){var S=function(){S.update(arguments)};S.args=[];S.update=function(e){S.args.push(e)};r.SparrowLauncher=S;s=a.getElementsByTagName(t);c=s[s.length-1];n=a.createElement(t);n.type="text/javascript";n.async=!0;n.id=e;n.src=["https://","codeuxdesign.surveysparrow.com/widget/",r.SS_WIDGET_TOKEN].join("");n.onload=sparrowOnLoad;c.parentNode.insertBefore(n,c)}})();</script>
            """.trimIndent()
}

@Suppress("unused")
abstract class AuthPassWebsite : BaseWebsite {
    abstract val storeUrls: StoreUrls
    val surveySparrow = SurveySparrow()

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