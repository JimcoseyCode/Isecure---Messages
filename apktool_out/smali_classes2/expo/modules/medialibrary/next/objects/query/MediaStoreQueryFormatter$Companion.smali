.class public final Lexpo/modules/medialibrary/next/objects/query/MediaStoreQueryFormatter$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/medialibrary/next/objects/query/MediaStoreQueryFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u000bJ\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lexpo/modules/medialibrary/next/objects/query/MediaStoreQueryFormatter$Companion;",
        "",
        "<init>",
        "()V",
        "parse",
        "",
        "field",
        "Lexpo/modules/medialibrary/next/records/AssetField;",
        "value",
        "Lexpo/modules/kotlin/types/Either;",
        "Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;",
        "",
        "expo-media-library_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/query/MediaStoreQueryFormatter$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final parse(Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;)Ljava/lang/String;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->toMediaStoreValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final parse(Lexpo/modules/medialibrary/next/records/AssetField;J)Ljava/lang/String;
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lexpo/modules/medialibrary/next/records/AssetField;->MODIFICATION_TIME:Lexpo/modules/medialibrary/next/records/AssetField;

    if-ne p1, v0, :cond_0

    .line 5
    sget-object p1, LQ8/d;->j:LQ8/d;

    invoke-static {p2, p3, p1}, LQ8/c;->j(JLQ8/d;)J

    move-result-wide p1

    invoke-static {p1, p2}, LQ8/a;->x(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final parse(Lexpo/modules/medialibrary/next/records/AssetField;Lexpo/modules/kotlin/types/Either;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/medialibrary/next/records/AssetField;",
            "Lexpo/modules/kotlin/types/Either<",
            "Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    const-class v0, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v1

    invoke-virtual {p2, v1}, Lexpo/modules/kotlin/types/Either;->isFirstType(LC7/d;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p1

    invoke-virtual {p2, p1}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    invoke-virtual {p0, p1}, Lexpo/modules/medialibrary/next/objects/query/MediaStoreQueryFormatter$Companion;->parse(Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v0

    invoke-virtual {p2, v0}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lexpo/modules/medialibrary/next/objects/query/MediaStoreQueryFormatter$Companion;->parse(Lexpo/modules/medialibrary/next/records/AssetField;J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
