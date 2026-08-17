package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class w implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final FragmentManager f17511g;

    w(FragmentManager fragmentManager) {
        this.f17511g = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        G gV;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f17511g);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y0.c.f12604a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(Y0.c.f12605b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(Y0.c.f12606c, -1);
        String string = typedArrayObtainStyledAttributes.getString(Y0.c.f12607d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !AbstractC1752u.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentI0 = resourceId != -1 ? this.f17511g.i0(resourceId) : null;
        if (fragmentI0 == null && string != null) {
            fragmentI0 = this.f17511g.j0(string);
        }
        if (fragmentI0 == null && id != -1) {
            fragmentI0 = this.f17511g.i0(id);
        }
        if (fragmentI0 == null) {
            fragmentI0 = this.f17511g.u0().a(context.getClassLoader(), attributeValue);
            fragmentI0.mFromLayout = true;
            fragmentI0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentI0.mContainerId = id;
            fragmentI0.mTag = string;
            fragmentI0.mInLayout = true;
            FragmentManager fragmentManager = this.f17511g;
            fragmentI0.mFragmentManager = fragmentManager;
            fragmentI0.mHost = fragmentManager.w0();
            fragmentI0.onInflate(this.f17511g.w0().f(), attributeSet, fragmentI0.mSavedFragmentState);
            gV = this.f17511g.h(fragmentI0);
            if (FragmentManager.J0(2)) {
                fragmentI0.toString();
                Integer.toHexString(resourceId);
            }
        } else {
            if (fragmentI0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentI0.mInLayout = true;
            FragmentManager fragmentManager2 = this.f17511g;
            fragmentI0.mFragmentManager = fragmentManager2;
            fragmentI0.mHost = fragmentManager2.w0();
            fragmentI0.onInflate(this.f17511g.w0().f(), attributeSet, fragmentI0.mSavedFragmentState);
            gV = this.f17511g.v(fragmentI0);
            if (FragmentManager.J0(2)) {
                fragmentI0.toString();
                Integer.toHexString(resourceId);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        Z0.c.g(fragmentI0, viewGroup);
        fragmentI0.mContainer = viewGroup;
        gV.m();
        gV.j();
        View view2 = fragmentI0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentI0.mView.getTag() == null) {
            fragmentI0.mView.setTag(string);
        }
        fragmentI0.mView.addOnAttachStateChangeListener(new a(gV));
        return fragmentI0.mView;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ G f17512g;

        a(G g10) {
            this.f17512g = g10;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f17512g.k();
            this.f17512g.m();
            Q.r((ViewGroup) fragmentK.mView.getParent(), w.this.f17511g).n();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
