package com.potyvideo.slider.library.Animations;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;

import com.potyvideo.slider.library.R;
import com.potyvideo.slider.library.Tricks.ViewPagerEx;

/**
 * A demo class to show how to use {@link BaseAnimationInterface}
 * to make  your custom animation in {@link ViewPagerEx.PageTransformer} action.
 */

public class DescriptionAnimation implements BaseAnimationInterface {

    private Boolean showDescription = true;

    public DescriptionAnimation() {
    }

    public DescriptionAnimation(Boolean showDescription) {
        this.showDescription = showDescription;
    }

    @Override
    public void onPrepareCurrentItemLeaveScreen(View current) {
        View descriptionLayout = current.findViewById(R.id.description_layout);
        if (descriptionLayout != null) {
            current.findViewById(R.id.description_layout).setVisibility(View.INVISIBLE);
        }
    }

    /**
     * When next item is coming to show, let's hide the description layout.
     *
     * @param next
     */
    @Override
    public void onPrepareNextItemShowInScreen(View next) {
        View descriptionLayout = next.findViewById(R.id.description_layout);
        if (descriptionLayout != null) {
            next.findViewById(R.id.description_layout).setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onCurrentItemDisappear(View view) {

    }

    /**
     * When next item show in ViewPagerEx, let's make an animation to show the
     * description layout.
     *
     * @param view
     */
    @Override
    public void onNextItemAppear(View view) {

        View descriptionLayout = view.findViewById(R.id.description_layout);
        if (descriptionLayout != null) {
            float layoutY = descriptionLayout.getY();

            if (showDescription)
                view.findViewById(R.id.description_layout).setVisibility(View.VISIBLE);
            else
                view.findViewById(R.id.description_layout).setVisibility(View.GONE);

            ValueAnimator animator = ObjectAnimator
                    .ofFloat(descriptionLayout, "y", layoutY + descriptionLayout.getHeight(), layoutY)
                    .setDuration(500);
            animator.start();
        }
    }
}
