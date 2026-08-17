package expo.modules.intentlauncher;

import C7.o;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.firebase.messaging.AbstractC2235c;
import expo.modules.intentlauncher.exceptions.ActivityAlreadyStartedException;
import expo.modules.intentlauncher.exceptions.PackageNotFoundException;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.OnActivityResultPayload;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.C2735B;
import j7.K;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lexpo/modules/intentlauncher/IntentLauncherModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "pendingPromise", "Lexpo/modules/kotlin/Promise;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-intent-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntentLauncherModule extends Module {
    private Promise pendingPromise;

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
        AsyncFunctionComponent intAsyncFunctionComponent;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoIntentLauncher");
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            C7.d dVarB = D.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.intentlauncher.IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(IntentLauncherParams.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(D.b(IntentLauncherParams.class), false, new InterfaceC3487a() { // from class: expo.modules.intentlauncher.IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(IntentLauncherParams.class);
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("startActivity", new AsyncFunctionWithPromiseComponent("startActivity", new AnyType[]{anyType, anyType2}, new Function2() { // from class: expo.modules.intentlauncher.IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$3
                public final void invoke(Object[] objArr, Promise promise) throws ActivityAlreadyStartedException {
                    CodedException unexpectedException;
                    CodedException codedException;
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj = objArr[0];
                    IntentLauncherParams intentLauncherParams = (IntentLauncherParams) objArr[1];
                    String str = (String) obj;
                    if (this.this$0.pendingPromise != null) {
                        throw new ActivityAlreadyStartedException();
                    }
                    Intent intent = new Intent(str);
                    if (intentLauncherParams.getClassName() != null) {
                        intent.setComponent(intentLauncherParams.getPackageName() != null ? new ComponentName(intentLauncherParams.getPackageName(), intentLauncherParams.getClassName()) : new ComponentName(this.this$0.getContext(), intentLauncherParams.getClassName()));
                    }
                    if (intentLauncherParams.getData() != null && intentLauncherParams.getType() != null) {
                        intent.setDataAndType(Uri.parse(intentLauncherParams.getData()), intentLauncherParams.getType());
                    } else if (intentLauncherParams.getData() != null) {
                        intent.setData(Uri.parse(intentLauncherParams.getData()));
                    } else if (intentLauncherParams.getType() != null) {
                        intent.setType(intentLauncherParams.getType());
                    }
                    Map<String, Object> extra = intentLauncherParams.getExtra();
                    if (extra != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(K.e(extra.size()));
                        Iterator<T> it = extra.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value instanceof Double) {
                                Number number = (Number) value;
                                value = (number.doubleValue() > 2.147483647E9d || number.doubleValue() < -2.147483648E9d) ? Long.valueOf((long) number.doubleValue()) : Integer.valueOf((int) number.doubleValue());
                            }
                            linkedHashMap.put(key, value);
                        }
                        intent.putExtras(IntentLauncherModuleKt.toBundle(linkedHashMap));
                    }
                    Integer flags = intentLauncherParams.getFlags();
                    if (flags != null) {
                        intent.addFlags(flags.intValue());
                    }
                    String category = intentLauncherParams.getCategory();
                    if (category != null) {
                        intent.addCategory(category);
                    }
                    try {
                        this.this$0.getAppContext().getThrowingActivity().startActivityForResult(intent, 12);
                        this.this$0.pendingPromise = promise;
                    } catch (Throwable th) {
                        if (th instanceof CodedException) {
                            codedException = (CodedException) th;
                        } else {
                            if (th instanceof expo.modules.core.errors.CodedException) {
                                expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th;
                                String code = codedException2.getCode();
                                AbstractC2855l.f(code, "getCode(...)");
                                unexpectedException = new CodedException(code, codedException2.getMessage(), codedException2.getCause());
                            } else {
                                unexpectedException = new UnexpectedException(th);
                            }
                            codedException = unexpectedException;
                        }
                        promise.reject(codedException);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws ActivityAlreadyStartedException {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.intentlauncher.IntentLauncherModule$definition$lambda$14$$inlined$Function$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            }
            AnyType[] anyTypeArr = {anyType3};
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType == null) {
                returnType = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("openApplication", new SyncFunctionComponent("openApplication", anyTypeArr, returnType, new Function1() { // from class: expo.modules.intentlauncher.IntentLauncherModule$definition$lambda$14$$inlined$Function$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws PackageNotFoundException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    String str = (String) objArr[0];
                    Intent launchIntentForPackage = this.this$0.getContext().getPackageManager().getLaunchIntentForPackage(str);
                    if (launchIntentForPackage == null) {
                        throw new PackageNotFoundException(str);
                    }
                    this.this$0.getAppContext().getThrowingActivity().startActivity(launchIntentForPackage);
                    return C2735B.f28704a;
                }
            }));
            if (AbstractC2855l.b(String.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getApplicationIcon", new AnyType[0], new Function2() { // from class: expo.modules.intentlauncher.IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) throws PackageNotFoundException {
                        Bitmap bitmap;
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        String str = (String) promise;
                        PackageManager packageManager = this.this$0.getContext().getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
                            AbstractC2855l.d(applicationInfo);
                            Drawable applicationIcon = packageManager.getApplicationIcon(applicationInfo);
                            AbstractC2855l.f(applicationIcon, "getApplicationIcon(...)");
                            if (applicationIcon instanceof BitmapDrawable) {
                                bitmap = ((BitmapDrawable) applicationIcon).getBitmap();
                            } else if (AbstractC2235c.a(applicationIcon)) {
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(a.a(applicationIcon).getIntrinsicWidth(), a.a(applicationIcon).getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                                AbstractC2855l.f(bitmapCreateBitmap, "createBitmap(...)");
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                                a.a(applicationIcon).draw(canvas);
                                bitmap = bitmapCreateBitmap;
                            } else {
                                bitmap = null;
                            }
                            if (bitmap != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                                StringBuilder sb = new StringBuilder();
                                sb.append("data:image/png;base64,");
                                sb.append(strEncodeToString);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            throw new PackageNotFoundException(str);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws PackageNotFoundException {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
                AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
                if (anyType4 == null) {
                    anyType4 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.intentlauncher.IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), converters3);
                }
                AnyType[] anyTypeArr2 = {anyType4};
                Function1 function1 = new Function1() { // from class: expo.modules.intentlauncher.IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(Object[] objArr) throws PackageNotFoundException {
                        Bitmap bitmap;
                        AbstractC2855l.g(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        PackageManager packageManager = this.this$0.getContext().getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
                            AbstractC2855l.d(applicationInfo);
                            Drawable applicationIcon = packageManager.getApplicationIcon(applicationInfo);
                            AbstractC2855l.f(applicationIcon, "getApplicationIcon(...)");
                            if (applicationIcon instanceof BitmapDrawable) {
                                bitmap = ((BitmapDrawable) applicationIcon).getBitmap();
                            } else if (AbstractC2235c.a(applicationIcon)) {
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(a.a(applicationIcon).getIntrinsicWidth(), a.a(applicationIcon).getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                                AbstractC2855l.f(bitmapCreateBitmap, "createBitmap(...)");
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                                a.a(applicationIcon).draw(canvas);
                                bitmap = bitmapCreateBitmap;
                            } else {
                                bitmap = null;
                            }
                            if (bitmap == null) {
                                return PointerEventHelper.POINTER_TYPE_UNKNOWN;
                            }
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                            String str2 = "data:image/png;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                            return str2 == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : str2;
                        } catch (PackageManager.NameNotFoundException unused) {
                            throw new PackageNotFoundException(str);
                        }
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(String.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getApplicationIcon", anyTypeArr2, function1) : AbstractC2855l.b(String.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getApplicationIcon", anyTypeArr2, function1) : AbstractC2855l.b(String.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getApplicationIcon", anyTypeArr2, function1) : AbstractC2855l.b(String.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getApplicationIcon", anyTypeArr2, function1) : AbstractC2855l.b(String.class, String.class) ? new StringAsyncFunctionComponent("getApplicationIcon", anyTypeArr2, function1) : new UntypedAsyncFunctionComponent("getApplicationIcon", anyTypeArr2, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getApplicationIcon", intAsyncFunctionComponent);
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.ON_ACTIVITY_RESULT;
            eventListeners.put(eventName, new EventListenerWithSenderAndPayload(eventName, new Function2() { // from class: expo.modules.intentlauncher.IntentLauncherModule$definition$lambda$14$$inlined$OnActivityResult$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Activity) obj, (OnActivityResultPayload) obj2);
                    return C2735B.f28704a;
                }

                public final void invoke(Activity sender, OnActivityResultPayload payload) {
                    Bundle extras;
                    AbstractC2855l.g(sender, "sender");
                    AbstractC2855l.g(payload, "payload");
                    if (payload.getRequestCode() != 12) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("resultCode", payload.getResultCode());
                    if (payload.getData() != null) {
                        Intent data = payload.getData();
                        if (data != null) {
                            bundle.putString("data", data.toString());
                        }
                        Intent data2 = payload.getData();
                        if (data2 != null && (extras = data2.getExtras()) != null) {
                            bundle.putBundle("extra", extras);
                        }
                    }
                    Promise promise = this.this$0.pendingPromise;
                    if (promise != null) {
                        promise.resolve(bundle);
                    }
                    this.this$0.pendingPromise = null;
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
