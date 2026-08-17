package com.horcrux.svg;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@ReactModule(name = "RNSVGRenderableModule")
class RNSVGRenderableManager extends NativeSvgRenderableModuleSpec {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int EOF = -1;
    public static final String NAME = "RNSVGRenderableModule";

    RNSVGRenderableManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getBBox(Double d10, ReadableMap readableMap) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d10.intValue());
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        boolean z10 = readableMap.getBoolean("fill");
        boolean z11 = readableMap.getBoolean("stroke");
        boolean z12 = readableMap.getBoolean("markers");
        boolean z13 = readableMap.getBoolean("clipped");
        try {
            renderableViewByTag.getPath(null, null);
            float f10 = renderableViewByTag.mScale;
            renderableViewByTag.initBounds();
            RectF rectF = new RectF();
            RectF rectF2 = renderableViewByTag.mFillBounds;
            RectF rectF3 = renderableViewByTag.mStrokeBounds;
            RectF rectF4 = renderableViewByTag.mMarkerBounds;
            RectF rectF5 = renderableViewByTag.mClipBounds;
            if (z10 && rectF2 != null) {
                rectF.union(rectF2);
            }
            if (z11 && rectF3 != null) {
                rectF.union(rectF3);
            }
            if (z12 && rectF4 != null) {
                rectF.union(rectF4);
            }
            if (z13 && rectF5 != null) {
                rectF.intersect(rectF5);
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("x", rectF.left / f10);
            writableMapCreateMap.putDouble("y", rectF.top / f10);
            writableMapCreateMap.putDouble("width", rectF.width() / f10);
            writableMapCreateMap.putDouble("height", rectF.height() / f10);
            return writableMapCreateMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getCTM(Double d10) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d10.intValue());
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        float f10 = renderableViewByTag.mScale;
        Matrix matrix = new Matrix(renderableViewByTag.mCTM);
        SvgView svgView = renderableViewByTag.getSvgView();
        if (svgView == null) {
            throw new RuntimeException("Did not find parent SvgView for view with tag: " + d10);
        }
        matrix.preConcat(svgView.mInvViewBoxMatrix);
        matrix.getValues(new float[9]);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("a", r6[0]);
        writableMapCreateMap.putDouble("b", r6[3]);
        writableMapCreateMap.putDouble("c", r6[1]);
        writableMapCreateMap.putDouble("d", r6[4]);
        writableMapCreateMap.putDouble("e", r6[2] / f10);
        writableMapCreateMap.putDouble("f", r6[5] / f10);
        return writableMapCreateMap;
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGRenderableModule";
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getPointAtLength(Double d10, ReadableMap readableMap) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d10.intValue());
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        try {
            PathMeasure pathMeasure = new PathMeasure(renderableViewByTag.getPath(null, null), false);
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            pathMeasure.getPosTan(Math.max(0.0f, Math.min(((float) readableMap.getDouble("length")) * renderableViewByTag.mScale, pathMeasure.getLength())), fArr, fArr2);
            double dAtan2 = Math.atan2(fArr2[1], fArr2[0]);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("x", fArr[0] / r8);
            writableMapCreateMap.putDouble("y", fArr[1] / r8);
            writableMapCreateMap.putDouble("angle", dAtan2);
            return writableMapCreateMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod
    public void getRawResource(String str, Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Resources resources = reactApplicationContext.getResources();
            InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", reactApplicationContext.getPackageName()));
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, StandardCharsets.UTF_8);
                char[] cArr = new char[DEFAULT_BUFFER_SIZE];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i10 = inputStreamReader.read(cArr, 0, DEFAULT_BUFFER_SIZE);
                    if (i10 == -1) {
                        promise.resolve(sb.toString());
                        try {
                            inputStreamOpenRawResource.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    sb.append(cArr, 0, i10);
                }
            } catch (Throwable th) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            promise.reject(e10);
        }
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getScreenCTM(Double d10) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d10.intValue());
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        renderableViewByTag.mCTM.getValues(new float[9]);
        float f10 = renderableViewByTag.mScale;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("a", r0[0]);
        writableMapCreateMap.putDouble("b", r0[3]);
        writableMapCreateMap.putDouble("c", r0[1]);
        writableMapCreateMap.putDouble("d", r0[4]);
        writableMapCreateMap.putDouble("e", r0[2] / f10);
        writableMapCreateMap.putDouble("f", r0[5] / f10);
        return writableMapCreateMap;
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getTotalLength(Double d10) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d10.intValue());
        if (renderableViewByTag == null) {
            return 0.0d;
        }
        try {
            return new PathMeasure(renderableViewByTag.getPath(null, null), false).getLength() / renderableViewByTag.mScale;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return -1.0d;
        }
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInFill(Double d10, ReadableMap readableMap) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d10.intValue());
        if (renderableViewByTag == null) {
            return false;
        }
        float f10 = renderableViewByTag.mScale;
        return renderableViewByTag.hitTest(new float[]{((float) readableMap.getDouble("x")) * f10, ((float) readableMap.getDouble("y")) * f10}) != -1;
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInStroke(Double d10, ReadableMap readableMap) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d10.intValue());
        if (renderableViewByTag == null) {
            return false;
        }
        try {
            renderableViewByTag.getPath(null, null);
            renderableViewByTag.initBounds();
            double d11 = renderableViewByTag.mScale;
            int i10 = (int) (readableMap.getDouble("x") * d11);
            int i11 = (int) (readableMap.getDouble("y") * d11);
            Region region = renderableViewByTag.mStrokeRegion;
            return region != null && region.contains(i10, i11);
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return false;
        }
    }
}
