.class public final Lexpo/modules/application/ApplicationModule$definition$lambda$8$$inlined$AsyncFunction$5;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/application/ApplicationModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
.field final synthetic this$0:Lexpo/modules/application/ApplicationModule;


# direct methods
.method public constructor <init>(Lexpo/modules/application/ApplicationModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/application/ApplicationModule$definition$lambda$8$$inlined$AsyncFunction$5;->this$0:Lexpo/modules/application/ApplicationModule;

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

    invoke-virtual {p0, p1}, Lexpo/modules/application/ApplicationModule$definition$lambda$8$$inlined$AsyncFunction$5;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Li7/B;"
        }
    .end annotation

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object p1, p1, v0

    .line 2
    check-cast p1, Lexpo/modules/kotlin/Promise;

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    new-instance v1, Lkotlin/jvm/internal/z;

    invoke-direct {v1}, Lkotlin/jvm/internal/z;-><init>()V

    .line 5
    iget-object v2, p0, Lexpo/modules/application/ApplicationModule$definition$lambda$8$$inlined$AsyncFunction$5;->this$0:Lexpo/modules/application/ApplicationModule;

    invoke-static {v2}, Lexpo/modules/application/ApplicationModule;->access$getContext(Lexpo/modules/application/ApplicationModule;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lp1/a;->c(Landroid/content/Context;)Lp1/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lp1/a$b;->a()Lp1/a;

    move-result-object v2

    .line 6
    new-instance v3, Lexpo/modules/application/ApplicationModule$definition$1$8$1;

    invoke-direct {v3, v1, v2, v0, p1}, Lexpo/modules/application/ApplicationModule$definition$1$8$1;-><init>(Lkotlin/jvm/internal/z;Lp1/a;Ljava/lang/StringBuilder;Lexpo/modules/kotlin/Promise;)V

    invoke-virtual {v2, v3}, Lp1/a;->d(Lp1/c;)V

    .line 7
    sget-object p1, Li7/B;->a:Li7/B;

    return-object p1
.end method
