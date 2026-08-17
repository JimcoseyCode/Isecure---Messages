.class public final Lexpo/modules/kotlin/jni/JavaScriptValue;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/jni/Destructible;


# annotations
.annotation build Lexpo/modules/core/interfaces/DoNotStrip;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\"\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\n\u0008\u0000\u0010\u0007*\u0004\u0018\u00010\u0006H\u0082 \u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086 \u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086 \u00a2\u0006\u0004\u0008\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000bH\u0086 \u00a2\u0006\u0004\u0008\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u000bH\u0086 \u00a2\u0006\u0004\u0008\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u000bH\u0086 \u00a2\u0006\u0004\u0008\u0014\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u000bH\u0086 \u00a2\u0006\u0004\u0008\u0015\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u000bH\u0086 \u00a2\u0006\u0004\u0008\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u000bH\u0086 \u00a2\u0006\u0004\u0008\u0017\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u000bH\u0086 \u00a2\u0006\u0004\u0008\u0018\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u000bH\u0086 \u00a2\u0006\u0004\u0008\u0019\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u000bH\u0086 \u00a2\u0006\u0004\u0008\u001a\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u000bH\u0086 \u00a2\u0006\u0004\u0008\u001b\u0010\rJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0086 \u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eH\u0086 \u00a2\u0006\u0004\u0008\u001f\u0010\u0010J\u0010\u0010!\u001a\u00020 H\u0086 \u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00000#H\u0086 \u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010\'\u001a\u00020&H\u0086 \u00a2\u0006\u0004\u0008\'\u0010(J!\u0010)\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\n\u0008\u0000\u0010\u0007*\u0004\u0018\u00010\u0006H\u0001\u00a2\u0006\u0004\u0008)\u0010\nJ$\u0010+\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\u000c\u0008\u0000\u0010*\u0018\u0001*\u0004\u0018\u00010\u0006H\u0086\u0008\u00a2\u0006\u0004\u0008+\u0010\nJ\u0015\u0010+\u001a\u0008\u0012\u0004\u0012\u00020,0\u0008H\u0007\u00a2\u0006\u0004\u0008-\u0010\nJ\r\u0010/\u001a\u00020.\u00a2\u0006\u0004\u0008/\u00100J\r\u00102\u001a\u000201\u00a2\u0006\u0004\u00082\u00103J\r\u00105\u001a\u000204\u00a2\u0006\u0004\u00085\u00106J\u000f\u00107\u001a\u00020,H\u0004\u00a2\u0006\u0004\u00087\u00108J\u000f\u00109\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u00089\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010;\u00a8\u0006<"
    }
    d2 = {
        "Lexpo/modules/kotlin/jni/JavaScriptValue;",
        "Lexpo/modules/kotlin/jni/Destructible;",
        "Lcom/facebook/jni/HybridData;",
        "mHybridData",
        "<init>",
        "(Lcom/facebook/jni/HybridData;)V",
        "",
        "T",
        "Lexpo/modules/kotlin/jni/JavaScriptFunction;",
        "jniGetFunction",
        "()Lexpo/modules/kotlin/jni/JavaScriptFunction;",
        "",
        "isValid",
        "()Z",
        "",
        "kind",
        "()Ljava/lang/String;",
        "isNull",
        "isUndefined",
        "isBool",
        "isNumber",
        "isString",
        "isSymbol",
        "isFunction",
        "isArray",
        "isTypedArray",
        "isObject",
        "getBool",
        "",
        "getDouble",
        "()D",
        "getString",
        "Lexpo/modules/kotlin/jni/JavaScriptObject;",
        "getObject",
        "()Lexpo/modules/kotlin/jni/JavaScriptObject;",
        "",
        "getArray",
        "()[Lexpo/modules/kotlin/jni/JavaScriptValue;",
        "Lexpo/modules/kotlin/jni/JavaScriptTypedArray;",
        "getTypedArray",
        "()Lexpo/modules/kotlin/jni/JavaScriptTypedArray;",
        "internalJniGetFunction",
        "ReturnType",
        "getFunction",
        "Li7/B;",
        "getVoidFunction",
        "",
        "getInt",
        "()I",
        "",
        "getLong",
        "()J",
        "",
        "getFloat",
        "()F",
        "finalize",
        "()V",
        "getHybridDataForJNIDeallocator",
        "()Lcom/facebook/jni/HybridData;",
        "Lcom/facebook/jni/HybridData;",
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
.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build Lexpo/modules/core/interfaces/DoNotStrip;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/facebook/jni/HybridData;)V
    .locals 0
    .annotation build Lexpo/modules/core/interfaces/DoNotStrip;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/kotlin/jni/JavaScriptValue;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 5
    .line 6
    return-void
.end method

.method private final native jniGetFunction()Lexpo/modules/kotlin/jni/JavaScriptFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lexpo/modules/kotlin/jni/JavaScriptFunction<",
            "TT;>;"
        }
    .end annotation
.end method


# virtual methods
.method protected final finalize()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaScriptValue;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final native getArray()[Lexpo/modules/kotlin/jni/JavaScriptValue;
.end method

.method public final native getBool()Z
.end method

.method public final native getDouble()D
.end method

.method public final getFloat()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/jni/JavaScriptValue;->getDouble()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    double-to-float v0, v0

    .line 6
    return v0
.end method

.method public final synthetic getFunction()Lexpo/modules/kotlin/jni/JavaScriptFunction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReturnType:",
            "Ljava/lang/Object;",
            ">()",
            "Lexpo/modules/kotlin/jni/JavaScriptFunction<",
            "TReturnType;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/jni/JavaScriptValue;->internalJniGetFunction()Lexpo/modules/kotlin/jni/JavaScriptFunction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x6

    .line 6
    const-string v2, "ReturnType"

    .line 7
    .line 8
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/jni/JavaScriptFunction;->setReturnType(LC7/o;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public getHybridDataForJNIDeallocator()Lcom/facebook/jni/HybridData;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaScriptValue;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInt()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/jni/JavaScriptValue;->getDouble()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    double-to-int v0, v0

    .line 6
    return v0
.end method

.method public final getLong()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/jni/JavaScriptValue;->getDouble()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    double-to-long v0, v0

    .line 6
    return-wide v0
.end method

.method public final native getObject()Lexpo/modules/kotlin/jni/JavaScriptObject;
.end method

.method public final native getString()Ljava/lang/String;
.end method

.method public final native getTypedArray()Lexpo/modules/kotlin/jni/JavaScriptTypedArray;
.end method

.method public final getVoidFunction()Lexpo/modules/kotlin/jni/JavaScriptFunction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/jni/JavaScriptFunction<",
            "Li7/B;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/jni/JavaScriptValue;->internalJniGetFunction()Lexpo/modules/kotlin/jni/JavaScriptFunction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Li7/B;

    .line 6
    .line 7
    invoke-static {v1}, Lkotlin/jvm/internal/D;->o(Ljava/lang/Class;)LC7/o;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/jni/JavaScriptFunction;->setReturnType(LC7/o;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final internalJniGetFunction()Lexpo/modules/kotlin/jni/JavaScriptFunction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lexpo/modules/kotlin/jni/JavaScriptFunction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/jni/JavaScriptValue;->jniGetFunction()Lexpo/modules/kotlin/jni/JavaScriptFunction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final native isArray()Z
.end method

.method public final native isBool()Z
.end method

.method public final native isFunction()Z
.end method

.method public final native isNull()Z
.end method

.method public final native isNumber()Z
.end method

.method public final native isObject()Z
.end method

.method public final native isString()Z
.end method

.method public final native isSymbol()Z
.end method

.method public final native isTypedArray()Z
.end method

.method public final native isUndefined()Z
.end method

.method public final isValid()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JavaScriptValue;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final native kind()Ljava/lang/String;
.end method
