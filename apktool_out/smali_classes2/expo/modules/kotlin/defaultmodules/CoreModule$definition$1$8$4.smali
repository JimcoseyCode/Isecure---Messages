.class final Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/kotlin/defaultmodules/CoreModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
    c = "expo.modules.kotlin.defaultmodules.CoreModule$definition$1$8$4"
    f = "CoreModule.kt"
    l = {
        0x77
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $runtimePointer:J

.field label:I

.field final synthetic this$0:Lexpo/modules/kotlin/defaultmodules/CoreModule;


# direct methods
.method constructor <init>(Lexpo/modules/kotlin/defaultmodules/CoreModule;JLn7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/defaultmodules/CoreModule;",
            "J",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;->this$0:Lexpo/modules/kotlin/defaultmodules/CoreModule;

    .line 2
    .line 3
    iput-wide p2, p0, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;->$runtimePointer:J

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 3
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
    new-instance p1, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;->this$0:Lexpo/modules/kotlin/defaultmodules/CoreModule;

    .line 4
    .line 5
    iget-wide v1, p0, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;->$runtimePointer:J

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, v2, p2}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;-><init>(Lexpo/modules/kotlin/defaultmodules/CoreModule;JLn7/f;)V

    .line 8
    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, LR8/d0;->c()LR8/K0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v1, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4$1;

    .line 32
    .line 33
    iget-object v3, p0, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;->this$0:Lexpo/modules/kotlin/defaultmodules/CoreModule;

    .line 34
    .line 35
    iget-wide v4, p0, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;->$runtimePointer:J

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-direct {v1, v3, v4, v5, v6}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4$1;-><init>(Lexpo/modules/kotlin/defaultmodules/CoreModule;JLn7/f;)V

    .line 39
    .line 40
    .line 41
    iput v2, p0, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$1$8$4;->label:I

    .line 42
    .line 43
    invoke-static {p1, v1, p0}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v0, :cond_2

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    :goto_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 51
    .line 52
    return-object p1
.end method
