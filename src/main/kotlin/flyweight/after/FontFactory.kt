package flyweight.after

class FontFactory(
    val cache: HashMap<String, Font> = HashMap(),
) {
    fun getFont(font: String): Font {
        if (cache.contains(font)) {
            return cache[font]!!
        } else {
            val split = font.split(":")
            val newFont = Font(split[0], Integer.parseInt(split[1]))
            cache[font] = newFont
            return newFont
        }
    }
}
