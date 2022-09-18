// Generated by view binder compiler. Do not edit!
package com.world4tech.driveu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.world4tech.driveu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NewsBlueprintBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgHeadline;

  @NonNull
  public final CardView mainContainer;

  @NonNull
  public final TextView textSource;

  @NonNull
  public final TextView textTitle;

  private NewsBlueprintBinding(@NonNull LinearLayout rootView, @NonNull ImageView imgHeadline,
      @NonNull CardView mainContainer, @NonNull TextView textSource, @NonNull TextView textTitle) {
    this.rootView = rootView;
    this.imgHeadline = imgHeadline;
    this.mainContainer = mainContainer;
    this.textSource = textSource;
    this.textTitle = textTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NewsBlueprintBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NewsBlueprintBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.news_blueprint, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NewsBlueprintBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_headline;
      ImageView imgHeadline = ViewBindings.findChildViewById(rootView, id);
      if (imgHeadline == null) {
        break missingId;
      }

      id = R.id.main_container;
      CardView mainContainer = ViewBindings.findChildViewById(rootView, id);
      if (mainContainer == null) {
        break missingId;
      }

      id = R.id.text_source;
      TextView textSource = ViewBindings.findChildViewById(rootView, id);
      if (textSource == null) {
        break missingId;
      }

      id = R.id.text_title;
      TextView textTitle = ViewBindings.findChildViewById(rootView, id);
      if (textTitle == null) {
        break missingId;
      }

      return new NewsBlueprintBinding((LinearLayout) rootView, imgHeadline, mainContainer,
          textSource, textTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
