.class public final Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$12;
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$12;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

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
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object v1, p1, v0

    const/4 v2, 0x1

    aget-object p1, p1, v2

    .line 2
    check-cast p1, Lexpo/modules/crypto/aes/records/CiphertextOptions;

    check-cast v1, Lexpo/modules/crypto/aes/objects/SealedData;

    if-nez p1, :cond_0

    .line 3
    new-instance p1, Lexpo/modules/crypto/aes/records/CiphertextOptions;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {p1, v0, v3, v2, v3}, Lexpo/modules/crypto/aes/records/CiphertextOptions;-><init>(ZLexpo/modules/crypto/aes/enums/DataFormat;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-virtual {p1}, Lexpo/modules/crypto/aes/records/CiphertextOptions;->component1()Z

    move-result v0

    invoke-virtual {p1}, Lexpo/modules/crypto/aes/records/CiphertextOptions;->component2()Lexpo/modules/crypto/aes/enums/DataFormat;

    move-result-object p1

    .line 4
    invoke-virtual {v1, v0}, Lexpo/modules/crypto/aes/objects/SealedData;->ciphertextBytes(Z)[B

    move-result-object v0

    invoke-static {v0, p1}, Lexpo/modules/crypto/aes/extensions/ByteArrayExtensionsKt;->formatted([BLexpo/modules/crypto/aes/enums/DataFormat;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
