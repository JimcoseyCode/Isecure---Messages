.class public abstract Lexpo/modules/kotlin/runtime/Runtime;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\u000c\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\nH \u00a2\u0006\u0004\u0008\u000e\u0010\u0003R\u001a\u0010\u0014\u001a\u00020\u00108 X\u00a1\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0013\u0010\u0003\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#R\u0014\u0010(\u001a\u00020%8 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lexpo/modules/kotlin/runtime/Runtime;",
        "",
        "<init>",
        "()V",
        "",
        "source",
        "Lexpo/modules/kotlin/jni/JavaScriptValue;",
        "eval",
        "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;",
        "Lkotlin/Function0;",
        "Li7/B;",
        "block",
        "schedule",
        "(Lw7/a;)V",
        "deallocate$expo_modules_core_release",
        "deallocate",
        "Lexpo/modules/kotlin/jni/JNIDeallocator;",
        "getDeallocator",
        "()Lexpo/modules/kotlin/jni/JNIDeallocator;",
        "getDeallocator$annotations",
        "deallocator",
        "Lexpo/modules/kotlin/AppContext;",
        "getAppContext",
        "()Lexpo/modules/kotlin/AppContext;",
        "appContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "getReactContext",
        "()Lcom/facebook/react/bridge/ReactApplicationContext;",
        "reactContext",
        "Lexpo/modules/kotlin/jni/JSIContext;",
        "getJsiContext",
        "()Lexpo/modules/kotlin/jni/JSIContext;",
        "jsiContext",
        "Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;",
        "getSharedObjectRegistry$expo_modules_core_release",
        "()Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;",
        "sharedObjectRegistry",
        "Lexpo/modules/kotlin/sharedobjects/ClassRegistry;",
        "getClassRegistry$expo_modules_core_release",
        "()Lexpo/modules/kotlin/sharedobjects/ClassRegistry;",
        "classRegistry",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic getDeallocator$annotations()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public abstract deallocate$expo_modules_core_release()V
.end method

.method public abstract eval(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;
.end method

.method public abstract getAppContext()Lexpo/modules/kotlin/AppContext;
.end method

.method public abstract getClassRegistry$expo_modules_core_release()Lexpo/modules/kotlin/sharedobjects/ClassRegistry;
.end method

.method public abstract getDeallocator()Lexpo/modules/kotlin/jni/JNIDeallocator;
.end method

.method public abstract getJsiContext()Lexpo/modules/kotlin/jni/JSIContext;
.end method

.method public abstract getReactContext()Lcom/facebook/react/bridge/ReactApplicationContext;
.end method

.method public abstract getSharedObjectRegistry$expo_modules_core_release()Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;
.end method

.method public abstract schedule(Lw7/a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/a;",
            ")V"
        }
    .end annotation
.end method
