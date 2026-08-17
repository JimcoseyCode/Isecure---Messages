package expo.modules.kotlin.modules;

import C7.d;
import C7.o;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.classcomponent.ClassDefinitionData;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventListenerWithPayload;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.OnActivityResultPayload;
import expo.modules.kotlin.objects.ObjectDefinitionBuilder;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.TypeConverterProviderKt;
import expo.modules.kotlin.views.ViewDefinitionBuilder;
import expo.modules.kotlin.views.ViewManagerDefinition;
import expo.modules.kotlin.views.decorators.CSSPropsKt;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.C2735B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v7.AbstractC3430a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013JG\u0010\u001b\u001a\u00020\r\"\n\b\u0000\u0010\u0015\u0018\u0001*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0004\u0012\u00020\r0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\r2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010$\u001a\u00020\r2\"\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\"\u0012\u0006\u0012\u0004\u0018\u00010#0 ¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\r2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b&\u0010\u001fJ#\u0010'\u001a\u00020\r2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u001fJ#\u0010(\u001a\u00020\r2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u001fJ#\u0010)\u001a\u00020\r2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ#\u0010*\u001a\u00020\r2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u001fJ)\u0010,\u001a\u00020\r2\u0014\b\u0004\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\r0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b,\u0010-J/\u00100\u001a\u00020\r2\u001a\b\u0004\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\r0 H\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u0010%J7\u00102\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r01\u0012\u0004\u0012\u00020\r0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b2\u00103JS\u00102\u001a\u00020\r\"\n\b\u0000\u00105\u0018\u0001*\u0002042\u0006\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000001\u0012\u0004\u0012\u00020\r0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b2\u00107JK\u00102\u001a\u00020\r\"\n\b\u0000\u00105\u0018\u0001*\u0002042\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000001\u0012\u0004\u0012\u00020\r0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b2\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:R*\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\f\u0010=\u0012\u0004\bA\u0010<\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u000fR4\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100B8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bC\u0010D\u0012\u0004\bI\u0010<\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR,\u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020K0B8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bL\u0010D\u0012\u0004\bN\u0010<\u001a\u0004\bM\u0010FRF\u0010O\u001a \b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\"\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bO\u0010P\u0012\u0004\bT\u0010<\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010%R.\u0010W\u001a\b\u0012\u0004\u0012\u00020V0U8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bW\u0010X\u0012\u0004\b]\u0010<\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006^"}, d2 = {"Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;", "Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;", "Lexpo/modules/kotlin/modules/Module;", "module", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converters", "<init>", "(Lexpo/modules/kotlin/modules/Module;Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "buildModule", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "Li7/B;", "Name", "(Ljava/lang/String;)V", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "definition", "registerViewDefinition", "(Lexpo/modules/kotlin/views/ViewManagerDefinition;)V", "Landroid/view/View;", "T", "LC7/d;", "viewClass", "Lkotlin/Function1;", "Lexpo/modules/kotlin/views/ViewDefinitionBuilder;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "View", "(LC7/d;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "OnCreate", "(Lw7/a;)V", "Lkotlin/Function2;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "Ln7/f;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "RegisterActivityContracts", "(Lkotlin/jvm/functions/Function2;)V", "OnDestroy", "OnActivityEntersForeground", "OnActivityEntersBackground", "OnUserLeavesActivity", "OnActivityDestroys", "Landroid/content/Intent;", "OnNewIntent", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/app/Activity;", "Lexpo/modules/kotlin/events/OnActivityResultPayload;", "OnActivityResult", "Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;", "Class", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "SharedObjectType", "sharedObjectClass", "(Ljava/lang/String;LC7/d;Lkotlin/jvm/functions/Function1;)V", "Lexpo/modules/kotlin/modules/Module;", "getModule", "()Lexpo/modules/kotlin/modules/Module;", "getModule$annotations", "()V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "getName$annotations", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewManagerDefinitions", "Ljava/util/Map;", "getViewManagerDefinitions", "()Ljava/util/Map;", "setViewManagerDefinitions", "(Ljava/util/Map;)V", "getViewManagerDefinitions$annotations", "Lexpo/modules/kotlin/events/EventName;", "Lexpo/modules/kotlin/events/EventListener;", "eventListeners", "getEventListeners", "getEventListeners$annotations", "registerContracts", "Lkotlin/jvm/functions/Function2;", "getRegisterContracts", "()Lkotlin/jvm/functions/Function2;", "setRegisterContracts", "getRegisterContracts$annotations", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;", "classData", "Ljava/util/List;", "getClassData", "()Ljava/util/List;", "setClassData", "(Ljava/util/List;)V", "getClassData$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DefinitionMarker
public class InternalModuleDefinitionBuilder extends ObjectDefinitionBuilder {
    private List<ClassDefinitionData> classData;
    private final Map<EventName, EventListener> eventListeners;
    private final Module module;
    private String name;
    private Function2 registerContracts;
    private Map<String, ViewManagerDefinition> viewManagerDefinitions;

    /* JADX WARN: Multi-variable type inference failed */
    public InternalModuleDefinitionBuilder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void Class$default(InternalModuleDefinitionBuilder internalModuleDefinitionBuilder, String name, Function1 body, int i10, Object obj) {
        AnyType anyType;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: Class");
        }
        if ((i10 & 2) != 0) {
            body = new Function1() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.Class.1
                public final void invoke(ClassComponentBuilder<C2735B> classComponentBuilder) {
                    AbstractC2855l.g(classComponentBuilder, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((ClassComponentBuilder<C2735B>) obj2);
                    return C2735B.f28704a;
                }
            };
        }
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        Module module = internalModuleDefinitionBuilder.getModule();
        if (module == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AppContext appContext = module.getAppContext();
        d dVarB = D.b(C2735B.class);
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(C2735B.class), Boolean.FALSE));
        if (anyType2 == null) {
            anyType = new AnyType(new LazyKType(D.b(C2735B.class), false, InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$1.INSTANCE), null);
        } else {
            anyType = anyType2;
        }
        ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, name, dVarB, anyType, internalModuleDefinitionBuilder.getConverters());
        body.invoke(classComponentBuilder);
        internalModuleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
    }

    public final void Class(String name, Function1 body) {
        AnyType anyType;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        Module module = getModule();
        if (module == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AppContext appContext = module.getAppContext();
        d dVarB = D.b(C2735B.class);
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(C2735B.class), Boolean.FALSE));
        if (anyType2 == null) {
            anyType = new AnyType(new LazyKType(D.b(C2735B.class), false, InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$1.INSTANCE), null);
        } else {
            anyType = anyType2;
        }
        ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, name, dVarB, anyType, getConverters());
        body.invoke(classComponentBuilder);
        getClassData().add(classComponentBuilder.buildClass());
    }

    public final void Name(String name) {
        AbstractC2855l.g(name, "name");
        this.name = name;
    }

    public final void OnActivityDestroys(final InterfaceC3487a body) {
        AbstractC2855l.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ACTIVITY_DESTROYS;
        eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnActivityDestroys.1
            @Override // w7.InterfaceC3487a
            public /* bridge */ /* synthetic */ Object invoke() {
                m226invoke();
                return C2735B.f28704a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m226invoke() {
                body.invoke();
            }
        }));
    }

    public final void OnActivityEntersBackground(final InterfaceC3487a body) {
        AbstractC2855l.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ACTIVITY_ENTERS_BACKGROUND;
        eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnActivityEntersBackground.1
            @Override // w7.InterfaceC3487a
            public /* bridge */ /* synthetic */ Object invoke() {
                m227invoke();
                return C2735B.f28704a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m227invoke() {
                body.invoke();
            }
        }));
    }

    public final void OnActivityEntersForeground(final InterfaceC3487a body) {
        AbstractC2855l.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ACTIVITY_ENTERS_FOREGROUND;
        eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnActivityEntersForeground.1
            @Override // w7.InterfaceC3487a
            public /* bridge */ /* synthetic */ Object invoke() {
                m228invoke();
                return C2735B.f28704a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m228invoke() {
                body.invoke();
            }
        }));
    }

    public final void OnActivityResult(final Function2 body) {
        AbstractC2855l.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ON_ACTIVITY_RESULT;
        eventListeners.put(eventName, new EventListenerWithSenderAndPayload(eventName, new Function2() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnActivityResult.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Activity) obj, (OnActivityResultPayload) obj2);
                return C2735B.f28704a;
            }

            public final void invoke(Activity sender, OnActivityResultPayload payload) {
                AbstractC2855l.g(sender, "sender");
                AbstractC2855l.g(payload, "payload");
                body.invoke(sender, payload);
            }
        }));
    }

    public final void OnCreate(final InterfaceC3487a body) {
        AbstractC2855l.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.MODULE_CREATE;
        eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnCreate.1
            @Override // w7.InterfaceC3487a
            public /* bridge */ /* synthetic */ Object invoke() {
                m229invoke();
                return C2735B.f28704a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m229invoke() {
                body.invoke();
            }
        }));
    }

    public final void OnDestroy(final InterfaceC3487a body) {
        AbstractC2855l.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.MODULE_DESTROY;
        eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnDestroy.1
            @Override // w7.InterfaceC3487a
            public /* bridge */ /* synthetic */ Object invoke() {
                m230invoke();
                return C2735B.f28704a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m230invoke() {
                body.invoke();
            }
        }));
    }

    public final void OnNewIntent(final Function1 body) {
        AbstractC2855l.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ON_NEW_INTENT;
        eventListeners.put(eventName, new EventListenerWithPayload(eventName, new Function1() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnNewIntent.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Intent) obj);
                return C2735B.f28704a;
            }

            public final void invoke(Intent it) {
                AbstractC2855l.g(it, "it");
                body.invoke(it);
            }
        }));
    }

    public final void OnUserLeavesActivity(final InterfaceC3487a body) {
        AbstractC2855l.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ON_USER_LEAVES_ACTIVITY;
        eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnUserLeavesActivity.1
            @Override // w7.InterfaceC3487a
            public /* bridge */ /* synthetic */ Object invoke() {
                m231invoke();
                return C2735B.f28704a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m231invoke() {
                body.invoke();
            }
        }));
    }

    public final void RegisterActivityContracts(Function2 body) {
        AbstractC2855l.g(body, "body");
        this.registerContracts = body;
    }

    public final /* synthetic */ <T extends View> void View(d viewClass, Function1 body) {
        AbstractC2855l.g(viewClass, "viewClass");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(4, "T");
        d dVarB = D.b(View.class);
        AbstractC2855l.l();
        ViewDefinitionBuilder viewDefinitionBuilder = new ViewDefinitionBuilder(viewClass, new LazyKType(dVarB, false, new InterfaceC3487a() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder$View$viewDefinitionBuilder$1
            @Override // w7.InterfaceC3487a
            public final o invoke() {
                AbstractC2855l.m(6, "T");
                return null;
            }
        }, 2, null), getConverters());
        CSSPropsKt.UseCSSProps(viewDefinitionBuilder);
        body.invoke(viewDefinitionBuilder);
        registerViewDefinition(viewDefinitionBuilder.build());
    }

    public final ModuleDefinitionData buildModule() {
        String simpleName = this.name;
        if (simpleName == null) {
            Module module = this.module;
            simpleName = module != null ? module.getClass().getSimpleName() : null;
        }
        String str = simpleName;
        if (str != null) {
            return new ModuleDefinitionData(str, buildObject(), this.viewManagerDefinitions, this.eventListeners, this.registerContracts, this.classData);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final List<ClassDefinitionData> getClassData() {
        return this.classData;
    }

    public final Map<EventName, EventListener> getEventListeners() {
        return this.eventListeners;
    }

    public final Module getModule() {
        return this.module;
    }

    public final String getName() {
        return this.name;
    }

    public final Function2 getRegisterContracts() {
        return this.registerContracts;
    }

    public final Map<String, ViewManagerDefinition> getViewManagerDefinitions() {
        return this.viewManagerDefinitions;
    }

    public final void registerViewDefinition(ViewManagerDefinition definition) {
        AbstractC2855l.g(definition, "definition");
        if (!this.viewManagerDefinitions.containsKey(definition.getName())) {
            this.viewManagerDefinitions.put(definition.getName(), definition);
            if (this.viewManagerDefinitions.containsKey(ModuleDefinitionBuilderKt.DEFAULT_MODULE_VIEW)) {
                return;
            }
            this.viewManagerDefinitions.put(ModuleDefinitionBuilderKt.DEFAULT_MODULE_VIEW, definition);
            return;
        }
        throw new IllegalArgumentException(("The module definition defines more than one view with name " + definition.getName() + ".").toString());
    }

    public final void setClassData(List<ClassDefinitionData> list) {
        AbstractC2855l.g(list, "<set-?>");
        this.classData = list;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRegisterContracts(Function2 function2) {
        this.registerContracts = function2;
    }

    public final void setViewManagerDefinitions(Map<String, ViewManagerDefinition> map) {
        AbstractC2855l.g(map, "<set-?>");
        this.viewManagerDefinitions = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InternalModuleDefinitionBuilder(Module module, TypeConverterProvider typeConverterProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        TypeConverterProvider typeConverterProviderConverters;
        module = (i10 & 1) != 0 ? null : module;
        this(module, (i10 & 2) != 0 ? (module == null || (typeConverterProviderConverters = module.converters()) == null) ? null : TypeConverterProviderKt.mergeWithDefault(typeConverterProviderConverters) : typeConverterProvider);
    }

    public InternalModuleDefinitionBuilder(Module module, TypeConverterProvider typeConverterProvider) {
        super(typeConverterProvider);
        this.module = module;
        this.viewManagerDefinitions = new LinkedHashMap();
        this.eventListeners = new LinkedHashMap();
        this.classData = new ArrayList();
    }

    public final /* synthetic */ <SharedObjectType extends SharedObject> void Class(String name, d sharedObjectClass, Function1 body) {
        AnyType anyType;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(sharedObjectClass, "sharedObjectClass");
        AbstractC2855l.g(body, "body");
        Module module = getModule();
        if (module != null) {
            AppContext appContext = module.getAppContext();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            AbstractC2855l.m(4, "SharedObjectType");
            d dVarB = D.b(Object.class);
            AbstractC2855l.m(3, "SharedObjectType");
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
            if (anyType2 == null) {
                AbstractC2855l.l();
                InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2 internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2 = InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2.INSTANCE;
                AbstractC2855l.m(4, "SharedObjectType");
                d dVarB2 = D.b(Object.class);
                AbstractC2855l.m(3, "SharedObjectType");
                anyType = new AnyType(new LazyKType(dVarB2, false, internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2), null);
            } else {
                anyType = anyType2;
            }
            ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, name, sharedObjectClass, anyType, getConverters());
            body.invoke(classComponentBuilder);
            getClassData().add(classComponentBuilder.buildClass());
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static /* synthetic */ void getClassData$annotations() {
    }

    public static /* synthetic */ void getEventListeners$annotations() {
    }

    public static /* synthetic */ void getModule$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getRegisterContracts$annotations() {
    }

    public static /* synthetic */ void getViewManagerDefinitions$annotations() {
    }

    public static /* synthetic */ void Class$default(InternalModuleDefinitionBuilder internalModuleDefinitionBuilder, String name, d dVar, Function1 body, int i10, Object obj) {
        AnyType anyType;
        if (obj == null) {
            if ((i10 & 2) != 0) {
                AbstractC2855l.m(4, "SharedObjectType");
                dVar = D.b(SharedObject.class);
            }
            d sharedObjectClass = dVar;
            if ((i10 & 4) != 0) {
                AbstractC2855l.l();
                body = AnonymousClass2.INSTANCE;
            }
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(sharedObjectClass, "sharedObjectClass");
            AbstractC2855l.g(body, "body");
            Module module = internalModuleDefinitionBuilder.getModule();
            if (module != null) {
                AppContext appContext = module.getAppContext();
                AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
                AbstractC2855l.m(4, "SharedObjectType");
                d dVarB = D.b(Object.class);
                AbstractC2855l.m(3, "SharedObjectType");
                AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
                if (anyType2 == null) {
                    AbstractC2855l.l();
                    InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2 internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2 = InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2.INSTANCE;
                    AbstractC2855l.m(4, "SharedObjectType");
                    d dVarB2 = D.b(Object.class);
                    AbstractC2855l.m(3, "SharedObjectType");
                    anyType = new AnyType(new LazyKType(dVarB2, false, internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2), null);
                } else {
                    anyType = anyType2;
                }
                ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, name, sharedObjectClass, anyType, internalModuleDefinitionBuilder.getConverters());
                body.invoke(classComponentBuilder);
                internalModuleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: Class");
    }

    public final /* synthetic */ <SharedObjectType extends SharedObject> void Class(d sharedObjectClass, Function1 body) {
        AnyType anyType;
        AbstractC2855l.g(sharedObjectClass, "sharedObjectClass");
        AbstractC2855l.g(body, "body");
        Module module = getModule();
        if (module != null) {
            AppContext appContext = module.getAppContext();
            String simpleName = AbstractC3430a.b(sharedObjectClass).getSimpleName();
            AbstractC2855l.f(simpleName, "getSimpleName(...)");
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            AbstractC2855l.m(4, "SharedObjectType");
            d dVarB = D.b(Object.class);
            AbstractC2855l.m(3, "SharedObjectType");
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
            if (anyType2 == null) {
                AbstractC2855l.l();
                InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3 internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3 = InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3.INSTANCE;
                AbstractC2855l.m(4, "SharedObjectType");
                d dVarB2 = D.b(Object.class);
                AbstractC2855l.m(3, "SharedObjectType");
                anyType = new AnyType(new LazyKType(dVarB2, false, internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3), null);
            } else {
                anyType = anyType2;
            }
            ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, simpleName, sharedObjectClass, anyType, getConverters());
            body.invoke(classComponentBuilder);
            getClassData().add(classComponentBuilder.buildClass());
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static /* synthetic */ void Class$default(InternalModuleDefinitionBuilder internalModuleDefinitionBuilder, d dVar, Function1 body, int i10, Object obj) {
        AnyType anyType;
        if (obj == null) {
            if ((i10 & 1) != 0) {
                AbstractC2855l.m(4, "SharedObjectType");
                dVar = D.b(SharedObject.class);
            }
            d sharedObjectClass = dVar;
            if ((i10 & 2) != 0) {
                AbstractC2855l.l();
                body = AnonymousClass3.INSTANCE;
            }
            AbstractC2855l.g(sharedObjectClass, "sharedObjectClass");
            AbstractC2855l.g(body, "body");
            Module module = internalModuleDefinitionBuilder.getModule();
            if (module != null) {
                AppContext appContext = module.getAppContext();
                String simpleName = AbstractC3430a.b(sharedObjectClass).getSimpleName();
                AbstractC2855l.f(simpleName, "getSimpleName(...)");
                AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
                AbstractC2855l.m(4, "SharedObjectType");
                d dVarB = D.b(Object.class);
                AbstractC2855l.m(3, "SharedObjectType");
                AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
                if (anyType2 == null) {
                    AbstractC2855l.l();
                    InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3 internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3 = InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3.INSTANCE;
                    AbstractC2855l.m(4, "SharedObjectType");
                    d dVarB2 = D.b(Object.class);
                    AbstractC2855l.m(3, "SharedObjectType");
                    anyType = new AnyType(new LazyKType(dVarB2, false, internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3), null);
                } else {
                    anyType = anyType2;
                }
                ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, simpleName, sharedObjectClass, anyType, internalModuleDefinitionBuilder.getConverters());
                body.invoke(classComponentBuilder);
                internalModuleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: Class");
    }
}
