package expo.modules.font;

import C7.d;
import C7.o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import com.facebook.react.common.assets.ReactFontManager;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.C2735B;
import i7.t;
import j7.K;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import t7.AbstractC3376c;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/font/FontUtilsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-font_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FontUtilsModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoFontUtils");
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = D.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.font.FontUtilsModule$definition$lambda$5$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(RenderToImageOptions.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(D.b(RenderToImageOptions.class), false, new InterfaceC3487a() { // from class: expo.modules.font.FontUtilsModule$definition$lambda$5$$inlined$AsyncFunctionWithPromise$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(RenderToImageOptions.class);
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("renderToImageAsync", new AsyncFunctionWithPromiseComponent("renderToImageAsync", new AnyType[]{anyType, anyType2}, new Function2() { // from class: expo.modules.font.FontUtilsModule$definition$lambda$5$$inlined$AsyncFunctionWithPromise$3
                public final void invoke(Object[] objArr, Promise promise) {
                    float f10;
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj = objArr[0];
                    RenderToImageOptions renderToImageOptions = (RenderToImageOptions) objArr[1];
                    String str = (String) obj;
                    Typeface typeface = ReactFontManager.INSTANCE.getInstance().getTypeface(renderToImageOptions.getFontFamily(), 0, this.this$0.getContext().getAssets());
                    float f11 = this.this$0.getContext().getResources().getDisplayMetrics().density;
                    float size = renderToImageOptions.getSize() * f11;
                    Float lineHeight = renderToImageOptions.getLineHeight();
                    Float fValueOf = lineHeight != null ? Float.valueOf(lineHeight.floatValue() * f11) : null;
                    Paint paint = new Paint();
                    paint.setTypeface(typeface);
                    paint.setColor(renderToImageOptions.getColor());
                    paint.setTextSize(size);
                    paint.setAntiAlias(true);
                    Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) Math.ceil(paint.measureText(str)), (int) (fValueOf != null ? fValueOf.floatValue() : (float) Math.ceil(fontMetrics.descent - fontMetrics.ascent)), Bitmap.Config.ARGB_8888);
                    AbstractC2855l.f(bitmapCreateBitmap, "createBitmap(...)");
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    if (fValueOf != null) {
                        float fFloatValue = fValueOf.floatValue();
                        float f12 = fontMetrics.descent;
                        float f13 = fontMetrics.ascent;
                        f10 = ((fFloatValue - (f12 - f13)) / 2.0f) - f13;
                    } else {
                        f10 = -fontMetrics.ascent;
                    }
                    canvas.drawText(str, 0.0f, f10, paint);
                    File file = new File(this.this$0.getContext().getCacheDir(), UUID.randomUUID() + ".png");
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            AbstractC3376c.a(fileOutputStream, null);
                            promise.resolve(K.l(t.a("uri", Uri.fromFile(file).toString()), t.a("width", Float.valueOf(bitmapCreateBitmap.getWidth() / f11)), t.a("height", Float.valueOf(bitmapCreateBitmap.getHeight() / f11)), t.a("scale", Float.valueOf(f11))));
                        } finally {
                        }
                    } catch (IOException e10) {
                        String absolutePath = file.getAbsolutePath();
                        AbstractC2855l.f(absolutePath, "getAbsolutePath(...)");
                        promise.reject(new SaveImageException(absolutePath, e10));
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
