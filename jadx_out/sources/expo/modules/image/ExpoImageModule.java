package expo.modules.image;

import B1.h;
import B1.i;
import B1.k;
import C7.d;
import C7.o;
import C7.q;
import M1.e;
import R8.AbstractC1413i;
import R8.C1404d0;
import R8.J;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import com.bumptech.glide.j;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import expo.modules.image.enums.ContentFit;
import expo.modules.image.enums.Priority;
import expo.modules.image.records.CachePolicy;
import expo.modules.image.records.ContentPosition;
import expo.modules.image.records.DecodeFormat;
import expo.modules.image.records.DecodedSource;
import expo.modules.image.records.ImageLoadOptions;
import expo.modules.image.records.ImageTransition;
import expo.modules.image.records.SourceMap;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.Queues;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilder;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.EitherOfThree;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.views.AnyViewProp;
import expo.modules.kotlin.views.ConcreteViewProp;
import expo.modules.kotlin.views.ViewDefinitionBuilder;
import expo.modules.kotlin.views.ViewManagerDefinition;
import expo.modules.kotlin.views.decorators.CSSPropsKt;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.z;
import l1.AbstractC2861a;
import n7.f;
import o7.AbstractC3016b;
import v1.EnumC3417a;
import v7.AbstractC3430a;
import w7.InterfaceC3487a;
import x1.AbstractC3526j;
import y0.AbstractC3607b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/image/ExpoImageModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoImageModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        if (r1 == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object definition$lambda$30$generatePlaceholder(ExpoImageModule expoImageModule, Either<URL, Image> either, Function1 function1, f fVar) {
        ExpoImageModule$definition$1$generatePlaceholder$1 expoImageModule$definition$1$generatePlaceholder$1;
        Function1 function12;
        Image secondType;
        if (fVar instanceof ExpoImageModule$definition$1$generatePlaceholder$1) {
            expoImageModule$definition$1$generatePlaceholder$1 = (ExpoImageModule$definition$1$generatePlaceholder$1) fVar;
            int i10 = expoImageModule$definition$1$generatePlaceholder$1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                expoImageModule$definition$1$generatePlaceholder$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                expoImageModule$definition$1$generatePlaceholder$1 = new ExpoImageModule$definition$1$generatePlaceholder$1(fVar);
            }
        }
        Object objLoad = expoImageModule$definition$1$generatePlaceholder$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = expoImageModule$definition$1$generatePlaceholder$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objLoad);
            if (either.isSecondType(D.b(Image.class))) {
                secondType = either.getSecondType(D.b(Image.class));
                function12 = function1;
                J jA = C1404d0.a();
                ExpoImageModule$definition$1$generatePlaceholder$2 expoImageModule$definition$1$generatePlaceholder$2 = new ExpoImageModule$definition$1$generatePlaceholder$2(function12, secondType, null);
                expoImageModule$definition$1$generatePlaceholder$1.L$0 = null;
                expoImageModule$definition$1$generatePlaceholder$1.label = 2;
                Object objG = AbstractC1413i.g(jA, expoImageModule$definition$1$generatePlaceholder$2, expoImageModule$definition$1$generatePlaceholder$1);
                return objG != objE ? objE : objG;
            }
            ImageLoadTask imageLoadTask = new ImageLoadTask(expoImageModule.getAppContext(), new SourceMap(either.getFirstType(D.b(URL.class)).toString(), 0, 0, 0.0d, null, null, 62, null), new ImageLoadOptions(0, 0, null, 7, null));
            function12 = function1;
            expoImageModule$definition$1$generatePlaceholder$1.L$0 = function12;
            expoImageModule$definition$1$generatePlaceholder$1.label = 1;
            objLoad = imageLoadTask.load(expoImageModule$definition$1$generatePlaceholder$1);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(objLoad);
                return objLoad;
            }
            function12 = (Function1) expoImageModule$definition$1$generatePlaceholder$1.L$0;
            AbstractC2753p.b(objLoad);
        }
        secondType = (Image) objLoad;
        J jA2 = C1404d0.a();
        ExpoImageModule$definition$1$generatePlaceholder$2 expoImageModule$definition$1$generatePlaceholder$22 = new ExpoImageModule$definition$1$generatePlaceholder$2(function12, secondType, null);
        expoImageModule$definition$1$generatePlaceholder$1.L$0 = null;
        expoImageModule$definition$1$generatePlaceholder$1.label = 2;
        Object objG2 = AbstractC1413i.g(jA2, expoImageModule$definition$1$generatePlaceholder$22, expoImageModule$definition$1$generatePlaceholder$1);
        if (objG2 != objE) {
        }
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        Class cls2;
        Class cls3;
        AnyTypeProvider anyTypeProvider;
        Object obj;
        Class cls4;
        Class cls5;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        ViewDefinitionBuilder viewDefinitionBuilder;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder2.Name("ExpoImage");
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder2.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$OnCreate$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m220invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m220invoke() {
                    Context reactContext = this.this$0.getAppContext().getReactContext();
                    if (reactContext != null) {
                        reactContext.registerComponentCallbacks(ExpoImageComponentCallbacks.INSTANCE);
                    }
                }
            }));
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder2.getEventListeners();
            EventName eventName2 = EventName.MODULE_DESTROY;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$OnDestroy$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m221invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m221invoke() {
                    Context reactContext = this.this$0.getAppContext().getReactContext();
                    if (reactContext != null) {
                        reactContext.unregisterComponentCallbacks(ExpoImageComponentCallbacks.INSTANCE);
                    }
                }
            }));
            TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
            AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
            d dVarB = D.b(List.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                cls = List.class;
                cls2 = Integer.class;
                cls3 = ExpoImageViewWrapper.class;
                anyType = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.p(List.class, q.f518c.d(D.o(String.class)));
                    }
                }), converters);
            } else {
                cls = List.class;
                cls2 = Integer.class;
                cls3 = ExpoImageViewWrapper.class;
            }
            AnyType anyType2 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(CachePolicy.class), bool));
            if (anyType2 == null) {
                anyTypeProvider = anyTypeProvider2;
                anyType2 = new AnyType(new LazyKType(D.b(CachePolicy.class), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(CachePolicy.class);
                    }
                }), converters);
            } else {
                anyTypeProvider = anyTypeProvider2;
            }
            d dVarB2 = D.b(Map.class);
            Boolean bool2 = Boolean.TRUE;
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB2, bool2));
            if (anyType3 == null) {
                obj = C2735B.class;
                cls4 = Boolean.class;
                anyType3 = new AnyType(new LazyKType(D.b(Map.class), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        return D.h(Map.class, aVar.d(D.o(String.class)), aVar.d(D.o(String.class)));
                    }
                }), converters);
            } else {
                obj = C2735B.class;
                cls4 = Boolean.class;
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("prefetch", new AsyncFunctionWithPromiseComponent("prefetch", new AnyType[]{anyType, anyType2, anyType3}, new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$4
                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(Object[] objArr, final Promise promise) {
                    i iVarC;
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Map map = (Map) objArr[2];
                    CachePolicy cachePolicy = (CachePolicy) obj3;
                    final List list = (List) obj2;
                    Context reactContext = this.this$0.getAppContext().getReactContext();
                    if (reactContext == null) {
                        return;
                    }
                    final A a10 = new A();
                    final z zVar = new z();
                    if (map != null) {
                        k.a aVar = new k.a();
                        for (Map.Entry entry : map.entrySet()) {
                            aVar.b((String) entry.getKey(), (String) entry.getValue());
                        }
                        iVarC = aVar.c();
                        if (iVarC == null) {
                            iVarC = i.f279b;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        M1.a aVarH = ((j) com.bumptech.glide.b.v(reactContext).j(new h((String) it.next(), iVarC)).i(100)).h(NoopDownsampleStrategy.INSTANCE);
                        AbstractC2855l.f(aVarH, "downsample(...)");
                        GlideExtensionsKt.customize((j) aVarH, cachePolicy == CachePolicy.MEMORY, new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$1$3$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final j invoke(j customize) {
                                AbstractC2855l.g(customize, "$this$customize");
                                M1.a aVarG = customize.g(AbstractC3526j.f33373b);
                                AbstractC2855l.f(aVarG, "diskCacheStrategy(...)");
                                return (j) aVarG;
                            }
                        }).w0(new e() { // from class: expo.modules.image.ExpoImageModule$definition$1$3$1$2
                            @Override // M1.e
                            public boolean onLoadFailed(x1.q e10, Object model, N1.d target, boolean isFirstResource) {
                                AbstractC2855l.g(target, "target");
                                z zVar2 = zVar;
                                if (!zVar2.f29399g) {
                                    zVar2.f29399g = true;
                                    promise.resolve(false);
                                }
                                return true;
                            }

                            @Override // M1.e
                            public boolean onResourceReady(Drawable resource, Object model, N1.d target, EnumC3417a dataSource, boolean isFirstResource) {
                                AbstractC2855l.g(resource, "resource");
                                AbstractC2855l.g(model, "model");
                                AbstractC2855l.g(target, "target");
                                AbstractC2855l.g(dataSource, "dataSource");
                                A a11 = a10;
                                int i10 = a11.f29369g + 1;
                                a11.f29369g = i10;
                                if (i10 == list.size()) {
                                    promise.resolve(true);
                                }
                                return true;
                            }
                        }).B0();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Object[]) obj2, (Promise) obj3);
                    return C2735B.f28704a;
                }
            }));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction = moduleDefinitionBuilder2.AsyncFunction("loadAsync");
            String name = asyncFunctionBuilderAsyncFunction.getName();
            TypeConverterProvider converters2 = asyncFunctionBuilderAsyncFunction.getConverters();
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(SourceMap.class), bool));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(D.b(SourceMap.class), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$Coroutine$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(SourceMap.class);
                    }
                }), converters2);
            }
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(ImageLoadOptions.class), bool2));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(D.b(ImageLoadOptions.class), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$Coroutine$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(ImageLoadOptions.class);
                    }
                }), converters2);
            }
            asyncFunctionBuilderAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, new AnyType[]{anyType4, anyType5}, new ExpoImageModule$definition$lambda$30$$inlined$Coroutine$3(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction2 = moduleDefinitionBuilder2.AsyncFunction("generateBlurhashAsync");
            String name2 = asyncFunctionBuilderAsyncFunction2.getName();
            TypeConverterProvider converters3 = asyncFunctionBuilderAsyncFunction2.getConverters();
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Either.class), bool));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(D.b(Either.class), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$Coroutine$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        return D.q(Either.class, aVar.d(D.o(URL.class)), aVar.d(D.o(Image.class)));
                    }
                }), converters3);
            }
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Pair.class), bool));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(D.b(Pair.class), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$Coroutine$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        Class cls6 = Integer.TYPE;
                        return D.q(Pair.class, aVar.d(D.o(cls6)), aVar.d(D.o(cls6)));
                    }
                }), converters3);
            }
            asyncFunctionBuilderAsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, new AnyType[]{anyType6, anyType7}, new ExpoImageModule$definition$lambda$30$$inlined$Coroutine$6(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction3 = moduleDefinitionBuilder2.AsyncFunction("generateThumbhashAsync");
            String name3 = asyncFunctionBuilderAsyncFunction3.getName();
            TypeConverterProvider converters4 = asyncFunctionBuilderAsyncFunction3.getConverters();
            AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Either.class), bool));
            if (anyType8 == null) {
                anyType8 = new AnyType(new LazyKType(D.b(Either.class), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$Coroutine$7
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        return D.q(Either.class, aVar.d(D.o(URL.class)), aVar.d(D.o(Image.class)));
                    }
                }), converters4);
            }
            asyncFunctionBuilderAsyncFunction3.setAsyncFunctionComponent(new SuspendFunctionComponent(name3, new AnyType[]{anyType8}, new ExpoImageModule$definition$lambda$30$$inlined$Coroutine$8(null, this)));
            d dVarB3 = D.b(Image.class);
            Module module = moduleDefinitionBuilder2.getModule();
            if (module == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AppContext appContext = module.getAppContext();
            String simpleName = AbstractC3430a.b(dVarB3).getSimpleName();
            AbstractC2855l.f(simpleName, "getSimpleName(...)");
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Image.class), bool));
            ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, simpleName, dVarB3, anyType9 == null ? new AnyType(new LazyKType(D.b(Image.class), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$Class$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    return D.o(Image.class);
                }
            }), null) : anyType9, moduleDefinitionBuilder2.getConverters());
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "width");
            AnyType[] anyTypeArr = {new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null)};
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(cls2));
            if (returnType == null) {
                returnType = new ReturnType(D.b(cls2));
                returnTypeProvider.getTypes().put(D.b(cls2), returnType);
            }
            SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr, returnType, new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Integer.valueOf(((Image) it[0]).getRef().getIntrinsicWidth());
                }
            });
            syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
            syncFunctionComponent.setCanTakeOwner(true);
            propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
            classComponentBuilder.getProperties().put("width", propertyComponentBuilderWithThis);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis2 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "height");
            AnyType[] anyTypeArr2 = {new AnyType(propertyComponentBuilderWithThis2.getThisType(), null, 2, null)};
            ReturnType returnType2 = returnTypeProvider.getTypes().get(D.b(cls2));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(cls2));
                returnTypeProvider.getTypes().put(D.b(cls2), returnType2);
            }
            SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent("get", anyTypeArr2, returnType2, new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Integer.valueOf(((Image) it[0]).getRef().getIntrinsicHeight());
                }
            });
            syncFunctionComponent2.setOwnerType(propertyComponentBuilderWithThis2.getThisType());
            syncFunctionComponent2.setCanTakeOwner(true);
            propertyComponentBuilderWithThis2.setGetter(syncFunctionComponent2);
            classComponentBuilder.getProperties().put("height", propertyComponentBuilderWithThis2);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis3 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "scale");
            AnyType[] anyTypeArr3 = {new AnyType(propertyComponentBuilderWithThis3.getThisType(), null, 2, null)};
            ReturnType returnType3 = returnTypeProvider.getTypes().get(D.b(Float.class));
            if (returnType3 == null) {
                returnType3 = new ReturnType(D.b(Float.class));
                returnTypeProvider.getTypes().put(D.b(Float.class), returnType3);
            }
            SyncFunctionComponent syncFunctionComponent3 = new SyncFunctionComponent("get", anyTypeArr3, returnType3, new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Resources resources;
                    DisplayMetrics displayMetrics;
                    AbstractC2855l.g(it, "it");
                    Image image = (Image) it[0];
                    Context reactContext = this.this$0.getAppContext().getReactContext();
                    float f10 = (reactContext == null || (resources = reactContext.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 1.0f : displayMetrics.density;
                    return Float.valueOf((AbstractC3607b.d(image.getRef(), 0, 0, null, 7, null) != null ? r8.getDensity() : 1) / (f10 * 160.0f));
                }
            });
            syncFunctionComponent3.setOwnerType(propertyComponentBuilderWithThis3.getThisType());
            syncFunctionComponent3.setCanTakeOwner(true);
            propertyComponentBuilderWithThis3.setGetter(syncFunctionComponent3);
            classComponentBuilder.getProperties().put("scale", propertyComponentBuilderWithThis3);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis4 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "isAnimated");
            AnyType[] anyTypeArr4 = {new AnyType(propertyComponentBuilderWithThis4.getThisType(), null, 2, null)};
            ReturnType returnType4 = returnTypeProvider.getTypes().get(D.b(cls4));
            if (returnType4 == null) {
                returnType4 = new ReturnType(D.b(cls4));
                returnTypeProvider.getTypes().put(D.b(cls4), returnType4);
            }
            SyncFunctionComponent syncFunctionComponent4 = new SyncFunctionComponent("get", anyTypeArr4, returnType4, new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    Image image = (Image) it[0];
                    return Boolean.valueOf((image.getRef() instanceof L3.a) || (image.getRef() instanceof E3.a) || (image.getRef() instanceof Q3.a));
                }
            });
            syncFunctionComponent4.setOwnerType(propertyComponentBuilderWithThis4.getThisType());
            syncFunctionComponent4.setCanTakeOwner(true);
            propertyComponentBuilderWithThis4.setGetter(syncFunctionComponent4);
            classComponentBuilder.getProperties().put("isAnimated", propertyComponentBuilderWithThis4);
            PropertyComponentBuilder propertyComponentBuilder = new PropertyComponentBuilder("mediaType");
            AnyType[] anyTypeArr5 = new AnyType[0];
            ReturnType returnType5 = returnTypeProvider.getTypes().get(D.b(Object.class));
            if (returnType5 == null) {
                returnType5 = new ReturnType(D.b(Object.class));
                returnTypeProvider.getTypes().put(D.b(Object.class), returnType5);
            }
            propertyComponentBuilder.setGetter(new SyncFunctionComponent("get", anyTypeArr5, returnType5, new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return null;
                }
            }));
            classComponentBuilder.getProperties().put("mediaType", propertyComponentBuilder);
            moduleDefinitionBuilder2.getClassData().add(classComponentBuilder.buildClass());
            UntypedAsyncFunctionComponent untypedAsyncFunctionComponent2 = new UntypedAsyncFunctionComponent("clearMemoryCache", new AnyType[0], new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    Activity currentActivity = this.this$0.getAppContext().getCurrentActivity();
                    if (currentActivity == null) {
                        return Boolean.FALSE;
                    }
                    com.bumptech.glide.b.d(currentActivity).c();
                    return Boolean.TRUE;
                }
            });
            moduleDefinitionBuilder2.getAsyncFunctions().put("clearMemoryCache", untypedAsyncFunctionComponent2);
            untypedAsyncFunctionComponent2.runOnQueue(Queues.MAIN);
            AnyType[] anyTypeArr6 = new AnyType[0];
            Function1 function1 = new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$AsyncFunction$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object[] it) {
                    boolean z10;
                    AbstractC2855l.g(it, "it");
                    Activity currentActivity = this.this$0.getAppContext().getCurrentActivity();
                    if (currentActivity == null) {
                        z10 = false;
                    } else {
                        com.bumptech.glide.b.d(currentActivity).b();
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                }
            };
            Class cls6 = Integer.TYPE;
            Class cls7 = cls4;
            boolean zB = AbstractC2855l.b(cls7, cls6);
            Class cls8 = Float.TYPE;
            Class cls9 = Double.TYPE;
            Class cls10 = Boolean.TYPE;
            moduleDefinitionBuilder2.getAsyncFunctions().put("clearDiskCache", zB ? new IntAsyncFunctionComponent("clearDiskCache", anyTypeArr6, function1) : AbstractC2855l.b(cls7, cls10) ? new BoolAsyncFunctionComponent("clearDiskCache", anyTypeArr6, function1) : AbstractC2855l.b(cls7, cls9) ? new DoubleAsyncFunctionComponent("clearDiskCache", anyTypeArr6, function1) : AbstractC2855l.b(cls7, cls8) ? new FloatAsyncFunctionComponent("clearDiskCache", anyTypeArr6, function1) : AbstractC2855l.b(cls7, String.class) ? new StringAsyncFunctionComponent("clearDiskCache", anyTypeArr6, function1) : new UntypedAsyncFunctionComponent("clearDiskCache", anyTypeArr6, function1));
            if (AbstractC2855l.b(String.class, Promise.class)) {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getCachePathAsync", new AnyType[0], new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$AsyncFunction$2
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        String str = (String) promise;
                        Context reactContext = this.this$0.getAppContext().getReactContext();
                        if (reactContext == null) {
                            return;
                        }
                        M1.b bVarB0 = ((j) com.bumptech.glide.b.v(reactContext).d().x0(new h(str)).O(true)).B0();
                        AbstractC2855l.f(bVarB0, "submit(...)");
                        try {
                            ((File) bVarB0.get()).getAbsolutePath();
                        } catch (Exception unused) {
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Object[]) obj2, (Promise) obj3);
                        return C2735B.f28704a;
                    }
                });
                cls5 = cls7;
            } else {
                TypeConverterProvider converters5 = moduleDefinitionBuilder2.getConverters();
                AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
                if (anyType10 == null) {
                    cls5 = cls7;
                    anyType10 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$AsyncFunction$3
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(String.class);
                        }
                    }), converters5);
                } else {
                    cls5 = cls7;
                }
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("getCachePathAsync", new AnyType[]{anyType10}, new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        Context reactContext = this.this$0.getAppContext().getReactContext();
                        if (reactContext == null) {
                            return null;
                        }
                        M1.b bVarB0 = ((j) com.bumptech.glide.b.v(reactContext).d().x0(new h(str)).O(true)).B0();
                        AbstractC2855l.f(bVarB0, "submit(...)");
                        try {
                            return ((File) bVarB0.get()).getAbsolutePath();
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                });
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("getCachePathAsync", untypedAsyncFunctionComponent);
            ViewDefinitionBuilder viewDefinitionBuilder2 = new ViewDefinitionBuilder(D.b(cls3), new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$$inlined$View$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    return D.o(ExpoImageViewWrapper.class);
                }
            }, 2, null), moduleDefinitionBuilder2.getConverters());
            CSSPropsKt.UseCSSProps(viewDefinitionBuilder2);
            viewDefinitionBuilder2.Events("onLoadStart", "onProgress", "onError", "onLoad", "onDisplay");
            Function2 function2 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) throws Exceptions.ReactContextLost {
                    invoke((ExpoImageViewWrapper) obj2, (EitherOfThree<List<SourceMap>, SharedRef<Drawable>, SharedRef<Bitmap>>) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, EitherOfThree<List<SourceMap>, SharedRef<Drawable>, SharedRef<Bitmap>> eitherOfThree) throws Exceptions.ReactContextLost {
                    AbstractC2855l.g(view, "view");
                    if (eitherOfThree == null) {
                        view.setSources$expo_image_release(AbstractC2800q.j());
                        return;
                    }
                    if (eitherOfThree.isFirstType(D.b(List.class))) {
                        view.setSources$expo_image_release(eitherOfThree.getFirstType(D.b(List.class)));
                        return;
                    }
                    if (eitherOfThree.isSecondType(D.b(SharedRef.class))) {
                        view.setSources$expo_image_release(AbstractC2800q.e(new DecodedSource(eitherOfThree.getSecondType(D.b(SharedRef.class)).getRef())));
                        return;
                    }
                    Bitmap ref = eitherOfThree.getThirdType(D.b(SharedRef.class)).getRef();
                    Context reactContext = this.this$0.getAppContext().getReactContext();
                    if (reactContext == null) {
                        throw new Exceptions.ReactContextLost();
                    }
                    view.setSources$expo_image_release(AbstractC2800q.e(new DecodedSource(new BitmapDrawable(reactContext.getResources(), ref))));
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder2.getProps();
            AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(D.b(EitherOfThree.class), bool2));
            if (anyType11 == null) {
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                viewDefinitionBuilder = viewDefinitionBuilder2;
                anyType11 = new AnyType(new LazyKType(D.b(EitherOfThree.class), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        return D.i(EitherOfThree.class, aVar.d(D.p(List.class, aVar.d(D.o(SourceMap.class)))), aVar.d(D.p(SharedRef.class, aVar.d(D.o(Drawable.class)))), aVar.d(D.p(SharedRef.class, aVar.d(D.o(Bitmap.class)))));
                    }
                }), null);
            } else {
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                viewDefinitionBuilder = viewDefinitionBuilder2;
            }
            props.put("source", new ConcreteViewProp("source", anyType11, function2));
            ExpoImageModule$definition$1$11$2 expoImageModule$definition$1$11$2 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (ContentFit) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, ContentFit contentFit) {
                    AbstractC2855l.g(view, "view");
                    if (contentFit == null) {
                        contentFit = ContentFit.Cover;
                    }
                    view.setContentFit$expo_image_release(contentFit);
                }
            };
            Map<String, AnyViewProp> props2 = viewDefinitionBuilder.getProps();
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(D.b(ContentFit.class), bool2));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(D.b(ContentFit.class), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(ContentFit.class);
                    }
                }), null);
            }
            props2.put("contentFit", new ConcreteViewProp("contentFit", anyType12, expoImageModule$definition$1$11$2));
            ExpoImageModule$definition$1$11$3 expoImageModule$definition$1$11$3 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (ContentFit) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, ContentFit contentFit) {
                    AbstractC2855l.g(view, "view");
                    if (contentFit == null) {
                        contentFit = ContentFit.ScaleDown;
                    }
                    view.setPlaceholderContentFit$expo_image_release(contentFit);
                }
            };
            Map<String, AnyViewProp> props3 = viewDefinitionBuilder.getProps();
            AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(D.b(ContentFit.class), bool2));
            if (anyType13 == null) {
                anyType13 = new AnyType(new LazyKType(D.b(ContentFit.class), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(ContentFit.class);
                    }
                }), null);
            }
            props3.put("placeholderContentFit", new ConcreteViewProp("placeholderContentFit", anyType13, expoImageModule$definition$1$11$3));
            ExpoImageModule$definition$1$11$4 expoImageModule$definition$1$11$4 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (ContentPosition) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, ContentPosition contentPosition) {
                    AbstractC2855l.g(view, "view");
                    if (contentPosition == null) {
                        contentPosition = ContentPosition.INSTANCE.getCenter();
                    }
                    view.setContentPosition$expo_image_release(contentPosition);
                }
            };
            Map<String, AnyViewProp> props4 = viewDefinitionBuilder.getProps();
            AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(D.b(ContentPosition.class), bool2));
            if (anyType14 == null) {
                anyType14 = new AnyType(new LazyKType(D.b(ContentPosition.class), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(ContentPosition.class);
                    }
                }), null);
            }
            props4.put("contentPosition", new ConcreteViewProp("contentPosition", anyType14, expoImageModule$definition$1$11$4));
            ExpoImageModule$definition$1$11$5 expoImageModule$definition$1$11$5 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (Integer) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, Integer num) {
                    AbstractC2855l.g(view, "view");
                    if (num == null || num.intValue() <= 0) {
                        num = null;
                    }
                    view.setBlurRadius$expo_image_release(num);
                }
            };
            Map<String, AnyViewProp> props5 = viewDefinitionBuilder.getProps();
            AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool2));
            if (anyType15 == null) {
                anyType15 = new AnyType(new LazyKType(D.b(cls2), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Integer.class);
                    }
                }), null);
            }
            props5.put("blurRadius", new ConcreteViewProp("blurRadius", anyType15, expoImageModule$definition$1$11$5));
            ExpoImageModule$definition$1$11$6 expoImageModule$definition$1$11$6 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (ImageTransition) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, ImageTransition imageTransition) {
                    AbstractC2855l.g(view, "view");
                    view.setTransition$expo_image_release(imageTransition);
                }
            };
            Map<String, AnyViewProp> props6 = viewDefinitionBuilder.getProps();
            AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(D.b(ImageTransition.class), bool2));
            if (anyType16 == null) {
                anyType16 = new AnyType(new LazyKType(D.b(ImageTransition.class), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(ImageTransition.class);
                    }
                }), null);
            }
            props6.put("transition", new ConcreteViewProp("transition", anyType16, expoImageModule$definition$1$11$6));
            ExpoImageModule$definition$1$11$7 expoImageModule$definition$1$11$7 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (Integer) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, Integer num) {
                    AbstractC2855l.g(view, "view");
                    view.setTintColor$expo_image_release(num);
                }
            };
            Map<String, AnyViewProp> props7 = viewDefinitionBuilder.getProps();
            AnyType anyType17 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool2));
            if (anyType17 == null) {
                anyType17 = new AnyType(new LazyKType(D.b(cls2), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$7
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Integer.class);
                    }
                }), null);
            }
            props7.put("tintColor", new ConcreteViewProp("tintColor", anyType17, expoImageModule$definition$1$11$7));
            ExpoImageModule$definition$1$11$8 expoImageModule$definition$1$11$8 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (List<SourceMap>) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, List<SourceMap> list) {
                    AbstractC2855l.g(view, "view");
                    if (list == null) {
                        list = AbstractC2800q.j();
                    }
                    view.setPlaceholders$expo_image_release(list);
                }
            };
            Map<String, AnyViewProp> props8 = viewDefinitionBuilder.getProps();
            AnyType anyType18 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool2));
            if (anyType18 == null) {
                anyType18 = new AnyType(new LazyKType(D.b(cls), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$8
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.g(List.class, q.f518c.d(D.o(SourceMap.class)));
                    }
                }), null);
            }
            props8.put(ReactTextInputShadowNode.PROP_PLACEHOLDER, new ConcreteViewProp(ReactTextInputShadowNode.PROP_PLACEHOLDER, anyType18, expoImageModule$definition$1$11$8));
            ExpoImageModule$definition$1$11$9 expoImageModule$definition$1$11$9 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (Boolean) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, Boolean bool3) {
                    AbstractC2855l.g(view, "view");
                    view.setAccessible$expo_image_release(AbstractC2855l.b(bool3, Boolean.TRUE));
                }
            };
            Map<String, AnyViewProp> props9 = viewDefinitionBuilder.getProps();
            AnyType anyType19 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool2));
            if (anyType19 == null) {
                anyType19 = new AnyType(new LazyKType(D.b(cls5), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$9
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Boolean.class);
                    }
                }), null);
            }
            props9.put("accessible", new ConcreteViewProp("accessible", anyType19, expoImageModule$definition$1$11$9));
            ExpoImageModule$definition$1$11$10 expoImageModule$definition$1$11$10 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$10
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (String) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, String str) {
                    AbstractC2855l.g(view, "view");
                    view.setAccessibilityLabel$expo_image_release(str);
                }
            };
            Map<String, AnyViewProp> props10 = viewDefinitionBuilder.getProps();
            AnyType anyType20 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool2));
            if (anyType20 == null) {
                anyType20 = new AnyType(new LazyKType(D.b(String.class), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$10
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), null);
            }
            props10.put(ViewProps.ACCESSIBILITY_LABEL, new ConcreteViewProp(ViewProps.ACCESSIBILITY_LABEL, anyType20, expoImageModule$definition$1$11$10));
            ExpoImageModule$definition$1$11$11 expoImageModule$definition$1$11$11 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$11
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (Boolean) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, Boolean bool3) {
                    AbstractC2855l.g(view, "view");
                    view.setFocusableProp$expo_image_release(AbstractC2855l.b(bool3, Boolean.TRUE));
                }
            };
            Map<String, AnyViewProp> props11 = viewDefinitionBuilder.getProps();
            AnyType anyType21 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool2));
            if (anyType21 == null) {
                anyType21 = new AnyType(new LazyKType(D.b(cls5), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$11
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Boolean.class);
                    }
                }), null);
            }
            props11.put("focusable", new ConcreteViewProp("focusable", anyType21, expoImageModule$definition$1$11$11));
            ExpoImageModule$definition$1$11$12 expoImageModule$definition$1$11$12 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$12
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (Priority) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, Priority priority) {
                    AbstractC2855l.g(view, "view");
                    if (priority == null) {
                        priority = Priority.NORMAL;
                    }
                    view.setPriority$expo_image_release(priority);
                }
            };
            Map<String, AnyViewProp> props12 = viewDefinitionBuilder.getProps();
            AnyType anyType22 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Priority.class), bool2));
            if (anyType22 == null) {
                anyType22 = new AnyType(new LazyKType(D.b(Priority.class), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$12
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Priority.class);
                    }
                }), null);
            }
            props12.put("priority", new ConcreteViewProp("priority", anyType22, expoImageModule$definition$1$11$12));
            ExpoImageModule$definition$1$11$13 expoImageModule$definition$1$11$13 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$13
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (CachePolicy) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, CachePolicy cachePolicy) {
                    AbstractC2855l.g(view, "view");
                    if (cachePolicy == null) {
                        cachePolicy = CachePolicy.DISK;
                    }
                    view.setCachePolicy$expo_image_release(cachePolicy);
                }
            };
            Map<String, AnyViewProp> props13 = viewDefinitionBuilder.getProps();
            AnyType anyType23 = anyTypeProvider.getTypesMap().get(new Pair(D.b(CachePolicy.class), bool2));
            if (anyType23 == null) {
                anyType23 = new AnyType(new LazyKType(D.b(CachePolicy.class), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$13
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(CachePolicy.class);
                    }
                }), null);
            }
            props13.put("cachePolicy", new ConcreteViewProp("cachePolicy", anyType23, expoImageModule$definition$1$11$13));
            ExpoImageModule$definition$1$11$14 expoImageModule$definition$1$11$14 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$14
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (String) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, String str) {
                    AbstractC2855l.g(view, "view");
                    view.setRecyclingKey(str);
                }
            };
            Map<String, AnyViewProp> props14 = viewDefinitionBuilder.getProps();
            AnyType anyType24 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool2));
            if (anyType24 == null) {
                anyType24 = new AnyType(new LazyKType(D.b(String.class), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$14
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), null);
            }
            props14.put("recyclingKey", new ConcreteViewProp("recyclingKey", anyType24, expoImageModule$definition$1$11$14));
            ExpoImageModule$definition$1$11$15 expoImageModule$definition$1$11$15 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$15
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (Boolean) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, Boolean bool3) {
                    AbstractC2855l.g(view, "view");
                    view.setAllowDownscaling$expo_image_release(!AbstractC2855l.b(bool3, Boolean.FALSE));
                }
            };
            Map<String, AnyViewProp> props15 = viewDefinitionBuilder.getProps();
            AnyType anyType25 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool2));
            if (anyType25 == null) {
                anyType25 = new AnyType(new LazyKType(D.b(cls5), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$15
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Boolean.class);
                    }
                }), null);
            }
            props15.put("allowDownscaling", new ConcreteViewProp("allowDownscaling", anyType25, expoImageModule$definition$1$11$15));
            ExpoImageModule$definition$1$11$16 expoImageModule$definition$1$11$16 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$16
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (Boolean) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, Boolean bool3) {
                    AbstractC2855l.g(view, "view");
                    view.setAutoplay$expo_image_release(!AbstractC2855l.b(bool3, Boolean.FALSE));
                }
            };
            Map<String, AnyViewProp> props16 = viewDefinitionBuilder.getProps();
            AnyType anyType26 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool2));
            if (anyType26 == null) {
                anyType26 = new AnyType(new LazyKType(D.b(cls5), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$16
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Boolean.class);
                    }
                }), null);
            }
            props16.put("autoplay", new ConcreteViewProp("autoplay", anyType26, expoImageModule$definition$1$11$16));
            ExpoImageModule$definition$1$11$17 expoImageModule$definition$1$11$17 = new Function2() { // from class: expo.modules.image.ExpoImageModule$definition$1$11$17
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((ExpoImageViewWrapper) obj2, (DecodeFormat) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoImageViewWrapper view, DecodeFormat decodeFormat) {
                    AbstractC2855l.g(view, "view");
                    if (decodeFormat == null) {
                        decodeFormat = DecodeFormat.ARGB_8888;
                    }
                    view.setDecodeFormat$expo_image_release(decodeFormat);
                }
            };
            Map<String, AnyViewProp> props17 = viewDefinitionBuilder.getProps();
            AnyType anyType27 = anyTypeProvider.getTypesMap().get(new Pair(D.b(DecodeFormat.class), bool2));
            if (anyType27 == null) {
                anyType27 = new AnyType(new LazyKType(D.b(DecodeFormat.class), true, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$17
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(DecodeFormat.class);
                    }
                }), null);
            }
            props17.put("decodeFormat", new ConcreteViewProp("decodeFormat", anyType27, expoImageModule$definition$1$11$17));
            AnyType anyType28 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType28 == null) {
                anyType28 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ExpoImageViewWrapper.class);
                    }
                }), null);
            }
            AnyType[] anyTypeArr7 = {anyType28};
            Function1 function12 = new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$3
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((ExpoImageViewWrapper) objArr[0]).setIsAnimating(true);
                    return C2735B.f28704a;
                }
            };
            Object obj2 = obj;
            viewDefinitionBuilder.getAsyncFunctions().put("startAnimating", AbstractC2855l.b(obj2, cls6) ? new IntAsyncFunctionComponent("startAnimating", anyTypeArr7, function12) : AbstractC2855l.b(obj2, cls10) ? new BoolAsyncFunctionComponent("startAnimating", anyTypeArr7, function12) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("startAnimating", anyTypeArr7, function12) : AbstractC2855l.b(obj2, cls8) ? new FloatAsyncFunctionComponent("startAnimating", anyTypeArr7, function12) : AbstractC2855l.b(obj2, String.class) ? new StringAsyncFunctionComponent("startAnimating", anyTypeArr7, function12) : new UntypedAsyncFunctionComponent("startAnimating", anyTypeArr7, function12));
            AnyType anyType29 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType29 == null) {
                anyType29 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ExpoImageViewWrapper.class);
                    }
                }), null);
            }
            AnyType[] anyTypeArr8 = {anyType29};
            Function1 function13 = new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$6
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((ExpoImageViewWrapper) objArr[0]).setIsAnimating(false);
                    return C2735B.f28704a;
                }
            };
            viewDefinitionBuilder.getAsyncFunctions().put("stopAnimating", AbstractC2855l.b(obj2, cls6) ? new IntAsyncFunctionComponent("stopAnimating", anyTypeArr8, function13) : AbstractC2855l.b(obj2, cls10) ? new BoolAsyncFunctionComponent("stopAnimating", anyTypeArr8, function13) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("stopAnimating", anyTypeArr8, function13) : AbstractC2855l.b(obj2, cls8) ? new FloatAsyncFunctionComponent("stopAnimating", anyTypeArr8, function13) : AbstractC2855l.b(obj2, String.class) ? new StringAsyncFunctionComponent("stopAnimating", anyTypeArr8, function13) : new UntypedAsyncFunctionComponent("stopAnimating", anyTypeArr8, function13));
            AnyType anyType30 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType30 == null) {
                anyType30 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$8
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ExpoImageViewWrapper.class);
                    }
                }), null);
            }
            AnyType[] anyTypeArr9 = {anyType30};
            Function1 function14 = new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$9
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((ExpoImageViewWrapper) objArr[0]).setLockResource$expo_image_release(true);
                    return C2735B.f28704a;
                }
            };
            viewDefinitionBuilder.getAsyncFunctions().put("lockResourceAsync", AbstractC2855l.b(obj2, cls6) ? new IntAsyncFunctionComponent("lockResourceAsync", anyTypeArr9, function14) : AbstractC2855l.b(obj2, cls10) ? new BoolAsyncFunctionComponent("lockResourceAsync", anyTypeArr9, function14) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("lockResourceAsync", anyTypeArr9, function14) : AbstractC2855l.b(obj2, cls8) ? new FloatAsyncFunctionComponent("lockResourceAsync", anyTypeArr9, function14) : AbstractC2855l.b(obj2, String.class) ? new StringAsyncFunctionComponent("lockResourceAsync", anyTypeArr9, function14) : new UntypedAsyncFunctionComponent("lockResourceAsync", anyTypeArr9, function14));
            AnyType anyType31 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType31 == null) {
                anyType31 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$11
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ExpoImageViewWrapper.class);
                    }
                }), null);
            }
            AnyType[] anyTypeArr10 = {anyType31};
            Function1 function15 = new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$12
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((ExpoImageViewWrapper) objArr[0]).setLockResource$expo_image_release(false);
                    return C2735B.f28704a;
                }
            };
            viewDefinitionBuilder.getAsyncFunctions().put("unlockResourceAsync", AbstractC2855l.b(obj2, cls6) ? new IntAsyncFunctionComponent("unlockResourceAsync", anyTypeArr10, function15) : AbstractC2855l.b(obj2, cls10) ? new BoolAsyncFunctionComponent("unlockResourceAsync", anyTypeArr10, function15) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("unlockResourceAsync", anyTypeArr10, function15) : AbstractC2855l.b(obj2, cls8) ? new FloatAsyncFunctionComponent("unlockResourceAsync", anyTypeArr10, function15) : AbstractC2855l.b(obj2, String.class) ? new StringAsyncFunctionComponent("unlockResourceAsync", anyTypeArr10, function15) : new UntypedAsyncFunctionComponent("unlockResourceAsync", anyTypeArr10, function15));
            AnyType anyType32 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType32 == null) {
                anyType32 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$14
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ExpoImageViewWrapper.class);
                    }
                }), null);
            }
            AnyType[] anyTypeArr11 = {anyType32};
            Function1 function16 = new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$15
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ExpoImageViewWrapper expoImageViewWrapper = (ExpoImageViewWrapper) objArr[0];
                    expoImageViewWrapper.setShouldRerender$expo_image_release(true);
                    ExpoImageViewWrapper.rerenderIfNeeded$expo_image_release$default(expoImageViewWrapper, false, true, 1, null);
                    return C2735B.f28704a;
                }
            };
            viewDefinitionBuilder.getAsyncFunctions().put("reloadAsync", AbstractC2855l.b(obj2, cls6) ? new IntAsyncFunctionComponent("reloadAsync", anyTypeArr11, function16) : AbstractC2855l.b(obj2, cls10) ? new BoolAsyncFunctionComponent("reloadAsync", anyTypeArr11, function16) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("reloadAsync", anyTypeArr11, function16) : AbstractC2855l.b(obj2, cls8) ? new FloatAsyncFunctionComponent("reloadAsync", anyTypeArr11, function16) : AbstractC2855l.b(obj2, String.class) ? new StringAsyncFunctionComponent("reloadAsync", anyTypeArr11, function16) : new UntypedAsyncFunctionComponent("reloadAsync", anyTypeArr11, function16));
            ViewDefinitionBuilder viewDefinitionBuilder3 = viewDefinitionBuilder;
            viewDefinitionBuilder3.setOnViewDidUpdateProps(new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$OnViewDidUpdateProps$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((View) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(View it) {
                    AbstractC2855l.g(it, "it");
                    ExpoImageViewWrapper.rerenderIfNeeded$expo_image_release$default((ExpoImageViewWrapper) it, false, false, 3, null);
                }
            });
            viewDefinitionBuilder3.setOnViewDestroys(new Function1() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$$inlined$OnViewDestroys$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((View) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(View it) {
                    AbstractC2855l.g(it, "it");
                    final ExpoImageViewWrapper expoImageViewWrapper = (ExpoImageViewWrapper) it;
                    if (expoImageViewWrapper.isAttachedToWindow()) {
                        expoImageViewWrapper.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: expo.modules.image.ExpoImageModule$definition$lambda$30$lambda$29$lambda$28$$inlined$doOnDetach$1
                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View view) {
                                expoImageViewWrapper.removeOnAttachStateChangeListener(this);
                                expoImageViewWrapper.onViewDestroys();
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View view) {
                            }
                        });
                    } else {
                        expoImageViewWrapper.onViewDestroys();
                    }
                }
            });
            ViewManagerDefinition viewManagerDefinitionBuild = viewDefinitionBuilder3.build();
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            moduleDefinitionBuilder3.registerViewDefinition(viewManagerDefinitionBuild);
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder3.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
