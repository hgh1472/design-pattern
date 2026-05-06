package singleton

class Settings private constructor() {
    companion object {
        // synchronized
        private var instance1: Settings? = null

        // eager initialization
        private val INSTANCE_2 = Settings()

        // double checked locking
        @Volatile
        private var instance3: Settings? = null

        class SettingsHolder {
            companion object {
                val INSTANCE = Settings()
            }
        }

        @Synchronized
        fun getInstance(): Settings {
            if (instance1 == null) {
                instance1 = Settings()
            }

            return instance1!!
        }

        fun getInstance2(): Settings = INSTANCE_2

        fun getInstance3(): Settings {
            if (instance3 == null) {
                synchronized(Settings::class.java) {
                    if (instance3 == null) {
                        instance3 = Settings()
                    }
                }
            }

            return instance3!!
        }

        fun getInstance4(): Settings = SettingsHolder.INSTANCE
    }
}

// enum을 통한 싱글톤
// enum은 리플렉션에서 newInstance 불가능
enum class SettingsEnum {
    INSTANCE,
}
