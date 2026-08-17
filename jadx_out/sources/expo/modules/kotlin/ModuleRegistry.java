package expo.modules.kotlin;

import R8.C1404d0;
import R8.M;
import R8.N;
import R8.O;
import R8.T0;
import android.view.View;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.views.ViewManagerDefinition;
import i7.AbstractC2746i;
import i7.C2735B;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001MB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\b\"\b\b\u0000\u0010\u0015*\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ!\u0010\u0019\u001a\u00020\u00002\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u001e\"\u00020\u0014¢\u0006\u0004\b\u0019\u0010 J\u0015\u0010!\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b#\u0010$J\u001a\u0010#\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0015\u0018\u0001H\u0086\b¢\u0006\u0004\b#\u0010%J\u001b\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J'\u0010&\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0015*\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b&\u0010(J+\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002\"\b\b\u0000\u0010\u0015*\u00020)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*¢\u0006\u0004\b&\u0010,J3\u0010/\u001a\u0004\u0018\u00010.\"\b\b\u0000\u0010\u0015*\u00020)2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*¢\u0006\u0004\b/\u00100J#\u0010/\u001a\u0004\u0018\u00010.2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u00101\u001a\u00020\u0017¢\u0006\u0004\b/\u00102J\r\u00103\u001a\u00020\b¢\u0006\u0004\b3\u0010\nJ\u0015\u00104\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b4\u00105J#\u00104\u001a\u00020\b\"\u0004\b\u0000\u001062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b4\u00107J1\u00104\u001a\u00020\b\"\u0004\b\u0000\u00106\"\u0004\b\u0001\u001082\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b4\u00109J\u001a\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020:H\u0096\u0002¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\b¢\u0006\u0004\b=\u0010\nJ\u000f\u0010?\u001a\u00020\bH\u0000¢\u0006\u0004\b>\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R0\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020A8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010\n\u001a\u0004\bD\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lexpo/modules/kotlin/ModuleRegistry;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/ModuleHolder;", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/kotlin/AppContext;", "appContextHolder", "<init>", "(Ljava/lang/ref/WeakReference;)V", "Li7/B;", "readyForPostingEvents", "()V", "flushTheEventQueue", "Lexpo/modules/kotlin/events/EventName;", "eventName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "sender", "payload", PointerEventHelper.POINTER_TYPE_UNKNOWN, "addToQueueIfNeeded", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;Ljava/lang/Object;)Z", "Lexpo/modules/kotlin/modules/Module;", "T", "module", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "register", "(Lexpo/modules/kotlin/modules/Module;Ljava/lang/String;)V", "Lexpo/modules/kotlin/ModulesProvider;", "provider", "(Lexpo/modules/kotlin/ModulesProvider;)Lexpo/modules/kotlin/ModuleRegistry;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "modules", "([Lexpo/modules/kotlin/modules/Module;)Lexpo/modules/kotlin/ModuleRegistry;", "hasModule", "(Ljava/lang/String;)Z", "getModule", "(Ljava/lang/String;)Lexpo/modules/kotlin/modules/Module;", "()Ljava/lang/Object;", "getModuleHolder", "(Ljava/lang/String;)Lexpo/modules/kotlin/ModuleHolder;", "(Lexpo/modules/kotlin/modules/Module;)Lexpo/modules/kotlin/ModuleHolder;", "Landroid/view/View;", "Ljava/lang/Class;", "viewClass", "(Ljava/lang/Class;)Lexpo/modules/kotlin/ModuleHolder;", "holder", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "getViewDefinition", "(Lexpo/modules/kotlin/ModuleHolder;Ljava/lang/Class;)Lexpo/modules/kotlin/views/ViewManagerDefinition;", "viewName", "(Lexpo/modules/kotlin/ModuleHolder;Ljava/lang/String;)Lexpo/modules/kotlin/views/ViewManagerDefinition;", "postOnCreate", "post", "(Lexpo/modules/kotlin/events/EventName;)V", "Sender", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;)V", "Payload", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;Ljava/lang/Object;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "iterator", "()Ljava/util/Iterator;", "cleanUp", "registerActivityContracts$expo_modules_core_release", "registerActivityContracts", "Ljava/lang/ref/WeakReference;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "registry", "Ljava/util/Map;", "getRegistry", "()Ljava/util/Map;", "getRegistry$annotations", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/ModuleRegistry$PostponedEvent;", "eventQueue", "Ljava/util/List;", "isReadyForPostingEvents", "Z", "PostponedEvent", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModuleRegistry implements Iterable<ModuleHolder<?>>, InterfaceC3550a {
    private final WeakReference<AppContext> appContextHolder;
    private final List<PostponedEvent> eventQueue;
    private boolean isReadyForPostingEvents;
    private final Map<String, ModuleHolder<?>> registry;

    public ModuleRegistry(WeakReference<AppContext> appContextHolder) {
        AbstractC2855l.g(appContextHolder, "appContextHolder");
        this.appContextHolder = appContextHolder;
        this.registry = new LinkedHashMap();
        this.eventQueue = new ArrayList();
    }

    private final boolean addToQueueIfNeeded(EventName eventName, Object sender, Object payload) {
        synchronized (this) {
            if (this.isReadyForPostingEvents) {
                return false;
            }
            this.eventQueue.add(new PostponedEvent(eventName, sender, payload));
            return true;
        }
    }

    static /* synthetic */ boolean addToQueueIfNeeded$default(ModuleRegistry moduleRegistry, EventName eventName, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            obj2 = null;
        }
        return moduleRegistry.addToQueueIfNeeded(eventName, obj, obj2);
    }

    private final void flushTheEventQueue() {
        synchronized (this) {
            try {
                for (PostponedEvent postponedEvent : this.eventQueue) {
                    Iterator<ModuleHolder<?>> it = iterator();
                    while (it.hasNext()) {
                        postponedEvent.post(it.next());
                    }
                }
                this.eventQueue.clear();
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void readyForPostingEvents() {
        synchronized (this) {
            this.isReadyForPostingEvents = true;
            C2735B c2735b = C2735B.f28704a;
        }
    }

    public final void cleanUp() {
        this.registry.clear();
        CoreLoggerKt.getLogger().info("✅ ModuleRegistry was destroyed");
    }

    public final Module getModule(String name) {
        AbstractC2855l.g(name, "name");
        ModuleHolder<?> moduleHolder = this.registry.get(name);
        if (moduleHolder != null) {
            return moduleHolder.getModule();
        }
        return null;
    }

    public final ModuleHolder<?> getModuleHolder(String name) {
        AbstractC2855l.g(name, "name");
        return this.registry.get(name);
    }

    public final Map<String, ModuleHolder<?>> getRegistry() {
        return this.registry;
    }

    public final <T extends View> ViewManagerDefinition getViewDefinition(ModuleHolder<?> holder, Class<T> viewClass) {
        Object next;
        AbstractC2855l.g(holder, "holder");
        AbstractC2855l.g(viewClass, "viewClass");
        Iterator<T> it = holder.getDefinition().getViewManagerDefinitions().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC2855l.b(((ViewManagerDefinition) next).getViewType$expo_modules_core_release(), viewClass)) {
                break;
            }
        }
        return (ViewManagerDefinition) next;
    }

    public final boolean hasModule(String name) {
        AbstractC2855l.g(name, "name");
        return this.registry.containsKey(name);
    }

    @Override // java.lang.Iterable
    public Iterator<ModuleHolder<?>> iterator() {
        return this.registry.values().iterator();
    }

    public final void post(EventName eventName) {
        AbstractC2855l.g(eventName, "eventName");
        if (addToQueueIfNeeded$default(this, eventName, null, null, 6, null)) {
            return;
        }
        Iterator<ModuleHolder<?>> it = iterator();
        while (it.hasNext()) {
            it.next().post(eventName);
        }
    }

    public final void postOnCreate() {
        Iterator<ModuleHolder<?>> it = iterator();
        while (it.hasNext()) {
            it.next().post(EventName.MODULE_CREATE);
        }
        registerActivityContracts$expo_modules_core_release();
        readyForPostingEvents();
        flushTheEventQueue();
    }

    public final <T extends Module> void register(T module, String name) {
        AbstractC2855l.g(module, "module");
        AbstractC2861a.c("[ExpoModulesCore] " + ("ModuleRegistry.register(" + module.getClass() + ")"));
        try {
            if (this.appContextHolder.get() == null) {
                throw new IllegalArgumentException("Cannot register a module to an invalid app context.");
            }
            module.set_appContextHolder$expo_modules_core_release(this.appContextHolder);
            final ModuleHolder<?> moduleHolder = new ModuleHolder<>(module, name);
            module.setCoroutineScopeDelegate(AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.kotlin.ModuleRegistry$register$1$2
                @Override // w7.InterfaceC3487a
                public final N invoke() {
                    return O.a(C1404d0.a().X(T0.b(null, 1, null)).X(new M(moduleHolder.getName())));
                }
            }));
            getRegistry().put(moduleHolder.getName(), moduleHolder);
            C2735B c2735b = C2735B.f28704a;
        } finally {
            AbstractC2861a.f();
        }
    }

    public final void registerActivityContracts$expo_modules_core_release() {
        Iterator<ModuleHolder<?>> it = iterator();
        while (it.hasNext()) {
            it.next().registerContracts();
        }
    }

    public final /* synthetic */ <T> T getModule() {
        T t10;
        T next;
        Iterator<T> it = getRegistry().values().iterator();
        while (true) {
            t10 = null;
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
            Module module = ((ModuleHolder) next).getModule();
            AbstractC2855l.m(3, "T");
            if (module != null) {
                break;
            }
        }
        ModuleHolder moduleHolder = next;
        if (moduleHolder != null) {
            t10 = (T) moduleHolder.getModule();
        }
        AbstractC2855l.m(2, "T");
        return t10;
    }

    public final <T extends Module> ModuleHolder<T> getModuleHolder(T module) {
        Object next;
        AbstractC2855l.g(module, "module");
        Iterator<T> it = this.registry.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ModuleHolder) next).getModule() == module) {
                break;
            }
        }
        if (next instanceof ModuleHolder) {
            return (ModuleHolder) next;
        }
        return null;
    }

    public final ViewManagerDefinition getViewDefinition(ModuleHolder<?> holder, String viewName) {
        Object next;
        AbstractC2855l.g(holder, "holder");
        AbstractC2855l.g(viewName, "viewName");
        Iterator<T> it = holder.getDefinition().getViewManagerDefinitions().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC2855l.b(((ViewManagerDefinition) next).getName(), viewName)) {
                break;
            }
        }
        return (ViewManagerDefinition) next;
    }

    public final <T extends View> ModuleHolder<?> getModuleHolder(Class<T> viewClass) {
        ModuleHolder<?> moduleHolder;
        AbstractC2855l.g(viewClass, "viewClass");
        Iterator<Map.Entry<String, ModuleHolder<?>>> it = this.registry.entrySet().iterator();
        do {
            moduleHolder = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleHolder<?> value = it.next().getValue();
            if (getViewDefinition(value, viewClass) != null) {
                moduleHolder = value;
            }
        } while (moduleHolder == null);
        return moduleHolder;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J2\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Lexpo/modules/kotlin/ModuleRegistry$PostponedEvent;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/events/EventName;", "eventName", "sender", "payload", "<init>", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;Ljava/lang/Object;)V", "Lexpo/modules/kotlin/ModuleHolder;", "moduleHolder", "Li7/B;", "post", "(Lexpo/modules/kotlin/ModuleHolder;)V", "component1", "()Lexpo/modules/kotlin/events/EventName;", "component2", "()Ljava/lang/Object;", "component3", "copy", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;Ljava/lang/Object;)Lexpo/modules/kotlin/ModuleRegistry$PostponedEvent;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "()Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", "Lexpo/modules/kotlin/events/EventName;", "getEventName", "Ljava/lang/Object;", "getSender", "getPayload", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PostponedEvent {
        private final EventName eventName;
        private final Object payload;
        private final Object sender;

        public PostponedEvent(EventName eventName, Object obj, Object obj2) {
            AbstractC2855l.g(eventName, "eventName");
            this.eventName = eventName;
            this.sender = obj;
            this.payload = obj2;
        }

        public static /* synthetic */ PostponedEvent copy$default(PostponedEvent postponedEvent, EventName eventName, Object obj, Object obj2, int i10, Object obj3) {
            if ((i10 & 1) != 0) {
                eventName = postponedEvent.eventName;
            }
            if ((i10 & 2) != 0) {
                obj = postponedEvent.sender;
            }
            if ((i10 & 4) != 0) {
                obj2 = postponedEvent.payload;
            }
            return postponedEvent.copy(eventName, obj, obj2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EventName getEventName() {
            return this.eventName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Object getSender() {
            return this.sender;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Object getPayload() {
            return this.payload;
        }

        public final PostponedEvent copy(EventName eventName, Object sender, Object payload) {
            AbstractC2855l.g(eventName, "eventName");
            return new PostponedEvent(eventName, sender, payload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostponedEvent)) {
                return false;
            }
            PostponedEvent postponedEvent = (PostponedEvent) other;
            return this.eventName == postponedEvent.eventName && AbstractC2855l.b(this.sender, postponedEvent.sender) && AbstractC2855l.b(this.payload, postponedEvent.payload);
        }

        public final EventName getEventName() {
            return this.eventName;
        }

        public final Object getPayload() {
            return this.payload;
        }

        public final Object getSender() {
            return this.sender;
        }

        public int hashCode() {
            int iHashCode = this.eventName.hashCode() * 31;
            Object obj = this.sender;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.payload;
            return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
        }

        public final void post(ModuleHolder<?> moduleHolder) {
            Object obj;
            AbstractC2855l.g(moduleHolder, "moduleHolder");
            Object obj2 = this.sender;
            if (obj2 != null && (obj = this.payload) != null) {
                moduleHolder.post(this.eventName, obj2, obj);
            } else if (obj2 != null) {
                moduleHolder.post(this.eventName, obj2);
            } else {
                moduleHolder.post(this.eventName);
            }
        }

        public String toString() {
            return "PostponedEvent(eventName=" + this.eventName + ", sender=" + this.sender + ", payload=" + this.payload + ")";
        }

        public /* synthetic */ PostponedEvent(EventName eventName, Object obj, Object obj2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(eventName, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? null : obj2);
        }
    }

    public final <Sender> void post(EventName eventName, Sender sender) {
        AbstractC2855l.g(eventName, "eventName");
        if (addToQueueIfNeeded$default(this, eventName, sender, null, 4, null)) {
            return;
        }
        Iterator<ModuleHolder<?>> it = iterator();
        while (it.hasNext()) {
            it.next().post(eventName, sender);
        }
    }

    public final <Sender, Payload> void post(EventName eventName, Sender sender, Payload payload) {
        AbstractC2855l.g(eventName, "eventName");
        if (addToQueueIfNeeded(eventName, sender, payload)) {
            return;
        }
        Iterator<ModuleHolder<?>> it = iterator();
        while (it.hasNext()) {
            it.next().post(eventName, sender, payload);
        }
    }

    public final ModuleRegistry register(ModulesProvider provider) {
        AbstractC2855l.g(provider, "provider");
        for (Map.Entry<Class<? extends Module>, String> entry : provider.getModulesMap().entrySet()) {
            Class<? extends Module> key = entry.getKey();
            String value = entry.getValue();
            Module moduleNewInstance = key.getDeclaredConstructor(null).newInstance(null);
            AbstractC2855l.d(moduleNewInstance);
            register(moduleNewInstance, value);
        }
        return this;
    }

    public static /* synthetic */ void getRegistry$annotations() {
    }

    public final ModuleRegistry register(Module... modules) {
        AbstractC2855l.g(modules, "modules");
        for (Module module : modules) {
            register(module, null);
        }
        return this;
    }
}
