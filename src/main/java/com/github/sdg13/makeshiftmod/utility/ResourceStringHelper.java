package com.github.sdg13.makeshiftmod.utility;

import com.github.sdg13.makeshiftmod.reference.Reference;

public class ResourceStringHelper {

    public static String constructUnlocalizedName(String type, String strippedName) {
        return type + "." + Reference.MOD_ID.toLowerCase() + ":" + strippedName;
    }

    public static String stripType(String name) {
        return name.substring(name.indexOf('.') + 1);
    }
}
