.class public final Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$7;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/haptics/HapticsModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
.field final synthetic this$0:Lexpo/modules/haptics/HapticsModule;


# direct methods
.method public constructor <init>(Lexpo/modules/haptics/HapticsModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$7;->this$0:Lexpo/modules/haptics/HapticsModule;

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

    invoke-virtual {p0, p1}, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$7;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
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
    check-cast p1, Ljava/lang/String;

    .line 3
    iget-object v0, p0, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$7;->this$0:Lexpo/modules/haptics/HapticsModule;

    sget-object v1, Lexpo/modules/haptics/arguments/HapticsImpactType;->INSTANCE:Lexpo/modules/haptics/arguments/HapticsImpactType;

    invoke-virtual {v1, p1}, Lexpo/modules/haptics/arguments/HapticsImpactType;->fromString(Ljava/lang/String;)Lexpo/modules/haptics/arguments/HapticsVibrationType;

    move-result-object p1

    invoke-static {v0, p1}, Lexpo/modules/haptics/HapticsModule;->access$vibrate(Lexpo/modules/haptics/HapticsModule;Lexpo/modules/haptics/arguments/HapticsVibrationType;)V

    .line 4
    sget-object p1, Li7/B;->a:Li7/B;

    return-object p1
.end method
