package com.potyvideo.slider.library.SliderTypes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.potyvideo.slider.library.R;

/**
 * This is a slider with a description TextView.
 */
public class TextSliderViewCurve extends BaseSliderView {

    private Boolean showTitle = false;

    public TextSliderViewCurve(Context context) {
        super(context);
    }

    public TextSliderViewCurve(Context context, Boolean showTitle) {
        super(context);
        this.showTitle = showTitle;
    }

    @Override
    public View getView() {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.render_type_text, null);

        ImageView target = v.findViewById(R.id.slider_image);
        TextView description = v.findViewById(R.id.description);
        LinearLayout linearLayoutDescription = v.findViewById(R.id.description_layout);
        description.setText(getDescription());

        if (showTitle)
            linearLayoutDescription.setVisibility(View.VISIBLE);
        else
            linearLayoutDescription.setVisibility(View.GONE);

        bindEventAndShowCurve(v, target);
        return v;
    }
}
