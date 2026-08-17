package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f.AbstractC2568a;
import f.AbstractC2573f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class Z extends K0.c implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f14915A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f14916B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f14917C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f14918D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f14919E;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final SearchView f14920r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final SearchableInfo f14921s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f14922t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final WeakHashMap f14923u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f14924v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f14925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f14926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ColorStateList f14927y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f14928z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f14929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f14930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f14931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f14932d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f14933e;

        public a(View view) {
            this.f14929a = (TextView) view.findViewById(R.id.text1);
            this.f14930b = (TextView) view.findViewById(R.id.text2);
            this.f14931c = (ImageView) view.findViewById(R.id.icon1);
            this.f14932d = (ImageView) view.findViewById(R.id.icon2);
            this.f14933e = (ImageView) view.findViewById(AbstractC2573f.f26856r);
        }
    }

    public Z(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f14925w = false;
        this.f14926x = 1;
        this.f14928z = -1;
        this.f14915A = -1;
        this.f14916B = -1;
        this.f14917C = -1;
        this.f14918D = -1;
        this.f14919E = -1;
        this.f14920r = searchView;
        this.f14921s = searchableInfo;
        this.f14924v = searchView.getSuggestionCommitIconResId();
        this.f14922t = context;
        this.f14923u = weakHashMap;
    }

    private void A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable j(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f14923u.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence k(CharSequence charSequence) {
        if (this.f14927y == null) {
            TypedValue typedValue = new TypedValue();
            this.f14922t.getTheme().resolveAttribute(AbstractC2568a.f26725L, typedValue, true);
            this.f14927y = this.f14922t.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f14927y, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable l(ComponentName componentName) {
        PackageManager packageManager = this.f14922t.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            componentName.flattenToShortString();
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.toString();
            return null;
        }
    }

    private Drawable m(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f14923u.containsKey(strFlattenToShortString)) {
            Drawable drawableL = l(componentName);
            this.f14923u.put(strFlattenToShortString, drawableL != null ? drawableL.getConstantState() : null);
            return drawableL;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f14923u.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f14922t.getResources());
    }

    public static String n(Cursor cursor, String str) {
        return v(cursor, cursor.getColumnIndex(str));
    }

    private Drawable o() {
        Drawable drawableM = m(this.f14921s.getSearchActivity());
        return drawableM != null ? drawableM : this.f14922t.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f14922t.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    return drawableCreateFromStream;
                } catch (IOException unused2) {
                    return drawableCreateFromStream;
                }
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused3) {
                    uri.toString();
                }
            }
        } catch (FileNotFoundException e10) {
            Objects.toString(uri);
            e10.getMessage();
            return null;
        }
        Objects.toString(uri);
        e10.getMessage();
        return null;
    }

    private Drawable r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f14922t.getPackageName() + "/" + i10;
            Drawable drawableJ = j(str2);
            if (drawableJ != null) {
                return drawableJ;
            }
            Drawable drawableE = androidx.core.content.a.e(this.f14922t, i10);
            z(str2, drawableE);
            return drawableE;
        } catch (Resources.NotFoundException unused) {
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableJ2 = j(str);
            if (drawableJ2 != null) {
                return drawableJ2;
            }
            Drawable drawableP = p(Uri.parse(str));
            z(str, drawableP);
            return drawableP;
        }
    }

    private Drawable s(Cursor cursor) {
        int i10 = this.f14917C;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableR = r(cursor.getString(i10));
        return drawableR != null ? drawableR : o();
    }

    private Drawable t(Cursor cursor) {
        int i10 = this.f14918D;
        if (i10 == -1) {
            return null;
        }
        return r(cursor.getString(i10));
    }

    private static String v(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception unused) {
            return null;
        }
    }

    private void x(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f14923u.put(str, drawable.getConstantState());
        }
    }

    @Override // K0.a, K0.b.a
    public void a(Cursor cursor) {
        if (this.f14925w) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f14928z = cursor.getColumnIndex("suggest_text_1");
                this.f14915A = cursor.getColumnIndex("suggest_text_2");
                this.f14916B = cursor.getColumnIndex("suggest_text_2_url");
                this.f14917C = cursor.getColumnIndex("suggest_icon_1");
                this.f14918D = cursor.getColumnIndex("suggest_icon_2");
                this.f14919E = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // K0.b.a
    public Cursor c(CharSequence charSequence) {
        String string = charSequence == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : charSequence.toString();
        if (this.f14920r.getVisibility() == 0 && this.f14920r.getWindowVisibility() == 0) {
            try {
                Cursor cursorU = u(this.f14921s, string, 50);
                if (cursorU != null) {
                    cursorU.getCount();
                    return cursorU;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    @Override // K0.a, K0.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strN;
        String strN2;
        if (cursor == null) {
            return null;
        }
        String strN3 = n(cursor, "suggest_intent_query");
        if (strN3 != null) {
            return strN3;
        }
        if (this.f14921s.shouldRewriteQueryFromData() && (strN2 = n(cursor, "suggest_intent_data")) != null) {
            return strN2;
        }
        if (!this.f14921s.shouldRewriteQueryFromText() || (strN = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strN;
    }

    @Override // K0.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f14919E;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f14929a != null) {
            y(aVar.f14929a, v(cursor, this.f14928z));
        }
        if (aVar.f14930b != null) {
            String strV = v(cursor, this.f14916B);
            CharSequence charSequenceK = strV != null ? k(strV) : v(cursor, this.f14915A);
            if (TextUtils.isEmpty(charSequenceK)) {
                TextView textView = aVar.f14929a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f14929a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f14929a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f14929a.setMaxLines(1);
                }
            }
            y(aVar.f14930b, charSequenceK);
        }
        ImageView imageView = aVar.f14931c;
        if (imageView != null) {
            x(imageView, s(cursor), 4);
        }
        ImageView imageView2 = aVar.f14932d;
        if (imageView2 != null) {
            x(imageView2, t(cursor), 8);
        }
        int i12 = this.f14926x;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f14933e.setVisibility(8);
            return;
        }
        aVar.f14933e.setVisibility(0);
        aVar.f14933e.setTag(aVar.f14929a.getText());
        aVar.f14933e.setOnClickListener(this);
    }

    @Override // K0.c, K0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewG = super.g(context, cursor, viewGroup);
        viewG.setTag(new a(viewG));
        ((ImageView) viewG.findViewById(AbstractC2573f.f26856r)).setImageResource(this.f14924v);
        return viewG;
    }

    @Override // K0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View viewF = f(this.f14922t, b(), viewGroup);
            if (viewF != null) {
                ((a) viewF.getTag()).f14929a.setText(e10.toString());
            }
            return viewF;
        }
    }

    @Override // K0.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View viewG = g(this.f14922t, b(), viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f14929a.setText(e10.toString());
            }
            return viewG;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        A(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        A(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f14920r.S((CharSequence) tag);
        }
    }

    Drawable q(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f14922t.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor u(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(PointerEventHelper.POINTER_TYPE_UNKNOWN).fragment(PointerEventHelper.POINTER_TYPE_UNKNOWN);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f14922t.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void w(int i10) {
        this.f14926x = i10;
    }
}
