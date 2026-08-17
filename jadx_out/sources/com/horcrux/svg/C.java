package com.horcrux.svg;

import Y2.C1533t;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.horcrux.svg.events.SvgLoadEvent;
import d2.AbstractC2325a;
import g2.AbstractC2662a;
import java.util.concurrent.atomic.AtomicBoolean;
import s2.AbstractC3320d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C extends RenderableView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SVGLength f24397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SVGLength f24398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SVGLength f24399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SVGLength f24400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f24401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f24402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f24403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f24404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f24405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f24406p;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends Z2.b {
        a() {
        }

        @Override // Z2.b
        public void a(Bitmap bitmap) {
            C c10 = C.this;
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(c10.mContext, c10.getId());
            int surfaceId = UIManagerHelper.getSurfaceId(C.this);
            int id = C.this.getId();
            C c11 = C.this;
            eventDispatcherForReactTag.dispatchEvent(new SvgLoadEvent(surfaceId, id, c11.mContext, c11.f24401k, bitmap.getWidth(), bitmap.getHeight()));
            C.this.f24406p.set(false);
            SvgView svgView = C.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }

        @Override // m2.AbstractC2895b
        public void onFailureImpl(m2.c cVar) {
            C.this.f24406p.set(false);
            AbstractC2325a.L(ReactConstants.TAG, cVar.b(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
        }
    }

    public C(ReactContext reactContext) {
        super(reactContext);
        this.f24406p = new AtomicBoolean(false);
    }

    private void e(Canvas canvas, Paint paint, Bitmap bitmap, float f10) {
        if (this.f24402l == 0 || this.f24403m == 0) {
            this.f24402l = bitmap.getWidth();
            this.f24403m = bitmap.getHeight();
        }
        RectF rectFF = f();
        RectF rectF = new RectF(0.0f, 0.0f, this.f24402l, this.f24403m);
        q0.a(rectF, rectFF, this.f24404n, this.f24405o).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f10 * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    private RectF f() {
        double dRelativeOnWidth = relativeOnWidth(this.f24397g);
        double dRelativeOnHeight = relativeOnHeight(this.f24398h);
        double dRelativeOnWidth2 = relativeOnWidth(this.f24399i);
        double dRelativeOnHeight2 = relativeOnHeight(this.f24400j);
        if (dRelativeOnWidth2 == 0.0d) {
            dRelativeOnWidth2 = this.f24402l * this.mScale;
        }
        if (dRelativeOnHeight2 == 0.0d) {
            dRelativeOnHeight2 = this.f24403m * this.mScale;
        }
        return new RectF((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2));
    }

    private void g(C1533t c1533t, com.facebook.imagepipeline.request.b bVar) {
        this.f24406p.set(true);
        c1533t.k(bVar, this.mContext).c(new a(), a2.i.B());
    }

    private void m(C1533t c1533t, com.facebook.imagepipeline.request.b bVar, Canvas canvas, Paint paint, float f10) {
        m2.c cVarO = c1533t.o(bVar, this.mContext);
        try {
            try {
                AbstractC2662a abstractC2662a = (AbstractC2662a) cVarO.getResult();
                try {
                    if (abstractC2662a == null) {
                        return;
                    }
                    try {
                        d3.e eVar = (d3.e) abstractC2662a.J();
                        if (eVar instanceof d3.d) {
                            Bitmap bitmapH0 = ((d3.d) eVar).h0();
                            if (bitmapH0 == null) {
                                return;
                            }
                            e(canvas, paint, bitmapH0, f10);
                        }
                    } catch (Exception e10) {
                        throw new IllegalStateException(e10);
                    }
                } finally {
                    AbstractC2662a.B(abstractC2662a);
                }
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        } finally {
            cVarO.close();
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        if (this.f24406p.get()) {
            return;
        }
        C1533t c1533tA = AbstractC3320d.a();
        com.facebook.imagepipeline.request.b bVarFromUri = com.facebook.imagepipeline.request.b.fromUri(new ImageSource(this.mContext, this.f24401k).getUri());
        if (c1533tA.u(bVarFromUri)) {
            m(c1533tA, bVarFromUri, canvas, paint, f10 * this.mOpacity);
        } else {
            g(c1533tA, bVarFromUri);
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        this.mPath = path;
        path.addRect(f(), Path.Direction.CW);
        return this.mPath;
    }

    public void h(Dynamic dynamic) {
        this.f24400j = SVGLength.b(dynamic);
        invalidate();
    }

    public void i(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString("uri");
            this.f24401k = string;
            if (string == null || string.isEmpty()) {
                return;
            }
            if (readableMap.hasKey("width") && readableMap.hasKey("height")) {
                this.f24402l = readableMap.getInt("width");
                this.f24403m = readableMap.getInt("height");
            } else {
                this.f24402l = 0;
                this.f24403m = 0;
            }
            if (Uri.parse(this.f24401k).getScheme() == null) {
                ResourceDrawableIdHelper.getInstance();
                ResourceDrawableIdHelper.getResourceDrawableUri(this.mContext, this.f24401k);
            }
        }
    }

    public void j(Dynamic dynamic) {
        this.f24399i = SVGLength.b(dynamic);
        invalidate();
    }

    public void k(Dynamic dynamic) {
        this.f24397g = SVGLength.b(dynamic);
        invalidate();
    }

    public void l(Dynamic dynamic) {
        this.f24398h = SVGLength.b(dynamic);
        invalidate();
    }

    public void setAlign(String str) {
        this.f24404n = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f24405o = i10;
        invalidate();
    }
}
