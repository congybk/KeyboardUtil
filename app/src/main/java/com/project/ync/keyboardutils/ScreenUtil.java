
package com.project.ync.keyboardutils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;


/**
 * Utilities for getting screen size or convert "dp" to "px".
 */
public final class ScreenUtil {
    private static final String TAG = ScreenUtil.class.getSimpleName();

    private ScreenUtil() {
        // no instance
    }


    /**
     * Convert dp to pixel
     *
     * @param dp dp value
     * @return return value in pixel
     */
    public static int convertDpToPixel(Context context, int dp) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return (int) (dp * (metrics.densityDpi / 160f));
    }
}
