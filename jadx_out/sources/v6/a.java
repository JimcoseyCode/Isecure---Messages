package V6;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.swmansion.rnscreens.F;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Animation {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final F f11804g;

    public a(F mFragment) {
        AbstractC2855l.g(mFragment, "mFragment");
        this.f11804g = mFragment;
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation t10) {
        AbstractC2855l.g(t10, "t");
        super.applyTransformation(f10, t10);
        this.f11804g.E(f10, !r3.isResumed());
    }
}
