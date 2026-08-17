.class public final Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$Function$4;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/securestore/SecureStoreModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
.field final synthetic this$0:Lexpo/modules/securestore/SecureStoreModule;


# direct methods
.method public constructor <init>(Lexpo/modules/securestore/SecureStoreModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$Function$4;->this$0:Lexpo/modules/securestore/SecureStoreModule;

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

    .line 4
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$Function$4;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object v2, p1, v1

    const/4 v3, 0x2

    aget-object p1, p1, v3

    .line 1
    move-object v7, p1

    check-cast v7, Lexpo/modules/securestore/SecureStoreOptions;

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    if-eqz v5, :cond_0

    .line 2
    new-instance v3, Lexpo/modules/securestore/SecureStoreModule$definition$1$3$1;

    iget-object v4, p0, Lexpo/modules/securestore/SecureStoreModule$definition$lambda$7$$inlined$Function$4;->this$0:Lexpo/modules/securestore/SecureStoreModule;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lexpo/modules/securestore/SecureStoreModule$definition$1$3$1;-><init>(Lexpo/modules/securestore/SecureStoreModule;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;Ln7/f;)V

    const/4 p1, 0x0

    invoke-static {p1, v3, v1, p1}, LR8/i;->f(Ln7/j;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Li7/B;->a:Li7/B;

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Lexpo/modules/securestore/NullKeyException;

    invoke-direct {p1}, Lexpo/modules/securestore/NullKeyException;-><init>()V

    throw p1
.end method
