// Generated by view binder compiler. Do not edit!
package sk.styk.martin.apkanalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import pl.droidsonroids.gif.GifImageView;
import sk.styk.martin.apkanalyzer.R;

public final class DialogFancyBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final GifImageView gifImageView;

  @NonNull
  public final TextView message;

  @NonNull
  public final Button negativeBtn;

  @NonNull
  public final Button positiveBtn;

  @NonNull
  public final RelativeLayout relativelayout1;

  @NonNull
  public final TextView title;

  private DialogFancyBinding(@NonNull RelativeLayout rootView, @NonNull GifImageView gifImageView,
      @NonNull TextView message, @NonNull Button negativeBtn, @NonNull Button positiveBtn,
      @NonNull RelativeLayout relativelayout1, @NonNull TextView title) {
    this.rootView = rootView;
    this.gifImageView = gifImageView;
    this.message = message;
    this.negativeBtn = negativeBtn;
    this.positiveBtn = positiveBtn;
    this.relativelayout1 = relativelayout1;
    this.title = title;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogFancyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogFancyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_fancy, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogFancyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.gifImageView;
      GifImageView gifImageView = ViewBindings.findChildViewById(rootView, id);
      if (gifImageView == null) {
        break missingId;
      }

      id = R.id.message;
      TextView message = ViewBindings.findChildViewById(rootView, id);
      if (message == null) {
        break missingId;
      }

      id = R.id.negativeBtn;
      Button negativeBtn = ViewBindings.findChildViewById(rootView, id);
      if (negativeBtn == null) {
        break missingId;
      }

      id = R.id.positiveBtn;
      Button positiveBtn = ViewBindings.findChildViewById(rootView, id);
      if (positiveBtn == null) {
        break missingId;
      }

      id = R.id.relativelayout1;
      RelativeLayout relativelayout1 = ViewBindings.findChildViewById(rootView, id);
      if (relativelayout1 == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new DialogFancyBinding((RelativeLayout) rootView, gifImageView, message, negativeBtn,
          positiveBtn, relativelayout1, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
