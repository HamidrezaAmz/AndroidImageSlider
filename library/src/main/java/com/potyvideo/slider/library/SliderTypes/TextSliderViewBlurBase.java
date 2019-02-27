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
public class TextSliderViewBlurBase extends BaseSliderView {

    public TextSliderViewBlurBase(Context context) {
        super(context);
    }

    @Override
    public View getView() {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.render_type_text_blur, null);
        ImageView target = (ImageView) v.findViewById(R.id.slider_image);
        ImageView target_blur = (ImageView) v.findViewById(R.id.slider_image_blur);
        TextView description = (TextView) v.findViewById(R.id.description);
        description.setText(getDescription());
        bindEventAndShowWithBlur(v, target, target_blur);
        return v;

    }
}
