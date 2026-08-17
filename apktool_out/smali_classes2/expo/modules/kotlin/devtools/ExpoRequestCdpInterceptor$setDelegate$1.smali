.class final Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$setDelegate$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->setDelegate(Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "Li7/B;",
        "<anonymous>",
        "(LR8/N;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.kotlin.devtools.ExpoRequestCdpInterceptor$setDelegate$1"
    f = "ExpoRequestCdpInterceptor.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $delegate:Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;

.field label:I


# direct methods
.method constructor <init>(Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$setDelegate$1;->$delegate:Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ln7/f;"
        }
    .end annotation

    .line 1
    new-instance p1, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$setDelegate$1;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$setDelegate$1;->$delegate:Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$setDelegate$1;-><init>(Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$setDelegate$1;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$setDelegate$1;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$setDelegate$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$setDelegate$1;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$setDelegate$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->INSTANCE:Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;

    .line 12
    .line 13
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$setDelegate$1;->$delegate:Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->access$setDelegate$p(Ljava/lang/ref/WeakReference;)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Li7/B;->a:Li7/B;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1
.end method
