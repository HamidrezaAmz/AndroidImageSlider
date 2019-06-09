package com.potyvideo.slider.library.SliderTypes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.potyvideo.slider.library.R;

/**
 * This is a slider with a description TextView.
 */
public class TextSliderViewCurve extends BaseSliderView {

    public TextSliderViewCurve(Context context) {
        super(context);
    }

    @Override
    public View getView() {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.render_type_text, null);
        ImageView target = (ImageView) v.findViewById(R.id.slider_image);
        TextView description = (TextView) v.findViewById(R.id.description);
        description.setText(getDescription());
        bindEventAndShowCurve(v, target);
        return v;
    }
}
