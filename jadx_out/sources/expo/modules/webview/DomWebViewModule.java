package expo.modules.webview;

import C7.d;
import C7.o;
import android.view.View;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.views.AnyViewProp;
import expo.modules.kotlin.views.ConcreteViewProp;
import expo.modules.kotlin.views.ViewDefinitionBuilder;
import expo.modules.kotlin.views.decorators.CSSPropsKt;
import i7.C2735B;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/webview/DomWebViewModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-dom-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DomWebViewModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        AnyTypeProvider anyTypeProvider;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoDomWebViewModule");
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_DESTROY;
            eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$$inlined$OnDestroy$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m350invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m350invoke() {
                    DomWebViewRegistry.INSTANCE.reset();
                }
            }));
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
            d dVarB = D.b(Integer.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                cls = ScrollToParam.class;
                anyType = new AnyType(new LazyKType(D.b(Integer.class), false, new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$$inlined$AsyncFunction$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Integer.TYPE);
                    }
                }), converters);
            } else {
                cls = ScrollToParam.class;
            }
            AnyType anyType2 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType2 == null) {
                cls2 = DomWebViewSource.class;
                anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$$inlined$AsyncFunction$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            } else {
                cls2 = DomWebViewSource.class;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("evalJsForWebViewAsync", new UntypedAsyncFunctionComponent("evalJsForWebViewAsync", new AnyType[]{anyType, anyType2}, new Function1() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$$inlined$AsyncFunction$3
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    DomWebView domWebView = DomWebViewRegistry.INSTANCE.get(((Number) obj).intValue());
                    if (domWebView == null) {
                        return null;
                    }
                    domWebView.injectJavaScript(str);
                    return C2735B.f28704a;
                }
            }));
            ViewDefinitionBuilder viewDefinitionBuilder = new ViewDefinitionBuilder(D.b(DomWebView.class), new LazyKType(D.b(DomWebView.class), false, new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$$inlined$View$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    return D.o(DomWebView.class);
                }
            }, 2, null), moduleDefinitionBuilder.getConverters());
            CSSPropsKt.UseCSSProps(viewDefinitionBuilder);
            viewDefinitionBuilder.Events("onMessage");
            DomWebViewModule$definition$1$3$1 domWebViewModule$definition$1$3$1 = new Function2() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((DomWebView) obj, (DomWebViewSource) obj2);
                    return C2735B.f28704a;
                }

                public final void invoke(DomWebView view, DomWebViewSource source) {
                    AbstractC2855l.g(view, "view");
                    AbstractC2855l.g(source, "source");
                    view.setSource(source);
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyType anyType3 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType3 == null) {
                DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$1 domWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$1 = new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(DomWebViewSource.class);
                    }
                };
                cls3 = DomWebView.class;
                d dVarB2 = D.b(cls2);
                cls4 = Boolean.class;
                anyType3 = new AnyType(new LazyKType(dVarB2, false, domWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$1), null);
            } else {
                cls3 = DomWebView.class;
                cls4 = Boolean.class;
            }
            props.put("source", new ConcreteViewProp("source", anyType3, domWebViewModule$definition$1$3$1));
            DomWebViewModule$definition$1$3$2 domWebViewModule$definition$1$3$2 = new Function2() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((DomWebView) obj, (String) obj2);
                    return C2735B.f28704a;
                }

                public final void invoke(DomWebView view, String script) {
                    AbstractC2855l.g(view, "view");
                    AbstractC2855l.g(script, "script");
                    view.setInjectedJSBeforeContentLoaded(script);
                }
            };
            Map<String, AnyViewProp> props2 = viewDefinitionBuilder.getProps();
            AnyType anyType4 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), null);
            }
            props2.put("injectedJavaScriptBeforeContentLoaded", new ConcreteViewProp("injectedJavaScriptBeforeContentLoaded", anyType4, domWebViewModule$definition$1$3$2));
            DomWebViewModule$definition$1$3$3 domWebViewModule$definition$1$3$3 = new Function2() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((DomWebView) obj, ((Boolean) obj2).booleanValue());
                    return C2735B.f28704a;
                }

                public final void invoke(DomWebView view, boolean z10) {
                    AbstractC2855l.g(view, "view");
                    view.setWebviewDebuggingEnabled(z10);
                }
            };
            Map<String, AnyViewProp> props3 = viewDefinitionBuilder.getProps();
            AnyType anyType5 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), null);
            }
            props3.put("webviewDebuggingEnabled", new ConcreteViewProp("webviewDebuggingEnabled", anyType5, domWebViewModule$definition$1$3$3));
            DomWebViewModule$definition$1$3$4 domWebViewModule$definition$1$3$4 = new Function2() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((DomWebView) obj, ((Boolean) obj2).booleanValue());
                    return C2735B.f28704a;
                }

                public final void invoke(final DomWebView view, final boolean z10) {
                    AbstractC2855l.g(view, "view");
                    view.getWebView().post(new Runnable() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            view.getWebView().setHorizontalScrollBarEnabled(z10);
                        }
                    });
                }
            };
            Map<String, AnyViewProp> props4 = viewDefinitionBuilder.getProps();
            AnyType anyType6 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), null);
            }
            props4.put("showsHorizontalScrollIndicator", new ConcreteViewProp("showsHorizontalScrollIndicator", anyType6, domWebViewModule$definition$1$3$4));
            DomWebViewModule$definition$1$3$5 domWebViewModule$definition$1$3$5 = new Function2() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((DomWebView) obj, ((Boolean) obj2).booleanValue());
                    return C2735B.f28704a;
                }

                public final void invoke(final DomWebView view, final boolean z10) {
                    AbstractC2855l.g(view, "view");
                    view.getWebView().post(new Runnable() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$5.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            view.getWebView().setVerticalScrollBarEnabled(z10);
                        }
                    });
                }
            };
            Map<String, AnyViewProp> props5 = viewDefinitionBuilder.getProps();
            AnyType anyType7 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), null);
            }
            props5.put("showsVerticalScrollIndicator", new ConcreteViewProp("showsVerticalScrollIndicator", anyType7, domWebViewModule$definition$1$3$5));
            DomWebViewModule$definition$1$3$6 domWebViewModule$definition$1$3$6 = new Function2() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((DomWebView) obj, ((Boolean) obj2).booleanValue());
                    return C2735B.f28704a;
                }

                public final void invoke(DomWebView view, boolean z10) {
                    AbstractC2855l.g(view, "view");
                    view.setNestedScrollEnabled(z10);
                }
            };
            Map<String, AnyViewProp> props6 = viewDefinitionBuilder.getProps();
            AnyType anyType8 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType8 == null) {
                anyType8 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), null);
            }
            props6.put("nestedScrollEnabled", new ConcreteViewProp("nestedScrollEnabled", anyType8, domWebViewModule$definition$1$3$6));
            TypeConverterProvider converters2 = viewDefinitionBuilder.getConverters();
            AnyType anyType9 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(DomWebView.class);
                    }
                }), converters2);
            }
            AnyType anyType10 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType10 == null) {
                anyType10 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ScrollToParam.class);
                    }
                }), converters2);
            }
            AnyType[] anyTypeArr = {anyType9, anyType10};
            Function1 function1 = new Function1() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$3
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((DomWebView) objArr[0]).scrollTo((ScrollToParam) objArr[1]);
                    return C2735B.f28704a;
                }
            };
            Class cls5 = Integer.TYPE;
            boolean zB = AbstractC2855l.b(C2735B.class, cls5);
            Class cls6 = Float.TYPE;
            Class cls7 = Double.TYPE;
            Class cls8 = Boolean.TYPE;
            viewDefinitionBuilder.getAsyncFunctions().put("scrollTo", zB ? new IntAsyncFunctionComponent("scrollTo", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls8) ? new BoolAsyncFunctionComponent("scrollTo", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls7) ? new DoubleAsyncFunctionComponent("scrollTo", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls6) ? new FloatAsyncFunctionComponent("scrollTo", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("scrollTo", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("scrollTo", anyTypeArr, function1));
            TypeConverterProvider converters3 = viewDefinitionBuilder.getConverters();
            AnyType anyType11 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType11 == null) {
                anyTypeProvider = anyTypeProvider2;
                anyType11 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(DomWebView.class);
                    }
                }), converters3);
            } else {
                anyTypeProvider = anyTypeProvider2;
            }
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters3);
            }
            AnyType[] anyTypeArr2 = {anyType11, anyType12};
            Function1 function12 = new Function1() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$6
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((DomWebView) objArr[0]).injectJavaScript((String) objArr[1]);
                    return C2735B.f28704a;
                }
            };
            viewDefinitionBuilder.getAsyncFunctions().put("injectJavaScript", AbstractC2855l.b(C2735B.class, cls5) ? new IntAsyncFunctionComponent("injectJavaScript", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls8) ? new BoolAsyncFunctionComponent("injectJavaScript", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls7) ? new DoubleAsyncFunctionComponent("injectJavaScript", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls6) ? new FloatAsyncFunctionComponent("injectJavaScript", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("injectJavaScript", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("injectJavaScript", anyTypeArr2, function12));
            viewDefinitionBuilder.setOnViewDidUpdateProps(new Function1() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$OnViewDidUpdateProps$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((View) obj);
                    return C2735B.f28704a;
                }

                public final void invoke(View it) {
                    AbstractC2855l.g(it, "it");
                    ((DomWebView) it).reload();
                }
            });
            moduleDefinitionBuilder.registerViewDefinition(viewDefinitionBuilder.build());
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
