.class public final Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/contacts/next/observers/ContactsObserverDelegate$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;",
        "",
        "Lexpo/modules/kotlin/AppContext;",
        "appContext",
        "Lexpo/modules/contacts/next/ContactsNextModule;",
        "module",
        "<init>",
        "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/contacts/next/ContactsNextModule;)V",
        "Li7/B;",
        "startObservingContactChanges",
        "()V",
        "stopObservingContactChanges",
        "Landroid/os/HandlerThread;",
        "contactsHandlerThread",
        "Landroid/os/HandlerThread;",
        "Landroid/os/Handler;",
        "contactsHandler",
        "Landroid/os/Handler;",
        "Lexpo/modules/contacts/next/observers/ContactsObserver;",
        "observer",
        "Lexpo/modules/contacts/next/observers/ContactsObserver;",
        "Ljava/lang/ref/WeakReference;",
        "weakAppContextRef",
        "Ljava/lang/ref/WeakReference;",
        "weakModuleRef",
        "Landroid/content/ContentResolver;",
        "resolver",
        "Landroid/content/ContentResolver;",
        "Companion",
        "expo-contacts_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lexpo/modules/contacts/next/observers/ContactsObserverDelegate$Companion;

.field public static final ON_CONTACTS_CHANGE_EVENT_NAME:Ljava/lang/String; = "onContactsChange"


# instance fields
.field private contactsHandler:Landroid/os/Handler;

.field private contactsHandlerThread:Landroid/os/HandlerThread;

.field private observer:Lexpo/modules/contacts/next/observers/ContactsObserver;

.field private final resolver:Landroid/content/ContentResolver;

.field private final weakAppContextRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lexpo/modules/kotlin/AppContext;",
            ">;"
        }
    .end annotation
.end field

.field private final weakModuleRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lexpo/modules/contacts/next/ContactsNextModule;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->Companion:Lexpo/modules/contacts/next/observers/ContactsObserverDelegate$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lexpo/modules/kotlin/AppContext;Lexpo/modules/contacts/next/ContactsNextModule;)V
    .locals 1

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "module"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lexpo/modules/kotlin/UtilsKt;->weak(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->weakAppContextRef:Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    invoke-static {p2}, Lexpo/modules/kotlin/UtilsKt;->weak(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->weakModuleRef:Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lexpo/modules/kotlin/AppContext;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    iput-object p1, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->resolver:Landroid/content/ContentResolver;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    new-instance p1, Lexpo/modules/contacts/next/ContentResolverNotObtainedException;

    .line 50
    .line 51
    const/4 p2, 0x1

    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-direct {p1, v0, p2, v0}, Lexpo/modules/contacts/next/ContentResolverNotObtainedException;-><init>(Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 54
    .line 55
    .line 56
    throw p1
.end method


# virtual methods
.method public final startObservingContactChanges()V
    .locals 7

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->observer:Lexpo/modules/contacts/next/observers/ContactsObserver;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    new-instance v0, Landroid/os/HandlerThread;

    .line 7
    .line 8
    const-string v1, "ContactsObserverThread"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v1, :cond_5

    .line 23
    .line 24
    iput-object v0, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->contactsHandlerThread:Landroid/os/HandlerThread;

    .line 25
    .line 26
    new-instance v1, Landroid/os/Handler;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->contactsHandler:Landroid/os/Handler;

    .line 36
    .line 37
    new-instance v0, Lexpo/modules/contacts/next/observers/ContactsObserver;

    .line 38
    .line 39
    iget-object v1, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->weakModuleRef:Ljava/lang/ref/WeakReference;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lexpo/modules/contacts/next/ContactsNextModule;

    .line 46
    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    iget-object v4, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->contactsHandler:Landroid/os/Handler;

    .line 50
    .line 51
    if-eqz v4, :cond_3

    .line 52
    .line 53
    invoke-direct {v0, v1, v4}, Lexpo/modules/contacts/next/observers/ContactsObserver;-><init>(Lexpo/modules/contacts/next/ContactsNextModule;Landroid/os/Handler;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->observer:Lexpo/modules/contacts/next/observers/ContactsObserver;

    .line 57
    .line 58
    sget-object v0, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    .line 59
    .line 60
    sget-object v1, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    .line 61
    .line 62
    filled-new-array {v0, v1}, [Landroid/net/Uri;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Landroid/net/Uri;

    .line 85
    .line 86
    iget-object v4, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->resolver:Landroid/content/ContentResolver;

    .line 87
    .line 88
    iget-object v5, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->observer:Lexpo/modules/contacts/next/observers/ContactsObserver;

    .line 89
    .line 90
    if-eqz v5, :cond_1

    .line 91
    .line 92
    const/4 v6, 0x1

    .line 93
    invoke-virtual {v4, v1, v6, v5}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    new-instance v0, Lexpo/modules/contacts/next/ContactsObserverException;

    .line 98
    .line 99
    const-string v1, "Failed to register content observer"

    .line 100
    .line 101
    invoke-direct {v0, v1, v3, v2, v3}, Lexpo/modules/contacts/next/ContactsObserverException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 102
    .line 103
    .line 104
    throw v0

    .line 105
    :cond_2
    :goto_1
    return-void

    .line 106
    :cond_3
    new-instance v0, Lexpo/modules/contacts/next/ContactsObserverException;

    .line 107
    .line 108
    const-string v1, "Failed to get the thread handler"

    .line 109
    .line 110
    invoke-direct {v0, v1, v3, v2, v3}, Lexpo/modules/contacts/next/ContactsObserverException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 111
    .line 112
    .line 113
    throw v0

    .line 114
    :cond_4
    new-instance v0, Lexpo/modules/contacts/next/ContactsObserverException;

    .line 115
    .line 116
    const-string v1, "The module has not been initialized"

    .line 117
    .line 118
    invoke-direct {v0, v1, v3, v2, v3}, Lexpo/modules/contacts/next/ContactsObserverException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :cond_5
    new-instance v0, Lexpo/modules/contacts/next/ContactsObserverException;

    .line 123
    .line 124
    const-string v1, "The observer thread failed to start"

    .line 125
    .line 126
    invoke-direct {v0, v1, v3, v2, v3}, Lexpo/modules/contacts/next/ContactsObserverException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 127
    .line 128
    .line 129
    throw v0
.end method

.method public final stopObservingContactChanges()V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->observer:Lexpo/modules/contacts/next/observers/ContactsObserver;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v2, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->resolver:Landroid/content/ContentResolver;

    .line 7
    .line 8
    invoke-virtual {v2, v0}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->observer:Lexpo/modules/contacts/next/observers/ContactsObserver;

    .line 12
    .line 13
    :cond_0
    iput-object v1, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->contactsHandler:Landroid/os/Handler;

    .line 14
    .line 15
    iget-object v0, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->contactsHandlerThread:Landroid/os/HandlerThread;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 20
    .line 21
    .line 22
    :cond_1
    iput-object v1, p0, Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;->contactsHandlerThread:Landroid/os/HandlerThread;

    .line 23
    .line 24
    return-void
.end method
