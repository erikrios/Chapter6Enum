package com.erikriosetiawan

enum class Colors {
    RED {
        override val rgb: Int = 0xFF0000
    },
    GREEN {
        override val rgb: Int = 0x00FF00
    },
    BLUE {
        override val rgb: Int = 0x0000FF
    }

    ;

    abstract val rgb: Int
    fun colorString() = "#%06X".format(0xFFFFFF and rgb)

}