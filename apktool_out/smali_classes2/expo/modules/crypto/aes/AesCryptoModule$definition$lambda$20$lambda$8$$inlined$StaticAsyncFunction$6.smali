.class public final Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$6;
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

    invoke-virtual {p0, p1}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$6;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

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
            "Lexpo/modules/crypto/aes/objects/EncryptionKey;"
        }
    .end annotation

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object p1, p1, v1

    .line 2
    check-cast p1, Lexpo/modules/crypto/aes/enums/KeyEncoding;

    check-cast v0, Lexpo/modules/kotlin/types/Either;

    .line 3
    const-class v2, [B

    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/types/Either;->isFirstType(LC7/d;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    goto :goto_1

    .line 5
    :cond_0
    const-class v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v2, -0x1

    if-nez p1, :cond_1

    move p1, v2

    goto :goto_0

    .line 6
    :cond_1
    sget-object v3, Lexpo/modules/crypto/aes/AesCryptoModule$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v3, p1

    :goto_0
    if-eq p1, v2, :cond_4

    const/4 v2, 0x2

    if-eq p1, v1, :cond_3

    if-ne p1, v2, :cond_2

    .line 7
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toLowerCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    const-string v0, "0x"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v2, v1}, LP8/q;->P0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 9
    sget-object v0, LP8/g;->d:LP8/g$b;

    invoke-virtual {v0}, LP8/g$b;->a()LP8/g;

    move-result-object v0

    invoke-static {p1, v0}, LP8/f;->i(Ljava/lang/String;LP8/g;)[B

    move-result-object p1

    goto :goto_1

    .line 10
    :cond_2
    new-instance p1, Li7/m;

    invoke-direct {p1}, Li7/m;-><init>()V

    throw p1

    .line 11
    :cond_3
    invoke-static {v0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    .line 12
    :goto_1
    new-instance v0, Lexpo/modules/crypto/aes/objects/EncryptionKey;

    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    invoke-direct {v0, p1}, Lexpo/modules/crypto/aes/objects/EncryptionKey;-><init>([B)V

    return-object v0

    .line 13
    :cond_4
    new-instance p1, Lexpo/modules/crypto/aes/MissingStringEncodingException;

    invoke-direct {p1}, Lexpo/modules/crypto/aes/MissingStringEncodingException;-><init>()V

    throw p1
.end method
