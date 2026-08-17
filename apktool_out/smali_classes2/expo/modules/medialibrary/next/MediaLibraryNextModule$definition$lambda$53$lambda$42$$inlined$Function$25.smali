.class public final Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$25;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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

    .line 3
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$25;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object v1, p1, v1

    const/4 v2, 0x2

    aget-object p1, p1, v2

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    check-cast v1, Lexpo/modules/medialibrary/next/records/AssetField;

    check-cast v0, Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 2
    sget-object p1, Lexpo/modules/medialibrary/next/objects/query/MediaStoreQueryFormatter;->Companion:Lexpo/modules/medialibrary/next/objects/query/MediaStoreQueryFormatter$Companion;

    invoke-virtual {p1, v1, v2, v3}, Lexpo/modules/medialibrary/next/objects/query/MediaStoreQueryFormatter$Companion;->parse(Lexpo/modules/medialibrary/next/records/AssetField;J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lexpo/modules/medialibrary/next/objects/query/Query;->gte(Lexpo/modules/medialibrary/next/records/AssetField;Ljava/lang/String;)Lexpo/modules/medialibrary/next/objects/query/Query;

    move-result-object p1

    return-object p1
.end method
