package org.oppia.app.databinding;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.databinding.BindingAdapter;
import org.jetbrains.annotations.NotNull;
import org.oppia.app.impl.adapters.R;

public final class DrawableBindingAdapters {
  /**
   * Used to set a rounded-rect background drawable with a data-bound color.
   */
  @BindingAdapter("app:roundedRectDrawableWithColor")
  public static void setBackgroundDrawable(@NotNull View view, @ColorInt int colorRgb) {
    view.setBackgroundResource(R.drawable.rounded_rect_background);
    // The input color needs to have alpha channel prepended to it.
    GradientDrawable background = (GradientDrawable) view.getBackground();
    background.setColor(0xff000000 | colorRgb);
  }

  @BindingAdapter("app:topRoundedRectDrawableWithColor")
  public static void setTopBackgroundDrawable(@NotNull View view, @ColorInt int colorRgb) {
    view.setBackgroundResource(R.drawable.top_rounded_rect_background);
    // The input color needs to have alpha channel prepended to it.
    GradientDrawable background = (GradientDrawable) view.getBackground();
    background.setColor(0xff000000 | colorRgb);
  }

  @BindingAdapter("app:bottomRoundedRectDrawableWithColor")
  public static void setBottomBackgroundDrawable(@NotNull View view, @ColorInt int colorRgb) {
    view.setBackgroundResource(R.drawable.bottom_rounded_rect_background);
    // The input color needs to have alpha channel prepended to it.
    GradientDrawable background = (GradientDrawable) view.getBackground();
    background.setColor(0xff000000 | colorRgb);
  }

  @BindingAdapter("app:rectangleDrawableWithColor")
  public static void setRectangleBackgroundDrawable(@NotNull View view, @ColorInt int colorRgb) {
    view.setBackgroundResource(R.drawable.rectangle_background);
    // The input color needs to have alpha channel prepended to it.
    GradientDrawable background = (GradientDrawable) view.getBackground();
    background.setColor(0xff000000 | colorRgb);
  }

  @BindingAdapter("android:button")
  public static void setBackgroundResource(@NotNull Button button, @DrawableRes int resource) {
    button.setBackgroundResource(resource);
  }
}
