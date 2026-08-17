.class public final Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$8;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/crypto/aes/AesCryptoModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
.field final synthetic $receiver$inlined:Lexpo/modules/crypto/aes/AesCryptoModule;


# direct methods
.method public constructor <init>(Lexpo/modules/crypto/aes/AesCryptoModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$8;->$receiver$inlined:Lexpo/modules/crypto/aes/AesCryptoModule;

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

    invoke-virtual {p0, p1}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$8;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object v1, p1, v1

    const/4 v2, 0x2

    aget-object p1, p1, v2

    .line 2
    check-cast p1, Lexpo/modules/crypto/aes/records/DecryptOptions;

    check-cast v1, Lexpo/modules/crypto/aes/objects/EncryptionKey;

    check-cast v0, Lexpo/modules/crypto/aes/objects/SealedData;

    .line 3
    iget-object v2, p0, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$8;->$receiver$inlined:Lexpo/modules/crypto/aes/AesCryptoModule;

    invoke-static {v2, v0, v1, p1}, Lexpo/modules/crypto/aes/AesCryptoModule;->access$decrypt(Lexpo/modules/crypto/aes/AesCryptoModule;Lexpo/modules/crypto/aes/objects/SealedData;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/DecryptOptions;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
