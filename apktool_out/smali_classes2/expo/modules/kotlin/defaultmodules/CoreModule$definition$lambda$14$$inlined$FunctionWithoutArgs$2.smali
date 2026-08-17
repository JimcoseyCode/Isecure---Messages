.class public final Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$FunctionWithoutArgs$2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/kotlin/defaultmodules/CoreModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lexpo/modules/kotlin/defaultmodules/CoreModule;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/defaultmodules/CoreModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$FunctionWithoutArgs$2;->this$0:Lexpo/modules/kotlin/defaultmodules/CoreModule;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$FunctionWithoutArgs$2;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$FunctionWithoutArgs$2;->this$0:Lexpo/modules/kotlin/defaultmodules/CoreModule;

    invoke-virtual {p1}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object p1

    invoke-virtual {p1}, Lexpo/modules/kotlin/AppContext;->getRuntime()Lexpo/modules/kotlin/runtime/MainRuntime;

    move-result-object p1

    invoke-virtual {p1}, Lexpo/modules/kotlin/runtime/MainRuntime;->getJsiContext()Lexpo/modules/kotlin/jni/JSIContext;

    move-result-object p1

    invoke-virtual {p1}, Lexpo/modules/kotlin/jni/JSIContext;->global()Lexpo/modules/kotlin/jni/JavaScriptObject;

    move-result-object p1

    const-string v0, "_WORKLET_RUNTIME"

    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/jni/JavaScriptObject;->get(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lexpo/modules/kotlin/jni/JavaScriptValue;->isObject()Z

    .line 4
    invoke-virtual {p1}, Lexpo/modules/kotlin/jni/JavaScriptValue;->getObject()Lexpo/modules/kotlin/jni/JavaScriptObject;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lexpo/modules/kotlin/jni/JavaScriptObject;->isArrayBuffer()Z

    .line 6
    invoke-virtual {p1}, Lexpo/modules/kotlin/jni/JavaScriptObject;->getArrayBuffer()Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;->size()I

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;->read8Byte(I)J

    move-result-wide v0

    .line 9
    new-instance p1, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;

    iget-object v2, p0, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$FunctionWithoutArgs$2;->this$0:Lexpo/modules/kotlin/defaultmodules/CoreModule;

    const/4 v3, 0x0

    invoke-direct {p1, v2, v0, v1, v3}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;-><init>(Lexpo/modules/kotlin/defaultmodules/CoreModule;JLn7/f;)V

    const/4 v0, 0x1

    invoke-static {v3, p1, v0, v3}, LR8/i;->f(Ln7/j;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 10
    sget-object p1, Li7/B;->a:Li7/B;

    return-object p1

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "UI Runtime is not available. Make sure you have Reanimated installed and imported in your project."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
