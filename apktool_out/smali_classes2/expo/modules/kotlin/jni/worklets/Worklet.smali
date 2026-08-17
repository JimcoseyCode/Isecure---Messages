.class public final Lexpo/modules/kotlin/jni/worklets/Worklet;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u0011\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J \u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 \u00a2\u0006\u0004\u0008\t\u0010\nJ0\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0082 \u00a2\u0006\u0004\u0008\t\u0010\rJ \u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 \u00a2\u0006\u0004\u0008\u000e\u0010\nJ0\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0082 \u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\t\u0010\u0011J\u0015\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u000e\u0010\u0011J-\u0010\t\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0012\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\t\u0010\u0013J-\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0012\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014R\u0018\u0010\u0017\u001a\u00020\u0006*\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lexpo/modules/kotlin/jni/worklets/Worklet;",
        "",
        "Lexpo/modules/kotlin/jni/worklets/Serializable;",
        "serializable",
        "<init>",
        "(Lexpo/modules/kotlin/jni/worklets/Serializable;)V",
        "Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;",
        "workletNativeRuntime",
        "Li7/B;",
        "schedule",
        "(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;)V",
        "",
        "args",
        "(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;[Ljava/lang/Object;)V",
        "execute",
        "Lexpo/modules/kotlin/runtime/WorkletRuntime;",
        "runtime",
        "(Lexpo/modules/kotlin/runtime/WorkletRuntime;)V",
        "arguments",
        "(Lexpo/modules/kotlin/runtime/WorkletRuntime;[Ljava/lang/Object;)V",
        "Lexpo/modules/kotlin/jni/worklets/Serializable;",
        "getEnforceHolder",
        "(Lexpo/modules/kotlin/runtime/WorkletRuntime;)Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;",
        "enforceHolder",
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


# instance fields
.field private final serializable:Lexpo/modules/kotlin/jni/worklets/Serializable;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/jni/worklets/Serializable;)V
    .locals 1

    .line 1
    const-string v0, "serializable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/kotlin/jni/worklets/Worklet;->serializable:Lexpo/modules/kotlin/jni/worklets/Serializable;

    .line 10
    .line 11
    return-void
.end method

.method private final native execute(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;)V
.end method

.method private final native execute(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;[Ljava/lang/Object;)V
.end method

.method private final getEnforceHolder(Lexpo/modules/kotlin/runtime/WorkletRuntime;)Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lexpo/modules/kotlin/runtime/WorkletRuntime;->getMWorkletNativeRuntime$expo_modules_core_release()Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Worklet runtime is not installed."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

.method private final native schedule(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;)V
.end method

.method private final native schedule(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;[Ljava/lang/Object;)V
.end method


# virtual methods
.method public final execute(Lexpo/modules/kotlin/runtime/WorkletRuntime;)V
    .locals 1

    const-string v0, "runtime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/worklets/Worklet;->getEnforceHolder(Lexpo/modules/kotlin/runtime/WorkletRuntime;)Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/worklets/Worklet;->serializable:Lexpo/modules/kotlin/jni/worklets/Serializable;

    invoke-direct {p0, p1, v0}, Lexpo/modules/kotlin/jni/worklets/Worklet;->execute(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;)V

    return-void
.end method

.method public final varargs execute(Lexpo/modules/kotlin/runtime/WorkletRuntime;[Ljava/lang/Object;)V
    .locals 10

    const-string v0, "runtime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/worklets/Worklet;->getEnforceHolder(Lexpo/modules/kotlin/runtime/WorkletRuntime;)Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;

    move-result-object p1

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    array-length v1, p2

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v5, p2, v3

    .line 6
    sget-object v4, Lexpo/modules/kotlin/types/JSTypeConverterProvider;->INSTANCE:Lexpo/modules/kotlin/types/JSTypeConverterProvider;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static/range {v4 .. v9}, Lexpo/modules/kotlin/types/JSTypeConverterProvider;->convertToJSValue$default(Lexpo/modules/kotlin/types/JSTypeConverterProvider;Ljava/lang/Object;Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;ZILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 7
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 8
    :cond_0
    new-array p2, v2, [Ljava/lang/Object;

    invoke-interface {v0, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    .line 9
    iget-object v0, p0, Lexpo/modules/kotlin/jni/worklets/Worklet;->serializable:Lexpo/modules/kotlin/jni/worklets/Serializable;

    invoke-direct {p0, p1, v0, p2}, Lexpo/modules/kotlin/jni/worklets/Worklet;->execute(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final schedule(Lexpo/modules/kotlin/runtime/WorkletRuntime;)V
    .locals 1

    const-string v0, "runtime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/worklets/Worklet;->getEnforceHolder(Lexpo/modules/kotlin/runtime/WorkletRuntime;)Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/worklets/Worklet;->serializable:Lexpo/modules/kotlin/jni/worklets/Serializable;

    invoke-direct {p0, p1, v0}, Lexpo/modules/kotlin/jni/worklets/Worklet;->schedule(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;)V

    return-void
.end method

.method public final varargs schedule(Lexpo/modules/kotlin/runtime/WorkletRuntime;[Ljava/lang/Object;)V
    .locals 10

    const-string v0, "runtime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/worklets/Worklet;->getEnforceHolder(Lexpo/modules/kotlin/runtime/WorkletRuntime;)Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;

    move-result-object p1

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    array-length v1, p2

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v5, p2, v3

    .line 6
    sget-object v4, Lexpo/modules/kotlin/types/JSTypeConverterProvider;->INSTANCE:Lexpo/modules/kotlin/types/JSTypeConverterProvider;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static/range {v4 .. v9}, Lexpo/modules/kotlin/types/JSTypeConverterProvider;->convertToJSValue$default(Lexpo/modules/kotlin/types/JSTypeConverterProvider;Ljava/lang/Object;Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;ZILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 7
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 8
    :cond_0
    new-array p2, v2, [Ljava/lang/Object;

    invoke-interface {v0, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    .line 9
    iget-object v0, p0, Lexpo/modules/kotlin/jni/worklets/Worklet;->serializable:Lexpo/modules/kotlin/jni/worklets/Serializable;

    invoke-direct {p0, p1, v0, p2}, Lexpo/modules/kotlin/jni/worklets/Worklet;->schedule(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;[Ljava/lang/Object;)V

    return-void
.end method
