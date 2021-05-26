interface OnClickInterface 
{
    fun onClick(lambda: (d: Boolean) -> Boolean): Boolean
}

abstract class Widget(private val size: Int, private val darkModeEnabled: Boolean) 
{
    fun getSize() = size
    fun getDarkMode() = darkModeEnabled
    
}

class ButtonWidget(private val size: Int, private val darkModeEnabled: Boolean) : Widget(size, darkModeEnabled)

class ImageWidget(private val size: Int, private val darkModeEnabled: Boolean) : Widget(size, darkModeEnabled), OnClickInterface 
{
    override fun onClick(lambda: (d: Boolean) -> Boolean): Boolean = lambda(getDarkMode())
}

fun main() 
{
    val buttonWidget = ButtonWidget(4, false)
    val imageWidget = ImageWidget(4, true)
    println(buttonWidget.getSize())
    println(buttonWidget.getDarkMode())    
    println(imageWidget.getDarkMode())
    println(imageWidget.onClick({it.not()}))
}
