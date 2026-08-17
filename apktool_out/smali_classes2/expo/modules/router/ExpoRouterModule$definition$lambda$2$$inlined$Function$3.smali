.class public final Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$3;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/router/ExpoRouterModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
.field final synthetic this$0:Lexpo/modules/router/ExpoRouterModule;


# direct methods
.method public constructor <init>(Lexpo/modules/router/ExpoRouterModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$3;->this$0:Lexpo/modules/router/ExpoRouterModule;

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

    .line 3
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$3;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object p1, p1, v1

    .line 1
    check-cast p1, Ljava/lang/String;

    check-cast v0, Ljava/lang/String;

    .line 2
    iget-object v1, p0, Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$3;->this$0:Lexpo/modules/router/ExpoRouterModule;

    invoke-static {v1, v0, p1}, Lexpo/modules/router/ExpoRouterModule;->access$materialColor(Lexpo/modules/router/ExpoRouterModule;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
