package c5;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.facebook.react.views.image.ReactImageView;

/* JADX INFO: renamed from: c5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1851a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f18826a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final View f18827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f18828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f18829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f18830e;

    public AbstractC1851a(View view) {
        this.f18827b = view;
        Context context = view.getContext();
        this.f18828c = d.f(context, Q4.a.f9161p0, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
        this.f18829d = d.f(context, Q4.a.f9167s0, 150);
        this.f18830e = d.f(context, Q4.a.f9165r0, 100);
    }
}
