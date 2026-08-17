.class public final Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithoutArgs$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/sharing/SharingModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
.field final synthetic this$0:Lexpo/modules/sharing/SharingModule;


# direct methods
.method public constructor <init>(Lexpo/modules/sharing/SharingModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithoutArgs$1;->this$0:Lexpo/modules/sharing/SharingModule;

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

    invoke-virtual {p0, p1}, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithoutArgs$1;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object p1, Lexpo/modules/sharing/SharingSingleton;->INSTANCE:Lexpo/modules/sharing/SharingSingleton;

    invoke-virtual {p1}, Lexpo/modules/sharing/SharingSingleton;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-nez p1, :cond_0

    .line 3
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    sget-object v0, Lexpo/modules/sharing/ResolvingShareIntentDataParser;->Companion:Lexpo/modules/sharing/ResolvingShareIntentDataParser$Companion;

    iget-object v1, p0, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithoutArgs$1;->this$0:Lexpo/modules/sharing/SharingModule;

    invoke-static {v1}, Lexpo/modules/sharing/SharingModule;->access$getContext(Lexpo/modules/sharing/SharingModule;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lexpo/modules/sharing/ResolvingShareIntentDataParser$Companion;->parse(Landroid/content/Context;Landroid/content/Intent;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
